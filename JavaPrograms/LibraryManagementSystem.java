package JavaPrograms;

public class LibraryManagementSystem {
    String [] books;
    int no_of_books;

    LibraryManagementSystem(){
        this.books= new String[50];
        this.no_of_books=0;
    }

    void add_Book(String book){
        this.books[no_of_books]=book;
        System.out.println(book +" has been added in Library");
        no_of_books ++;
    }

    void issued_book(String Book){
            for(int i=0;i<this.books.length;i++){
                if(this.books[i].equals(Book)){
                    System.out.println("Book has been issued Suceesfully");
                    this.books[i]=null;
                    return;
                }
                System.out.println("#" + Book);

            }


    }

    void show_Books(){
        System.out.println("Following Books are Available ");
        for(String book:this.books){
            if(book==null){
                continue;
            }
            System.out.println("#" +book);
        }

    }
    public static void main(String[] args) {
        LibraryManagementSystem library= new LibraryManagementSystem();
        library.add_Book("Python");
        library.add_Book("Java");
        library.add_Book("SQL Server");

        library.issued_book("Java");
        library.show_Books();


    }
}
