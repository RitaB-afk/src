public class Fiction extends Book{

public static void main(String[] args) {
    Book Dune= new Fiction("Dune");
    System.out.println("This book is called "+ Dune.bookTitle+" and its price is: "+ Dune.bookPrice);
}

    public Fiction (String bookTitle){

        super(bookTitle);
        setPrice();

    }
    @Override
    public void setPrice() {
     bookPrice=24.99;
    }
}
