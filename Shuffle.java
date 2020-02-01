package AP_Exam;

import java.util.Random;

public class Shuffle {
	public String Phrase(char[] input) {
		Random rand = new Random();
		int secondI=0;   
	       do{
	       int randomInt1 = rand.nextInt(input.length);
	       int randomInt2 = rand.nextInt(input.length);
	       
	       if(randomInt1 == randomInt2)
	       {
	    randomInt1 = ((randomInt2 + 1)%(input.length));     
	       }
	        char temp1 = input[randomInt1];
	        char temp2 = input[randomInt2];
	        input[randomInt1] = temp2;
	        input[randomInt2] = temp1; 
	        secondI++;
	    } while(secondI<100);
	       
	       String output = new String(input);
	       return output;
	}
}
