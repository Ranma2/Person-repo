package com.ranaëlle;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
      Address address = new Address(
              546,
              "Frances Way",
              "Richardson",
              "Texas",
              "United States",
              75081
      );

      Car mustang = new Car(
              CarBrand.MUSTANG,
              new BigDecimal(50000)
      );

      Car[] cars ={mustang};

      Person robert = new Person(
              "Robert",
              50,
             Gender.MALE,
              House.Cottage,
              address,
              cars
      );
    }
}