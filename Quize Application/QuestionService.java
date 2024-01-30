/**
 * QuestionService
 */
import java.util.Scanner;
public class QuestionService {

    Question[] questions = new Question[5];
    String selection[]= new String[5];

    public QuestionService(){
         //double, char, long, boolean
        questions[0] = new Question(1,"Size of int", "2", "1", "8", "4", "4");
        questions[1] = new Question(2,"Size of Double", "2", "1", "8", "4", "8");
        questions[2] = new Question(3,"Size of Char", "2", "1", "8", "4", "2");
        questions[3] = new Question(4,"Size of Long", "2", "1", "8", "4", "8");
        questions[4] = new Question(5,"Size of Boolean", "2", "1", "8", "4", "1");
        

    }

    public void playQuiz(){
        int i=0;
        for(Question q : questions){            
        System.out.println(" Question No. : " + q.getId());
        System.out.println(q.getQuestion());
        System.out.println(q.getOpt1());
        System.out.println(q.getOpt2());
        System.out.println(q.getOpt3());
        System.out.println(q.getOpt4());

        Scanner sc = new Scanner(System.in);
        selection[i] = sc.nextLine();
        i++;

        for(String s : selection){
            System.out.println(s);
        }
    }

}

public void printScore(){
    int score = 0;

    for(int i =0; i <questions.length; i++){
        Question que = questions[i];
    String actualAnswer = que.getAnswer();
    String userAnswer = selection[i];

    if(actualAnswer.equals(userAnswer)){
        score ++;
    }
    }
    System.out.println("Your Score is : " + score);
}



}