public class UseBook {
    public static void main(String[] args) {
        Book Dune= new Fiction("Dune");
        System.out.println("This book is called "+ Dune.bookTitle+" and its price is: "+ Dune.bookPrice);
        Book Becoming= new NonFiction("Becoming");
        System.out.println("This book is called "+ Becoming.bookTitle+" and its price is: "+ Becoming.bookPrice);
    }
}
