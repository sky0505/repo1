package com.jv.basic.thread.threadcommunicate;

public class Producter implements Runnable {
    private BaoZi baozi;

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    private Integer count;

    public Producter(BaoZi baozi, Integer count) {
        this.baozi = baozi;
        this.count = count;
    }

    @Override
    public void run() {
      while(true){
          synchronized (baozi)  {

                baozi.setNum(count);
                System.out.println("生产了。。"+baozi.getNum()+"。。。号包子");
                try {
                    baozi.wait(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                count++;

                  baozi.notify();

          }


                if(count>100)break;

        }
    }
}
