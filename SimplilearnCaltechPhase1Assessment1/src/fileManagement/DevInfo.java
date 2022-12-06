package fileManagement;
import java.util.Scanner;
public class DevInfo {
DevInfo(){
	System.out.println("Name of the Developer: Mohd Feroz Bux");
	System.out.println("Technology Used: Java");
	DevMenu();
}
void DevMenu(){
	System.out.println("******************************");
	System.out.println("******************************");
	System.out.println("Choose from this Menu");
	System.out.println("1- Go Back");
	System.out.println("2- Exit the Application");
	Scanner sc=new Scanner(System.in);
	int input=sc.nextInt();
	switch(input) {
	case 1:
		Main mainClass=new Main();
		mainClass.mainMenu();
		break;
	case 2:
		System.out.println("Application Closed");
		System.exit(0);
	default:
		System.out.println("You have entered a wrong choice! Enter the correct choice from the Menu");
		DevMenu();
		break;
}
}
}
