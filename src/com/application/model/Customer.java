package com.application.model;

import com.application.model.enums.Membership;

import java.util.Objects;

public class Customer implements Comparable<Customer> {
    private final int id;
    private final String name;
    private final String surname;
    private final Membership membership;
    private int priorityQueuePoints;

    public Customer(int id, String name, String surname, Membership membership) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.membership = membership;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Membership getMembership() {
        return membership;
    }

    public int getPriorityQueuePoints() {
        return priorityQueuePoints;
    }

    public void setPriorityQueuePoints(int priorityQueuePoints) {
        this.priorityQueuePoints = priorityQueuePoints;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return id == customer.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Customer: " +
                "id = " + id +
                ", name = " + name +
                ", surname = " + surname +
                ", membership = " + membership;
    }

    @Override
    public int compareTo(Customer o) {
        return -1 * Integer.compare(this.priorityQueuePoints, o.getPriorityQueuePoints());
    }
}
