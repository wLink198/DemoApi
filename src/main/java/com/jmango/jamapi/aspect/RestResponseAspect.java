package com.jmango.jamapi.aspect;

import com.jmango.jamapi.model.exception.BusinessException;
import com.jmango.jamapi.model.exception.Error;
import com.jmango.jamapi.model.res.ResponseNoData;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
public class RestResponseAspect {

    @Around("@annotation(RestResponse)")
    public Object logExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
        try {
            return joinPoint.proceed();
        }
        catch (BusinessException ge) {
            log.error(ge.getMessage(), ge);
            return new ResponseNoData(ge.getCode(), ge.getMessage());
        }
        catch (Exception e) {
            log.error(e.getMessage(), e);
            return new ResponseNoData(Error.UNDEFINED_ERROR, Error.defaultMessage());
        }
    }
}
