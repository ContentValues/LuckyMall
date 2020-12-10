package com.lucky.mall.admin.service.impl;

import com.github.pagehelper.PageHelper;
import com.lucky.mall.admin.dto.PmsProductCategoryParam;
import com.lucky.mall.admin.dto.PmsProductCategoryWithChildrenItem;
import com.lucky.mall.admin.service.PmsProductCategoryService;
import com.lucky.mall.mbg.mapper.PmsProductCategoryMapper;
import com.lucky.mall.mbg.model.PmsProductCategory;
import com.lucky.mall.mbg.model.PmsProductCategoryExample;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @program: LuckyMall
 * @author: ShyBlue
 * @create: 2020-11-04 15:48
 **/
@Service
public class PmsProductCategoryServiceImpl implements PmsProductCategoryService {
    @Resource
    PmsProductCategoryMapper pmsProductCategoryMapper;

    @Override
    public int create(PmsProductCategoryParam param) {
        PmsProductCategory category = new PmsProductCategory();
        BeanUtils.copyProperties(param,category);
        category.setProductCount(0);
        setCategoryLevel(category);
        //todo 创建筛选属性关联
        return pmsProductCategoryMapper.insertSelective(category);
    }

    @Override
    public int delete(List<Long> ids) {
        PmsProductCategoryExample example = new PmsProductCategoryExample();
        example.createCriteria().andIdIn(ids);
        return pmsProductCategoryMapper.deleteByExample(example);
    }

    @Override
    public int update(Long id, PmsProductCategoryParam param) {
        PmsProductCategory category = new PmsProductCategory();
        category.setId(id);
        BeanUtils.copyProperties(param,category);
        setCategoryLevel(category);

        //todo 更新商品分类时要更新商品中的名称
        //todo 同时更新筛选属性的信息
        return pmsProductCategoryMapper.updateByPrimaryKeySelective(category);
    }

    @Override
    public PmsProductCategory getItem(Long id) {
        return pmsProductCategoryMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<PmsProductCategory> listAll(Long parentId, Integer pageSize, Integer pageNum) {
        PageHelper.startPage(pageNum,pageSize);
        PmsProductCategoryExample example = new PmsProductCategoryExample();
        example.createCriteria().andParentIdEqualTo(parentId);
        return pmsProductCategoryMapper.selectByExample(example);
    }

    @Override
    public int updateNavStatus(List<Long> ids, Integer navStatus) {
        PmsProductCategoryExample example = new PmsProductCategoryExample();
        example.createCriteria().andIdIn(ids);
        PmsProductCategory category = new PmsProductCategory();
        category.setNavStatus(navStatus);
        return pmsProductCategoryMapper.updateByExampleSelective(category,example);
    }

    @Override
    public int updateShowStatus(List<Long> ids, Integer showStatus) {
        PmsProductCategoryExample example = new PmsProductCategoryExample();
        example.createCriteria().andIdIn(ids);
        PmsProductCategory category = new PmsProductCategory();
        category.setShowStatus(showStatus);
        return pmsProductCategoryMapper.updateByExampleSelective(category,example);
    }

    @Override
    public List<PmsProductCategoryWithChildrenItem> listWithChildren() {

        List<PmsProductCategory> categoryList =  pmsProductCategoryMapper.selectByExample(new PmsProductCategoryExample());
        List<PmsProductCategoryWithChildrenItem> result =  categoryList.stream()
                .filter(pmsProductCategory -> pmsProductCategory.getParentId() == 0)
                .map(category -> covert(category,categoryList))
                .collect(Collectors.toList());
        return result;
    }

    /**
     * 将UmsMenu转化为UmsMenuNode并设置children属性
     */
    private PmsProductCategoryWithChildrenItem covert(PmsProductCategory category, List<PmsProductCategory> categoryList) {
        PmsProductCategoryWithChildrenItem item = new PmsProductCategoryWithChildrenItem();
        BeanUtils.copyProperties(category,item);
        List<PmsProductCategory> children =  categoryList.stream()
                .filter(sub->sub.getParentId() == category.getId())
                .collect(Collectors.toList());
        item.setChildren(children);
        return item;
//        UmsMenuNode node = new UmsMenuNode();
//        BeanUtils.copyProperties(menu, node);
//        List<UmsMenuNode> children = menuList.stream()
//                .filter(subMenu -> subMenu.getParentId().equals(menu.getId()))
//                .map(subMenu -> covertMenuNode(subMenu, menuList)).collect(Collectors.toList());
//        node.setChildren(children);
//        return node;
    }

    /**
     * 根据分类的parentId设置分类的level
     */
    private void setCategoryLevel(PmsProductCategory productCategory) {
        //没有父分类时为一级分类
        if(productCategory.getParentId() == 0){
            productCategory.setLevel(0);
        }else {
            //有父分类时选择根据父分类level设置
            PmsProductCategory parent =  pmsProductCategoryMapper.selectByPrimaryKey(productCategory.getParentId());
            if(parent!=null){
               productCategory.setLevel(parent.getLevel()+1);
            }else {
                productCategory.setLevel(0);
            }
        }
    }
}