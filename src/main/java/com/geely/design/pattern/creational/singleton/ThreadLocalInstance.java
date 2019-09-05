package com.geely.design.pattern.creational.singleton;

/**
 * Created by geely
 * 全局不唯一,线程唯一
 */
public class ThreadLocalInstance {
    private static final ThreadLocal<ThreadLocalInstance> threadLocalInstanceThreadLocal
             = new ThreadLocal<ThreadLocalInstance>(){
        @Override
        protected ThreadLocalInstance initialValue() {
            return new ThreadLocalInstance();
        }
    };
    private ThreadLocalInstance(){

    }

    public static ThreadLocalInstance getInstance(){
        return threadLocalInstanceThreadLocal.get();
    }

}
