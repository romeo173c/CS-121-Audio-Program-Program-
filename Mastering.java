import Files.Options;

public class Mastering extends Options {

    public void displayMenu () {
        System.out.println();
        System.out.println ("...Mastering Menu...");
        System.out.println();
        System.out.println ("1) Limiting ");
        System.out.println ("2) Loudness ");
        System.out.println ("3) Track Reference ");
        System.out.println ("4) Range Control");
        System.out.println ("5) Exit ");
        System.out.println();
        System.out.println("Please choose one of the options above to learn more");
        System.out.println();
    }



    public boolean organizeChoice (int choice ) {

        switch (choice) {
            case 1: 
                System.out.println("Limiting is a more aggressive form of compression that prevents audio from going above a set level ");
                break;
            case 2:
                System.out.println(" Loudness is how loud a sound feels to the ears and how your ears perceive a sound at a certain frequencie level ");
                break;
            case 3: 
                System.out.println("Track Reference is referencing an existing fully mixed and mastered track and use it as a benchmark for tone, balance, loudness, and stereo width to your track");
                break;
            case 4:
                System.out.println("Range Control refers to managing the dyanmic/frequency range of an incoming signal");
                break;
            case 5: 
                System.out.println("Exiting to Main Menu :) ");
                return false;
            default:
                System.out.println("Please choose a vaild option");

        }
        return true;
}



    



    
    }




