public class Cat {
    int age;
    String name;

    public static void main(String[] args) {
        Cat murka = new Cat();
        murka.meow();
        murka.name = "Tom";
        murka.age = 10;
        System.out.println(murka.name + " " + murka.age + " years old");
    }

    public void meow() {
        System.out.println("Cat");
    }
}
