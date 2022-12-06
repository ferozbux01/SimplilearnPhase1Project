package fileManagement;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
public class FilesCheck {
	String dir="/LockedMeFiles";
	File directory=new File(dir);
	FilesCheck() throws IOException{
		boolean folderCreated = directory.mkdir();
		if(folderCreated)
		{
			System.out.println("Directory was not found.");
			System.out.println("New Directory Created: "+directory.getAbsoluteFile());
		}	
		String[] files= directory.list();
        if(files==null)
        {
        	System.out.println("The Folder is Empty");
        }
        else {
    		ArrayList<String> filesName=new ArrayList<String>();
    		for(int i=0;i<files.length;i++)
            {
    			filesName.add(files[i]);
            }
    		for(int i = 0;i<filesName.size();i++)
    		{
    		System.out.println(filesName.get(i));
    		}
        }
        directory.exists();        
        FilesCheckMenu();
		
	}
	private ArrayList<File> String(File[] listFiles) {
		// TODO Auto-generated method stub
		return null;
	}
	void FilesCheckMenu(){
		System.out.println("******************************");
		System.out.println("******************************");
		System.out.println("Choose from this Menu");
		System.out.println("1- Back to Main Menu");
		System.out.println("2- Exit App");
		Scanner sc=new Scanner(System.in);
		int input = sc.nextInt();
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
			FilesCheckMenu();
			break;
		}
	}
}