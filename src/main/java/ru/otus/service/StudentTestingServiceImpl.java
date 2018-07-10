package ru.otus.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;
import ru.otus.config.ApplicationSettings;
import ru.otus.model.Question;
import ru.otus.model.Student;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

@Service
public class StudentTestingServiceImpl implements  StudentTestingService {

    private final MessageSource messageSource;
    private final ParserCsvService csvParser;
    private final Locale localeInjViaConfig;
    private final Locale localeViaSettings;
    private final int rightAnswer;
    private final int defaultMark;
    private final String msgName;
    private final String msgAge;
    private final String msgError;
    private final String msgResult;

    @Autowired
    public StudentTestingServiceImpl(ParserCsvService csvParser,
                                     MessageSource messageSource,
                                     ApplicationSettings settings,
                                     Locale locale) {
        this.csvParser = csvParser;
        this.localeInjViaConfig = locale;
        this.messageSource = messageSource;
        this.defaultMark = settings.getDefaultMark();
        this.rightAnswer = settings.getRightAnswer();
        this.localeViaSettings = new Locale(settings.getLocaleProp());
        this.msgAge = settings.getMsgAge();
        this.msgError = settings.getMsgError();
        this.msgName = settings.getMsgName();
        this.msgResult = settings.getMsgResult();
    }

    public void startStudentTesting() {
        Student student = new Student();
        Scanner scanner = new Scanner(System.in);
        greetings(student, scanner);
        questionsTest(csvParser.getQuestionList(), student, scanner);
        scanner.close();
        System.out.println(messageSource.getMessage(msgResult
                , new Object[]{student.getName(), student.getAge(), student.getMark()}
                , localeViaSettings));
    }

    private void questionsTest(ArrayList<Question> questionList, Student student, Scanner scanner) {
        student.setMark(defaultMark);
        for (Question question : questionList) {
            System.out.println(question.getText());
            System.out.println(question.getOptions());
            if (scanner.nextLine().equalsIgnoreCase(question.getAnswer())){
                student.setMark(student.getMark() + rightAnswer);
            }
        }
    }

    private void greetings(Student student, Scanner scanner) {
        System.out.print(messageSource.getMessage(msgName, new String[]{}, localeInjViaConfig));
        student.setName(scanner.nextLine());
        System.out.print(messageSource.getMessage(msgAge, new String[]{}, localeInjViaConfig));
        try {
            student.setAge(Integer.valueOf(scanner.nextLine()));
        } catch (NumberFormatException e) {
            System.out.println(messageSource.getMessage(msgError, new String[]{}, localeInjViaConfig));
            greetings(student, scanner);
        }
    }
}
