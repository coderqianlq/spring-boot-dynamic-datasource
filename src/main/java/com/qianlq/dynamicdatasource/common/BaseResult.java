package com.qianlq.dynamicdatasource.common;

import com.qianlq.dynamicdatasource.common.constant.Code;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author qianliqing
 * @date 2019/6/6 11:32 AM
 * email: qianliqing@hyperchain.com
 */

@SuppressWarnings("unchecked")
@Data
@AllArgsConstructor
public class BaseResult<T> {

    private int code;
    private String message;
    private T data = (T) new Object();

    public BaseResult() {
        this.data = (T) new Object();
    }

    public BaseResult(String msg) {
        this();
        this.code = 200;
        this.message = msg;
    }

    public BaseResult(Code code) {
        this.code = code.getCode();
        this.message = code.getMsg();
    }

    public BaseResult(Code code, T data) {
        this.code = code.getCode();
        this.message = code.getMsg();
        this.data = data;
    }

    public BaseResult(int code, String message) {
        this.code = code;
        this.message = message;
    }

    @Override
    public String toString() {
        return "BaseResult{" + "code=" + code + ", message='" + message + ", data=" + data + '}';
    }
}
