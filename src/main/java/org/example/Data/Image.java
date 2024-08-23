package org.example.Data;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
class Image {
    @Id
    Long id;

    String fileName;
    String fileData;
    Recipe  recipe;
}
