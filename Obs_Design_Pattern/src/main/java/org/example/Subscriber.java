package org.example;

public class Subscriber implements Observer{
    private String name;
    public Subscriber(String name){
        this.name = name;
    }

    @Override
    public void update(String message){
        System.out.println(name + "has received notification: "+ message);
    }

    @Override
    public String toString(){
        return "Subscriber{name = "+ name + "}";
    }
}
