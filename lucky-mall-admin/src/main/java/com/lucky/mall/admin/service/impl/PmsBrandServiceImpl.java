package com.lucky.mall.admin.service.impl;
import com.github.pagehelper.PageHelper;
import com.lucky.mall.admin.dto.PmsBrandParam;
import com.lucky.mall.admin.service.PmsBrandService;
import com.lucky.mall.mbg.mapper.PmsBrandMapper;
import com.lucky.mall.mbg.model.PmsBrand;
import com.lucky.mall.mbg.model.PmsBrandExample;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.List;

/**
 * @program: LuckyMall
 * @author: ShyBlue
 * @create: 2020-11-03 17:46
 **/
@Service
public class PmsBrandServiceImpl implements PmsBrandService {
    @Resource
    PmsBrandMapper pmsBrandMapper;

    @Override
    public int create(PmsBrandParam param) {
        return 0;
    }

    @Override
    public int delete(List<Long> ids) {
        return 0;
    }

    @Override
    public int update(Long id, PmsBrandParam param) {
        PmsBrand pmsBrand = new PmsBrand();
        pmsBrand.setId(id);
        BeanUtils.copyProperties(param,pmsBrand);
        return pmsBrandMapper.updateByPrimaryKeySelective(pmsBrand);
    }

    @Override
    public PmsBrand getBrand(Long id) {
        return pmsBrandMapper.selectByPrimaryKey(id);
    }

//    @Override
//    public List<PmsBrand> listAll(String keyWord) {
//        PmsBrandExample example = new PmsBrandExample();
//        if(!StringUtils.isEmpty(keyWord)){
//            example.createCriteria().andNameLike("%"+keyWord+"%");
//        }
//        return pmsBrandMapper.selectByExample(example);
//    }


    @Override
    public List<PmsBrand> listBrand(String keyword, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        PmsBrandExample pmsBrandExample = new PmsBrandExample();
        pmsBrandExample.setOrderByClause("sort desc");
        PmsBrandExample.Criteria criteria = pmsBrandExample.createCriteria();
        if (!StringUtils.isEmpty(keyword)) {
            criteria.andNameLike("%" + keyword + "%");
        }
        return pmsBrandMapper.selectByExample(pmsBrandExample);
    }
}