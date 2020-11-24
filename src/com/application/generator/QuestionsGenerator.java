package com.application.generator;

import com.application.model.Answer;
import com.application.model.Question;

import java.util.*;

public class QuestionsGenerator {
    public static List<Question> generateQuestions() {
        List<Question> questions = new ArrayList<>();
        questions.add(createQuestion("How did you find us?", "Website", "From colleague", "Facebook", "Advertisement"));
        questions.add(createQuestion("Why do you call us?", "Service", "Reclamation", "Opinion", "Sales"));
        questions.add(createQuestion("Do you want to place an order?", "Yes", "No", "I have already placed an order"));
        questions.add(createQuestion("Would you want to leave some feedback?", "Yes", "No"));
        questions.add(createQuestion("Would you recommend us to your friend?", "Yes", "No"));

        return questions;
    }

    private static Question createQuestion(String question, String... answers) {
        Random random = new Random();
        Map<Character, Answer> result = new HashMap<>();
        for(int i=0; i< answers.length; i++) {
            result.put((char) (65 + i), new Answer(answers[i], random.nextInt(10) + 1));
        }

        return new Question(question, result);
    }
}
