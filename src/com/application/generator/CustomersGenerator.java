package com.application.generator;

import com.application.model.Customer;
import com.application.model.enums.Membership;

import java.util.ArrayList;
import java.util.List;

public class CustomersGenerator {
    public static List<Customer> generateCustomers() {
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer(1, "John", "Smith", Membership.SILVER));
        customers.add(new Customer(2, "Whitney", "Henson", Membership.GOLD));
        customers.add(new Customer(3, "Bradlee", "Patterson", Membership.SILVER));
        customers.add(new Customer(4, "Leonardo", "Ramsay", Membership.PLAT));
        customers.add(new Customer(5, "Darcey", "Cottrell", Membership.GOLD));
        customers.add(new Customer(6, "Sumaiya", "Cox", Membership.PLAT));
        customers.add(new Customer(7, "Sadie", "Dupont", Membership.SILVER));
        customers.add(new Customer(8, "Chace", "Pope", Membership.GOLD));
        customers.add(new Customer(9, "Lia", "Bradley", Membership.GOLD));
        customers.add(new Customer(10, "Bianca", "Acevedo", Membership.PLAT));
        customers.add(new Customer(11, "Keane", "Nelson", Membership.SILVER));
        customers.add(new Customer(12, "Fariha", "Hanna", Membership.PLAT));
        customers.add(new Customer(13, "Tommy", "Couch", Membership.GOLD));
        customers.add(new Customer(14, "Tasneem", "Plummer", Membership.SILVER));
        customers.add(new Customer(15, "Roseanna", "Banks", Membership.GOLD));

        return customers;
    }
}
