package com.mybatis.demo.service.impl;

import com.mybatis.demo.dao.LocationDao;
import com.mybatis.demo.model.LocationVo;
import com.mybatis.demo.model.OrgTypeEnum;
import com.mybatis.demo.model.StatusTypeEnum;
import com.mybatis.demo.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2019/11/11.
 */
@Service
public class LocationServiceImpl implements LocationService {

    @Autowired
    private LocationDao locationDao;

    @Override
    public List<LocationVo> selectListByOrgType(OrgTypeEnum orgType) {
        return locationDao.selectListByOrgType(orgType);
    }

    @Override
    public List<LocationVo> selectListByStatus(StatusTypeEnum statusType) {
        return locationDao.selectListByStatus(statusType);
    }

    @Override
    public List<LocationVo> selectListByVo(LocationVo locationVo) {
        return locationDao.selectListByVo(locationVo);
    }

    @Override
    public LocationVo selectOne(String code) {
        return locationDao.get(code);
    }

    @Override
    public int insert(LocationVo locationVo) {
        return locationDao.insert(locationVo);
    }

    @Override
    public int update(LocationVo locationVo) {
        return locationDao.update(locationVo);
    }
}
