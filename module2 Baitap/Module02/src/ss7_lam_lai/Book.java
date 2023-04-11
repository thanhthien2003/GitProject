package ss7_lam_lai;

public abstract class Book {
    protected String  nameBook;
    protected String producer;
    protected String debutYear;

    public Book() {
    }

    public Book(String nameBook, String producer, String debutYear) {
        this.nameBook = nameBook;
        this.producer = producer;
        this.debutYear = debutYear;
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getDebutYear() {
        return debutYear;
    }

    public void setDebutYear(String debutYear) {
        this.debutYear = debutYear;
    }
    @Override
    public String toString() {
        return "Book{" +
                "nameBook='" + nameBook + '\'' +
                ", producer='" + producer + '\'' +
                ", debutYear='" + debutYear + '\'' +
                '}';
    }
}
