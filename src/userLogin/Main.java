package userLogin;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String userName = "patika";
		String password = "java123";
		String enteredUserName;
		String enteredPassword;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter your user name:");
		
		enteredUserName = in.nextLine();
		
		System.out.println("Enter your password:");
		
		enteredPassword = in.nextLine(); 
		
		if (enteredUserName.equals(userName) && enteredPassword.equals(password)) {
			
			System.out.println("Login Succesful!");
			
		}
		
		else {
			
			System.out.println("Incorrect User Name or Password!");
			
			int select;
			
			System.out.println("Do you want to reset your password?\n1-Yes\n2-No");
			
			select = in.nextInt();
			
			switch(select) {
			
			case 1:
				
			in.nextLine();
			
			Boolean continiueReset = true;
				
			String newPassword;
			
			while(continiueReset) {
			
				System.out.println("Enter new password:");
				
				newPassword = in.nextLine();
				
				
				if(!newPassword.equals(password)) {
					
					password = newPassword;
					
					System.out.println("Succesful!");
					
					continiueReset = false;
				}
				
				else {
					
					System.out.println("Your old password cannot be the same as your new password!");
					
					System.out.println("Do you wanto to try again?\n1-Yes\n2-No");
					
					int answer = in.nextInt();
					in.nextLine();
					
					if (answer == 1) {
						
						continue;
					}
					
					else {
						
						System.out.println("Password reset cancelled.");
						
						continiueReset = false;
					}
					
				}
				
				
				
			}
				
			break;	
			
			}
			
			in.close();
			
			
		}
		
		
	

	}

}
