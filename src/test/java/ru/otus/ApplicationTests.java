package ru.otus;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import ru.otus.dao.ParserCsvDao;
import ru.otus.model.Question;
import ru.otus.service.ParserCsvService;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class ApplicationTests {

    @MockBean
    private ParserCsvDao parserCsvDao;
    @Autowired
    private ParserCsvService parserCsvService;

    @Test
    public void contextLoads() {
        List<Question> questions = new ArrayList<>();

        questions.a
    }

}
