package com.example.demo.filter;

import org.springframework.util.Assert;

public class UserContextHolder {
    private static final ThreadLocal<UserContext> usercontext=new ThreadLocal<>();

    public static final UserContext getContext(){
        UserContext context=usercontext.get();

        if(context==null){
            context=createEmptyContext();
            usercontext.set(context);
        }

        return usercontext.get();
    }

    public static final void setContext(UserContext context){
        Assert.notNull(context,"Only non-null UserContext instances are permitted");
        usercontext.set(context);
    }

    public static final UserContext createEmptyContext(){
        return new UserContext();
    }
}
