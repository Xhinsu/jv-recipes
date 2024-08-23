package org.example.Data;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jdk.jfr.Category;

import java.util.Date;
import java.util.List;

@Entity
class Recipe {
    @Id
    @GeneratedValue
    Long id;

    String title;

    String description;

    String instructions;

    double preparationTime;

    double  cookingTime;

    double servings;

    String difficultyLevel;

    Rating rating;

    @ManyToOne
    List<Ingredient> listOfIngredient;

    @ManyToOne
    List<Category> listOfCategories;

    User creator;

    Date date;

    Date lastModified;

}
