package in.ObserverPattern;


public class Client
{
 public static void main(String[] args)
 {
     Newsletter newsletter = new Newsletter();

     Observer daniel = new Subscriber("Daniel");
     Observer unnath = new Subscriber("Unnath");

     newsletter.addObserver(daniel);
     newsletter.addObserver(unnath);

     newsletter.publishNewArticle("Observer Pattern in Java");

     newsletter.removeObserver(daniel);

     newsletter.publishNewArticle("More Design Patterns");
 }
}
