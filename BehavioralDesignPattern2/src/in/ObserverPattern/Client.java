package in.ObserverPattern;


public class Client
{
 public static void main(String[] args)
 {
     Newsletter newsletter = new Newsletter();

     Observer john = new Subscriber("Daniel");
     Observer jane = new Subscriber("Unnath");

     newsletter.addObserver(john);
     newsletter.addObserver(jane);

     newsletter.publishNewArticle("Observer Pattern in Java");

     newsletter.removeObserver(john);

     newsletter.publishNewArticle("More Design Patterns");
 }
}
