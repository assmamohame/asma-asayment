import java.util.Scanner;

public class Q8 {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a byte value :");
        byte bytevalue =scanner.nextByte();
         System.out.print("enter a short value :");
         Short shortValue =scanner.nextShort();
         System.out.println("enter value :" );
         int intValue = scanner.nextShort();
         System.out.println("enter an int value ");
        intValue = scanner.nextInt();
        System.out.println("enter a log value :");
        long longValue =scanner.nextLong();
        System.out.println("enter a float");
        float floatValue= scanner.nextFloat();
        System.out.println("enter a double value :");
        double doubleValue = scanner.nextDouble();
        System.out.println("enter a boolean value (true or false): ");
        boolean booleanValue = scanner.hasNextBoolean();
        System.out.println("enter a char value : ");
        char charValue = scanner.next().charAt(0);
        System.out.println("Byte value : "+bytevalue);
        System.out.println("short value " +shortValue);
        System.out.println("int value "+ intValue);
        System.out.println("long value "+longValue);
        System.out.println("Float value "+ floatValue);
        System.out.println("Double value "+doubleValue);
        System.out.println("boolean value "+ booleanValue);
        System.out.println("char value "+charValue);
        scanner.close();



    }
}
