package pl.akademiakodu;

import java.util.ArrayList;
import java.util.List;

public class SimpleQuestionGenerator implements  QuestionGenerator {

    @Override
    public List<Question> generateQuestions() {
        List<Question> questionList = new ArrayList<>();
        questionList.add(new Question("Czy Polska leży w europie", true));
        questionList.add(new Question("Czy 2+5 =8", false));
        questionList.add(new Question("czy 2^10=1024", true));
        questionList.add(new Question("czy Chopin urodził się w Warszawie", false));
        return questionList;


    }
}