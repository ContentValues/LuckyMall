package com.lucky.mall.admin.service;
import com.lucky.mall.admin.dto.PmsBrandParam;
import com.lucky.mall.mbg.model.PmsBrand;

import java.util.List;

public interface PmsBrandService {

    int create(PmsBrandParam param);

    int delete(List<Long> ids);

    int update(Long id,PmsBrandParam param);

    int updateShowStatus(List<Long> ids, Integer showStatus);

    int updateFactoryStatus(List<Long> ids,Integer factoryStatus);

    PmsBrand getBrand(Long id);
//    List<PmsBrand> listAll(String keyWord);
    List<PmsBrand> listBrand(String keyword, int pageNum, int pageSize);
}
