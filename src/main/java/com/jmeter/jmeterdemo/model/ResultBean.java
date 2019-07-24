package com.jmeter.jmeterdemo.model;

import java.io.Serializable;

public class ResultBean<T> implements Serializable {
    public static final int SUCCESS = 0;
    public static final int FAIL = -1;

    private String errorMessage = "SUCCESS";
    private int code = SUCCESS;
    private T data;
    private int flag = SUCCESS;


    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }

    public ResultBean() {
        super();
    }

    public ResultBean(T data) {
        super();
        this.data = data;
    }

    public ResultBean(Throwable e) {
        super();
        this.errorMessage = e.getMessage();
        this.code = FAIL;
    }
}