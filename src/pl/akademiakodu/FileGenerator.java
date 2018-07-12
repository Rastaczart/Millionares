package pl.akademiakodu;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileGenerator implements QuestionGenerator {

    @Override
    public List<Question> generateQuestions() {
        String fileName = "questions.txt";
        List<String> list = new ArrayList<>();
        List<Question> questions = new ArrayList<>();

        try (Stream<String> stream = Files.lines(Paths.get(fileName))) {

            //1. filter line 3
            //2. convert all content to upper case
            //3. convert it into a List
            list = stream
                    .filter(line -> !line.startsWith("line3"))
                    .collect(Collectors.toList());

        } catch (IOException e) {
            e.printStackTrace();
        }

        for (String line : list) {
            System.out.println("Linia "+line);
            int indexQuestionMark = line.indexOf('?');
            String question = line.substring(0, indexQuestionMark + 1);
            if (line.contains("tak")) {
                questions.add(new Question(question,true));
            }
            if (line.contains("nie")) {
                questions.add(new Question(question,false));
            }

        }

        return questions;
    }

    public static void main(String[] args) {
        FileGenerator fileGenerator = new FileGenerator();
        System.out.println(fileGenerator.generateQuestions());
    }

}
