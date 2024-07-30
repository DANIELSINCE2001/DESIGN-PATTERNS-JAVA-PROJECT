package in.chainOfResponsibility;


class Level2Support extends Handler
{
 @Override
 public void handleRequest(String request)
 {
     if (request.equals("intermediate")) 
     {
         System.out.println("Level 2 support handling intermediate request.");
     } 
     else if (successor != null)
     {
         System.out.println("Level 2 support passing request to Level 3.");
         successor.handleRequest(request);
     }
 }
}
