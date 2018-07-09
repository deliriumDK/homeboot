package ru.otus.dao;

import ru.otus.model.Question;

import java.net.URL;
import java.util.ArrayList;

public interface IParserCsvDao {

    ArrayList<Question> getQuestionList(String filePath, String locale);
}
