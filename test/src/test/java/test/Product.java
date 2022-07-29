package test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Product {

    public static void main(String[] args) {
        Storage storage = new Storage();
        for (int i = 0; i < 3; i++) {
            //new Thread(new Customer("C" + (i + 1),storage)).start();
            new Customer("生产者" + (i + 1),storage).start();
        }
        for (int i = 0; i < 3; i++) {
            //new Thread(new Producer("P" + (i + 1),storage)).start();
            new Producer("消费者" + (i + 1),storage).start();
        }
    }
}

class Customer extends Thread{
    private Storage storage;

    public Customer(String name, Storage storage) {
        super(name);
        this.storage = storage;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            storage.push();
        }

    }
}
class Producer extends Thread{
    private Storage storage;

    public Producer(String name, Storage storage) {
        super(name);
        this.storage = storage;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            storage.add(new Random().nextInt(100));
        }

    }
}
class Storage{
    private List list = new LinkedList();

    public synchronized void add(Object data){
        while (list.size() >= 10){
            System.out.println(Thread.currentThread().getName() + "正在等待。。。");
            try {
                list.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        list.add(data);
        System.out.println(Thread.currentThread().getName() + "放入了数据" + data);
        this.notifyAll();
    }

    public synchronized void push(){
        while (list.isEmpty()){
            System.out.println(Thread.currentThread().getName() + "正在等待---");
            try {
                list.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName() + "取出了数据" + list.remove(0));
        this.notifyAll();

    }
}