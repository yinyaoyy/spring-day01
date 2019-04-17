package practice;

public class Dog implements  animal {
    @Override
    public void eat() {
        System.out.println("狗吃肉");
    }

    public static void main(String[] args) {
       animal a = new Dog();
       a.eat();

    }
}