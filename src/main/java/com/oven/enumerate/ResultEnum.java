package com.oven.enumerate;

/**
 * 统一返回枚举类
 *
 * @author Oven
 */
public enum ResultEnum {

    SUCCESS(200, "操作成功！");

    private Integer code;
    private String value;

    ResultEnum(Integer code, String value) {
        this.code = code;
        this.value = value;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}
