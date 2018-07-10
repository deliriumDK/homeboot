package ru.otus.dao;

import com.opencsv.CSVReader;
import org.springframework.stereotype.Repository;
import ru.otus.config.ApplicationSettings;
import ru.otus.model.Question;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

@Repository
public class ParserCsvDao implements IParserCsvDao {

    public ArrayList<Question> getQuestionList(String filePath, String locale, ApplicationSettings settings) {
        ArrayList<Question> questionList = new ArrayList<>();
        CSVReader reader;
        try {
            reader = new CSVReader(new InputStreamReader(getClass().getResourceAsStream(filePath)));
            String[] line;
            while ((line = reader.readNext()) != null) {
                if (line[settings.getLineLocale()].equalsIgnoreCase(locale)) {
                    Question question = new Question();
                    question.setAnswer(line[settings.getLineAnswer()]);
                    question.setText(line[settings.getLineText()]);
                    List<String> options = new ArrayList<>();
                    for (int option : settings.getLineOptions()) {
                        options.add(line[option]);
                    }
                    question.setOptions(options);
                    questionList.add(question);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return  questionList;
    }
}