package pl.akademiakodu;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.List;
public class Main extends JFrame implements ActionListener {



    private JButton buttonYes;
    private JButton buttonNo;
    private JLabel labelQuestion;
        //zmienna typu interfejsowego
        // co oznacza, że musi to tej zmiennej przekazac klasę
        // która będzie implementowała  interfejs  Question Generator
        // mowimy ogolnie o typie, ale nie mowi konkretnie o klasie
        // oidajemy kategorie do, której bedzie nalezec klasa
    private QuestionGenerator questionGenerator;
    private int currentQuestion = 0;

    //lista pytań
    private List<Question> questionList =new ArrayList<>();

    public void setQuestionGenerator(QuestionGenerator questionGenerator) {
        // ustawiamy zmienna z 21 linijki na tą, kktora jest podana w argumencie metody
        this.questionGenerator = questionGenerator;
        /*tutaj zakładamy że już mamy obiekt jakiejs klasy
        na etapie pisania kody nie wiemy kompletnie jaka to bedzie klasa
        tylko wiemy ze musi implementowac interfejs questiongenerator
        wypelniamy liste pytaniami, ktore sa generowane za pomoca metody generateQuestions*/

        questionList =questionGenerator.generateQuestions();
    }

    public Main(){
        super("Milionerzy"); // ustawia tytul okna
        setSize(500,500);// ustawie wielkosc okna
        setDefaultCloseOperation(1);//sprawia ze dziala przycisk exit
        setVisible(true);//
        setQuestionGenerator(new SimpleQuestionGenerator());
        //ustawiamy konkretna klase ktora bedzie generowac pytanie
        // za pomoca New NazwaKlasy 

        buttonYes =new JButton("Tak");
        buttonNo =new JButton("Nie");
        buttonYes.addActionListener( this);
        buttonNo.addActionListener( this);
        labelQuestion = new JLabel(questionList.get(0).getContent(),0);

        add(labelQuestion);
        add(buttonYes);
        add(buttonNo);
        setLayout(new GridLayout(3,1));
   }



    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Main main = new Main();
            }
        });
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (questionList.size() > currentQuestion + 1) {
            labelQuestion.setText(questionList.get(++currentQuestion).getContent());
            System.out.println("Kliknięto mnie!");
        } else
            JOptionPane.showMessageDialog(this, "koniecQuizu");
        buttonNo.setEnabled(false);
        buttonYes.setEnabled(false);
    }


}
