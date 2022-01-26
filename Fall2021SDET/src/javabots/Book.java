package javabots;

public class Book {
    int numberOfPages;
    public Book(int numberOfPages){ //this is the constructor. it specifies the value of class variables.
        this.numberOfPages = numberOfPages;
    }
    public void setNumberOfPages(int number){ // this is setter method. it sets the value of your class variables.
        if (number > 0){
            this.numberOfPages = number;
        }
    }
    public int getNumberOfPages(){ // it's a getter method. it gets you a value of your class variables.
        return this.numberOfPages;
    }
    static void print(){
        Book book = new Book(100);
        System.out.println(book.getNumberOfPages());
        book.setNumberOfPages(200);
        int num = book.getNumberOfPages();
        System.out.println(num);
    }

    public static void main(String[] args) {
        print();
    }
}
