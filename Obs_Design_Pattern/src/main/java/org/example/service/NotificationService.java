package org.example.service;

import org.example.Observer;
import java.util.ArrayList;
public class NotificationService {
    private static NotificationService instance;
    private NotificationService(){}

    public static NotificationService getInstance(){
        if(instance == null){
            instance = new NotificationService();
        }
        return instance;
    }
    public void notifySubscribers(String message, ArrayList<Observer> subscribers){
        for(Observer subscriber : subscribers){
            subscriber.update(message);
        }
    }


}
