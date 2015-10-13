package newpackage;

import java.util.*;

public class validator {
	public static void main(String[] args)
	{
		String name;
		int age,height,weight;
		double dec;
		Scanner keyboard = new Scanner (System.in);
		System.out.println("ENTER NAME");
		name=keyboard.nextLine();
		System.out.println("Enter age between 1 and 100");
		age=keyboard.nextInt();
		if(age<1||age>100)
		{
			do
			{
				System.out.println("Enter an age between 1 and 100 you geriatric fool");
				age=keyboard.nextInt();
			}while(age<1||age>100);
			
		}
		
		System.out.println("Enter height between 36 and 92 inches");
		height=keyboard.nextInt();
		if(height<36||height>92)
		{
			do
			{
				System.out.println("Enter a height between 36 and 92 inches ya pillock");
				height=keyboard.nextInt();
			}while(height<36||height>92);
			
		}
		System.out.println("Enter weight between 80 and 400lbs");
		weight=keyboard.nextInt();
		if(weight<80||weight>400)
		{
			do
			{
				System.out.println("Enter a weight between 80 and 400lbs ya whale");
				weight=keyboard.nextInt();
			}while(weight<80||weight>400);
			
		}
		System.out.println("Whats your favourite decimal number between 0 and 1");
		dec=keyboard.nextDouble();
		if(dec<=0||dec>=1)
		{
			do
			{
				System.out.println("Between 0 and 1 ya fool");
				dec=keyboard.nextDouble();
			}while(dec<=0||dec>=1);
			
		}
		
		System.out.println(name+"\n"+age+"\n"+height+"\n"+weight+"\n"+dec);
	}
	

}
