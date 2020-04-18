package com.v.project.common.model.api;

import lombok.Getter;

/**
 * @author : DaiGD
 * @createtime :  2020年04月18日 14:17
 * @description : 业务响应码
 */
@Getter
public enum  BizResponseCode
{
    /**
     * 响应码
     */
    SUCCESS(1000, "处理成功"),
    FAIL(-1000, "处理失败"),

    /**
     *
     */
    PARAMS_NOT_VALID(2000, "参数校验失败"),
    ;
    private Integer code;
    private String desc;

    BizResponseCode(Integer code, String desc)
    {
        this.code = code;
        this.desc = desc;
    }
}
