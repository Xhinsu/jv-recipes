package org.example;

import org.hibernate.SessionFactory;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        SessionFactory sessionFactory = Database.getSessionFactory();

        sessionFactory.getSchemaManager().exportMappedObjects(true);






    }
}