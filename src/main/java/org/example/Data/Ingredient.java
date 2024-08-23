package org.example.Data;

import jakarta.persistence.Id;

class Ingredient {

  @Id
  Long id;

  String name;

  int quantity;

  String unitOfMeasurement;


}
