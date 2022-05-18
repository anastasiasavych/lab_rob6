package com.company;

public class Horse {
     double height;
     double weight;
     int endurance;

    public Horse(double weight, double height, int endurance){
        this.height = height;
        this.weight = weight;
        this.endurance = endurance;
    }

    void horseR(){
        System.out.println("Кінь Расл. Ріст " + height + "м. Вага " + weight + "кг");
    }
        void isType() {
            double type1 = weight / height;
            if (type1 > 120 & type1 < 170) {
                System.out.println("Скакун у відношенні маса/висота належить типу 'Легкий'");
            } else if (type1 > 170 & type1 < 320) {
                System.out.println("Скакун у відношенні маса/висота належить типу 'Середній'");
            } else if (type1 > 320 & type1 < 430) {
                System.out.println("Скакун у відношенні маса/висота належить типу 'Важкий'");
            } else if (type1 > 430 & type1 < 680) {
                System.out.println("Скакун у відношенні маса/висота належить типу 'Дуже важкий'");
            }else {
                System.out.println("Щось не так(");
            }
        }


        void isEndurance() {
            if (endurance >= 6) {
                System.out.println("Тренування триває. Скакун прекрасно себе, продовжуйте тренування. <" + endurance + ">");
            } else if (endurance > 2 & endurance < 6) {
                System.out.println("Тренування триває. У скакуна подає рівень витривалості. <" + endurance + ">");
            } else {
                System.out.println("Тренування триває. Скакун виснежений, час відпочинку!");
            }

        }
}






