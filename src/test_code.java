import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import cracking_code.Student;

import java.util.*;

public class test_code {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String x;
		int xy;

		// para string usa o next
		System.out.print("the value of X is: ");
		//read line
		/* x = sc.next(); */
		x = "teste";

		// para int usar o nextInt

		System.out.print("Enter value of XY is: ");
		/*xy = sc.nextInt();*/
		xy = 10;

		System.out.println("The value of X is :" + x + "value of XY is :" + xy);

		String[] cars = { "AUDI", "BMW", "CHEVROLET", "FORD", "MERCEDES" };

		for (int i = 0; i < cars.length; i++) {
			System.out.println(cars[i]);

		}

		List<Student> list = new ArrayList<>();


		list.add(new Student(101, "test1", 21));
		list.add(new Student(120, "test2", 31));
		list.add(new Student(130, "test3", 41));
		list.add(new Student(111, "test4", 51));




		Iterator itr= list.iterator(); 

		while(itr.hasNext()){  
			Student st=(Student)itr.next();  
			System.out.println(st.rollno+" "+st.name+" "+st.age);  
		}  

		/*
		 * 1*****
			12****
			123***
			1234**
			12345*
			123456
		 */

		for (int i = 1; i <= 6; i++ ) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			for (int k = 6; k > i; k--) {
				System.out.print("*");
			}
			System.out.println();
		}

		/*12345&
		1234&&
		123&&&
		12&&&&
		1&&&&&*/
		for (int i = 6; i >= 1; i-- ) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			for (int k = 6; k > i; k--) {
				System.out.print("&");
			}
			System.out.println();
		}

		/*
		 *  @
			@ @
			@  @
			@   @
			@    @
			@     @
			@ @ @ @ @ @ 
		 */
		System.out.println();
		System.out.println("@");
		for (int i = 5; i >= 1; i--) {
			System.out.print("@");
			for (int j = 5; j >= i; j--) {
				System.out.print(" ");
			}

			System.out.println("@");
		}
		for (int j = 5; j >= 0; j--) {
			System.out.print("@ ");
		}

		/*
		 *  1 10 11 20 21 30
			2 9 12 19 22 29
			3 8 13 18 23 28
			4 7 14 17 24 27
			5 6 15 16 25 26
			6 5 16 15 26 25
			7 4 17 14 27 24
			8 3 18 13 28 23
			9 2 19 12 29 22
			10 1 20 11 30 21
		 */
		
		System.out.println();
		
		/* print bloco de numero */
		for  (int a = 1, b = 10, c = 11, d = 20, e = 21, f = 30; a <= 10; a++,b--, c++, d--, e++, f-- )
		{
			System.out.println(a + " " + b + " " + c + " " + d + " " + e + " " + f);
			
		}	
			
		System.out.println("============================");
		
		/*
		 * [[1, 2, 3],
 		   [4, 5, 6],
 		   [7, 8, 9]]
		 * output
		 * 9 4 1
		   8 5 2
		   7 6 3
		 */
		
		for (int i = 1, b = 9, c = 4, d = 1; b >= 7; b--, c++, d++)
		{
			System.out.println(b + " " + c + " " + d);
		}
		
		sc.close();

	}



}
