package basic.arrays.Ex68_87;

import java.util.Scanner;

public class Task_75 {

    public static void main(String[] args) {
        int n = 5;
        int array[]= new int[n];
        int sum = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Nermucel zangvaci "+n+" tarrery");
        for(int i = 0; i < n; i++){
            array[i]=input.nextInt();
        }

        for(int i = 0; i < n; i++){
            if(array[i] % 2 != 0){
               sum = sum + Math.abs(array[i]);
            }
        }
        System.out.println(sum);
    }
}