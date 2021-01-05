/*
Program: TVApplication 
Classes: Television & RemoteControl
Author: Patricia Virgen 
																	Description

The purpose of this application is to provide functionality to a control remote of a TV.

*/
import java.util.Scanner;


public class TVApplication 
{

	// A single main method which instantiates a RemoteControl object 
	
	public static void main(String[] args) 
	{
		Television television = new Television();
		RemoteControl remoteControl = new RemoteControl(television); 
		Scanner scan = new Scanner(System.in);
		int userChoice = 0;
		
		// Interacting with the user until he/she decides to stop watching TV
		
		while( userChoice != 6)
		{
			System.out.println(television.toString());
			System.out.println("Press a Botton on the Remote Control");
			System.out.println("1. Power 2. Volume Up by 50% 3. Volume Down by 50% 4. Channel Up 5. Channel Down 6. Go Outside");
			userChoice = scan.nextInt();
			
			if (userChoice == 1)
			{
				remoteControl.powerBotton();
				System.out.println("Power Bottom Pressed");
			}
			else if(userChoice == 2)
			{
				remoteControl.volumeUpByHalf();
				System.out.println("Volume Up by 50% Buttom Pressed");
			}
			
			else if (userChoice == 3)
			{
				remoteControl.volumeDownByHalf();
				System.out.println("Volume Down by 50% Buttom Pressed");
			}
			
			else if (userChoice == 4)
			{
				remoteControl.channelUpButton();
				System.out.println("Channel Up Buttom Pressed");
			}
			
			else if (userChoice == 5)

			{
				remoteControl.channelDownButton();
				System.out.println("Channel Down Buttom Pressed");
			}
		}
	}
}

	
	
	
	
	
	
	
	
	
	
	
	
	
