package org.example.Data;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
 class Rating {
    @Id
    Long id;
    int[] value = {1,2,3,4,5};
    Date dateRated;
    Recipe recipe;
    User Rater;
}
