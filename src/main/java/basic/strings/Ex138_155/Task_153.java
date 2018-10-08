package basic.strings.Ex138_155;

public class Task_153 {

    public static void main(String[] args) {
        int n = 6;
        String string1 = "cvdecf"; //length = n
        char c = 'e';
        String string2 ="";

        for( int i = 0; i < n; i++){
            if(string1.charAt(i) > c){
                string2 += string1.charAt(i);
            }
        }
        for( int i = 0; i < n; i++){
            if(string1.charAt(i) == c){
                string2 += string1.charAt(i);
            }
        }
        for( int i = 0; i < n; i++){
            if(string1.charAt(i) < c){
                string2 += string1.charAt(i);
            }
        }

            System.out.println(string2);
    }
}