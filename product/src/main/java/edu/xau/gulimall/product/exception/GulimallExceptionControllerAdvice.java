package edu.xau.gulimall.product.exception;

import com.sun.javafx.binding.BidirectionalContentBinding;
import edu.xau.common.exception.BizCodeEnume;
import edu.xau.common.utils.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

/**
 * @Author: 杨斌
 * @Date: 2021/1/20 0020 23:28
 */
@Slf4j
//ResponBody + ControllerAdvice
@RestControllerAdvice(basePackages = "edu.xau.gulimall.product.controller")
public class GulimallExceptionControllerAdvice {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public R handleValueException(MethodArgumentNotValidException e){
    log.error("数据校验出现错误 {},错误类型 {}",e.getMessage(),e.getClass());
        BindingResult bindingResult = e.getBindingResult();
        HashMap<Object, Object> map = new HashMap<>();
        bindingResult.getFieldErrors().forEach((error)->{
            //错误字段
            String field = error.getField();
            //错误消息
            String message = error.getDefaultMessage();
            map.put(field,message);
        });
        return R.error(BizCodeEnume.VAILD_EXCEPTION.getCode(), BizCodeEnume.VAILD_EXCEPTION.getMsg()).put("data", map);
    }

    @ExceptionHandler(Exception.class)
    public R handleException(Throwable throwable ){
        log.error("Exception : {}",throwable.getMessage());
        return R.error(BizCodeEnume.UNKNOW_EXCEPTION.getCode(), BizCodeEnume.UNKNOW_EXCEPTION.getMsg());
    }

}
