package newBook;

import book.Book;

public class NewBook {
    private Book[] arr;
    private int size;
    private int head=-1;
    private int tail=-1;

    public Book[] getArr() {
        return arr;
    }

    public void setArr(Book[] arr) {
        this.arr = arr;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void insert(Book temp){
        head+=1;
        arr[head]=temp;
    }

    public Book delete(){
        Book temp=arr[tail];
        tail+=1;
        return temp;
    }
}