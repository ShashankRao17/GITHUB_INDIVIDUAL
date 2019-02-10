import java.util.*;

public class Main {
	
//	public static int rollDice()
//	{
//		int number=1;
//		int nSides=6;
//		int num=0;
//		int roll=0;
//		Random r=new Random();
//		if(nSides>=3) {
//			for(int i=0;i<number;i++) {
//				roll=r.nextInt(nSides)+1;
//				//System.out.println("Roll:"+roll);
//				num=num+roll;
//			}
//		}
//		else {
//			System.out.println("Error");
//		}
//		return num;
//	}	
//	
//	public static void DiceSelectionAttacker() {
//		System.out.print("Enter the number of dice:");
//		Scanner scan=new Scanner(System.in);
//		int numberOfDice=scan.nextInt();
//		switch(numberOfDice) {
//		case 1:
//			int die=rollDice();
//			System.out.println("Roll:"+die);
//			break;
//		case 2:
//			int die1=rollDice();
//			int die2=rollDice();
//			System.out.println("Roll:"+die1);
//			System.out.println("Roll:"+die2);
//			break;
//		case 3:
//			int die3=rollDice();
//			int die4=rollDice();
//			int die5=rollDice();
//			System.out.println("Roll:"+die3);
//			System.out.println("Roll:"+die4);
//			System.out.println("Roll:"+die5);
//			break;
//		default:
//			break;
//		}
//	}
//	public static void DiceSelectionDefender() {
//		switch(numberOfDice) {
//		case 1:
//			int die=rollDice();
//			System.out.println("Roll:"+die);
//			break;
//		case 2:
//			int die1=rollDice();
//			int die2=rollDice();
//			System.out.println("Roll:"+die1);
//			System.out.println("Roll:"+die2);
//			break;
//		default:
//			break;
//		}
//	}
	public static void engageBattle(int sizeAttack,int sizeDefense) {
		Integer[] att=new Integer[sizeAttack];
		Integer[] def=new Integer[sizeDefense];
		Random dice=new Random();
		for(int i = 0;i<sizeAttack;i++)
			att[i]=dice.nextInt(6)+1;;
		for(int i=0;i<sizeDefense;i++)
			def[i]=dice.nextInt(6)+1;
		Arrays.sort(att, Collections.reverseOrder());
		Arrays.sort(def, Collections.reverseOrder());
		
		System.out.println("Attacker's dice");
		for(int i = 0;i<sizeAttack;i++) {
			System.out.println(att[i]);
		}
		System.out.println("Defender's dice");
		for(int i = 0;i<sizeDefense;i++) {
			System.out.println(def[i]);
		}
		
		if (sizeAttack == 1) {
			System.out.println(att[0] + " vs " + def[0]);
			if (att[0] > def[0])
				System.out.println("\tATTACKER WINS");
			else
				System.out.println("\tDEFENDER WINS");
		}
		if (sizeAttack > 1) { // attacking with more than 1
			System.out.println(att[0] + " vs " + def[0]);
			if (att[0] > def[0])
				System.out.print("\tATTACKER WINS");
			
			else
				System.out.print("\tDEFENDER WINS");
			if (sizeDefense == 2) {
				System.out.println("\n"+att[1] + " vs " + def[1]);
				if (att[1] > def[1])
					System.out.println("\tATTACKER WINS");
				else
					System.out.println("\tDEFENDER WINS");
			} // if defneding with two
		}
		
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//DiceSelectionAttacker();
		System.out.print("Enter number of attacker dice:");
		Scanner scan=new Scanner(System.in);
		int att=scan.nextInt();
		System.out.print("Enter number of defender dice:");
		int def=scan.nextInt();
		
		engageBattle(att,def);
			
	}

}
