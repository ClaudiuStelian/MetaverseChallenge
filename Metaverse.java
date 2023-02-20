import java.util.Scanner;

public class Metaverse {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        int T = sc.nextInt();

        int[] N = new int[T];
        int[] M = new int[T];
        int[][] P = new int[T][];

        for (int t = 0; t < T; t++) {
            N[t] = sc.nextInt();
            M[t] = sc.nextInt();

            P[t] = new int[N[t]];
            for (int p = 0; p < N[t]; p++) {
                P[t][p] = sc.nextInt();
            }
        }

        // Calculation and output
        for (int t = 0; t < T; t++) {
            int lcm = LCM(P[t], 0);
            int o = ((M[t] - 1) / lcm) + 1;

            System.out.println("Case #" + (t + 1) + ": " + o);
        }
    }

    // Algorithm to determine the least common multiple using Euclid's algorithm
    private static int LCM(int[] numbers, int i) {
        if (i + 2 == numbers.length) {
            return LCM(numbers[i], numbers[i + 1]);
        } else {
            return LCM(numbers[i], LCM(numbers, i + 1));
        }
    }

    public static int LCM(int a, int b) {
        return a * b / GCD(a, b);
    }

    public static int GCD(int a, int b) {
        int t;
        while (b != 0) {
            t = b;
            b = a % b;
            a = t;
        }
        return a;
    }
}