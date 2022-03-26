package com.mybatis.demo.model;

/**
 * Created by Administrator on 2019/11/13.
 */
public enum OrgTypeEnum implements ValuedEnum {

    FENBO(11601,"分拨"),
    WANGDIAN(11603,"网点"),
    GONGSI(11602,"公司");

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

    OrgTypeEnum(int key, String value){
        this.key = key;
        this.value = value;
    }
}
