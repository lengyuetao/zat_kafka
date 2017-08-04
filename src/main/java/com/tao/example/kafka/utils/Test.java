package com.tao.example.kafka.utils;

import com.alibaba.fastjson.JSONObject;

/**
 * Created by DELL on 2017/8/1.
 */
public class Test<T> {

    public  T  paramJson(JSONObject json, String key,T t){

        return json.containsKey(key)? (T) json.get(key) :null;

    }

    public static void main(String[] args) {
        Test<String> list=new Test<>();

    }
}
