package com.application.controller;

import com.application.model.Customer;

import java.util.List;
import java.util.PriorityQueue;

public class MainController {
    private final CustomerController customerController;
    private final PrioritizingController prioritizingController;

    public MainController() {
        customerController = new CustomerController();
        prioritizingController = new PrioritizingController();
    }


    public void startApplication() {
        System.out.println("Hello in SimpleQueue application.\n\n" +
                "Please pick 5 customers which would you like to add to AwaitingList\n");

        List<Customer> awaitingCustomersList = customerController.pickNumberOfCustomers(5);
        PriorityQueue<Customer> prioritizedCustomers = prioritizingController.performQuestionnaireForCustomers(awaitingCustomersList);
        printPrioritizedCustomers(prioritizedCustomers);
    }

    private void printPrioritizedCustomers(PriorityQueue<Customer> prioritizedCustomers) {
        while(prioritizedCustomers.size() > 0) {
            Customer polledCustomer = prioritizedCustomers.poll();
            System.out.println(polledCustomer + "  ---  POINT: " + polledCustomer.getPriorityQueuePoints());
        }
    }
}
