package in.sp.FacdePattern;


public class Client 
{
 public static void main(String[] args) 
 {
     MediaFacade mediaFacade = new MediaFacade();

     mediaFacade.loadMedia();
     mediaFacade.displayMedia();
     mediaFacade.deleteMedia("photo1.jpg", "video1.mp4");
 }
}

