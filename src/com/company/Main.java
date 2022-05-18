package com.company;

public class Main {
    public static void main(String[] args) {

        Horse rasl = new Horse(300,1.75,4);
        rasl.horseR();
        KindOfHorses koh = new KindOfHorses(350,1.55,60);
        koh.isType1();
        rasl.isType();
        rasl.isEndurance();
        System.out.println();


        System.out.println();
        Stable st = new Stable(4,5,5);
        st.square();


        FieldForHorses ffh = new FieldForHorses(20,200,100);
        ffh.perimeter(2);
        System.out.println("Площа територіЇ для вигулу скакунів: " + ffh.squareForAll() + "м2");
        System.out.println("Площа території,яка припадає на одного скакуна: " +  ffh.squareForOne()+ "м2");

    }
}
