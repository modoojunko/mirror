package com.ittools.mirror.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
public enum  MirrorEnums {
    SUCCESS("成功",200),
    FAILED("失败" ,401),
    ERROR("内部错误",509);

    private String msg;
    private int code;

    public String getMsg() {
        return msg;
    }

    public int getCode() {
        return code;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
