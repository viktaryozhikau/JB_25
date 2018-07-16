package by.epam.jb25.Lesson10;





import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		Library myLibrary = new Library();
		
		myLibrary.add(new Book("Java.NET ", "Rabinovich", 120,
				2018, "SomeOne"));
		myLibrary.add(new Book("C++", "NewYork", 120, 2016, "Ivanov"));
		
		myLibrary.add(new Magazine("Ponny", 70, 500, 2010, "Petrov"));
		myLibrary.add(new Magazine("Play Games", 10, 120, 2012, "Sidorov"));
		// exclude Book
		myLibrary.remove(new Book("C++", "NewYork", 120, 2016, "Rabinovich"));
		// find printed editions with price
		Findable price = new FindByPrice(120);
		List<PrintedEdition> listPr = myLibrary.find(price);

		System.out.println("-------LIST  WITH PRICE 120$------");
		print(new PrintAsList(), listPr);
		System.out.println("----------TABLE-----------");
		print(new PrintAsTable(), listPr);

		// find printed editions by author
		Findable author = new FindByAuthor("Vasya");
		List<PrintedEdition> listAu = myLibrary.find(author);
		System.out.println("----------FIND BY AUTHOR-----------");
		System.out.println("Printed Editions with the same author:" );
		print(new PrintAsList(), listAu);
		// comparator by price
		System.out.println("----------FIND BY AUTHOR SORTED BY PRICE----------");
		Comparator<PrintedEdition> comparatorByPrice = new ComparatorPrice();

		Set<PrintedEdition> bookSortedByPrice = new TreeSet<PrintedEdition>(comparatorByPrice);
		for (int i = 0; i < listAu.size(); i++) {
			bookSortedByPrice.add(listAu.get(i));
		}
		for (PrintedEdition elements : bookSortedByPrice) {
			System.out.print(elements.toString() + "\n");
		}
		// comparator by year published
		System.out.println("----------FIND BY AUTHOR SORTED BY YEAR----------");
		Comparator<PrintedEdition> comparatorByYear = new ComparatorYear();

		Set<PrintedEdition> bookSortedByYear = new TreeSet<PrintedEdition>(comparatorByYear);
		for (int i = 0; i < listAu.size(); i++) {
			bookSortedByYear.add(listAu.get(i));
		}
		for (PrintedEdition elements : bookSortedByYear) {
			System.out.print(elements.toString() + "\n");
		}
				
	}

	public static void print(Printable printObj, List<PrintedEdition> lists) {
		printObj.print(lists);
	}
}
