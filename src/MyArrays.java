import java.util.Locale;
import java.util.Scanner;

public class MyArrays {
    public static double AvgOf4Digit(int[] q) {
        double sm = 0;
        int k = 0;
        for (int i = 0; i < q.length; ++i){
            if (q[i] >= 1000 && q[i] <= 9999) {
                sm += q[i];
                k += 1;
            }
        }
        if (k == 0){
            return -1.00;
        }
        return sm/ k;
    }


        public static void main(String[] args) {
            Scanner in = new Scanner(System.in).useLocale(Locale.ENGLISH);
            int n = in.nextInt();
            int[] ar = new int[n];
            for (int i = 0; i < n; ++i){
                ar[i] = in.nextInt();
            }
            System.out.println(AvgOf4Digit(ar));
        }
    }
