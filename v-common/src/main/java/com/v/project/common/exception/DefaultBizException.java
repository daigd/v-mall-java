package com.v.project.common.exception;

import lombok.EqualsAndHashCode;
import lombok.Getter;

/**
 * @author : DaiGD
 * @createtime :  2020年04月18日 14:02
 * @description : 默认业务异常类
 */
@Getter
@EqualsAndHashCode
public class DefaultBizException extends RuntimeException
{
    private Integer code;

    public DefaultBizException(Integer code,String message)
    {
        super(message);
        this.code = code;
    }

    public DefaultBizException(Integer code, String message, Throwable cause)
    {
        super(message, cause);
        this.code = code;
    }
}
