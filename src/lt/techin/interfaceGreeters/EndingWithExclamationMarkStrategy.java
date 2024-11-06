package lt.techin.interfaceGreeters;

public class EndingWithExclamationMarkStrategy implements EndingStrategy {

    @Override
    public String getEndingString() {
        return "!";
    }
}