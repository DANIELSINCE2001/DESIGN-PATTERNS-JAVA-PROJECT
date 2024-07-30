package in.chainOfResponsibility;


class Level1Support extends Handler
{
 @Override
 public void handleRequest(String request)
 {
     if (request.equals("basic"))
     {
         System.out.println("Level 1 support handling basic request.");
     } 
     else if (successor != null)
     {
         System.out.println("Level 1 support passing request to Level 2.");
         successor.handleRequest(request);
     }
 }
}
