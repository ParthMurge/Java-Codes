package company;

class Library {
	String[] books;
	int no_of_books;
	Library() {
		this.books = new String[100];
		no_of_books = 0;
	}
	
	void addBooks(String book) {
		this.books[no_of_books] = book;
		no_of_books++;
		System.out.println(book+ " has been added.");
	}
	
	void showAvailableBooks() {
		System.out.println("The available books are:");
		for(String b : this.books) {
			if(b == null) {
				continue;
			}
			System.out.println("* " +b);
		}
		System.out.println();
	}
	
	void issueBooks(String book) {
		for(int i=0; i < this.books.length; i++) {
			if(this.books[i] == book) {  // if(this.books[i].equals(book))
				this.books[i] = null;
				System.out.println("The book has been issued!");
				return;
			}
		}
		System.out.println("This book doesn't exist.\n");
	}
	
	void returnBook(String book) {
		addBooks(book);
	}
}

public class cwh_61_Exercise4_solution {

	public static void main(String[] args) {

		/* You have to implement a library using Java class Library.
		   Methods: addBooks, issueBooks, returnBook, showAvailableBooks
		   Properties: Array to store the available books
		   Array to store the issued books */
		
		Library lb = new Library();
		lb.addBooks("A Song of Ice and Fire");
		lb.addBooks("Rashmirathi");
		lb.addBooks("Rythm Roger");
		lb.addBooks("Pukhraj");
		System.out.println();
		
		lb.showAvailableBooks();
		
		lb.issueBooks("Pukhraj");
		lb.showAvailableBooks();
		
		lb.returnBook("Radheya");
		lb.showAvailableBooks();
	}

}
