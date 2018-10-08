package oop.encapsulation.Ex206_235.task235;

public class Main {

    public static void main(String[] args) {
        int n = 5;
        Book books[] = {new Book(1, "Askanio",65),
                new Book(14, "The Light Between Worlds ",52),
                new Book(20,"Red Queen",71),
                new Book(17,"Empress of All Seasons ",14),
                new Book(4, "Empress of All Seasons ",25)};

        for(int i = 0; i< n; i++){
             if(books[i].getPage() <= 70 ) {
               System.out.println(books[i]);
             }
         }

    }
}