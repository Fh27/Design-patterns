package com.design_builder;

public class User {

private final int userid;
private final String username;
private  final String emailId;

    private User(UserBuilder userBuilder){
        this.userid=userBuilder.userid;
        this.username=userBuilder.username;
        this.emailId=userBuilder.emailId;
    }

    public int getUserid() {
        return userid;
    }

    public String getUsername() {
        return username;
    }

    public String getEmailId() {
        return emailId;
    }

    @Override
    public String toString() {
        return this.emailId+" "+this.userid +" "+this.username;
    }

     static class UserBuilder{

        private  int userid;
        private  String username;

        private  String emailId;


        public UserBuilder setUserid(int userid) {
            this.userid = userid;
            return this;
        }

        public UserBuilder setUsername(String username) {
            this.username = username;
            return this;
        }

        public UserBuilder setEmailId(String emailId) {
            this.emailId = emailId;
            return this;
        }
        public  UserBuilder(){


        }
       public static UserBuilder builder(){
            return new UserBuilder();
        }
        public User build(){
             User user=new User(this);
             return user;
        }

    }
}
