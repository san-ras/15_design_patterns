package lt.techin.interfaceGreeters;

public class Greeter {

    private GreeterLanguageStrategy greeterLanguageStrategy;
    private EndingStrategy endingStrategy;

    public Greeter(GreeterLanguageStrategy greeterLanguageStrategy, EndingStrategy endingStrategy) {
        this.greeterLanguageStrategy = greeterLanguageStrategy;
        this.endingStrategy = endingStrategy;
    }

    public void greet(String firstName, String lastName) {
        System.out.println(greeterLanguageStrategy.getGreetingString() + ", " + firstName + " " + lastName + endingStrategy.getEndingString());
    }

}
