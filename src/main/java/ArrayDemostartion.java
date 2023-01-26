import java.util.ArrayList;
import java.util.Scanner;
public class ArrayDemostartion {
    public static void main(String[] args) {
        int[] anArray;

        loop(ArrayList<Integer>someArraylist);

        anArray = new int[10];
        anArray[0] = 100;
        anArray[1] = 200;
        anArray[2] = 300;
        anArray[3] = 400;
        anArray[4] = 500;
        anArray[5] = 600;
        anArray[6] = 700;
        anArray[7] = 800;
        anArray[8] = 900;
        anArray[9] = 1000;
        loop(anArray);

        System.out.println("Element at index 0 " + anArray[0]);
        System.out.println("Element at index 0 " + anArray[0]);
        System.out.println("Element at index 0 " + anArray[0]);
        System.out.println("Element at index 0 " + anArray[0]);
        System.out.println("Element at index 0 " + anArray[0]);
        System.out.println("Element at index 0 " + anArray[0]);
        System.out.println("Element at index 0 " + anArray[0]);
        System.out.println("Element at index 0 " + anArray[0]);


        Scanner myscan = new Scanner(System.in);
        try {
            System.out.println("Please eneter a number ");
            anArray.add(myscan.nextInt());
            loop(anArray);
        }
        catch (ArrayIndexOutOfBoundsException)
        {
            System.out.println("we went out of bounds of memory block ");
        }

    }

    public static void loop(ArrayList<Integer> someArraylist) {
        int indexValue = 0;
        for (int value; someArraylist)
        {
            System.out.println("element at index " + indexValue + " : " + value);
            indexValue++;
        }
    }
}
