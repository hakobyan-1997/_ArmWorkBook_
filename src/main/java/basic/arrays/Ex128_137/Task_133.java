package basic.arrays.Ex128_137;

import java.util.Scanner;

import static java.lang.Math.abs;

public class Task_133 {

    public static void main(String[] args) {
        int n = 7;
        int X[]= new int[n];

        int Y[] = new int[n];

        Scanner input = new Scanner(System.in);
        System.out.println("Nermucel zangvaci "+n+" tarrery");
        for(int i = 0; i < X.length; i++){
            X[i]= input.nextInt();
        }

        int max = X[0];
        for(int i = 0 ; i < n; i++){
            if(X[i]>max){
                max = X[i];
            }
        }
        int min = X[0];
        for(int i = 0 ; i < n; i++){
            if(X[i] < min){
                min = X[i];
            }
        }
        int avg = (min + max)/2;
        int j = 0;
            for(int i = 0; i < n; i++){
                 if(abs(X[i]) < avg){
                    Y[j] = X[i];
                    j++;
                }
            }

            
        for(int i = 0; i < j; i++){
            System.out.print(Y[i]+" ");
        }
    }
}