package com.emailApp;

import java.util.ArrayList;
import java.util.Scanner;

public class EmailApp {

	public static void display()
	{
		System.out.println("To create email pls enter 1\nTO view database 2\nTo update 3\nTo delete 4\nTo Exit 5");
	}
	
	
	public static void main(String[] args) {
		
		ArrayList<Email> database = new ArrayList<>();
		display();
		Scanner s = new Scanner(System.in);
		int loop = s.nextInt();
		
		while(loop<5) {
			switch (loop) {
			case 1:
				Email e = EmailService.createEmail();
				database.add(e);
				display();
				loop = s.nextInt();
				break;
				
			case 2:
				EmailService.getData(database);
				display();
				loop = s.nextInt();
				break;
				
			case 3:
				System.out.println("Pls enter id to update department");
				int u = s.nextInt();
				EmailService.updateData(database,u);
				display();
				loop = s.nextInt();
				break;
				
			case 4:
				System.out.println("Pls enter id to delete department");
				int d = s.nextInt();
				EmailService.deleteData(database,d);
				display();
				loop = s.nextInt();
				break;
			}
		}
		
		System.out.println("--------------");

	}

}
