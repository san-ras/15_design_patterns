package lt.techin.interfaceGreeters;

public class Main {
    public static void main(String[] args) {

        Greeter ltGreeterDot = new Greeter(new LithuanianGreetingStrategy(), new EndingWithDotStrategy());
        Greeter ltGreeter1Exclam = new Greeter(new LithuanianGreetingStrategy(), new EndingWithExclamationMarkStrategy());
        Greeter ltGreeter3Exclam = new Greeter(new LithuanianGreetingStrategy(), new EndingWith3ExclamationMarksStrategy());
        Greeter enGreeterDot = new Greeter(new EnglishGreetingStrategy(), new EndingWithDotStrategy());
        Greeter enGreeter1Exclam = new Greeter(new EnglishGreetingStrategy(), new EndingWithExclamationMarkStrategy());
        Greeter enGreeter3Exclam = new Greeter(new EnglishGreetingStrategy(), new EndingWith3ExclamationMarksStrategy());

        ltGreeterDot.greet("Tomas", "Petraitis");
        ltGreeter1Exclam.greet("Tomas", "Petraitis");
        ltGreeter3Exclam.greet("Tomas", "Petraitis");

        enGreeterDot.greet("John", "Snow");
        enGreeter1Exclam.greet("John", "Snow");
        enGreeter3Exclam.greet("John", "Snow");


        ;
    }
}