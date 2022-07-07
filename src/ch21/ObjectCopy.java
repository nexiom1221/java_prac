package ch21;

public class ObjectCopy {
public static void main(String[] args) {
	Book[] library = new Book[5];
	Book[] copyLibrary = new Book[5];
	
	library[0] = new Book("태백산맥1", "조정래");
	library[1] = new Book("태백산맥2", "조정래");
	library[2] = new Book("태백산맥3", "조정래");
	library[3] = new Book("태백산맥4", "조정래");
	library[4] = new Book("태백산맥5", "조정래");
	
	// System.arrayCopy(src, srcPos, dest, destPos, length) 자바에서 제공되는 배열 복사 메서드
	System.arraycopy(library, 0, copyLibrary, 0, 5);	
	
	System.out.println("======copy library=========");
	for(Book book : copyLibrary) {
		book.showBookInfo();
	}
	
	
}
}