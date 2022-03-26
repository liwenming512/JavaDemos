package com.mybatis.demo.controller;

import com.mybatis.demo.model.LocationVo;
import com.mybatis.demo.model.OrgTypeEnum;
import com.mybatis.demo.model.StatusTypeEnum;
import com.mybatis.demo.service.LocationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Administrator on 2019/11/11.
 */
@RestController
//@RequestMapping(value = "/api/location")
public class LocationController {

    @Autowired
    private LocationService locationService;

    Logger logger = LoggerFactory.getLogger(LocationController.class);

    @RequestMapping(value = "/selectListByOrgType", method = RequestMethod.GET)
    public List<LocationVo> selectListByOrgType(@RequestParam OrgTypeEnum orgType){
        return locationService.selectListByOrgType(orgType);
    }

    @RequestMapping(value = "/selectListByStatus", method = RequestMethod.GET)
    public List<LocationVo> selectListByStatus(@RequestParam StatusTypeEnum status){
        return locationService.selectListByStatus(status);
    }

    @RequestMapping(value = "/selectListByVo", method = RequestMethod.POST)
    public List<LocationVo> selectListByVo(@RequestBody LocationVo locationVo){
        return locationService.selectListByVo(locationVo);
    }

    @RequestMapping(value = "/selectOne/{code}", method = RequestMethod.GET)
    public LocationVo selectOne(@PathVariable String code){
        LocationVo locationVo = locationService.selectOne(code);
        if (locationVo.getOrgType().equals(OrgTypeEnum.FENBO)){
            System.out.println("是分拨");
        }else if(locationVo.getOrgType().equals(OrgTypeEnum.WANGDIAN)){
            System.out.println("是网点");
        }else{
            System.out.println("是公司");
        }
        return  locationVo;
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public int update(@RequestBody LocationVo locationVo){
        return locationService.update(locationVo);
    }

    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public int insert(@RequestBody LocationVo locationVo){
        return locationService.insert(locationVo);
    }

    @RequestMapping(value = "demo", method = RequestMethod.GET)
    public String demo(){
        return "Hello, world!";
    }
}
