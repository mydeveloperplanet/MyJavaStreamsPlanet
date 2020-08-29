package com.mydeveloperplanet;

import java.util.Objects;

public class Car {
    private int id;
    private String brand;
    private String type;
    private String color;

    public Car (int id, String brand, String type, String color) {
        this.id = id;
        this.brand = brand;
        this.type = type;
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return id == car.id &&
                Objects.equals(brand, car.brand) &&
                Objects.equals(type, car.type) &&
                Objects.equals(color, car.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, brand, type, color);
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", type='" + type + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
