package filehandling_assignment1;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileWriter;

public class file_create {
	
	public void create() {
		try {
			
			File file1 =  new File("message.txt");
			if(file1.createNewFile()) {
				System.out.println("file "+file1.getName()+ " file created succesesfully");
			}
			else {
				System.out.println("File already exists");
			}
		}
		catch(IOException exception) {
			System.out.println("unexpected error");
			exception.printStackTrace();
		}
	}
	
	public void write() {
		try {
			FileWriter fw =new FileWriter("message.txt");
			fw.write("i learned something new today. hope to learn somethn=ing new even tomorrow");
			fw.close();
			System.out.println("content successfully worte in file");
			
		}
		catch(IOException e) {
			System.out.println("unexpected error");
			e.printStackTrace();
		}
		
	}
	
	public void read() {
		try {  
            // Create f1 object of the file to read data  
            File f1 = new File("message.txt");    
            Scanner read = new Scanner(f1);  
            while (read.hasNextLine()) {  
                String data = read.nextLine();  
                System.out.println(data);  
            }  
            read.close();  
        } catch (FileNotFoundException exception) {  
            System.out.println("Unexcpected error occurred!");  
            exception.printStackTrace();
	}
	  
}
	
	public void delete() {
		File f0 = new File("message.txt");   
	    if (f0.delete()) {   
	      System.out.println(f0.getName()+ " file is deleted.");  
	    } else {  
	      System.out.println("file not deleted due to error.");  
	    }   
	}
	
	public static void main(String[] args) {
		file_create f1= new  file_create();
		 f1.create();
		 f1.write();
		 f1.read();
		 f1.delete();
}
}