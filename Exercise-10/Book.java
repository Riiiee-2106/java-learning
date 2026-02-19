// 51. Create a Book class for a library system.

// Instance variables: title, author, isbn.

// Static variable: totalBooks, a counter for the total number of book instances.

// Instance methods: borrowBook(), returnBook().

// Static method: getTotalBooks(), to get the total number of books in the library.

public class Book {
    static int totalNoOfBooks;
  

    String title;
    String author;
    String isbn;


    static{
        int totalNoOfBooks =0;
       

    }

    {
        totalNoOfBooks++;
    }

    boolean isBorrowed;
    

    Book(String isbn,String author,String title){
        this.isbn = isbn;
        this.author = author;
        this.title = title; 
    }

    Book (String isbn){
        this(isbn,"Unknown","Unknown");
    }

    static int getTotalNoOfBooks(){
        return totalNoOfBooks++;
    }

    void borrowBook(){
        if(isBorrowed){
            System.out.println("book is already borrowed");
        }
        else{
        this.isBorrowed = true;
        System.out.println("enjoy the book "+this.title);
    }
}

    void returnBook(){
        if(isBorrowed){
            this.isBorrowed = false;
            System.out.println("hope you enjoyed ,book is returned");
        }else{
        System.out.println("this book is still not borrowed.present in library");

            }
        }


        public static void main(String[] args) {
            Book ikigai = new Book("9788273079879","Hector Garcia & Francesc miralles","ikigai:the japanese secret to a long and happy life");

            Book designOfThings = new Book("1");

            System.out.println(Book.getTotalNoOfBooks());

            ikigai.borrowBook();
            ikigai.returnBook();
            ikigai.borrowBook();
            ikigai.borrowBook();
            designOfThings.returnBook();


        }
    


   }

    
