package com.design_Observer;

public class Demo {
    public static void main(String[] args) {
       YoutubeChannel channel= new YoutubeChannel();

       Subcriber aman=new Subcriber("aman");
        Subcriber raman=new Subcriber("raman");

        channel.subscribe(aman);
        channel.subscribe(raman);

       channel.notifychanges("wipro updates");
       channel.notifychanges("Cognizant interview mails");
    }
}
