package VvedenieVOOP;

public class Cat {
    // private ограничили использование переменных в пределах класса
    private String name;
    private String color;
    private int age;

    // Создаем пустой конструктор для другой формы определения cat2

    public Cat() {

    }

    //В итоге несколько конструкторов образуют перегружАемый конструктор


    public Cat(String name, String color) {
        this.name = name;
        this.color = color;
    }

    // Создали конструктор для упрощения кода alt-insert
    public Cat(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    // Вызовем конструктор внутри конструктора
    public Cat(String name) {
        this (name, "бело-черный", 4);

    }


    public void info(){

        System.out.println("Кот "+ name+ " цвет "+ color+" возраст "+age + " года");
    }

    public void jump(){

        System.out.println("Кот "+ name+ " прыгает");
    }

    public void slip(){

        System.out.println("Кот "+ name+ " спит...");
    }

// Использовали геттер для доступа к информации полей
    public String getName() {
        return name;
    }

    public String getColor() {
      return color;
    }

    public int getAge() {
        return age;
    }
// Использовали сеттер для возможности изменения поля
    public void setAge(int age) {
        if (age<0){
            System.out.println("Возраст кота не может быть отрицательным");
        } else {
            this.age = age;
        }

    }
}
