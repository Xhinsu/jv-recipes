package org.example.Data;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
class User {
    @Id
    Long id;
    String userName;
    double quantity;
    String email;
    String password;
    String[] roles = {"admin, regular user"};
    Date dateRegistered;
}
