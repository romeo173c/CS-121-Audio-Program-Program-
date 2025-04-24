import Files.Options;

public class Mixing extends Options {

public void displayMenu () {
    System.out.println();
    System.out.println ("...Mixing Menu...");
    System.out.println();
    System.out.println ("1) EQ ");
    System.out.println ("2) Compression ");
    System.out.println ("3) Reverb ");
    System.out.println ("4) Delay ");
    System.out.println ("5) Exit ");
    System.out.println();
    System.out.println(" Please choose one of the options above to learn more ");
    System.out.println();
}

public boolean organizeChoice (int choice) {
    switch (choice) {


        case 1: 
            System.out.println ("EQ is a tool used to adjust the balance of different frequencies in a sound");
            break;
        case 2:
            System.out.println ("Compression is a process that controls the dynamic range of a sound");
            break;
        case 3:
            System.out.println ("Reverb is a vocal effect where your able to make an artifical echo effect");
            break;
        case 4:
            System.out.println ("Delay is a vocal effect that will delay the incoming input audio at the rate you set ");
            break;
        case 5:
            System.out.println (" Leaving to Main Menu :) ");
            return false;
        default:
            System.out.println ("Please choose a vaild option ");
        
    }

    return true;

}

}