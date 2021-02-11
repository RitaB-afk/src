public class NonFiction extends Book{
    public static void main (String [] args)
    {
        Book Becoming= new NonFiction("Becoming");
        System.out.println("This book is called "+ Becoming.bookTitle+" and its price is: "+ Becoming.bookPrice);
    }
    public NonFiction (String bookTitle){
        super(bookTitle);
        setPrice();
    }
    @Override
    public void setPrice() {
        bookPrice=37.99;
    }
}
