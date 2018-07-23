package ru.otus.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.otus.config.ApplicationSettings;
import ru.otus.dao.IParserCsvDao;
import ru.otus.model.Question;

import java.util.ArrayList;

@Service
public class ParserCsvServiceImpl implements ParserCsvService {

    private final IParserCsvDao dao;
    private final String filePath;
    private final String locale;
    private final int[] lineOptions;
    private final int lineText;
    private final int lineAnswer;
    private final int lineLocale;

    @Autowired
    public ParserCsvServiceImpl(IParserCsvDao dao, ApplicationSettings settings) {
        this.filePath = settings.getCsvFilePath();
        this.locale = settings.getLocaleProp();
        this.lineAnswer = settings.getLineAnswer();
        this.lineOptions = settings.getLineOptions();
        this.lineText = settings.getLineText();
        this.lineLocale = settings.getLineLocale();
        this.dao = dao;
    }

    public ArrayList<Question> getQuestionList() {
        return dao.getQuestionList(filePath, locale, lineAnswer, lineText, lineOptions, lineLocale);
    }
}