package com.tao.example.kafka.Constant;

/**
 * Created by DELL on 2017/8/7.
 */
public class ResultVo {
    /**
     * 消息
     */
    private String message;
    /**
     * 状态码
     */
    private int code;
    /**
     * 数据对象
     */
    private Object obj;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }

}
