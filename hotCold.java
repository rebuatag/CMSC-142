import java.util.*;

public class hotCold{

	public static void main(String[] args) {
			Scanner console = new Scanner(System.in);
			Random randNum = new Random();
			int randomGuess = randNum.nextInt(10)+1;

			int numberGuess = 0;
			int tryGuess = 0;
			boolean correct = false;

			while(correct == false){
				System.out.println("Guess a number from 0 to 100: ");
				tryGuess = console.nextInt();
				numberGuess++;
			

			if(tryGuess == randomGuess){
				correct = true;
			}
			else if(tryGuess < randomGuess){
				System.out.println("Hotter");
			}else if(tryGuess > randomGuess){
				System.out.println("Colder");
			}
		}
			System.out.println("Correct");
			System.out.println("The number of guesses: "+numberGuess);

		}	
}