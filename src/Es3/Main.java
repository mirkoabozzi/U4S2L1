package Es3;

import exceptions.BancaException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class Main {
    private static Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) throws BancaException {
        Scanner scanner = new Scanner(System.in);
        ContoCorrente contoCorrente = new ContoCorrente("Mirko", 20000);
        ContoOnLine contoOnLine = new ContoOnLine("Mirko", 1000, 100);

        System.out.println("Quanto vuoi prelevare?");
        int prelievo = scanner.nextInt();

        contoOnLine.preleva(prelievo);
        System.out.println(contoOnLine.getSaldo());


    }
}