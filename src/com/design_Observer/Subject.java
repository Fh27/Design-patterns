package com.design_Observer;

public interface Subject {

    void subscribe(Observer ob);
    void unsubscribe(Observer ob);

    void notifychanges(String title);


}
