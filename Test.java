

package seminar;
import java.util.Scanner;




public class Test {

	public static String check(String inp){
		String fin = inp.toLowerCase();
		
		return fin;
	}
	
	public static void Room1(){
		System.out.println("You are trapped in some sort of dark room...");
		Scanner scan = new Scanner(System.in);
		String ch;
		int done = 0;
		//input handling goes here
		while (done == 0){
			ch = scan.nextLine();
			ch = check(ch);
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to PlaceHolder Title!");
		System.out.println("Please type 'help' or 'start'.");
		Scanner scan = new Scanner(System.in);
		String ch;
		//ch = scan.nextLine();
		int done = 0;
		//ch = check(ch);
		
		while (done == 0){
			ch = scan.nextLine();
			ch = check(ch);
			//System.out.println(ch);
			if(ch.equals("start")){
				done = 1;
			}
			else if(ch.equals("help")){
				System.out.println("In order to simplify gameplay, and streamline the user experience,");
				System.out.println("each command in this game is one word. Valid inputs will be all");
				System.out.println("lowercase, and will not include any extra spaces.");
				System.out.println("Typing help in any room will list available commands at present.");
				System.out.println("Please type 'start' to begin playing.");
			}
			else
				System.out.println("Invalid Input");
		}
		Room1();
		scan.close();
		
		
	
	
	}

}
