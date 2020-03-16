package com.jv.basic.thread.threadcommunicate;

public class Customer implements Runnable
{
    public Customer(BaoZi baoZi, Integer eatNum) {
        this.baoZi = baoZi;
        this.eatNum = eatNum;
    }

    public Integer getEatNum() {
        return eatNum;
    }

    public void setEatNum(Integer eatNum) {
        this.eatNum = eatNum;
    }

    private BaoZi baoZi;
    private Integer eatNum;
    @Override
    public void run() {
        while(true){
            synchronized (baoZi) {
                if (eatNum <= baoZi.getNum()) {
                    System.out.println("吃了。。" + eatNum + "号包子");
                    eatNum++;
                    baoZi.notify();
                } else {
                    try {
                        baoZi.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
                if(eatNum>100)break;

        }

    }
}
