package com.tao.example.kafka.utils;

/**
 * Created by DELL on 2017/8/1.
 */
public enum  ParamTypes {
    STRING("String"),LONG("Long"),INTEGER("Integer"),DOUBLE("Double"),BOOLEAN("Boolean");

    private String typeName;

    private ParamTypes(String typeName){
        this.typeName=typeName;
    }

    public String getTypeName(){
        return typeName;
    }
}
