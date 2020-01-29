package geekbrains.java7;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Barsik", 5, false);
        Plate plate = new Plate(20);
        plate.info();
        cat.eat(plate);
        plate.info();
        Cat cat1 = new Cat("Joja", 9, false);
        cat.eat(plate);
        plate.info();
        Cat cat2 = new Cat("Bimbo", 10, false);
        cat.eat(plate);
        plate.info();
        plate.addFood();
        plate.info();
    }
}
