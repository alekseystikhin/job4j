package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("Война и мир", 1500);
        Book book2 = new Book("Clean code", 1400);
        Book book3 = new Book("Мертвые души", 600);
        Book book4 = new Book("Мои университеты", 800);
        Book[] books = new Book[4];
        books[0] = book1;
        books[1] = book2;
        books[2] = book3;
        books[3] = book4;
        for (int index = 0; index < books.length; index++) {
            Book bk = books[index];
            System.out.println(bk.getName() + " - " + bk.getNumberOfPages());
        }

        //Replace element in array.
        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;

        for (int index = 0; index < books.length; index++) {
            System.out.println(books[index].getName() + " - " + books[index].getNumberOfPages());
        }
        //Print element "Clean code".
        for (int index = 0; index < books.length; index++) {
            if (books[index].getName().equals("Clean code")) {
                System.out.println(books[index].getName() + " - " + books[index].getNumberOfPages());
            }
        }
    }
}
