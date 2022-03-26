package com.mybatis.demo.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2019/11/17.
 */
public enum StatusTypeEnum implements ValuedEnum{

    TONGGUO(100, "通过"),
    BOHUI(101, "驳回");

    private Integer key;
    private String value;

    public int getKey(){
        return key;
    }

    public String getValue() {
        return value;
    }

    public String getName(){
        return this.name();
    }

    StatusTypeEnum(int key, String value){
        this.key = key;
        this.value = value;
    }
}
