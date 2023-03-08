public class Main {
    public class Book {
        private String title;
        private Author author;
        private int year;

        public Book(String title, Author author, int year) {
            this.title = title;
            this.author = author;
            this.year = year;
        }

        public String getTitle() {
            return title;
        }

        public Author getAuthor() {
            return author;
        }

        public int getYear() {
            return year;
        }

        public void setYear(int year) {
            this.year = year;
        }
    }

    public class Author {
        private String firstName;
        private String lastName;

        public Author(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }
    }

    public class Library {
        public void run() {
            Author author1 = new Author("J.K.", "Rowling");
            Author author2 = new Author("Stephen", "King");

            Book book1 = new Book("Harry Potter and the Philosopher's Stone", author1, 1997);
            Book book2 = new Book("The Shining", author2, 1977);

            book1.setYear(1998);

            System.out.println(book1.getTitle() + " by " + book1.getAuthor().getFirstName() + " " + book1.getAuthor().getLastName() + ", published in " + book1.getYear());
            System.out.println(book2.getTitle() + " by " + book2.getAuthor().getFirstName() + " " + book2.getAuthor().getLastName() + ", published in " + book2.getYear());
        }

        public static void main(String[] args) {
            Library library = new Library();
            library.run();
        }
    }
}

