package lt.techin.interfaceGreeters;

public class EndingWith3ExclamationMarksStrategy implements EndingStrategy {

    @Override
    public String getEndingString() {
        return "!!!";
    }
}
