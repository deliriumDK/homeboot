package ru.otus.dao;

import ru.otus.config.ApplicationSettings;
import ru.otus.model.Question;

import java.util.ArrayList;

public interface IParserCsvDao {

    ArrayList<Question> getQuestionList(String filePath, String locale, ApplicationSettings settings);
}
