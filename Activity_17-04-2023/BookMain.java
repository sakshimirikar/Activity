
//Book Management System using Array
package bookapplication;

import java.util.Scanner;

public class BookMain {

	public static void main(String[] args) {
		BookService bservice = new BookService();
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to our Book Management System");
		
		do {
			System.out.println("Press \n 1 To Create Book \n 2 To Get All Book Details \n 3 To Get Book Details using Id \n 4. To Get Book Details using Name \n 5. To Update Book \n 6. Exit  ");
			System.out.println("---------------------------------------------------");
			System.out.println("Enter your choice : ");
			int choice = sc.nextInt();
			
			switch(choice) {
			
			case 1:
				bservice.createBook();
				System.out.println();
                                break;
				
			case 2 :
				bservice.getAllBookDetails();
				System.out.println();
				break;
				
			
			case 3:	
				bservice.getBookDetailsById();
				System.out.println();
				break;
				
			case 4:
				bservice.getBookDetailsByName();
				System.out.println();
				break;
				
			case 5 :
				bservice.bookUpdate();
			
				
			case 6:
				System.out.println("Thanks for visiting !");
				System.exit(0);
			
			default:
				System.out.println("You entered wrong choice !");	
			
			
			}
			
		
		}
		while(true);	
	}

}


//make new class BookService under bookapplication
package bookapplication;

import java.util.Scanner;

public class BookService {
	static Book book[] = new Book[10];  // creating array of Book type
	static Scanner sc = new Scanner(System.in);

	static int index=0;
	
    //creatong createbook method
	public static void createBook()
	{
		System.out.println("Enter book id : ");
		int id = sc.nextInt();
		
		sc.nextLine();
		System.out.println("Enter book Name : ");
		String bname = sc.nextLine();
		
		System.out.println("Enter book Price : ");
		double price = sc.nextDouble();
		
		book[index]= new Book(id, bname, price);
		index++;
		System.out.println("Book Details created successfully ");
	
	}
	
	//get all book details method
	public static void getAllBookDetails() {
		for(int i=0;i<index;i++) {
			System.out.println("Book Id : " + book[i].getBookId());
			System.out.println("Book Name : " + book[i].getBookName());
			System.out.println("Book Price : " + book[i].getBookPrice());
			System.out.println("----------------------------------");
			
		}
		
	}
	
	//get book details based on id
	public static void getBookDetailsById() {
		
		System.out.println("Enter id to search : ");
		boolean flag = false;
		int id = sc.nextInt();
		
		for(int i=0;i<index ;i++) {
			if(book[i].getBookId()==id) {
				System.out.println("Book Id : " + book[i].getBookId());
				System.out.println("Book Name : " + book[i].getBookName());
				System.out.println("Book Price : " + book[i].getBookPrice());
				System.out.println("----------------------------------");
				flag=true;
			}
			else
			{
				if(flag==true)
					System.out.println("Book not found !!");
			}
		}
		
	}
	
	
    //--------------------------------------------
     public static void getBookDetailsByName() {
		
    	 
		System.out.println("Enter book name to search : ");
		sc.nextLine();
		boolean flag = false;
		String bname = sc.nextLine();
	
		for(int i=0;i<index ;i++) {
			
	        
			if(book[i].getBookName().equalsIgnoreCase(bname)) {
				
				System.out.println("Book Name : " + book[i].getBookName());
				System.out.println("Book Id : " + book[i].getBookId());
				System.out.println("Book Price : " + book[i].getBookPrice());
				System.out.println("----------------------------------");
				flag=true;
				break;
			}
			
		}
		if(flag==false)
			System.out.println("Book not found !!");
		
	}
	
	public static void bookUpdate() {
    	
    	boolean flag=false;
    	System.out.println("Enter the book id you want to replace");
    	int id=sc.nextInt();
    	
    	for(int i=0 ; i<index ; i++) {
    		if(id==book[i].getBookId()) {
    			
    			
    			sc.nextLine();
    			System.out.println("Enter the New Book Name : ");
    			String bname = sc.nextLine();
    			
    			System.out.println("Enter New Book Price : ");
    			double bprice = sc.nextDouble();
    			
//    			book[i].setBookName(bname); //using setter methods
//    			book[i].setBookPrice(bprice);
//    			
    			
    			book[i] = new Book(id, bname, bprice);
    			flag=true;
    			
    			
    		}
    	}
    	
    	if(flag==true) {
    		System.out.println("Book is updated successfully !");
    	}
    	else
    		System.out.println("Book id " + id + " not found ! ");
    	
    	
    }
		
	
}

//make new class under bookapplication
package bookapplication;

public class Book {
	
	private int bookId;
	private String bookName;
	private double bookPrice;
	
	
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public double getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(double bookPrice) {
		this.bookPrice = bookPrice;
	}
	
	public Book(int bookId, String bookName, double bookPrice) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookPrice = bookPrice;
	}
	
	public Book() {
		super();

	}
}
