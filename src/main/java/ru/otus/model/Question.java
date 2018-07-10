package ru.otus.model;

import java.util.List;

public class Question {

    private String text;
    private String answer;
    private List<String> options;

    public Question() { }

    public Question(String text, String answer, List<String> options) {
        this.text = text;
        this.answer = answer;
        this.options = options;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public List<String> getOptions() {
        return options;
    }

    public void setOptions(List<String> options) {
        this.options = options;
    }
}
