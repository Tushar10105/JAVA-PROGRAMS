class Book{
	private String Title,Author;

	public Book(String Title,String Author){
		this.Title=Title;
		this.Author=Author;
		}

		public void ShowBook(){
			System.out.println("Book: "+Title+" by "+Author);
			}

	}

	class Library{
		private static final String LibraryName="CENTURION UNIVERSITY LIBRARY";
		private final Book book;

		public Library(Book book){
			this.book=book;
			}

			public void ShowLibrary(){
				System.out.println("Library: "+LibraryName);
				book.ShowBook();
				}

		}

	public class Association{
		public static void main(String args[]){
			Book b1=new Book("JAVA Programming","James Gosling");
			Library lib=new Library(b1);
			lib.ShowLibrary();
			}
		}