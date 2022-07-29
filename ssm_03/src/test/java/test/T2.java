package test;

import org.junit.Test;

import java.util.Random;

public class T2 {
    @Test
    public void t2() {
        System.out.println(System.currentTimeMillis() +"" +  (new Random().nextInt(90000) + 10000));
    }
    @Test
    public void t42() {
        System.out.println("" + System.currentTimeMillis() +  (new Random().nextInt(90000) + 10000));
    }




    public void m1(){
        synchronized (this){
            for (int i = 0; i < 100; i++) {
                System.out.println(Thread.currentThread().getName() + "----->" + i);
            }
        }
    }
    public synchronized void m2(){
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + "----->" + i);
        }
    }
}

class Tee{
    public static void main(String[] args) {
        Tee t = new Tee();
        new Thread(new Runnable() {
            @Override
            public void run() {
                t.m1();
            }
        },"t1").start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                t.m2();
            }
        },"t2").start();
    }

    public void m1(){
        synchronized (Tee.class){
            for (int i = 0; i < 100; i++) {
                System.out.println(Thread.currentThread().getName() + "----->" + i);
            }
        }
    }
    public static synchronized void m2(){
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + "----->" + i);
        }
    }
}
