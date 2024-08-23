package org.example.Data;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

import java.util.Date;

@Entity
class Comment {
    @Id
    Long id;
    String text;
    Date datePosted;

    @OneToOne
    User author;

    @OneToOne
    Recipe recipe;

}
