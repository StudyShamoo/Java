package itr_prac;

import java.util.Iterator;

public class IteratorTester {

	public static void main(String[] args) {
		BookShelf bookShelf = new BookShelf();
		bookShelf.appendBook(new Book("First Book"));
		bookShelf.appendBook(new Book("Second Book"));
		bookShelf.appendBook(new Book("Third Book"));
		bookShelf.appendBook(new Book("Fourth Book"));
		
		// 明示的にIteratorを使う方法
		Iterator<Book> it = bookShelf.iterator();
		while(it.hasNext()) {
			Book book = it.next();
			System.out.println(book.getName());
		}
		System.out.println();
		
		// 拡張for文を使う方法
		for(Book book : bookShelf) {
			System.out.println(book.getName());
		}
		System.out.println();
	}

}
