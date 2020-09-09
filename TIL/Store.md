# 2020년 06월 04일(목)
> # Store.java
```C++
import java.util.*;
class Book {
	final int num = 10;			//입고할 책 3개로 지정.
	int price;
	int total =0;	//합계 초기화
	String book[][] = new String[2][num];
	
	Scanner sc = new Scanner(System.in);
	
	//기능 선택하기
	public void select_Function(){
		
		System.out.println("Function");
		System.out.println("1. Insert_DATA");
		System.out.println("2. Book_LIST");
		System.out.println("3. Book_PRICE");
		System.out.println("4. Book_Total");
		
		while(true) {
			System.out.print("Select >> ");
			int f = sc.nextInt();
			
			switch(f){
			case 1:
				insert_Book(book);
				break;
			case 2:
				print_List(book);
				break;
			case 3:
				print_Price(book);
				break;
			case 4:
				print_Total(book);
				break;
			}
			System.out.println();
		}
	}
	
	//도서 선정하기
	public void insert_Book(String book[][]) {
		for(int i =0; i < 2; i++) {
				System.out.print("Name :");
				book[0][i] = sc.next();
				
				System.out.print("Price :");
				book[1][i] = sc.next();
				
				total += Integer.parseInt(book[1][i]);		//총 합계 누적. ; String -> Integer 형변환.
		}
	}
	
	//도서 LIST 출력
	public void print_List(String book[][]) {
		System.out.println("BOOK LIST");
		for(int i =0; i < book.length; i++) {
			System.out.println(i + "> " + book[0][i]);
		}
	}
	
	//도서 가격 출력
	public void print_Price(String book[][]) {
		for(int i =0; i < book.length; i++) {
			System.out.println("no :" + i);
			System.out.println("title :" + book[0][i]);
			System.out.println("price :" + book[1][i] + "원");
			System.out.println();
		}
	}
	
	//도서 가격의 총합 출력
	public void print_Total(String book[][]) {
			System.out.println("Total = " + total + "원");
	}
	
}
public class Store {
	
	public static void main(String[] args) {
		
		Book bs = new Book();	//Book Store 오픈
		bs.select_Function();
	}
}
```