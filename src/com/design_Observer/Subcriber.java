package com.design_Observer;

public class Subcriber implements Observer{

    String name;

    public Subcriber(String name) {
        this.name = name;
    }

    @Override
      public void notified(String title) {
        System.out.println(name+" has has got a video on "+title);
    }
}
