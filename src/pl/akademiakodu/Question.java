package pl.akademiakodu;


// Klasa Question, ktora jest odpowiedzialna za przechowywanie konkretnego pytania
// pytanie ma tylko opcje tak lub nie
public class Question {

//treść pytanie
 private String content;
//Czy tak jest poprawne
 private boolean isCorrect;


    // konstruktor parametrowy
    public Question(String content, boolean isCorrect)
    {
        this.content = content;
        this.isCorrect = isCorrect;
    }
    //getter otrzymuje dane
    public String getContent()
    {
        return content;
    }


    //setter zmienia treść pytanie
    public void setContent(String content)
    {
        this.content = content;
    }

    //getter dla boolean'a
    public boolean isCorrect()
    {
        return isCorrect;
    }
    //setter dla booleana
    public void setCorrect(boolean correct)
    {
        isCorrect = correct;
    }

    @Override
    //wyświetla czytelna treść pytania, wygenerował IntelliJ
    public String toString() {
        return "Question{" +
                "content='" + content + '\'' +
                ", isCorrect=" + isCorrect +
                '}';
    }
}
