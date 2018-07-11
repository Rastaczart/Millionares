package pl.akademiakodu;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main extends JFrame {



    private JButton buttonYes;
    private JButton buttonNo;
    private JLabel labelQuestion;

    public Main(){
        super("Milionerzy");
        setSize(500,500);
        setDefaultCloseOperation(1);//sprawia ze dziala przycisk exit
        setVisible(true);//
        buttonYes =new JButton("Tak");
        buttonNo =new JButton("Nie");
        labelQuestion = new JLabel("Czy Polska leży w Europie",0);
        add(buttonYes);
        add(buttonNo);
        add(labelQuestion);
0   }




    public static void main(String[] args) {
    List<Question> questionList =new ArrayList<>();
    Main main = new Main();
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
