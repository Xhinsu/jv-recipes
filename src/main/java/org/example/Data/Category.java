package org.example.Data;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
 class Category {
    @Id
    Long id;

    String name;
}
