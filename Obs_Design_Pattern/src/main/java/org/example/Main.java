package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        YoutubeChannel channel = new YoutubeChannel("HungDevTutorial");

        Subscriber subscriber1 = new Subscriber("dgln0101");
        Subscriber subscriber2 = new Subscriber("newkingforthethrone");
        Subscriber subscriber3 = new Subscriber("Danbo");

        channel.subscribe(subscriber1);
        channel.subscribe(subscriber2);
        channel.subscribe(subscriber3);

        channel.upLoadVideo("New design pattern");
        channel.showSubscribers();

        channel.unsubscribe(subscriber1);
        channel.showSubscribers();
    }
}