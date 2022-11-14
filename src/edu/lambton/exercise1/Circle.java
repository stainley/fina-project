package edu.lambton.exercise1;

public class Circle {
    private double radius = 1.0;
    private String color = "red";

    public Circle() {}

    public Circle(double r) {
        this.radius = r;
    }

    public Circle(double r, String color) {
        this.radius = r;
        this.color = color;
    }

    public double getRadius() {
        return this.radius;
    }

    public double getArea() {
        return (this.radius * Math.PI) * 2;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return this.color;
    }
    public void setColor(String color) {
        this.color = color;
    }
}
