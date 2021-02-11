public class BookArray {
    public static void main (String[] args)
    {
        Book[] BookArray = {new Fiction("Monte Cristo"),new NonFiction("Canada"),new Fiction("Madame Bovary"),new Fiction("Midnight Sun"),new NonFiction("Why we sleep"),new NonFiction("Untamed"),new Fiction("The Bride Test"),
                new Fiction("Det Alice Glemte"), new NonFiction("Older but better"), new NonFiction("History of Humankind")};

        for (int i=0; i< BookArray.length; i++)
        {
            System.out.println("For the book called "+ BookArray[i].bookTitle+ " the price is: " + BookArray[i].bookPrice);
        }
    }
}
