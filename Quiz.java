import java.util.*;

public class Quiz {
    public Quiz(Scanner inputScanner) {}
    
    HashMap<String, List<String>> questionsAndAnswers = new HashMap<String, List<String>>();
    
    public void AddANewQuestion(String question, List<String> answers) {
	    questionsAndAnswers.put(question, answers);
	}
	
	public List<String> GetAnswersForAQuestion(String question) {
	    return questionsAndAnswers.get(question);
	}
    
    public boolean ValidateQuestion(String question) {
        if(question.length() > 255) {
            System.out.println("Max length for a question is 255 characters. Try again.");
            return false;
        }
        
        return true;
    }
    
    public boolean ValidateAnswers(List<String> answers) {
        boolean questionsValid = true;
        for(String answer : answers) {
            if(answer.length() > 255) {
                questionsValid = false;
                break;
            }
        }
        
        if(!questionsValid) {
            System.out.println("Max length for an answer is 255 characters. Try again.");
            return false;
        }
        
        return true;
    }
}
