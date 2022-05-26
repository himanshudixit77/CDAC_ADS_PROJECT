import java.util.*;
import java.util.InputMismatchException;
class Solution
{
public static void display1()
{
	int n=0;;
TelephoneDirectory obj=new TelephoneDirectory();
Scanner sc=new Scanner(System.in);
   System.out.println("|===========================================|");
      System.out.println("|       WELCOME TO TELEPHONE DIRECTORY      |");
      System.out.println("|===========================================|");
do
{  
	 System.out.println("1 -insert at Start");
	   System.out.println("2 -insert after Any NAME");
	   System.out.println("3 -insert at LAST PLACE");
	   System.out.println("4-display");
	    System.out.println("5-letter Search");
		System.out.println("6-Startingword Search");
		 System.out.println("7-Middle Name of Directory");
		 System.out.println("8-Sorting");
		  System.out.println("9-Delete");
		  System.out.println("10- Edit Contact");
		   System.out.println("11- Searching");
		  System.out.println();
	    System.out.println("enter the choice");
		
		try
		{
			n=sc.nextInt();
	     
	 switch(n)
	 {
		 case 1:
		 System.out.println("enter the PHONE NUMBER of CUSTOMER");
		   long number=sc.nextLong();
		   sc.nextLine();
		  System.out.println("enter the NAME of CUSTOMER");
		  String s=sc.nextLine();
		   obj.insertAtHead(s,number);
		    System.out.println("PHONE number added Successfully");
			  System.out.println("--------------------------------");
			break;
			case 2:
			sc.nextLine();
			
		   obj.insertAfterPosition(); 
			break;
			case 3:
			System.out.println("enter the PHONE NUMBER of CUSTOMER");
		  long  number2=sc.nextLong();
		  sc.nextLine();
		  System.out.println("enter the NAME of CUSTOMER");
		  String s2=sc.nextLine();
		   
		   obj.insertAtLast(s2,number2);
		    System.out.println("PHONE number added Successfully");
			 System.out.println("--------------------------------");
			break;
			case 4:
			obj.display();
			break;
			case 5:
			sc.nextLine();
			System.out.println("enter the Character by which u want to search");
			String s3=sc.nextLine();
			obj.SearchByletter(s3);
			break;
			case 6:
			sc.nextLine();
			System.out.println("enter the word by which u want to search the name");
			String s4=sc.nextLine();
			obj.SearchbyWord(s4);
			break;
			case 7:
			sc.nextLine();
			obj.MiddleElement();
			System.out.println("---------------------");
			break;
			case 8:
			obj.sortList();
			System.out.println("Sorting Completed");
			System.out.println("---------------------");
			break;
			case 9:
			sc.nextLine();
			
			obj.delete();
			break;
			case 10 :
			sc.nextLine();
		System.out.println("Enter Name to edit the Number ");
		String s6=sc.nextLine();
					obj.editContact(s6);
					break;	
					case 11:
					sc.nextLine();
					obj.Searching();
			break;
       }
	  
}		 catch (InputMismatchException e) {
		System.out.println("Wrong input");
		System.out.println("----------------");
		display1();
		}

}while(n<=12);
}
public static void main(String args[])
{
	display1();
}
}



