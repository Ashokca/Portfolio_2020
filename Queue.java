package AP_Exam;
import java.util.*;
public class Queue
{ 
	public static void main (String args []) 
	{ 
		int use_inp = 0, use_inp2 = 0; 
		while(use_inp != 2) 
		{
		 Scanner scan = new Scanner(System.in); 
		 Queue a = new Queue();   
		System.out.println("Would you like to add or delete the list?"); 
		System.out.println("1. Add"); 
		System.out.println("2. Delete");  
		use_inp = scan.nextInt();
		switch (use_inp) 
		{ 
		case 1: 
			  add(); 
			  print_queue();
			  break;
		case 2: 
			System.out.println("Do you want to delete everything or delete one item?"); 
			System.out.println("1. Delete 1"); 
			System.out.println("2. Delete Everything"); 
			use_inp2 = scan.nextInt();
			switch (use_inp2) 
			{ 
			case 1: 
				delete(); 
				print_queue();
				break; 
			case 2: 
				delete_everything(); 
				print_queue(); 
				System.out.println("List is now empty");
			}
	
			break;
		}
	 
	} 
	}
   private static LinkedList headNode;			// 1st element in Queue
   private static LinkedList tailNode;			// Last element in Queue
   private static LinkedList currentNode;		

 

  

  public static void add()
  {
	
	  Random rand = new Random();
	  Scanner scan = new Scanner(System.in); 
	  String[] mathequations = Queue_Lab.main(); 
	  String[] booktitles = Queue_Lab.booktitles(); 
	  String user;  
	  int use_inp; 
	  int random;
	 System.out.println("What would you like to add to the list?"); 
	System.out.println("1. A dog"); 
	System.out.println("2. A random math equation"); 
	System.out.println("3. A random book title");  
	use_inp = scan.nextInt();
		switch(use_inp) 
		{ 
		case 1: 
			user = "Dog";   
			 tailNode = new LinkedList(user, currentNode); 
			 break; 
		case 2: 
			 random = rand.nextInt(3);
			user = mathequations[random];  
			tailNode = new LinkedList(user, currentNode); 
			break; 
		case 3: 
			 random = rand.nextInt(3);
			user = booktitles[random]; 
			tailNode = new LinkedList(user, currentNode);
			break;
		}
	  
	  
	  if (currentNode != null)
		  currentNode.setNextNode(tailNode);
	  
	  currentNode = tailNode;

	 
	  if (headNode == null) {
		  headNode = tailNode;
	  }
  }
  

  public static String delete()
  {
	  String base_string = null; 
	  if (headNode != null) {
		  base_string = headNode.getObject();
		  headNode = headNode.getNext();
		  if (headNode == null)
			  tailNode = headNode;
		  else
			  headNode.setPrevNode(null);
	  } 
	  		
	  return base_string;
  } 
  public static String delete_everything() 
  { 
	  String base_string = null; 
		while (headNode != null)   
	  	{
			  if (headNode != null) {
				  base_string = headNode.getObject();
				  headNode = headNode.getNext();
				  if (headNode == null)
					  tailNode = headNode;
				  else
					  headNode.setPrevNode(null);
	  	} 
	  	} 
		return base_string;
  }
  

   
  public static void print_queue() 
  {  
	  String queueToString = "List:";

  LinkedList Start = headNode;  			
  while (Start != null)
  {
  	queueToString += Start.getObject(); 	
  	Start = Start.getNext();				
  	if (Start != null)
  		queueToString += ", ";
  }										 
	  if (queueToString != null) 
		  System.out.println(queueToString);
  } 
  
  }
    
