package demo;

/**
 * Created by 150436p on 10/24/2016.
 */
public class BookDBAO {
    public BookDetails getBookDetails(String bookId) {
        // return dummy book for testing now
        return createDummyBook(bookId);
    }

    // convenient method to create a dummy book detail
    // this method is meant for testing
    private BookDetails createDummyBook(String bookId) {
        BookDetails details = new BookDetails();
        details.setBookId(bookId);
        details.setDescription("Web components for developers talks about how web components can transfor the way you develop application for the web");
        details.setFirstName("Java");
        details.setSurname("Expert");
        details.setInventory(5);
        details.setOnSale(false);
        details.setPrice(5.9f);
        details.setTitle("Web components for developers");
        details.setYear(2015);
        return details;
    }

    public BookDetails[] getAllBooks(String bookId) {
        BookDetails[] array = new BookDetails[7];
        for (int i = 0; i < 7; i++) {
            array[i] = createDummyBook(bookId);
        }
        return array;
    }
}
