package com.mybatis.demo.model;/**
 * Created by Administrator on 2019/11/20.
 */

/**
 * @Author liwenming
 * @Description //TODO
 * @Date 2019/11/20 9:51
 **/
public class EnumVo {

    private Integer key;

    private String name;

    private String value;

    public Integer getKey() {
        return key;
    }

    public void setKey(Integer key) {
        this.key = key;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String toString(){
        return this.key + ":" + this.name + ":" + this.value;
    }
}
