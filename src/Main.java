import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Write write=new Write();
		Append append=new Append();
		
		Scanner scanner=new Scanner(System.in);
		
		boolean flag1=true;
		boolean flag2=true;
		
		
		//Logic for adding continents manually - START
		System.out.print("Do you want to create the map manually?(Y/N)");
		char selection1=scanner.nextLine().charAt(0);
		if(selection1=='Y'||selection1=='y') {
			write.Write("[Map]");
			append.Append("\n");
			append.Append("[Continent]");
			append.Append("\n");
			System.out.print("Enter the continent name and control value in the format<Continent Name=Control value>:");
			String text1=scanner.nextLine();
			append.Append(text1);
			while(flag1) {
				System.out.print("Do you want to add more continents?(Y/N)");
				char selection2=scanner.nextLine().charAt(0);
				if(selection2=='Y'||selection2=='y') {
					System.out.print("Enter the continent name:");
					String text2=scanner.nextLine();
					append.Append("\n");
					append.Append(text2);
					
				}
				else {
					flag1=false;
					append.Append("\n");
					append.Append("-");
					System.out.println("User selected N.Exit");
										
				}
			}
			System.out.println("Enter the territory details in the format:");
			String text3=scanner.nextLine();
			append.Append("\n");
			append.Append("[Territories]");
			append.Append("\n");
			append.Append(text3);
			while(flag2) {
				System.out.print("Do you want to add more territories?(Y/N)");
				char selection2=scanner.nextLine().charAt(0);
				if(selection2=='Y'||selection2=='y') {
					System.out.println("Enter the territory details in the format:");
					String text4=scanner.nextLine();
					append.Append("\n");
					append.Append(text4);
					
				}
				else {
					flag2=false;
					append.Append("\n");
					append.Append(";;");
					System.out.println("User selected N.Exit");
										
				}
			}
		}
		else {
			//append.Append("-");
			System.out.println("User selected N. Exit");
		}
		//Logic for adding continents manually - END		
		
	}

}
