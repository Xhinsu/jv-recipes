package org.example.Data;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
class Tag {
    @Id
    Long id;

    String name;

}
