package org.example;
import org.example.service.NotificationService;

import java.util.ArrayList;
public class YoutubeChannel extends Subject{
    private final ArrayList<Observer> subscribers = new ArrayList<>();
    private final String channelName;

    public YoutubeChannel(String channelName){
        this.channelName = channelName;
    }

    @Override
    public void subscribe(Observer o){
        subscribers.add(o);
        System.out.println(o + " has subscribed " + channelName);
    }
    @Override
    public void unsubscribe(Observer o){
        subscribers.remove(o);
        System.out.println(o + "\nUnsubscribe!!"+ channelName);
    }

    @Override
    public void notifySubscribers(String message){
        NotificationService.getInstance().notifySubscribers(message, subscribers);
    }

    public void upLoadVideo(String videoTitle){
        System.out.println("\nChannel: " + channelName + " has posted " + videoTitle);
        notifySubscribers("New video: " + videoTitle);
    }

    public void showSubscribers(){
        System.out.println("\n");
        for(Observer subscriber : subscribers){
            System.out.println("-" + subscriber);
        }

    }
}
