package com.application.model;

public class Answer {
    private final String answer;
    private final int points;

    public Answer(String answer, int points) {
        this.answer = answer;
        this.points = points;
    }

    public String getAnswer() {
        return answer;
    }

    public int getPoints() {
        return points;
    }
}
