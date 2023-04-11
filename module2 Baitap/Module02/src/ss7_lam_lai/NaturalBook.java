package ss7_lam_lai;

public class NaturalBook extends Book implements IBook {
    private long productionNumber;
    static NaturalBook naturalBook1 = new NaturalBook("Thien binh", "Thanh Thien", "2023", 50000);
    static NaturalBook naturalBook2 = new NaturalBook("Song tu", "Hoang Oanh", "2023", 30000);
    static NaturalBook naturalBook3 = new NaturalBook("Bao Binh", "Quoc Hoa", "2023", 40000);

    public NaturalBook() {
    }

    public NaturalBook(String nameBook, String producer, String debutYear, long productionNumber) {
        super(nameBook, producer, debutYear);
        this.productionNumber = productionNumber;
    }

    @Override
    public void display() {
        NaturalBook[] naturalBooks = new NaturalBook[3];
        naturalBooks[0] = naturalBook1;
        naturalBooks[1] = naturalBook2;
        naturalBooks[2] = naturalBook3;
        for (NaturalBook n : naturalBooks) {
            System.out.println(n);
        }
    }
}
