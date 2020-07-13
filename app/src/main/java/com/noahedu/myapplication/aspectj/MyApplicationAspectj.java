package com.noahedu.myapplication.aspectj;

import android.util.Log;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

/**
 * @Description: //@Before 在切入点之前运行
 * //    @After("")
 *     //@Around 在切入点前后都运行
 * @Author: huangjialin
 * @CreateDate: 2020/7/10 14:07
 */
@Aspect
public class MyApplicationAspectj {

    @Around("call(* com.noahedu.myapplication.MyApplication.**(..))")
    public void getTime(ProceedingJoinPoint joinPoint){
        Signature signature = joinPoint.getSignature();
        String name = signature.getName();
        long time = System.currentTimeMillis();
        try {
            joinPoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        Log.e("MyApplicationAspectj " ,(name + " cost " + (System.currentTimeMillis() - time)));
    }


}
