package Author;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
class Author {
    private String name;
    private Date dateOfBirth;
    public Author() {
        this.name = "";
        this.dateOfBirth = new Date();
    }
    public Author(String name, Date dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Date getDateOfBirth() {
        return dateOfBirth;
    }
    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    @Override
    public String toString() { 
        return "Author{" + "name='" + name + '\'' + ", dateOfBirth=" + dateOfBirth +'}';
    }
}
class Book {
    private String title;
    private Author author;

    public Book() {
        this.title = "";
        this.author = new Author(); 
    }
    public Book(String title, Author author) {
        this.title = title;
        this.author = author;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public Author getAuthor() {
        return author;
    }
    public void setAuthor(Author author) {
        this.author = author;
    }
    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author=" + author +
                '}';
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.print("nhap ten tac gia: ");
        String authorName = scanner.nextLine();
        System.out.println("nhap ngay sinh cua tac gia (dd/MM/yyyy): ");
        Date authorDateOfBirth = null;
        try {
            authorDateOfBirth = sdf.parse(scanner.nextLine());
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Author author = new Author(authorName, authorDateOfBirth);
        System.out.println("nhap tieu de sach: ");
        String bookTitle = scanner.nextLine();
        Book book = new Book(bookTitle, author);
        System.out.println("thong tin gioi thieu cua sach: ");
        System.out.println(book);       
        scanner.close();
    }
}