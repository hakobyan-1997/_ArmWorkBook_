package basic.arrays.Ex88_107;

import java.util.Scanner;
import static java.lang.Math.pow;

public class Task_107 {

    public static void main(String[] args) {
        int n = 5;
        int array[]= new int[n];
        int p = 1;

        Scanner input = new Scanner(System.in);
        System.out.println("Nermucel zangvaci "+n+" tarrery");
        for(int i = 0; i < array.length; i++){
            array[i]= input.nextInt();
        }

        for(int i = 0; i < n; i++){
            if((array[i] * i) % 3 == 2 ){
                p *= pow(array[i],2);
            }
        }
        System.out.println(p);
    }
}