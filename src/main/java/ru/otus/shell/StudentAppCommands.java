package ru.otus.shell;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import ru.otus.service.StudentTestingService;

@ShellComponent
public class StudentAppCommands {

    private final StudentTestingService studentTestingService;

    @Autowired
    public StudentAppCommands(StudentTestingService studentTestingService) {
        this.studentTestingService = studentTestingService;
    }
    @ShellMethod("Start student testing service")
    public void startTesting() {
        studentTestingService.startStudentTesting();
    }
}
