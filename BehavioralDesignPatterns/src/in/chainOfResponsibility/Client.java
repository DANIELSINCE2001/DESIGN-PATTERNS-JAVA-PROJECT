package in.chainOfResponsibility;


class Client
{
 public static void main(String[] args)
 {
     Handler level1 = new Level1Support();
     Handler level2 = new Level2Support();
     Handler level3 = new Level3Support();

     level1.setSuccessor(level2);
     level2.setSuccessor(level3);

     System.out.println("Sending a basic request:");
     level1.handleRequest("basic");

     System.out.println("\nSending an intermediate request:");
     level1.handleRequest("intermediate");

     System.out.println("\nSending an advanced request:");
     level1.handleRequest("advanced");

     System.out.println("\nSending an unhandled request:");
     level1.handleRequest("unknown");
 }
}
