import java.util.Locale;
import java.util.Scanner;

public class NumberDigits {
    public static int SumOfSeven(int a, int b) {
        int sm = 0;
        for (int i = a; i < b + 1; ++i) {
            if (i >= 10 && i <= 99 && i % 7 == 0) {
                sm += i / 10 + i % 10;
            }
        }
        return sm;
    }


        public static void main(String[] args) {
            Scanner in = new Scanner(System.in).useLocale(Locale.ENGLISH);
            int w = in.nextInt();
            int e = in.nextInt();
            System.out.println(SumOfSeven(w, e));
        }
    }
