package fileManagement;
import java.io.IOException;
import java.util.Scanner;

public class Main {
public static void main(String args[]) {
	System.out.println("Welcome to LockedMe File Management!\nDeveloper: Mohd Feroz Bux.");
	mainMenu();
}
static void mainMenu(){
	System.out.println("******************************");
	System.out.println("******************************");
	System.out.println("Enter Your Choice");
	System.out.println("1- Check all Files");
	System.out.println("2- Interface");
	System.out.println("3- Developer Information");
	System.out.println("4- Close the App");
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	switch (a) {
	case 1:
		try {
			FilesCheck f=new FilesCheck();
		} catch (IOException e) {
			e.printStackTrace();
		}
		break;
	case 2:
		FileManaging us = new FileManaging();
		us.FileManagingMenu();
		break;
	case 3:
		DevInfo dev=new DevInfo();
		break;
	case 4:
		System.out.println("Application Closed");
		System.exit(0);
	default:
		System.out.println("You have entered a wrong choice! Enter the correct choice from the Menu");
		mainMenu();
		break;
	}
}
}
