package lt.techin.classGreeters;

public abstract class Ending {

    public String end() {
        return getEndingString();
    }

    public abstract String getEndingString();
}
