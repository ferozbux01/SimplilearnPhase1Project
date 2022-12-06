package fileManagement;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileManaging {
	String dir="/LockedMeFiles/";
	File file;
	String fileName;
	String msg;
	Scanner sc=new Scanner(System.in);
	public void FileManagingMenu() {
		System.out.println("******************************");
		System.out.println("******************************");
		System.out.println("Choose From the Options");
		System.out.println("1- Add a new txt file");
		System.out.println("2- Delete a File");
		System.out.println("3- Search a File");
		System.out.println("4- Back to Main Menu");
		int Input = sc.nextInt();
		if (Input==1||Input==2||Input==3)
		{
			System.out.println("Enter the name of the file");
			fileName=sc.next();
			file=new File(dir+fileName);
			System.out.println(file.getAbsolutePath());
		}
			switch(Input) {
			case 1:
				add();
				break;
			case 2:
				delete();
				break;
			case 3:
				search();
				break;
			case 4:
				Main m=new Main();
				m.mainMenu();
				break;
			default:
			System.out.println("Enter the corret number from the Menu");
				FileManagingMenu();
			}
	}
	
	void add(){
		boolean b=false;
		try {
			b=file.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		msg=(b)?"File Added Successfully":"File Added Failed";
		System.out.println(msg);
		returnToMenu();
	}
	void delete(){
		boolean b=false;
		b=file.delete();
		System.out.println(b);
		msg=(b)?"File Deleted Successfully":"File Deleted Failed";
		System.out.println(msg);
		returnToMenu();
	}
	void search(){
		boolean b=false;
		b=file.exists();
		msg=(b)?"File Found":"File Not Found";
		System.out.println(msg);
		returnToMenu();
	}
	void returnToMenu() {
		System.out.println("Enter any number or character to Go Back to Menu");
	
			String a=sc.nextLine();

		FileManagingMenu();
		
	}
}
