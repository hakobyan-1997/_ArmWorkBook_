package basic.control_statments.Ex31_40;

public class Task_36 {
    public static void main(String[] args) {
        int number = 4564;

        int one = number % 10;
        int thousands = number / 1000;

        if(one == 4 && thousands == 4 ){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
