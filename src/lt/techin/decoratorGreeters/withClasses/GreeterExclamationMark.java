package lt.techin.decoratorGreeters.withClasses;

public class GreeterExclamationMark extends Greeter {

    @Override
    public String greet(String firstName, String lastName) {
        return super.greet(firstName, lastName) + "!";
    }
}
