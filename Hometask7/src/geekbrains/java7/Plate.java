package geekbrains.java7;

import java.util.Scanner;

public class Plate {
    private int food;
    public Plate(int food) {
        this.food = food;
    }
    public void decreaseFood(int n) {
        if (food > Cat.appetite) {
            food -= n;
            Cat.satiety = true;
            System.out.println("Сытость " + Cat.satiety);
        } else {
            Cat.satiety = false;
            System.out.println("Еда кончилась T_T");
            System.out.println("Сытость " + Cat.satiety);
        }
    }
    public void info() {
        System.out.println("plate: " + food);
    }
    public void addFood(){
        System.out.println("Сколько еды добавить?");
        Scanner scanner = new Scanner(System.in);
        int extra_food = scanner.nextInt();
        food += extra_food;
    }
}
