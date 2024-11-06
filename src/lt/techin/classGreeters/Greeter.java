package lt.techin.classGreeters;

public abstract class Greeter {

    public String greet(String firstName, String lastName) {
        return getGreetingString() + ", " + firstName + " " + lastName;
    }

    protected abstract String getGreetingString();

}
