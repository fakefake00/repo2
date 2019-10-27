package com.hui.div;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect     //标注这个类是一个切面
public class AnnotationPointCut {

    @Before("execution(* com.hui.service.Impl.UserServiceImpl.*(..))")
    public void before(){
        System.out.println("====方法执行前===");
    }

}
