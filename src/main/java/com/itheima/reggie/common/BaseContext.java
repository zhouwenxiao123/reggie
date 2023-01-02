package com.itheima.reggie.common;

/**
 * @author zwx
 * @date 2022/10/23 20:29
 */

/**
 * 基于Threadlocal封装工具类，用户保存和获取当前登录用户id
 */
public class BaseContext {
    private static ThreadLocal<Long> threadLocal=new ThreadLocal<>();

    public static void setCurrentId(Long id){
        threadLocal.set(id);
    }

    public static Long getCurrentId(){
        return threadLocal.get();
    }
}
