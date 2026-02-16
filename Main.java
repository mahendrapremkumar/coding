class Bird {
    String name;
    String color;

    Bird(String name, String color) {
        this.name = name;
        this.color = color;
    }

    void fly() {
        System.out.println(name + " is flying.");
    }

    void eat() {
        System.out.println(name + " is eating.");
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Color: " + color);
    }
}

public class Main {
    public static void main(String[] args) {
        Bird b1 = new Bird("Parrot", "Green");

        b1.display();
        b1.fly();
        b1.eat();
    }
}
