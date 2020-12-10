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
        PmsBrand pmsBrand = new PmsBrand();
        BeanUtils.copyProperties(param,pmsBrand);
        if(!StringUtils.isEmpty(pmsBrand.getName().trim())){
            pmsBrand.setFirstLetter(pmsBrand.getName().trim().substring(0,1));
        }
        return pmsBrandMapper.insertSelective(pmsBrand);
    }

    @Override
    public int delete(List<Long> ids) {
        PmsBrandExample example = new PmsBrandExample();
        example.createCriteria().andIdIn(ids);
        return pmsBrandMapper.deleteByExample(example);
    }

    @Override
    public int update(Long id, PmsBrandParam param) {
        PmsBrand pmsBrand = new PmsBrand();
        pmsBrand.setId(id);
        BeanUtils.copyProperties(param,pmsBrand);
        if(!StringUtils.isEmpty(pmsBrand.getName().trim())){
            pmsBrand.setFirstLetter(pmsBrand.getName().trim().substring(0,1));
        }
        return pmsBrandMapper.updateByPrimaryKeySelective(pmsBrand);
    }

    @Override
    public int updateShowStatus(List<Long> ids, Integer showStatus) {
        PmsBrand pmsBrand = new PmsBrand();
        pmsBrand.setShowStatus(showStatus);
        PmsBrandExample example = new PmsBrandExample();
        example.createCriteria().andIdIn(ids);
        return pmsBrandMapper.updateByExampleSelective(pmsBrand,example);
    }

    @Override
    public int updateFactoryStatus(List<Long> ids, Integer factoryStatus) {
        PmsBrand pmsBrand = new PmsBrand();
        pmsBrand.setFactoryStatus(factoryStatus);
        PmsBrandExample example = new PmsBrandExample();
        example.createCriteria().andIdIn(ids);
        return pmsBrandMapper.updateByExampleSelective(pmsBrand,example);
    }

    @Override
    public PmsBrand getBrand(Long id) {
        return pmsBrandMapper.selectByPrimaryKey(id);
    }


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