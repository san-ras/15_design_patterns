package lt.techin.decoratorGreeters.withClasses;

public class Main {
    public static void main(String[] args) {

        Greeter greeterSimple = new Greeter();
        Greeter greeterExclam = new GreeterExclamationMark();
        Greeter greeterUpper = new GreeterUpperCase();

        System.out.println(greeterSimple.greet("Tom", "Hanks"));
        System.out.println(greeterExclam.greet("Tom", "Hanks"));
        System.out.println(greeterUpper.greet("Tom", "Hanks"));
    }
}
