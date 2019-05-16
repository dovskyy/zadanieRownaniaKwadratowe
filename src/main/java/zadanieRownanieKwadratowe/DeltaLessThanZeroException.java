package zadanieRownanieKwadratowe;

public class DeltaLessThanZeroException extends ArithmeticException {
    public DeltaLessThanZeroException(){
        super("Delta jest ujemna, a arka gdynia coś tam, coś tam");
    }
}
