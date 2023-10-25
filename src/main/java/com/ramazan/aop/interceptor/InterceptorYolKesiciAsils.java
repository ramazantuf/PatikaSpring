package com.ramazan.aop.interceptor;

import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

@Interceptor
@InterceptorYolKesici
public class InterceptorYolKesiciAsils {
    @AroundInvoke public Object loglama(InvocationContext context){
        System.out.println("ilk Hali"+context.getMethod().getName());
        // kullanıcı burda giriş yapmış mı
        boolean isLogin=true;
        Object cont = null;
        if(isLogin){
            System.out.println("!!! Önce sisteme giriş yapsın !!!");
            return null;
        }else{
            try{
                cont = context.proceed();
                System.out.println("Sonraki hali"+cont);
            }catch (Exception e){
                e.printStackTrace();
            }
            return cont;
        }

    }
}
