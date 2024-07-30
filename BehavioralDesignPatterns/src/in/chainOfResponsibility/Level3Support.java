package in.chainOfResponsibility;


class Level3Support extends Handler
{
 @Override
 public void handleRequest(String request)
 {
     if (request.equals("advanced")) 
     {
         System.out.println("Level 3 support handling advanced request.");
     } 
     else 
     {
         System.out.println("Request cannot be handled.");
     }
 }
}

