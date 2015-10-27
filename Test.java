

package seminar;
import java.util.Scanner;




public class Test {
	
	public static void End(){
		System.out.println("You've reached the end of the current version. Make sure to check if there are updates!");
	}
	public static String check(String inp){
		String fin = inp.toLowerCase();
		return fin;
	}
	
	public static void Room1(){
		System.out.println("You are trapped in some sort of dark room...");
		System.out.println("There is a door on your left, some sort of urn in the corner, a closet, and a window.");
		System.out.println("What will you do?");
		Scanner scan = new Scanner(System.in);
		String ch;
		int done = 0;
		int key = 0;
		//input handling goes here
		while (done == 0){
			ch = scan.nextLine();
			ch = check(ch);
			if(ch.equals("help")){
				System.out.println("You can perform these actions here:");
				System.out.println("door, urn, closet, window");
			}
			else if (ch.equals("door")){
				if (key == 0){
					System.out.println("The door seems to be locked. Perhaps there is a key nearby.");
				}
				if (key == 1){
					System.out.println("You insert the key and turn it. The door becomes unlocked, and you proceed to the next room.");
					System.out.println("Oddly, the key vanishes into thin air...");
					done = 1;
				}
			}
			//door
			else if (ch.equals("closet")){
				System.out.println("Though it looked promising, the closet doesn't contain anything of note. In fact, it seems there is nothing at all inside.");
			}
			else if (ch.equals("window")){
				System.out.println("You look out of the window, but it's pitch black outside.");
			}
			else if (ch.equals("urn")){
				if (key == 1){
					System.out.println("You already checked the urn.");
				}
				
				if (key == 0){
					System.out.println("You shake the urn and hear something moving within.");
					System.out.println("You then turn the urn upside down, and a key falls out.");
					key = 1;
				}
				
			}
			else{
				System.out.println("Invalid Input");
				}
			}
			
			//switch this to room 2 later
			End();
		}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Mitchell's Text adventure!");
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
