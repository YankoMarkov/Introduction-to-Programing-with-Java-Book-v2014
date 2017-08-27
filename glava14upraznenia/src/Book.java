
public class Book {

    private String name;
    private String publisher;
    private String author;
    private int number;
    private int age;

    public Book() {
        this.name = "Kniga";
        this.age = 2000;
    }

    public Book(String author) {
        this.author = author;
        this.name = getName();
        this.age = getAge();
    }

    public Book(int number) {
        this.number = number;
        this.name = getName();
        this.age = getAge();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void getBookInfo() {
        System.out.println("Book: " + this.name + "\nPublisher: " + this.publisher + "\nAuthor: " + this.author + "\nAge: " + this.age);
    }
}

