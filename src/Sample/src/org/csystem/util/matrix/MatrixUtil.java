/**
 * Utility class for array operations
 * Last Update: 24th September 2024
 * @author Java-Jan-2024 Group
 */
package org.csystem.util.matrix;

import org.csystem.util.array.ArrayUtil;

import java.util.Random;

public class MatrixUtil {
    public static int [][] add(int [][] a, int [][] b)
    {
        int m = a.length;
        int n = a[0].length;
        int [][] r = new int[m][n];

        for (int i = 0; i < m; ++i)
            for (int j = 0; j < n; ++j)
                r[i][j] = a[i][j] + b[i][j];

        return r;
    }

    public static double [][] add(double [][] a, double [][] b)
    {
        int m = a.length;
        int n = a[0].length;
        double [][] r = new double[m][n];

        for (int i = 0; i < m; ++i)
            for (int j = 0; j < n; ++j)
                r[i][j] = a[i][j] + b[i][j];

        return r;
    }

    public static int [][] generateRandomMatrix(Random random, int m, int n, int origin, int bound)
    {
        int [][] result = new int[m][];

        for (int i = 0; i < m; ++i)
            result[i] = ArrayUtil.generateRandomArray(random, n, origin, bound);

        return result;
    }

    public static int [][] generateRandomSquareMatrix(Random random, int n, int origin, int bound)
    {
        return generateRandomMatrix(random, n, n, origin, bound);
    }

    public static boolean isMatrix(int [][] a)
    {
        for (int i = 1; i < a.length; ++i)
            if (a[i].length != a[0].length)
                return false;

        return true;
    }

    public static boolean isSquareMatrix(int [][] a)
    {
        return isMatrix(a) && a.length == a[0].length;
    }

    public static int max(int [][] a)
    {
        return ArrayUtil.max(a);
    }

    public static int min(int [][] a)
    {
        return ArrayUtil.min(a);
    }

    public static int [][] multiply(int [][] a, int [][] b)
    {
        throw new UnsupportedOperationException("TODO");
    }

    public static void multiplyBy(int [][] a, int value)
    {
        ArrayUtil.multiplyBy(a, value);
    }

    public static void print(int [][] a)
    {
        print(a, 1);
    }

    public static void print(int [][] a, int n)
    {
        ArrayUtil.print(a, n);
    }

    public static int [][] subtract(int [][] a, int [][] b)
    {
        int m = a.length;
        int n = a[0].length;
        int [][] r = new int[m][n];

        for (int i = 0; i < m; ++i)
            for (int j = 0; j < n; ++j)
                r[i][j] = a[i][j] - b[i][j];

        return r;
    }

    public static long sum(int [][] a)
    {
        long total = 0;

        for (int [] array : a)
            total += ArrayUtil.sum(array);

        return total;
    }

    public static long sumDiagonal(int [][] a)
    {
        long total = 0;

        for (int i = 0; i < a.length; ++i)
            total += a[i][i];

        return total;
    }

    public static int [][] transpose(int [][] a)
    {
        int m = a.length;
        int n = a[0].length;
        int [][] r = new int[n][m];

        for (int i = 0; i < n; ++i)
            for (int j = 0; j < m; ++j)
                r[i][j] = a[j][i];

        return r;
    }
}
