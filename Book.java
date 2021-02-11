public abstract class Book {
    String bookTitle;
    Double bookPrice;

    public Book (String bookTitle){
        this.bookTitle = bookTitle;
    }
    public String getTitle(){return bookTitle;}
    public Double getPrice() {return bookPrice;}
    public abstract void setPrice ();
}
