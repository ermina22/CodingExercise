import java.util.*;
import java.util.regex.*;


public class Main
{
	public static void main(String[] args) {
	    Scanner inputScanner = new Scanner(System.in);
        Quiz quiz = new Quiz(inputScanner);
        
        
		while(true){
		    System.out.println("\n-----\n");
		    System.out.println("Pick and enter the option you want to do:");
		    System.out.println("[1] Ask a question");
		    System.out.println("[2] Add a new question");
		    System.out.println("[3] Exit");
		    System.out.println("\n-----\n");
		    
            
            String option = inputScanner.nextLine();
            switch (option) {
                case "1": {
                    System.out.println("\nEnter the question:\n");
                    String question = inputScanner.nextLine();
                    List<String> answers = quiz.GetAnswersForAQuestion(question);
                    if(answers == null) {
                        System.out.println("\n\"The answer to life, universe and everything is 42\" according to \"The Hitchhikers Guide to the Galaxy\"\n");
                    } else {
                        for(String answer:answers) {
                            System.out.println(answer);
                        }
                        
                    }
                    
                    break;
                }
                case "2": {
		            System.out.println("\nEnter the question and its answers:\n");
		            
                    String questionAndAnswers = inputScanner.nextLine();
                    String[] parts = Arrays.stream(questionAndAnswers.split("\""))
                    .map(String::trim)
                    .filter(s -> s.length() != 0)
                    .toArray(String[]::new);;
                    
                    if(parts.length < 2) {
                        System.out.println("Enter a question and at least one answer. Try again.");
                        continue;
                    }
                    
                    String question = parts[0];
                    if(!quiz.ValidateQuestion(question)) {
                        continue;
                    }
                    
                    List<String> answers = Arrays.asList(Arrays.copyOfRange(parts, 1, parts.length));
                    
                    if(!quiz.ValidateAnswers(answers)) {
                        continue;
                    }
                    
                    
                    quiz.AddANewQuestion(question, answers);
                    System.out.println("\nQuestion successfully added.\n");
                    break;
                }
                case "3": {
                    System.out.println("\nBye!\n");
                    return;
                }
                default: {
                    System.out.println("\nPick a valid option from the list.\n");
                    continue;
                }
            }
        }
		
	}
	

}

