package com.application.model;

import java.util.Map;

public class Question {
    private final String question;
    private final Map<Character, Answer> answers;

    public Question(String question, Map<Character, Answer> answers) {
        this.question = question;
        this.answers = answers;
    }

    public String getQuestion() {
        return question;
    }

    public Map<Character, Answer> getAnswers() {
        return answers;
    }
}
