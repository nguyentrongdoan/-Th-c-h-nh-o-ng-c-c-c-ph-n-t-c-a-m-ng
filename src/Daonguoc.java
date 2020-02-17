import java.awt.*;
import java.util.Scanner;

public class Daonguoc {
    public static void main(String[] args) {
        int size;
            int[] array;
        Scanner sr = new Scanner(System.in);
        do {
            System.out.print("Enter a size: ");
            size = sr.nextInt();
            if (size > 20)
                System.out.println("Size does not exceed 20");
        }while (size > 20);
        // Nhap gia tri cho cac phan tu cua mang.
        array = new int[size];
        int i = 0;
        while (i < array.length){
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = sr.nextInt();
            i++;
        }
        //In mang da nhap.
        System.out.printf("%-20s%s", "Elements in array: ", "");
        for (int j = 0; j < array.length; j++){
            System.out.print(array[j] + "\t");
        }
        // Dao nguoc thu tu cac phan tu trong mang.
        // Su dung bien trung gian de hoan doi gia tri giua 2 phan tu
        for (int j = 0; j < array.length / 2; j++){
            int temp = array[j];
            array[j] = array[size - 1 - j];
            array[size - 1 -j] = temp;
        }
        // in ra mang moi.
        System.out.printf("%-20s%s", "Reverse array: ", "");
        for (int j = 0; j < array.length; j++){
            System.out.print(array[j] + "\t");
        }
    }
}
