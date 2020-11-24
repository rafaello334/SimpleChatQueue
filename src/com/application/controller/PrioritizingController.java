package com.application.controller;

import com.application.generator.QuestionsGenerator;
import com.application.model.Answer;
import com.application.model.Customer;
import com.application.model.Question;
import com.application.model.enums.Membership;
import com.application.utils.ScannerUtil;

import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class PrioritizingController {
    private final List<Question> questions;

    public PrioritizingController() {
        questions = QuestionsGenerator.generateQuestions();
    }

    public PriorityQueue<Customer> performQuestionnaireForCustomers(List<Customer> pickedCustomers) {
        PriorityQueue<Customer> customerPriorityQueue = new PriorityQueue<>();
        for(Customer customer: pickedCustomers) {
            System.out.println("\n\nQuestionnaire for customer: " + customer.getName() + " " + customer.getSurname() + " has started!\n");
            int questionnairePoints = performQuestionnaireAndGetPoints();
            int membershipPoints = calculatePointsForMemberShip(customer.getMembership());
            customer.setPriorityQueuePoints(questionnairePoints + membershipPoints);
            customerPriorityQueue.add(customer);
        }

        return customerPriorityQueue;
    }

    private int performQuestionnaireAndGetPoints() {
        int customerPoints = 0;
        for(Question question : questions) {
            Answer userAnswer;
            do {
                printQuestionAndAnswers(question);
                userAnswer = ScannerUtil.getPossibleAnswer(question.getAnswers());
            } while (userAnswer == null);
            customerPoints += userAnswer.getPoints();
        }
        return customerPoints;
    }

    private void printQuestionAndAnswers(Question question) {
        System.out.println(question.getQuestion());
        for(Map.Entry<Character, Answer> entry : question.getAnswers().entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getAnswer());
        }
    }

    private int calculatePointsForMemberShip(Membership membership) {
        switch (membership) {
            case SILVER:
                return 10;
            case GOLD:
                return 15;
            case PLAT:
                return 20;
            default:
                return 0;
        }
    }
}
