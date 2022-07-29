package test;

import org.junit.Test;

public class MyTest {
    @Test
    public void t1() {
        Thread t1 = new Thread();
        //Thread t2 = new Thread(new MyThread(),"t2");
        t1.start();
        MyThread t2 = new MyThread();
        t2.doRun();
    }

    @Test
    public void t2() {
        final MyTest t = new MyTest();
        new Thread(new Runnable() {
            @Override
            public void run() {
                t.m1();
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                t.m2();
            }
        }).start();
    }
    public void m1(){
        synchronized (this){
            for (int i = 0; i < 100; i++) {
                System.out.println(Thread.currentThread().getName() + "m1---------->" + i);
            }
        }
    }
    public synchronized void m2(){
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + "m2---------->" + i);
        }
    }
}
class MyThread{


    public synchronized void doRun(){
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + "---------->" + i);
        }
    }
}
class Outer{        // 定义外部类
    private String info = "hello world" ;   // 定义外部类的私有属性
    public void fun(final int temp){        // 定义外部类的方法
        class Inner{                        // 在方法中定义的内部类
            public void print(){                // 定义内部类的方法
                System.out.println("类中的属性：" + info) ;       // 直接访问外部类的私有属性
                System.out.println("方法中的参数：" + temp) ;
            }
        };
        new Inner().print() ;               // 通过内部类的实例化对象调用方法
    }
};
class InnerClassDemo05{
    public static void main(String args[]){
        //final MyTest t = new MyTest();
        final InnerClassDemo05 t = new InnerClassDemo05();
        new Thread(new Runnable() {
            @Override
            public void run() {
                t.m1();
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                t.m2();
            }
        }).start();
    }

    public void m1(){
        synchronized (this){
            for (int i = 0; i < 100; i++) {
                System.out.println(Thread.currentThread().getName() + "m1---------->" + i);
            }
        }
    }
    public synchronized void m2(){
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + "m2---------->" + i);
        }
    }
};
