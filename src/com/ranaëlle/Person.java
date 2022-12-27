package com.ranaëlle;

import java.util.Arrays;
import java.util.Objects;

public class Person {
    private String name;
    private int age;
   private Gender gender;
   private House house;

    private Address address;
    private Car[] cars;

    public Person(String name, int age, Gender gender, House house, Address address, Car[] cars) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.house = house;
        this.address = address;
        this.cars = cars;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Car[] getCars() {
        return cars;
    }

    public void setCars(Car[] cars) {
        this.cars = cars;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", house=" + house +
                ", address=" + address +
                ", cars=" + Arrays.toString(cars) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name) && gender == person.gender && house == person.house && Objects.equals(address, person.address) && Arrays.equals(cars, person.cars);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name, age, gender, house, address);
        result = 31 * result + Arrays.hashCode(cars);
        return result;
    }
}