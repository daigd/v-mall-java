package com.v.project.common.model.api;

import lombok.Getter;

/**
 * @author : DaiGD
 * @createtime :  2020年04月18日 14:14
 * @description : 响应结构体
 */
@Getter
public class ResultVO<T>
{
    /**
     * 状态码，比如1000代表响应成功
     */
    private Integer code;

    /**
     * 响应信息，用来说明响应情况
     */
    private String desc;

    /**
     * 响应的具体数据
     */
    private T data;

    public ResultVO(T data)
    {
        this(BizResponseCode.SUCCESS.getCode(), BizResponseCode.SUCCESS.getDesc(), data);
    }

    public ResultVO(Integer code, String desc, T data)
    {
        this.code = code;
        this.desc = desc;
        this.data = data;
    }
}
