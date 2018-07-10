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
    private final ApplicationSettings settings;

    @Autowired
    public ParserCsvServiceImpl(IParserCsvDao dao, ApplicationSettings settings) {
        this.filePath = settings.getCsvFilePath();
        this.locale = settings.getLocaleProp();
        this.settings = settings;
        this.dao = dao;
    }

    public ArrayList<Question> getQuestionList() {
        return dao.getQuestionList(filePath, locale, settings);
    }
}