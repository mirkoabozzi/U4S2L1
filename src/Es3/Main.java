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

//        while (true) {
//            System.out.println("Quanto vuoi prelevare?");
//            int prelievo = scanner.nextInt();
//            try {
//                contoOnLine.preleva(prelievo);
//                logger.info(contoOnLine.toString());
//
//            } catch (BancaException e) {
//                logger.info("Errore nel prelievo " + e);
//            }
//        }

        while (true) {
            System.out.println("Quanto vuoi prelevare?");
            int prelievo = scanner.nextInt();
            try {
                contoCorrente.preleva(prelievo);
                logger.info(contoCorrente.toString());

            } catch (BancaException e) {
                logger.info("Errore nel prelievo " + e);
            }
        }
    }
}
