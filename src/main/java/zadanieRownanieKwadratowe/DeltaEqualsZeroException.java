package zadanieRownanieKwadratowe;

public class DeltaEqualsZeroException extends ArithmeticException {
    public DeltaEqualsZeroException() {
        super("Wartość delta jest równa 0, więc funkcja ma jedno miejsce zerowe");
    }
}
