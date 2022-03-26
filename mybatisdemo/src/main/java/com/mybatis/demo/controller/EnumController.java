package com.mybatis.demo.controller;/**
 * Created by Administrator on 2019/11/20.
 */

import com.mybatis.demo.model.EnumVo;
import com.mybatis.demo.model.LocationVo;
import com.mybatis.demo.model.OrgTypeEnum;
import com.mybatis.demo.utils.PubUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author liwenming
 * @Description //TODO
 * @Date 2019/11/20 9:45
 **/
@RestController
public class EnumController {

    Logger logger = LoggerFactory.getLogger(LocationController.class);

    @RequestMapping(value = "/selectEnumListByCode", method = RequestMethod.GET)
    public List<EnumVo> selectEnumListByCode(Integer code){
        return PubUtils.getEnumVoListByCode(code);
    }
}
