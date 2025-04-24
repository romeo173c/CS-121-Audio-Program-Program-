import Files.Options;
import Files.Quiz;


public class Main {
    public static void main(String[] args) {
        
        boolean keepGoing = true;

        while (keepGoing) {
            System.out.println();
            System.out.println("Welcome to Audio Nerds where you can learn topics audio related");
            System.out.println("--------------------------------------");
            System.out.println("1) Mixing ");
            System.out.println("2) Mastering ");
            System.out.println("3) Quiz yourself");
            System.out.println("4) Leave Indefinitly");
            System.out.println();
            System.out.println("Please choose an option ");
            System.out.println();
            int choice = Options.scanner.nextInt();


            switch (choice) {

                case 1:
                    new Mixing().Start();
                    break;
                case 2:
                    new Mastering().Start();
                    break;
                case 3:
                   new Quiz().Start();
                   break;
                case 4:
                    System.out.println("Come Back Next Time !!!");
                    keepGoing = false;
                    break;
                default:
                    System.out.println("Please choose an option listed");

            }

            

        }
    }
}