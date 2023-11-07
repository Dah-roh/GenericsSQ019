package org.example.generics.entities;

import lombok.Data;

@Data
public class Furniture extends CategoryType {

   private String producer;
   private String design;
   private String productionLocation;

}
