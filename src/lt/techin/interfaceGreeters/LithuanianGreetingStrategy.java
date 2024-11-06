package lt.techin.interfaceGreeters;

public class LithuanianGreetingStrategy implements GreeterLanguageStrategy {
    @Override
    public String getGreetingString() {
        return "Sveiki";
    }
}
