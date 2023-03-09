package com.example.java8learning.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class Car {
    int id;
    int manufacturerId;
    String model;
    int year;
    float rating;

    public Car(int id, int manufacturerId, String model, int year) {
        this.id = id;
        this.manufacturerId = manufacturerId;
        this.model = model;
        this.year = year;
    }
}