import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class MyArrays {
    public static int[] MinToBegin(int[] q) {
        int mn = q[0];
        int c;
        int a;
        for (int i = 0; i < q.length; ++i){
            if (mn > q[i]){
                mn = q[i];
            }
            //c = q[i];
            //q[i+1] = c;
        }
        c = q[0];
        for (int i = 0; i < q.length; ++i){
            if (q[i] == mn) {
                a = q[i];
                q[i] = c;
                c = a;
                break;
            }
            a = q[i];
            q[i] = c;
            c = a;

        }
        q[0] = mn;
        return q;
    }


        public static void main(String[] args) {

            Scanner in = new Scanner(System.in).useLocale(Locale.ENGLISH);
            int n = in.nextInt();
            int[] ar = new int[n];
            for (int i = 0; i < n; ++i){
                ar[i] = in.nextInt();
            }
            ar = (MinToBegin(ar));
            if (ar.length == 0){//Немного не понял про "Если в массиве нет таких чисел, метод должен вернуть число -1", т.к минимум всегда есть, на всякий случай написал условие
                System.out.println(-1);
            }
            else {
                for (int i = 0; i < n; ++i) {
                    System.out.print(ar[i] + " ");
                }
            }
        }
    }

