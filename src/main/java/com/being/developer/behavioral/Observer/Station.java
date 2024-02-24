package com.being.developer.behavioral.Observer;
// subject class
public interface Station {
    void registerMe(Observer observer);
    void unRegisterMe(Observer observer);
    void sendNotification();
}
