package com.emailApp;

import java.util.ArrayList;
import java.util.Scanner;

public class EmailService {

	public static Email createEmail() {
		Email obj = new Email();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter first name ");
		String fname=  s.next();
		obj.setfName(fname);
		System.out.println("Enter last name ");
		String lname=  s.next();
		obj.setlName(lname);
		System.out.println("Enter department name ");
		String department=  s.next();
		obj.setDepartment(department);
		obj.setEmail(obj.getfName()+"."+obj.getlName()+"@"+obj.getDepartment()+".company.com");
		obj.setPassword(randomPassword());
		 return obj;
	}

	private static String randomPassword() {
		String passwordset = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0987654321!@#$%";
		char[] password = new char[8];
		for (int i=0;i<7;i++) {
			password[i] = passwordset.charAt((int)(Math.random()*passwordset.length()));
		}
		return new String(password);
	}

	public static void getData(ArrayList<Email> database) {
		for (Email e : database) {
			System.out.println(e.toString());
		}
		
	}

	public static void updateData(ArrayList<Email> database, int u) {
		
		for (int i=0;i<database.size();i++) {
			Email e = database.get(i);
			if(e.getId()==u) {
				Scanner s = new Scanner(System.in);
				System.out.println("Pls enter department");
				String dep = s.next();
				e.setDepartment(dep);
				break;
			}
		}
		
	}

	public static void deleteData(ArrayList<Email> database, int d) {
		for (int i=0;i<database.size();i++) {
			Email e = database.get(i);
			if(e.getId()==d) {
				database.remove(i);
				break;
			}
		}
		
	}

	
}


