package practice;

public class Father {
    public int a = 10;
    public String str = "ss";
    public void say(String s){
        System.out.println("我是你爹!");
        System.out.println(s);
    }
    public void say(){
        System.out.println("我是你爹!");
    }
}
 class Sun extends Father{
     public void say(String s){
         System.out.println("我是你儿子!");
         System.out.println(s);
     }
    public void say1(){

         System.out.println("我是你儿子!");
    }
     public void say(){

         System.out.println("我是你erzi!");
     }
     public static void main(String[] args) {
         Father father = new Sun();
         ((Sun) father).say1();
         father.say("haha");
         father.say();

         Base b=new Sub();
//        Base c=b;
         b.printMessage();
         System.out.println(b.x);
     }
}
class Base{
    int x=10;
    public Base(){
        this.printMessage();
        System.out.println("父类的构造方法"+x);
        x=20;
    }
    public void printMessage(){

        System.out.println("父类的构造方法中的方法Base.x="+x);
    }
}
class Sub extends Base{
    int x=30;
    public Sub(){
        this.printMessage();
        System.out.println("子类的构造方法"+x);
        x=40;
    }
    public void printMessage(){

        System.out.println("子类的构造方法中的方法sub.x="+x);
    }
}
