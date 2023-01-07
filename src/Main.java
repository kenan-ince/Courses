import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] a = {5,7,2,1,9,8,6,4};
        System.out.println(Arrays.toString(a));
        Main.shellSort(a);
        System.out.println(Arrays.toString(a));
    }

    public static void shellSort(int[] d) {
        int tmp = 0;
        int i=0, j=0;
        int gap = 0;

        for ( gap = d.length/2 ; gap > 0 ; gap /= 2 ) {
            for (i = gap; i < d.length; i += gap) {
                tmp = d[i];

                for (j = i; j > 0 && d[j - gap] > tmp; j-=gap) {
                    d[j] = d[j - gap];
                }
                d[j] = tmp;
            }
        }

    }
}