package com.zyun.note.basics.designpattern.singleton;

/**
 * @description：懒汉模式://懒汉式单例类.在第一次调用的时候实例化
 * @Author zhaoyun
 * @Date 2020-7-8
 */
public class Singleton2 {
    //私有的默认构造子
    private Singleton2() {
    }

    //注意，这里没有final
    private static Singleton2 single = null;

    //静态工厂方法
    public synchronized static Singleton2 getInstance() {
        if (single == null) {
            single = new Singleton2();
        }
        return single;
    }
}
