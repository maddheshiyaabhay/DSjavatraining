package javaprogram;

public class averageprogram {
    public static void main(String[] args) {

        int[] no = {1, 7, 9, 11, 12};
        int sum = 0;
        for (int i = 0; i < no.length; i++) {
            sum += no[i];

        }
        int avg = (sum / no.length);
        System.out.println(avg);
    }
}
