import it.epicode.Pair;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        // Esercizio 1

        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci il numero di elementi da inserire:");
        int numeroN = scanner.nextInt();
        scanner.nextLine();

        Set<Pair> set = new HashSet<>();

        for(int i = 0; i < numeroN; i++) {
            System.out.println("Inserisci la parola n. " + (i + 1) + ":");
            String parolaN = scanner.nextLine();
            if (parolaN)

        }



    }
    }
