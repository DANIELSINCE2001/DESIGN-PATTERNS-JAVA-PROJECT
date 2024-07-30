package in.ObserverPattern;


interface Subject 
{
 void addObserver(Observer observer);
 void removeObserver(Observer observer);
 void notifyObservers(String message);
}
