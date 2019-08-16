/*
 * This program is maintain the list of numbers
 * Developed by
 * Obed Otto C.
 * Saveetha Engineering College
 * obedotto@saveetha.ac.in
 * 
 */
package numbercollection;

import java.util.*;



public class NumberList {

	public static void main(String[] args) {
		int option;
		int n,index,i;
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> nums;
		
		
		nums=new ArrayList<Integer>();
		
		while(true)
		{
			System.out.println("1. To add an integer number at the end");
			System.out.println("2. To insert an integer number at particular index");
			System.out.println("3. To search for a number");
			System.out.println("4. To display all the numbers");
			System.out.println("5. Exit");
			System.out.print("Enter your choice:");
			
			option=sc.nextInt();
			switch(option)
			{
			case 1:
				System.out.print("Enter a number:");
				n=sc.nextInt();
				nums.add(n);
				System.out.println("The given number is added at the end");
				break;
			case 2:
				System.out.print("Enter a number:");
				n=sc.nextInt();
				System.out.print("Enter the index:");
				index=sc.nextInt();				
				nums.add(index,n);
				System.out.println("The given number is added at the given index");				
				break;
			case 3:
				System.out.print("Enter a number:");
				n=sc.nextInt();
				index=nums.indexOf(n);
				if(index<0)
				{
					System.out.println("The given number is not available in the list");
				}else
				{
					System.out.printf("The number %d is found at the index %d\n",n,index);
				}
				break;
			case 4:
				System.out.println("The available numbers are:");
				for(i=0;i<nums.size();i++)
				{
					System.out.println(nums.get(i));
				}
				break;
			case 5:
				System.out.println("Thankyou for using number list application !!!");
				break;
			default:
				System.out.println("Please enter a valid number !!!");
			}
			
			if(option==5)
			{		
				break;
			}
		}

	}

}
