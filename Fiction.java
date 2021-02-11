public class Fiction extends Book{



    public Fiction (String bookTitle){

        super(bookTitle);
        setPrice();

    }
    @Override
    public void setPrice() {
     bookPrice=24.99;
    }
}
