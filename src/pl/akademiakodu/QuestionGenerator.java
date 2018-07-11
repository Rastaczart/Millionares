package pl.akademiakodu;
import  java.util.List;
/* interfejs
Klasa która implementuje interfejs
dzieki temu moze byc traktowana jako typ SimpleQuestionGenerator
ale te z jako typ QuestionGenerator
*/


public interface QuestionGenerator {
    // metoda, ktora ma zwracać ma listę pytań
    // w jakiś sposób
    // ale nie wiemy w jaki
List<Question> generateQuestions();

}
