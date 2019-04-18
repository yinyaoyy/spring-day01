package builder;

public class Client {
    public static void main(String[] args) {
        Builder builder = new ConcreteBuilder();
        System.out.println(builder.getClass().getName());
        Director director = new Director(builder);
        director.construct();
        Product product = builder.retrieveResult();
        System.out.println(product.getPart1());
        System.out.println(product.getPart2());
    }
}
