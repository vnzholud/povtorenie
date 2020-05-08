package StringOOP;

public class Plate {

    int food = 100;

    public Plate(int food) {
        this.food = food;
    }

   public void info(){

       System.out.println("В тарелке " + food + " еды");
   }

    public int getFood() {
        return food;
    }


    public void redusFood(int aet) {
        food-=aet;
    }

   // Добавляем метод наполнения тарелки

    public void plusePlate(int PlusEatplate){
        food+=PlusEatplate;

        System.out.println("В тарелке " + food + " еды можно кормить котов");
    }
}


