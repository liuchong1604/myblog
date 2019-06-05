package com.four.myblog.utils;

import org.springframework.stereotype.Component;

/**
 * Created with IDEA
 *
 * @author chong  liu
 * @create 2019/6/5 10:04
 */
public class RestResult {
    private int code;
    private String message;
    private Object data;
    public static int SUCCESS = 200;
    public static int FAILED = 400;
    public  RestResult(){

    }

    public RestResult(int code, String message) {
        super();
        this.code = code;
        this.message = message;
    }

    public RestResult(int code, String message, Object data) {
        super();
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public RestResult(int code, Object data) {
        super();
        this.code = code;
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "RestResult{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
