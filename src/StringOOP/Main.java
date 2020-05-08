package StringOOP;


public class Main {
    public static void main(String[] args) {


        int plusEatplate = 0;
        Cat [] cat = new Cat [5];

                cat[0] = new Cat("Vasya", 10, true);
                cat[1] = new Cat("Barsik", 10,false);
                cat[2] = new Cat("Murzik", 15,false);
                cat[3] = new Cat("Puschok", 13,false);
                cat[4] = new Cat("Chernisch", 11,false);



        Plate plate = new Plate(30);

        // Кормим котов

        for (int i = 0; i < 5; i++) {
            cat[i].eat(plate, cat[i].name);
            System.out.println("У кота " + cat[i].name + " аппетит " + cat[i].appetit);
        }

        // Выводим информацию о сытости котов

        for (int i = 0; i < 5; i++) {

            if(cat[i].fedup) {
                System.out.println("Кот " + cat[i].name + " сыт ");
            } else
                System.out.println("Кот " + cat[i].name + " голоден ");

        }

        plate.info();


        // Считаем сколько еды надо добавить в тарелку


        for (int i = 0; i < 5 ; i++) {

              if (cat[i].fedup!=true) {
                  plusEatplate += cat[i].appetit;
              }

           }
       System.out.println("В тарелку надо полодить "+plusEatplate+" еды");

       plate.plusePlate(plusEatplate);
       
        }



    }

