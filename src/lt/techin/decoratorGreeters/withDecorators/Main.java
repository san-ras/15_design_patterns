package lt.techin.decoratorGreeters.withDecorators;

public class Main {
    public static void main(String[] args) {
        GreeterImpl g = new GreeterImpl();
        System.out.println(g.greet("John", "Snow"));

        GreeterUpperCaseDecorator gUpper = new GreeterUpperCaseDecorator(g);
        System.out.println(gUpper.greet("John", "Snow"));

        GreeterExclamationMarkDecorator gExclam = new GreeterExclamationMarkDecorator(g);
        System.out.println(gExclam.greet("John", "Snow"));

        GreeterExclamationMarkDecorator gExclamUpper = new GreeterExclamationMarkDecorator(gUpper);
        System.out.println(gExclamUpper.greet("John", "Snow"));
    }
}
