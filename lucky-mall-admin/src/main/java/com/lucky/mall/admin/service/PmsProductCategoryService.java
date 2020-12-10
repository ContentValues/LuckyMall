package com.lucky.mall.admin.service;
import com.lucky.mall.admin.dto.PmsProductCategoryParam;
import com.lucky.mall.admin.dto.PmsProductCategoryWithChildrenItem;
import com.lucky.mall.mbg.model.PmsProductCategory;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @program: LuckyMall
 * @author: ShyBlue
 * @create: 2020-11-04 15:48
 **/
public interface PmsProductCategoryService {

    @Transactional
    int create(PmsProductCategoryParam param);

    int delete(List<Long> ids);

    @Transactional
    int update(Long id,PmsProductCategoryParam param);

    PmsProductCategory getItem(Long id);

    List<PmsProductCategory> listAll(Long parentId, Integer pageSize, Integer pageNum);

    /**
     * 批量修改导航状态
     */
    int updateNavStatus(List<Long> ids, Integer navStatus);

    /**
     * 批量修改显示状态
     */
    int updateShowStatus(List<Long> ids, Integer showStatus);

    /**
     * 以层级形式获取商品分类
     */
    List<PmsProductCategoryWithChildrenItem> listWithChildren();

}