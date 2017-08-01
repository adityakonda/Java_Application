package com.training.threads;

/**
 * Created by adity on 7/31/2017.
 */
public class Application_3 {

    public static void main(String args[]){

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i<=10; i++){

                    System.out.println("Hello - "+i);
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        thread.start();
        thread.start();
    }
}
