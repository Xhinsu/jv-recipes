package org.example;

import org.hibernate.SessionFactory;
<<<<<<< HEAD

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        SessionFactory sessionFactory = Database.getSessionFactory();

        sessionFactory.getSchemaManager().exportMappedObjects(true);






=======
import org.hibernate.relational.SchemaManager;

public class Main {
    public static void main(String[] args) {

        Database.getSessionFactory();
>>>>>>> ac81f90219f149ab9b9e95ed0369f00e6d8c0f17
    }
}