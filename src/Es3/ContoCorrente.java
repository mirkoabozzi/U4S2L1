package Es3;

import exceptions.BancaException;

public class ContoCorrente {
    private final int maxMovimenti = 50;
    private String titolare;
    private int nMovimenti;
    private double saldo;

    public ContoCorrente(String titolare, double saldo) {
        this.titolare = titolare;
        this.saldo = saldo;
        this.nMovimenti = 0;
    }

    public void preleva(double x) throws BancaException {

        if (nMovimenti < maxMovimenti) saldo = saldo - x;
        else saldo = saldo - x - 0.50;
        if (saldo < 0)
            throw new BancaException("Il conto è in rosso");
        nMovimenti++;
    }

    public double restituisciSaldo() {
        return saldo;
    }

    public int getMaxMovimenti() {
        return maxMovimenti;
    }

    public String getTitolare() {
        return titolare;
    }

    public int getnMovimenti() {
        return nMovimenti;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        return "ContoCorrente{" +
                "maxMovimenti=" + maxMovimenti +
                ", titolare='" + titolare + '\'' +
                ", nMovimenti=" + nMovimenti +
                ", saldo=" + saldo +
                '}';
    }
}
