package basicjava;
import java.util.Random;

public class Randomclass {
    public static void main(String[] args) {
        //random class is used to get the random no
        Random random = new Random();
        int intNo = random.nextInt();
        float floatNo = random.nextFloat();
        double doubleNo = random.nextDouble();
        long longNo = random.nextLong();
        boolean booleanNo = random.nextBoolean();
        System.out.println("Int no is:"+ intNo);
        System.out.println("Float no is"+ floatNo);
        System.out.println("Double no is"+ doubleNo);
        System.out.println("Long no is"+longNo);
        System.out.println("boolean no is"+booleanNo);
    }
}

