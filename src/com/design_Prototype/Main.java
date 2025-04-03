package com.design_Prototype;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("creating new obj");

        NetworkConnection networkConnection=new NetworkConnection();
        networkConnection.setIp("1.344.5555");
        networkConnection.loadVeryImpData();
        //cloning
        System.out.println(networkConnection);
        NetworkConnection nwt2=networkConnection.clone();
        System.out.println(nwt2);
        //creating separately
        NetworkConnection networkConnection3=new NetworkConnection();
        networkConnection3.setIp("1.344.5555");
        networkConnection3.loadVeryImpData();
        System.out.println(networkConnection3);
    }
}
