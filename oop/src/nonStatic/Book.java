package nonStatic;

class Book {
    String title;
    int edition;

    // Instance block
    {
        System.out.println("Initializing a new instance of Book");
        edition = 1;  // default edition
    }

    // Constructor without parameters
    public Book() {
        title = "Unknown Title";
        System.out.println("Constructor with no parameter called.");
    }

    // Constructor with one parameter
    public Book(String title) {
        this.title = title;
        System.out.println("Constructor with title called.");
    }

    public void displayInfo() {
        System.out.println("Title: " + title + ", Edition: " + edition);
    }

    public static void main(String[] args) {
        Book defaultBook = new Book();
        defaultBook.displayInfo();

        Book specificBook = new Book("Java Fundamentals");
        specificBook.displayInfo();
    }
}
