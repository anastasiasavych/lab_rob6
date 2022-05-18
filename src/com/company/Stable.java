package com.company;

 public class Stable {

    private double height;
    private double width;
    private double lenght;

    public Stable(double height,double width,double lenght) {
        this.height = height;
        this.width = width;
        this.lenght = lenght;
    }

    public Stable(double i){
        width = lenght = i;
        // перевизначений конструктор
    }

    public Stable(){
        // не приймає жодних параметрів
    }

    void square(){
         double sq = width * lenght;
        System.out.println("Площа загону (одного коня): " + sq + "м2");
    }

    //get()/set()
    public double getHeight(){
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double getWidth(){
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getLenght(){
        return lenght;
    }
    public void setLenght(double lenght) {
        this.lenght = lenght;
    }
}




