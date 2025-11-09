// Q29. Override the toString() method in a user-defined class Book.
class Book {
    String title;
    String author;

    Book(String t, String a) {
        title = t;
        author = a;
    }

    public String toString() {
        return "Book Title: " + title + ", Author: " + author;
    }
}

class a29 {
    public static void main(String[] args) {
        Book b = new Book("Java Basics", "GST");
        System.out.println(b);
    }
}
