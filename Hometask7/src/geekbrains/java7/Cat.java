package geekbrains.java7;

public class Cat {
    private String name;
    public static int appetite;
    public static boolean satiety;
    public Cat(String name, int appetite, boolean satiety) {
        this.name = name;
        this.appetite = appetite;
    }
    public void eat(Plate p) {
        p.decreaseFood(appetite);

    }
}
