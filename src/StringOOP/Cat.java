package StringOOP;

public class Cat {

    String name;
    int appetit;
    boolean fedup = false;

    public Cat(String name, int appetit, boolean fedup) {
        this.name = name;
        this.appetit = appetit;
        this.fedup = fedup;
    }



    public void eat(Plate plate, String name) {

        if ( fedup!=true && appetit<=plate.food && plate.food!=0){
            System.out.println(name + " кушает");
            plate.redusFood(appetit);
            fedup = true;

        } else if (fedup==true) {
            System.out.println("Кот " + name + " сыт");
        } else

        System.out.println("В тарелке мало еды!"+ " Кот "+ name + " не стал есть");



    }

        public int getAppetit () {
            return appetit;
        }



}