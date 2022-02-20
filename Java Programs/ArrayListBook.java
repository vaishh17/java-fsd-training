import java.util.*;
public class ArrayListBook {	
	public static void main(String[] args) {
		
		List<Book> arrList = new ArrayList<Book>();
		
		arrList.add(new Book(2015,"Into the wild","Arun",12));
		arrList.add(new Book(2004,"Roads & Mountains","Varshit",6));
		arrList.add(new Book(2020,"Scientific Football","Sayed",10));
		arrList.add(new Book(1998,"Guns & Roses","Lilwayne",20));
		for(Book str1: arrList)
		{
			System.out.println(str1.yop + " " +str1.name +" "+str1.author+" "+str1.qty);
		}
		System.out.println();
		Collections.sort(arrList, new yopComparator() );
		for(Book str: arrList)
		{
			System.out.println(str.yop + " " +str.name +" "+str.author+" "+str.qty);
		}
	}
}
class Book
{  
	int yop;  
	String name,author;  
	int qty;  
	public Book(int yop, String name, String author, int qty) 
	{  
    this.yop = yop;  
    this.name = name;  
    this.author = author;  
    this.qty = qty;  
	}  
	class yopComparator implements Comparator<Book>
	{
		public int compare(Book b1, Book b2)
		{
			if(b1.yop == b2.yop)
				return 0;
			else if(b1.yop > b2.yop)
				return 1;
			else
				return -1;
		}
	}

}


