package exceptions;

public class NumbreLesThenZero extends RuntimeException {
    public NumbreLesThenZero(int num) {
        super("Il numero inserito: " + num + " non può essere inserito");
    }
}
