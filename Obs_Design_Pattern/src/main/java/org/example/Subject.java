package org.example;
import java.util.List;
import java.util.ArrayList;
public abstract class Subject{
    abstract void subscribe(Observer o);
    abstract void unsubscribe(Observer o);
    abstract void notifySubscribers(String message);
}
