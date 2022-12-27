package com.ranaëlle;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * Car class
 */

public class Car {
    private CarBrand carBrand;
    private BigDecimal price;

    public Car(CarBrand manufacturerName, BigDecimal price) {
        this.carBrand = manufacturerName;
        this.price = price;
    }

    public CarBrand getManufacturerName() {
        return carBrand;
    }

    public void setManufacturerName(CarBrand carBrand) {
        this.carBrand = Car.this.carBrand;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carBrand='" + carBrand + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(carBrand, car.carBrand) && Objects.equals(price, car.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(carBrand, price);
    }
}