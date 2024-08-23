package org.example;

import org.hibernate.SessionFactory;
import org.hibernate.relational.SchemaManager;

public class Main {
    public static void main(String[] args) {

        Database.getSessionFactory();
    }
}