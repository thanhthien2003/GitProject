package ss7_lam_lai;

public class SocialBook extends Book implements IBook {
    private String author;
    static SocialBook socialBook4 = new SocialBook("nhan ma", "Thanh Thien", "2023", "Thien Thanh");
    static SocialBook socialBook5 = new SocialBook("Su tu", "Thanh Thien", "2025", "Thien Thanh");

    public SocialBook() {
    }

    public SocialBook(String nameBook, String producer, String debutYear, String author) {
        super(nameBook, producer, debutYear);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public void display() {
        SocialBook[] socialBooks = new SocialBook[3];
        socialBooks[0] = socialBook4;
        socialBooks[1] = socialBook5;
        for (SocialBook s : socialBooks) {
            System.out.println(s);
        }
    }

    @Override
    public String toString() {
        return "SocialBook{" +
                "author='" + author + '\'' +
                ", nameBook='" + nameBook + '\'' +
                ", producer='" + producer + '\'' +
                ", debutYear='" + debutYear + '\'' +
                '}';
    }
}
