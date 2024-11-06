package lt.techin.interfaceGreeters;

public class EnglishGreetingStrategy implements GreeterLanguageStrategy {
    @Override
    public String getGreetingString() {
        return "Hello";
    }
}

