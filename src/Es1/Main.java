package Es1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Main {
    private static Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int[] numRandom = new int[5];

        for (int i = 0; i < numRandom.length; i++) {
            numRandom[i] = random.nextInt(1, 10);
        }
        System.out.println(Arrays.toString(numRandom));
        logger.info(Arrays.toString(numRandom));

        while (true) {
            System.out.println("Scegli una posizione da 1 a 5");
            String posizioneScelta = scanner.nextLine();
            int numeroScelto;
            if (Objects.equals(posizioneScelta, "0")) {
                break;
            } else {
                
                switch (posizioneScelta) {
                    case "1":
                        System.out.println("Che numero vuoi inserire?");
                        numeroScelto = Integer.parseInt(scanner.nextLine());
                        numRandom[0] = numeroScelto;
                        break;
                    case "2":
                        System.out.println("Che numero vuoi inserire?");
                        numeroScelto = Integer.parseInt(scanner.nextLine());
                        numRandom[1] = numeroScelto;
                        break;
                    case "3":
                        System.out.println("Che numero vuoi inserire?");
                        numeroScelto = Integer.parseInt(scanner.nextLine());
                        numRandom[2] = numeroScelto;
                        break;
                    case "4":
                        System.out.println("Che numero vuoi inserire?");
                        numeroScelto = Integer.parseInt(scanner.nextLine());
                        numRandom[3] = numeroScelto;
                        break;
                    case "5":
                        System.out.println("Che numero vuoi inserire?");
                        numeroScelto = Integer.parseInt(scanner.nextLine());
                        numRandom[4] = numeroScelto;
                        break;
                    default:
                        System.out.println("Scelta non valida scegli un numero compreso da 1 a 5");
                        break;
                }
                System.out.println(Arrays.toString(numRandom));
                logger.info(Arrays.toString(numRandom));
            }
        }


    }
}
