package com.mybatis.demo.dao;

import com.mybatis.demo.model.LocationVo;
import com.mybatis.demo.model.OrgTypeEnum;
import com.mybatis.demo.model.StatusTypeEnum;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Administrator on 2019/11/11.
 */

@Repository
public interface LocationDao {

    List<LocationVo> selectListByOrgType(OrgTypeEnum orgType);

    List<LocationVo> selectListByStatus(StatusTypeEnum statusType);

    List<LocationVo> selectListByVo(LocationVo locationVo);

    LocationVo get(String code);

    int insert(LocationVo locationVo);

    int update(LocationVo locationVo);
}
