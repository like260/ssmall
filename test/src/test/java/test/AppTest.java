package test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;


public class AppTest 
{
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void t1() throws InterruptedException {
        System.out.println(Thread.activeCount());
        Thread[] threads = new Thread[6];
        Thread.enumerate(threads);
        for (int i = 0; i < threads.length; i++) {
            System.out.println(threads[i]);
        }
        Thread t = new Thread(new T2(),"t3243");

        System.out.println("+++++++++++++++");
        t.setDaemon(true);
        t.start();
        t.setName("t3324");

        System.out.println("+++++++++++++++");
        System.out.println("+++++++++++++++");
        System.out.println("+++++++++++++++");
        System.out.println("+++++++++++++++");
        t.join();
        t.yield();
        t.interrupt();
        Thread.interrupted();

    }
}
class T2 implements Runnable{

    T2(){
        System.out.println(Thread.currentThread());
    }
    @Override
    public void run() {
        System.out.println(Thread.currentThread());
        for (int i = 0; i < 1236; i++) {
            System.out.print(i + " " );
        }
    }
}
