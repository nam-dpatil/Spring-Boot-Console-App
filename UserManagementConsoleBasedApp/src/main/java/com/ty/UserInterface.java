package com.ty;

import java.util.List;

import java.util.Scanner;

import com.ty.modal.User;
import com.ty.service.UserServiceImp;


public class UserInterface {
	public static void interfaces()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("---------------------------------");
		System.out.println("1 for : user data insert or update ");
		System.out.println("2 for : select user data byId ");
		System.out.println("3 for : select all user data ");
		System.out.println("4 for : delate user data by id ");
		System.out.println("select any button for exit program");
		System.out.println("---------------------------------");
		System.out.println("enter choice");
		while(true)
		{
			int choice=scan.nextInt();
			UserServiceImp userServices=new UserServiceImp();
			
			switch(choice)
			{
			case 1: 
				System.out.println("enter id : ");
				int id=scan.nextInt();
				System.out.println("enter name : ");
				String name=scan.next();
				System.out.println("enter email : ");
				String email=scan.next();
				System.out.println("enter mobile number");
				long mobileNum=scan.nextLong();
				User user=new User(id,name,email,mobileNum);
				userServices.upsert(user);
				System.out.println("data successfully inserted");
				break;
				
			case 2: System.out.println("enter user_id");
				User userData=userServices.findById(scan.nextInt());
				System.out.println(userData.getId());
				System.out.println(userData.getName());
				System.out.println(userData.getEmail());
				System.out.println(userData.getMobileNum());
				
				break;
				
			case 3: List<User> list=userServices.findAll();
			
				for(User userData1:list)
				{
					
					System.out.println(userData1.getId());
					System.out.println(userData1.getName());
					System.out.println(userData1.getEmail());
					System.out.println(userData1.getMobileNum());
					System.out.println("---------------");
				}
				break;
			
			case 4: System.out.println("enter user_id");
				System.out.println(userServices.deleteById(scan.nextInt()));
				break;
				
			default : System.exit(scan.nextInt());
				
			
			}
		}
		
		
		
		
	}
	

}
