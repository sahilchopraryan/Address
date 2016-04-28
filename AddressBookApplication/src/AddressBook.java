import java.awt.List;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;
/** This class use to extract the input from the console,
 * search the record from the address contacts,
 * show the details to console 
 * @author Sahil Chopra
 * @since  4/18/2016
 * @version 1.0
 **/
	
public class AddressBook { 
	Scanner read = new Scanner(System.in);
	LinkedList<AddressEntry> Records= new LinkedList<AddressEntry>();   //Maintening the collection
	/**
	 * Storing the First Name
	 **/
	private String firstName;           						
	/**
	 * Storing the Last Name
	 **/ 							
	private String lastName;
	/**
	 * Storing the Street
	 **/ 		
	private String street;
	/**
	 * Storing the State
	 **/ 		
	private String state;
	/**
	 * Storing the phone
	 **/ 	
	private String phone;
	/**
	 *  storing the email
	 **/ 	
	private String email;
	/**
	 *   Storing the Zip
	 **/ 	
	private Integer zip;  				 
	
	
	 
	/**
	 * Fetching the data from file
	 **/
	
	public void getDetailfromConsole(String fileName){
		 // String fileName = "temp.txt";		//file name storing the data
		  int i=0;
		  String xy = null;					// read the data element from the file
		  String[] thisIsAStringArray = new String[115];
		  try {
	            // FileReader reads text files in the default encoding.
	            FileReader fileReader = 
	                new FileReader(fileName);

	            // Always wrap FileReader in BufferedReader.
	            BufferedReader bufferedReader = 
	                new BufferedReader(fileReader);

	            try {
					while((xy = bufferedReader.readLine())!=null) {
					
						i++;
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}   
				System.out.println("Read in"+ i+" new Addresses, successfully loaded, currently 21 Addresses");
		
	}
		  catch(FileNotFoundException ex){
			  System.out.println(ex.getMessage());
			  
			  
		  }
	}
	
	
	/**
	 *showing the details to console 
	 **/
	public void ShowDetailtoConsole(){
		
		for(int i=0;i<Records.size();i++){
			System.out.println(i+1+":");
			System.out.println(Records.get(i).getFirstName());
			System.out.println(Records.get(i).getLastName());
			System.out.println(Records.get(i).getState());
			System.out.println(Records.get(i).getState());
			System.out.println(Records.get(i).getPhone());
			System.out.println(Records.get(i).getEmail());
			System.out.println();
		}
		
	}

	/**
	 *showing the details to console by scanning input from 
	 **/
	public void ShowDetailtoConsoleGettingInputfromConsole(){

		ArrayList<Integer>  match = new ArrayList<Integer>();
		HashMap<Integer,Integer> hashMap = new HashMap<Integer, Integer>();
		int count=0;
		System.out.println("Enter the last name");
		lastName=read.next();
			for(int i=0;i<Records.size();i++){
				if(lastName.equalsIgnoreCase(Records.get(i).getLastName())){
					
					match.add(i);
					count++;
					
					
				}else{
					System.out.println("NO Records find");
				}
			}
		System.out.println("The following"+ count+1+ "entries were found in the address book, select number of entry you wish to remove:"); 
		for(int i=0;i<match.size();i++){
			System.out.println(i+1);
			System.out.println(firstName+""+lastName);
			System.out.println(Records.get(i).getState());
			System.out.println(Records.get(i).getState());
			System.out.println(Records.get(i).getPhone());
			System.out.println(Records.get(i).getEmail());
			System.out.println(Records.get(i).getZip());
			hashMap.put(i+1, match.get(i));
		}
		System.out.println("Hit number to remove the following entry or n to return to main menu:");
		int a=read.nextInt();
		//Records.remove(hashMap.get(a));
		System.out.println(Records.get(hashMap.get(a)).getFirstName()+""+Records.get(hashMap.get(a)).getLastName());
		System.out.println(Records.get(hashMap.get(a)).getState());
		System.out.println(Records.get(hashMap.get(a)).getStreet());
		System.out.println(Records.get(hashMap.get(a)).getPhone());
		System.out.println(Records.get(hashMap.get(a)).getZip());
		System.out.println(Records.get(hashMap.get(a)).getEmail());
		Records.remove(hashMap.get(a).intValue());
		
		System.out.println(Records.size());
	}
	public void Adddetailtostructure(){

		System.out.println("Enter the first name");
		firstName= read.next();
		System.out.println("Enter the Last name");
		lastName= read.next();
		System.out.println("Enter the Street name");
		street= read.next();
		System.out.println("Enter the State name");
		state= read.next();
		System.out.println("Enter the Phone name");
		phone= read.next();
		System.out.println("Enter the email name");
		email= read.next();
		System.out.println("Enter the ZIP name");
		zip= Integer.parseInt(read.next());
		
		
	        AddressEntry addressEntry = new AddressEntry(firstName,lastName, street, state, phone, email, zip);
		Records.add(addressEntry);
		System.out.println("Thank you the following contact has been added to your address book:");
		System.out.println(firstName +""+lastName);
		System.out.println(state);
		System.out.println(street);
		System.out.println(phone);
		System.out.println(zip);
		System.out.println(email);
		
		firstName="";
		lastName="";
		street="";
		state="";
		phone="";
		email="";
		zip=null;
		
		
	
	}
	public void ShowSearchdetail(){


		int[]match = null;
		//HashMap<Integer,Integer> hashMap = new HashMap<Integer, Integer>();
		int count=0;
		System.out.println("Enter in all or the begining of the Last Name of the contact you wish to find:");
		lastName=read.next();
			for(int i=0;i<Records.size();i++){
				if(lastName.equalsIgnoreCase(Records.get(i).getLastName())){
					
					match[count]=i;
					count++;
					
					
				}else{
					System.out.println("NO Records find");
				}
			}
		System.out.println("The following"+ count+1+ " entries were found in the address book for a last name starting with " +lastName); 
		for(int i=0;i<match.length;i++){
			System.out.println(i+1);
			System.out.println(firstName+""+lastName);
			System.out.println(Records.get(i).getState());
			System.out.println(Records.get(i).getState());
			System.out.println(Records.get(i).getPhone());
			System.out.println(Records.get(i).getEmail());
			System.out.println(Records.get(i).getZip());
			
		}
		
		
		
	
		
	}
	public void save() throws IOException{
		System.out.println("Enter the filename");
		Scanner SC = new Scanner(System.in);
		
		String filename = SC.next();
		File statText = new File("E:/sahil/AddressBookApplication/"+filename+".txt");
        FileOutputStream is = new FileOutputStream(statText);
        OutputStreamWriter osw = new OutputStreamWriter(is);    
        Writer w = new BufferedWriter(osw);

		
		for(int i=0;i<Records.size();i++){
			System.out.println(i+1+":");
			w.write(Records.get(i).getFirstName());
			w.write(Records.get(i).getLastName());
			w.write(Records.get(i).getPhone());
			w.write(Records.get(i).getState());
			w.write(Records.get(i).getZip());
			w.write(Records.get(i).getState());
			
			System.out.println();
		}
		
	
        
		w.close();
		
	}
	
}
