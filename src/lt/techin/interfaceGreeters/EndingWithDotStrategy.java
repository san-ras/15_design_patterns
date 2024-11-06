package lt.techin.interfaceGreeters;

public class EndingWithDotStrategy implements EndingStrategy {

    @Override
    public String getEndingString() {
        return ".";
    }
}