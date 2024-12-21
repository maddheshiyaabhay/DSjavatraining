package OOPs;

public class PolymorphismMethodOverloading {


    private static Object v1;

    public static void main(String[]args){
        //method calling for addition integer
        System.out.println( add(2.5,6));
//        double resultValue = add(v: 2.5, v1: 9.3);
//        System.out.println("M1" + result + "M2" + resultValue)


    }

    private static double add(double v, double v1) {
        double value = v + v1;
        return value;
    }
}
