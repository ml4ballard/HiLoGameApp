

import java.util.Scanner;

public class HiLo {

	public static void main(String[] args) {
	
		Scanner intScanner = new Scanner(System.in);
		Scanner stringScanner = new Scanner(System.in);
		
		int randomNum = 0;
		char PlayaRound = 'Y';
		
        do {
        	
// Get the randomNum
		
		   randomNum = ComputerRandom();
//  System.out.printf("Random number is: %d " , randomNum);	
//  System.out.println (" ");
  
		   PlayaRound = AskaQuestion();
		
// User guess number section 
		
		   int NumGuess = 1;
		   int guess = 0;
		   char correct = 'N';
		
		   while ( NumGuess <= 5 && correct == 'N' && PlayaRound == 'Y') {
			   System.out.println(" ");
			   System.out.printf("Guess %d Enter number 1 - 20: " , NumGuess);
			   guess = intScanner.nextInt();
			   
			   if ( NumGuess == 5 && guess != randomNum ) {
				   System.out.println(" ");
				   System.out.printf("You LOSE! My number was %d" , randomNum);
				   System.out.println(" ");
				   correct = 'N';
			   }
			   else if ( guess < randomNum ) {
				   System.out.println("");
				   System.out.println("Guess is too low");
			   }
			   else if ( guess > randomNum ) {
				   System.out.println("");
				   System.out.println("Guess is too high");	
			   }
			   else if ( guess == randomNum ) {
				   System.out.println("");
				   System.out.printf("You WON! My number was %d " , randomNum );
				   System.out.println(" ");
				   correct = 'Y';
			   }
			   NumGuess ++;
		   }
					
        } while (PlayaRound == 'Y');
        
// Answer = N so exiting
        System.out.println("");
        System.out.println("Thanks for playing, bye bye!");
        System.out.println("");
		
	}
	
	public static int ComputerRandom() {
		int max = 20;
		int min = 1;
		int randomNum = min + (int)(Math.random() * ((max - min) + 1));
    	return randomNum;
	}
	
	public static char AskaQuestion() {
		Scanner stringScanner = new Scanner(System.in);
		System.out.println("");
		System.out.print("Want to play Hi Low, you get 5 guesses. Y or N: ");
		char PlayaRound = stringScanner.next().charAt(0);
//		stringScanner.close();  Commented this out to keep user input working on yes and no
// Cannot close within the loop scanner is not long for this class so it will be ok.
		return PlayaRound;
		}	
    }

