package VvedenieVOOP;

import java.util.concurrent.Callable;

public class Main {

    public static void main(String[] args) {

        Cat cat1 = new Cat("Барсик","серый", 5);



        Cat cat2 = new Cat("Вася","серый",3);

        //cat2.name = ; Убрали после объявления переменных private
        //cat2.color = ;
        //cat2.age = 3;


        Cat cat3 = new Cat("Пушок", "Черный");

        Cat cat4 = new Cat("Мурзик");

        cat1.info();
        cat2.info();
        cat1.jump();
        cat1.slip();
        cat2.jump();
        cat2.slip();

        cat3.info();

        cat4.setAge(-777);

        System.out.println(cat1.getName()+ " "+ cat1.getColor()+ " "+ cat1.getAge());
        System.out.println(cat2.getName()+ " "+ cat2.getColor()+ " "+ cat2.getAge());
        System.out.println(cat3.getName()+ " "+ cat3.getColor()+ " "+ cat3.getAge());
        System.out.println(cat4.getName()+ " "+ cat4.getColor()+ " "+ cat4.getAge());
    }
}
