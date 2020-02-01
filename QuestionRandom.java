package AP_Exam;

import java.util.Random;

	// Console support

/**
 * QuestionRandom class is intended to support asking question on test by randomizing order
 *
 * @author (John Mortensen)
 * @version (1.0)
 */
public class QuestionRandom extends Question
{
	
    /**
     * Constructor for objects of class Question
     * 
     * @param  void
     */
    public QuestionRandom()
    {
    	// This outputs constructor being run
        System.out.println("QuestionRandom class constructor");
        
        Random rand = new Random();
    	choiceOffset = rand.nextInt(answers.length);
    	
    	// Output showing randomization
    	System.out.println("choiceOffset: "+choiceOffset);
    }
      
    /**
     * Use Modulo arithmetic to randomly offset choices
     *
     */
    @Override
    final public void setupQuestion() {
    	// This outputs constructor being run
        System.out.println("QuestionRandom class setupQuestion Override method");
        
        // number of fixed answers
     	int modBase = choiceEfixed ? answers.length - 1 : answers.length;
     		
    	// scramble logic using modulo math
    	aOffset = choiceOffset % modBase;
    	bOffset = (choiceOffset+1) % modBase;
    	cOffset = (choiceOffset+2) % modBase;
    	dOffset = (choiceOffset+3) % modBase;
    	eOffset = choiceEfixed ? answers.length-1 : (choiceOffset+4) % modBase;
    	
    	// call super for standardized assignment
    	super.setupQuestion();
    	
    	// answer key set to match choice offset
		System.out.println("answerKey original: " +answerKey);
    	switch (answerKey) {
		case charA:
			answerKey = answers[aOffset];
			break;
		case charB:
			answerKey = answers[bOffset];
			break;
		case charC:
			answerKey = answers[cOffset];
			break;
		case charD:
			answerKey = answers[dOffset];
			break;
		case charE:
			answerKey = answers[eOffset];
			break;
    	}
    	
    	/* Remaining code is Console information to show reordering */
    	
    	// Outputs showing after randomization answerKey
		System.out.println("answerKey after offset: " +answerKey);
		
    	// Outputs showing randomization of letters
    	System.out.println(answers[0]);
    	System.out.println(answers[aOffset]);
    	System.out.println('-');
    	System.out.println(answers[1]);
    	System.out.println(answers[bOffset]);
    	System.out.println('-');
    	System.out.println(answers[2]);
    	System.out.println(answers[cOffset]);
    	System.out.println('-');
    	System.out.println(answers[3]);
    	System.out.println(answers[dOffset]);
    	System.out.println('-');
    	System.out.println(answers[4]);
    	System.out.println(answers[eOffset]);
    	System.out.println();
    }
  
}
