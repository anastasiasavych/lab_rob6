package com.company;

public class KindOfHorses extends Horse {
    int speed;

    public KindOfHorses( double weight, double height, int speed){
        super(weight,height, speed);

    }
    public void isType1(){
        double wh =  weight / height;
        if (speed < 75  & wh < 280){
            System.out.println("Кінь скакової породи, який бере участь у перегонах.");
        }
        else if (speed < 55 & wh < 400){
            System.out.println("Упряжний кінь.пересувається зазвичай риссю,можуть везти візок з вершником, або лише вершника.");
        }
        else if ( speed < 35 & wh < 680){
            System.out.println("Великий кінь, що перевозить важкі вантажі, воліє пересуватися кроком.");
        }else {
            System.out.println("Ви ввели щось не те " + wh);
        }
    }

}
