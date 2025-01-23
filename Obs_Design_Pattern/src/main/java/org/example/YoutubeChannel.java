package org.example;
import java.util.List;
import java.util.ArrayList;
public class YoutubeChannel extends Subject{
    private List<Observer> subscribers = new ArrayList<>();
    private String channelName;
    public YoutubeChannel(String channelName){
        this.channelName = channelName;
    }
    @Override
    public void subscribe(Observer o){
        subscribers.add(o);
        System.out.println(o + "Subscribed!" + channelName);
    }
    @Override
    public void unsubscribe(Observer o){
        subscribers.remove(o);
        System.out.println(o + "Unsubscribe!!"+ channelName);
    }

    @Override
    public void notifySubscribers(String message){
        for(Observer subscriber : subscribers){
            subscriber.update(message);
        }
    }

    public void upLoadVideo(String videoTitle){
        System.out.println("Channel: " + channelName + " has posted" + videoTitle);
        notifySubscribers("New video: " + videoTitle);
    }

    public void showSubscribers(){
        System.out.println("\n");
        for(Observer subscriber : subscribers){
            System.out.println("-" + subscriber);
        }

    }
}
