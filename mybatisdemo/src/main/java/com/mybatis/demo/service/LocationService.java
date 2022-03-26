package com.mybatis.demo.service;

import com.mybatis.demo.model.LocationVo;
import com.mybatis.demo.model.OrgTypeEnum;
import com.mybatis.demo.model.StatusTypeEnum;

import java.util.List;

/**
 * Created by Administrator on 2019/11/11.
 */
public interface LocationService {

    List<LocationVo> selectListByOrgType(OrgTypeEnum orgType);

    List<LocationVo> selectListByStatus(StatusTypeEnum statusType);

    List<LocationVo> selectListByVo(LocationVo locationVo);

    LocationVo selectOne(String code);

    int insert(LocationVo locationVo);

    int update(LocationVo locationVo);
}
