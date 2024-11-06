package lt.techin.classGreeters;

public class Main {
    public static void main(String[] args) {

        Greeter eng = new EnglishGreeter();
        Greeter lit = new LithuanianGreeter();
        Ending endWithDot = new EndingWithDot();
        Ending endWith1Excl = new EndingWithExclamationMark();
        Ending endWith3Excl = new EndingWith3ExclamationMarks();

        System.out.println(lit.greet("Tom", "Cruise"));
        System.out.println(lit.greet("Tom", "Cruise") + endWithDot.end());
        System.out.println(lit.greet("Tom", "Cruise") + endWith3Excl.end());
        System.out.println(lit.greet("Tom", "Cruise") + endWith1Excl.end());

        System.out.println(eng.greet("Tom", "Hanks"));
        System.out.println(eng.greet("Tom", "Hanks") + endWithDot.end());
        System.out.println(eng.greet("Tom", "Hanks") + endWith3Excl.end());
        System.out.println(eng.greet("Tom", "Hanks") + endWith1Excl.end());

    }
}
