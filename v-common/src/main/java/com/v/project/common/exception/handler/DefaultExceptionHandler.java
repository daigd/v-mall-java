package com.v.project.common.exception.handler;

import com.v.project.common.model.api.BizResponseCode;
import com.v.project.common.model.api.ResultVO;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author : DaiGD
 * @createtime :  2020年04月18日 14:10
 * @description : 默认异常处理器
 * 参考:https://juejin.im/post/5e7ab0bae51d45271b749815
 */
@RestControllerAdvice
public class DefaultExceptionHandler
{
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResultVO<String> MethodArgumentNotValidExceptionHandler(MethodArgumentNotValidException e)
    {
        // 从异常对象中拿到ObjectError对象
        ObjectError objectError = e.getBindingResult().getAllErrors().get(0);
        // 然后提取错误提示信息进行返回
        return new ResultVO<>(BizResponseCode.PARAMS_NOT_VALID.getCode(), BizResponseCode.PARAMS_NOT_VALID.getDesc(),
                objectError.getDefaultMessage());
    }
}
