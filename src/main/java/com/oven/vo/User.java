package com.oven.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * 用户实体类
 *
 * @author Oven
 */
@Data
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;
    private String userName;
    private Integer age;

}
