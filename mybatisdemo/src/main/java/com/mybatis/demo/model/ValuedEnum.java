package com.mybatis.demo.model;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * Created by Administrator on 2019/11/17.
 */
@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public interface ValuedEnum {

    int getKey();

    String getValue();

    String getName();
}
