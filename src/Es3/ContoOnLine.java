package Es3;

import exceptions.BancaException;

public class ContoOnLine extends ContoCorrente {
    private double maxPrelievo;

    public ContoOnLine(String titolare, double saldo, double maxP) {
        super(titolare, saldo);
        this.maxPrelievo = maxP;
    }

    public void stampaSaldo() {
        System.out.println("Titolare:" + getTitolare() + " - Saldo: " + getSaldo() + " - Num movimenti: " + getnMovimenti()
                + "- Massimo movimenti: " + getMaxMovimenti() + " - Massimo prelievo possibile:" + maxPrelievo);
    }

    public void preleva(double x) throws BancaException {
        if (x > maxPrelievo) {
            throw new BancaException("Il prelievo non è disponibile");
        }
        try {
            if (x > 0) {
                super.preleva(x);
            }
        } catch (Exception e) {
            throw new BancaException(e.getMessage());
        }

    }

}