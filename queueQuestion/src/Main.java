import book.Book;
import newBook.NewBook;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        NewBook obj = new NewBook();
        Scanner scan = new Scanner(System.in);
        int size=scan.nextInt();
        obj.setSize(size);
        System.out.println("Enter number of elements to insert");
        int number =scan.nextInt();
        Book temp = new Book();
        for (int i = 0; i < number; i++) {
            System.out.println("enter name --> ");
            String name = scan.next();
            System.out.println("enter price --> ");
            double price = scan.nextDouble();
            temp.setName(name);
            temp.setPrice(price);
            obj.insert(temp);
        }

        System.out.println("Removing elements --> ");
        number-=3;
        for (int i = 0; i < number; i++) {
            System.out.println("Removed element --> "+obj.delete().getName());
        }
    }
}
