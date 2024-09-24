package org.csystem.util.matrix.test;

import java.util.Random;
import java.util.Scanner;

import static org.csystem.util.matrix.MatrixUtil.*;

public class MatrixUtilTransposeTest {
    public static void run()
    {
        Scanner kb = new Scanner(System.in);
        Random r = new Random();

        while (true) {
            System.out.print("Satır sayısını giriniz:");
            int m = Integer.parseInt(kb.nextLine());

            System.out.print("Sütun sayısını giriniz:");
            int n = Integer.parseInt(kb.nextLine());

            if (m <= 0 || n <= 0)
                break;

            int [][] a = generateRandomMatrix(r, m, n, 0, 100);

            print(a, 2);
            System.out.println();
            print(transpose(a), 2);
        }
    }

    public static void main(String[] args)
    {
        run();
    }
}
