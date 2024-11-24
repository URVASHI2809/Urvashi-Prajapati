import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Shop {
	public static void main(String[] args) {
		Book b1 = new Book();
		b1.setPrice(99);
		//System.out.println(b1.getPrice());
		
		createBooks();
		System.out.println("Assignment 01 :- ");
		assignment();
		
	}

	private static void assignment() {
		Book []shelf = new Book[10];
		Random rand = new Random();
		List<Book> listOfBooks = new ArrayList<Book>();
		
		for(int i=0; i<10; i++) {
			Book ib = new Book();
			ib.setPrice(rand.nextFloat(70, 100));
			shelf[i] = ib;
		}
		
		for(int i=0;i<10;i++) {
			System.out.println(shelf[i].getPrice());
			listOfBooks.add(shelf[i]);
			
		}
		System.out.println();
		listOfBooks.sort((book1, book2) -> (int) book1.getPrice() - (int) book2.getPrice());
		listOfBooks.forEach((Book book) -> System.out.println(book.getPrice()) );
		
		}
		
	private static void createBooks() {
		Book []shelf = new Book[10];
		Random rand = new Random();
		List<Book> listOfBooks = new ArrayList<Book>();
		
		for(int i=0; i<10; i++) {
			Book ib = new Book();
			ib.setPrice(rand.nextFloat(70, 100));
			shelf[i] = ib;
		}
		
		for(int i=0;i<10;i++) {
			System.out.println(shelf[i].getPrice());
			
		}
	}

}
