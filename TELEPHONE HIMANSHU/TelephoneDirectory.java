import java.util.*;
class TelephoneDirectory
{
node head;
static int pos=0;
static class node
{
	long number;
String name;
node prev;
node next;
	node(String name,long number)
	{
this.number=number;
this.name=name;
prev=null;
next=null;
  }
}
static Scanner sc=new Scanner(System.in);
void insertAtHead(String name,long number)
{
node n=new node(name,number);

n.next=head;
head=n;
}

	void insertAfterPosition()
	{
	
	node p=head;
	if(head==null)
	{
		System.out.println("EMPTY DIRECTORY");
		 System.out.println("--------------------------------");
	return;
	}
	System.out.println("enter the NAME of CUSTOMER After which you want to Add Customer name");
		  String s1=sc.nextLine();
		  
			 System.out.println("enter the PHONE NUMBER of CUSTOMER");
		  long  number1=sc.nextLong();
		   sc.nextLine();
		  System.out.println("enter the NAME of CUSTOMER");
		  String name=sc.nextLine();
		  node n=new node(name,number1);
	while(p!=null && !p.name.equalsIgnoreCase(s1))
	{
	p=p.next;
	}
	if(p.name.equalsIgnoreCase(s1))
	{
	n.next=p.next;
	p.next=n;
	n.prev=p;
	p.next.prev=n;
	}
	System.out.println("PHONE number added Successfully");
			 System.out.println("--------------------------------");
	}
	
	void display()
	{
		if(head==null)
		{
			System.out.println("Empty directory");
			System.out.println("----------------------------------");
			return;
		}
		node n=head;
		System.out.println("----------------------------------");
		while(n!=null)
		{
			System.out.println(n.name+ " "+n.number);
			n=n.next;
		}
			System.out.println("----------------------------------");
	}
void insertAtLast(String name,long number)
{
	node n=new node(name,number);
	node p=head;
	if(head==null)
		{
			head=n;
			return;
		}
		while(p.next !=null)
		{
			p=p.next;
		}
		
		p.next=n;
		n.prev=p;
	}
	void Searching()
	{
	 node n=head;
	 int pos=0;
	 if(head==null){
		 System.out.println("Directory is Empty");
		  System.out.println("----------------------------------");
		  return;
	 }
	 System.out.println("enter the name u want to search the name");
			String s7=sc.nextLine();
	 while(n!=null)
	 {
		 pos++;
		 if(n.name.equalsIgnoreCase(s7)){
		 System.out.println("Number found  at position "+pos);
		 System.out.println("----------------------------------");
		 return;
		 }
	 n=n.next;
	 }
	 System.out.println(" Number not found");
	 System.out.println("----------------------------------");
	}

  void SearchByletter(String s)
{
	char s1=s.charAt(0);
	node n=head;
	System.out.println();
	while(n!=null) 
	{
		if(n.name.charAt(0)==s1)
		{
		System.out.println(n.name+ " "+n.number);
		}
		n=n.next;
		
	}

	 System.out.println("--------------------------------");
}
void delete()
  {  
  node n=head;
  node pre=null;
  if(head==null){
	  System.out.println("Sorry it is empty");
	   System.out.println("--------------------------------");
	  return;
  }
          System.out.println("enter the name u want to DELETE ");
			String s5=sc.nextLine();
	  if(n.name.equalsIgnoreCase(s5) && n!=null)
	  {  head=n.next;
	  
		  return;
	  }
	  while(n.next!=null && !n.name.equalsIgnoreCase(s5))
	  {
		  pre=n;
		  n=n.next;
	  }
	  if(n.next==null)
	  {
		  pre.next=null;
		  System.out.println("Deleted Name");
		  System.out.println("--------------------------------");
	  return;
	  }
     pre.next=n.next;
	 n.next.prev=pre;
	 System.out.println("delete done");
	 System.out.println("----------------------------------");
  }
void SearchbyWord(String s)
{
	int len=s.length();
	node n=head;
	System.out.println();
	System.out.println("----------------------------------");
	while(n!=null)
	{
		if(n.name.substring(0,len).equalsIgnoreCase(s))
		{
			System.out.println(n.name+ " "+n.number);
		}
		n=n.next;
	}
	 System.out.println("----------------------------------");
	
}
   void editContact(String name)
   {
	   Scanner sc=new Scanner(System.in);
	   node temp=head;
	   
	   while(temp!=null && !(name.equals(temp.name)))
	   {
		   temp=temp.next;
	   }
	   if(temp==null)
	   {
		   System.out.println("Name not Found !!!");
	   }
	   else
	   {
		   System.out.println("Enter Number to update ");
		   temp.number=sc.nextInt();
		   System.out.println("Number is updated !!!");
		   	System.out.println("----------------------------------");
	   }
   }
void MiddleElement()
{
	node n=head;
	node prev=head;
	while(n!=null &&n.next!=null)
	{
		n=n.next.next;
		prev=prev.next;
	}
	System.out.println(prev.name+ " "+prev.number);
	System.out.println("----------------------------------");
}
public void sortList() {
        node current = null, index = null;
        String strtemp;
        long numtemp;
        //Check whether list is empty  
        if (head == null) {
            return;
        } else {

            for (current = head; current.next != null; current = current.next) {

                for (index = current.next; index != null; index = index.next) {

                    int first = current.name.charAt(0);
                    int second = index.name.charAt(0);

                    if (first > second) {
                        strtemp = current.name;
                        current.name = index.name;
                        index.name = strtemp;

                        numtemp = current.number;
                        current.number = index.number;
                        index.number = numtemp;
                    }
                }
            }
        }
    }

}