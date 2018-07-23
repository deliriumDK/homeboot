package ru.otus.dao;

import ru.otus.model.Question;

import java.util.ArrayList;

public interface IParserCsvDao {

    ArrayList<Question> getQuestionList(String filePath,
                                        String locale,
                                        int lineAnswer,
                                        int lineText,
                                        int[] lineOptions,
                                        int lineLocale);
}
