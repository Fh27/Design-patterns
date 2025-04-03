package com.design_builder;

public class Testdesign_builder {
    public static void main(String[] args) {
       User user=new User.UserBuilder().setUserid(1).setUsername("furqan").setEmailId("@gmailcom").build();
        System.out.println(user);


        User user2=User.UserBuilder.builder().setUserid(1).setUsername("hasan").build();
        System.out.println(user2);
    }

}
