import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.Scanner;

/** Menu class currently only has static methods to prompt to standard output information about a Contact like name,etc
 * @author Sahil Chopra
 * @since  4/18/2016
 * @version 1.0
**/

class Menu {
	AddressBook addressbook; 
	public void execute() throws IOException{  
		addressbook = new AddressBook();
		char EXIT='f';
		char input;
		System.out.println("Please enter in your menu selection");
		System.out.println("a) Loading From File");
		System.out.println("b) Addition");
		System.out.println("c) Removal");

		System.out.println("d) Find");
		System.out.println("e) Listing");
		System.out.println("f) Save and Quit");
		Scanner SC = new Scanner(System.in);
		input= SC.next().charAt(0);
		switch(input)
	      {
	         case 'a' :
	            System.out.println("Enter the file Name!"); 
	            SC = new Scanner(System.in);
	            addressbook.getDetailfromConsole(SC.next());
	            break;
	         case 'b' :
	        	 addressbook.Adddetailtostructure();
	        	 
	        	 break;
	         case 'c' :
	            System.out.println("Enter in Last Name of contact to remove:");
	            addressbook .ShowDetailtoConsoleGettingInputfromConsole();
	            break;
	         case 'd' :
	            System.out.println("Enter in all or the begining of the Last Name of the contact you wish to find:");
	            addressbook .ShowSearchdetail();
	            break;
	         case 'e' :
		            //System.out.println("Enter in all or the begining of the Last Name of the contact you wish to find:");
		            addressbook.ShowDetailtoConsole();
		            break;
	         case 'f' :
	          System.out.println("SAVE and Quit");
	            break;
	         default :
	            
	      }
		System.out.println("Please enter in your menu selection");
		System.out.println("a) Loading From File");
		System.out.println("b) Addition");
		System.out.println("c) Removal");
		System.out.println("d) Find");
		System.out.println("e) Listing");
		System.out.println("f) Save and Quit");	
		Scanner SC2 = new Scanner(System.in);
		input= SC2.next().charAt(0);
		
		while(input!=EXIT){
			switch(input)
		      {
		         case 'a' :
		            System.out.println("Enter the file Name!"); 
		            SC = new Scanner(System.in);
		            addressbook.getDetailfromConsole(SC.next());
		            break;
		         case 'b' :
		        	 addressbook.Adddetailtostructure();
		        	 
		        	 break;
		         case 'c' :
		            System.out.println("Enter in Last Name of contact to remove:");
		            addressbook .ShowDetailtoConsoleGettingInputfromConsole();
		            break;
		         case 'd' :
		            System.out.println("Enter in all or the begining of the Last Name of the contact you wish to find:");
		            addressbook .ShowDetailtoConsoleGettingInputfromConsole();
		            break;
		         case 'e' :
			            //System.out.println("Enter in all or the begining of the Last Name of the contact you wish to find:");
		        	 addressbook.ShowDetailtoConsole();
		        	 break;
		         case 'f' :
		            System.out.println("SAVE and Quit");
		            break;
		         default :
		            
		      }
			
			System.out.println("Please enter in your menu selection");
			System.out.println("a) Loading From File");
			System.out.println("b) Addition");
			System.out.println("c) Removal");
			System.out.println("d) Find");
			System.out.println("e) Listing");
			System.out.println("f) Save and Quit");	
			Scanner SC1 = new Scanner(System.in);
			input= SC1.next().charAt(0);
		   }
			if(input=='f'){
				
				addressbook.save();
				
				
			}
			
		}
		
	
		
	}
	
 
