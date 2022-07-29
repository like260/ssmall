package test;

import org.junit.Test;

public class t {

    @Test
    public void name() {
        Ticket ticket = new Ticket(100);
        for (int i = 0; i < 5; i++) {
            new Thread(new Windows("窗口" + i,ticket)).start();
        }
    }
}

class MM{
    public static final Object LOCK = new Object();
    static int num = 0;
    static int count = 5;
    public static void main(String[] args) {
        for (int i = 0; i < count; i++) {
            final int r = i;
            new Thread(new Runnable() {

                @Override
                public void run() {

                        row(r);


                }
            },"T" + i).start();
        }
    }

    private static void row(int i2) {
        for (int j = 0;j < 50;j++) {
            synchronized (LOCK) {
                while (num % count != i2) {
                    try {
                        LOCK.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(Thread.currentThread().getName() + "--->" + ++num);


                LOCK.notifyAll();

            }
        }
    }

}



class tei{
    public static void main(String[] args) {
        Ticket ticket = new Ticket(100);
        for (int i = 0; i < 5; i++) {
            new Thread(new Windows("窗口" + i,ticket)).start();
        }
    }
}

class Windows implements Runnable{
    private String name;
    private Ticket ticket;

    public Windows(String name, Ticket ticket) {
        this.name = name;
        this.ticket = ticket;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (ticket) {
                if(ticket.isEmpty()){
                    System.out.println("票已售完！！");
                    return;
                }
                System.out.println(Thread.currentThread().getName() + "卖出票为：--" + ticket.getSum());
                ticket.sale();
            }
            try {
                Thread.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}

class Ticket{
    private int sum;

    public Ticket(int sum) {
        this.sum = sum;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public boolean isEmpty(){
        return sum < 1;
    }

    public void sale(){
        sum--;
    }
}
