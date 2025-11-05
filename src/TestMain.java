public class TestMain {
    public static void main(String[] args) {
        // Create and test Animal and Mammal
        Animal a = new Animal("GenericAnimal");
        Mammal m = new Mammal("MammalOne");
        System.out.println(a);
        System.out.println(m);

        // Create and test Cat
        Cat c = new Cat("Kitty");
        System.out.println(c);
        c.greets();

        // Create and test Dog
        Dog d1 = new Dog("Fido");
        Dog d2 = new Dog("Rex");
        System.out.println(d1);
        d1.greets();
        d1.greets(d2);
    }
}
