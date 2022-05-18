package com.company;

public class FieldForHorses {
    private int horse;
    private double length;
    private double width;

    public FieldForHorses(int horse, double length, double width) {
        this.horse = horse;
        this.length = length;
        this.width = width;
    }

    public FieldForHorses(double i) {
        width = length = i;
        //Перевизначений конструктор
    }

    void perimeter() {
        double p = 2 * (length + width);
        System.out.println(p);
    }

    //Перевизначений метод, що повертає значення периметру території
    void perimeter(double n) {
        double p = n * (length + width);
        System.out.println("Периметр всієї території: " + p + " м2");
    }

    double squareForAll() {
        double s1 = length * width;
        return s1;
    }

    double squareForOne() {
        double s2 = (length * width) / horse;
        return s2;
    }


    //get()/set()
    public int getHorse() {
        return horse;
    }

    public void setHorse(int horse) {
        this.horse = horse;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
