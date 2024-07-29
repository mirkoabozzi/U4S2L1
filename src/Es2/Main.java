package Es2;

import exceptions.NumbreLesThenZero;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class Main {
    private static Logger logger = LoggerFactory.getLogger(Es2.Main.class);

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Quanti Km hai percorso?");
        int kmPercorsi = scanner.nextInt();
        System.out.println("Quanti litri di carburante hai consumato?");
        int litriConsumati = scanner.nextInt();

        try {
            logger.info("Km/Lt: {}", kmPercorsi / litriConsumati);
        } catch (Exception e) {
            throw new NumbreLesThenZero(litriConsumati);
        } finally {
            scanner.close();
        }
    }
}