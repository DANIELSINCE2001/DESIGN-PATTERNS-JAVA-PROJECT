package in.ObserverPattern;


import java.util.ArrayList;
import java.util.List;

class Newsletter implements Subject
{
 private List<Observer> subscribers = new ArrayList<>();

 @Override
 public void addObserver(Observer observer)
 {
     subscribers.add(observer);
 }

 @Override
 public void removeObserver(Observer observer)
 {
     subscribers.remove(observer);
 }

 @Override
 public void notifyObservers(String message)
 {
     for (Observer subscriber : subscribers)
     {
         subscriber.update(message);
     }
 }

 public void publishNewArticle(String articleTitle) 
 {
     System.out.println("Publishing new article: " + articleTitle);
     notifyObservers("New article published: " + articleTitle);
 }
}

