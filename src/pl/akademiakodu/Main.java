package pl.akademiakodu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    List<Question> questionList =new ArrayList<>();

    questionList.add(new Question("Czy Polska leży w europie",true));
    questionList.add(new Question("Czy 2+5 =8",false));
    questionList.add(new Question("czy 2^10=1024",true));
    questionList.add(new Question("czy Chopin urodził się w Warszawie",false));
    int numberOfPoints =0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Milionerzy: odpowiadaj tak bądź nie na pytanie");

        for (Question question: questionList ){
            System.out.println(question.getContent());
            String answer = scanner.next();
            if ((answer.equals("tak") && question.isCorrect())
                    || (answer.equals("nie") && !question.isCorrect()))
            { numberOfPoints++;
            }
        }
        System.out.println("Zdobyłeś "+numberOfPoints);
    }
}
