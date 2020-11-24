package com.application.controller;

import com.application.generator.CustomersGenerator;
import com.application.model.Customer;
import com.application.utils.ScannerUtil;

import java.util.ArrayList;
import java.util.List;

public class CustomerController {
    private final List<Customer> generatedCustomers;

    public CustomerController() {
        generatedCustomers = CustomersGenerator.generateCustomers();
    }

    public List<Customer> pickNumberOfCustomers(int numberOfCustomersToPick) {
        List<Customer> awaitingCustomers = new ArrayList<>();
        int pickedCustomerNumber = 0;
        do {
            System.out.println("There are following customers in a list. Please pick one by typing his ID:\n");
            printRemainingCustomers();
            int userNumber = ScannerUtil.getIntFromConsole();
            if(userNumber < 0) {
                System.out.println("Invalid number. \n");
                continue;
            }
            Customer pickedCustomer = getCustomerById(userNumber);
            if(pickedCustomer != null) {
                awaitingCustomers.add(pickedCustomer);
                pickedCustomerNumber++;
            }
        } while (pickedCustomerNumber < numberOfCustomersToPick);

        return awaitingCustomers;
    }

    private Customer getCustomerById(int customerId) {
        for(Customer cust : generatedCustomers) {
            if(cust.getId() == customerId) {
                generatedCustomers.remove(cust);
                return cust;
            }
        }
        System.out.println("Customer with id: " + customerId + " was not found");
        return null;
    }

    private void printRemainingCustomers() {
        for(Customer cust : generatedCustomers) {
            System.out.println(cust);
        }
    }
}
