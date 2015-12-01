

package seminar;
import java.util.Scanner;




public class Test {
	
	public static void End(Scanner scan){
		System.out.println("You've reached the end of the current version. Make sure to check if there are updates!");
		scan.close();
	}
	public static String check(String inp){
		String fin = inp.toLowerCase();
		return fin;
	}
	
	public static void Room3(Scanner scan){
		System.out.println("You proceed down the hall, and find a strange room with 3 buttons, red, green, and blue, and a large door. \nWhat will you do?");
		
		//Scanner scan = new Scanner(System.in);
		String ch;
		int done = 0;
		int ron = 0;
		int bon = 0;
		int gon = 0;
		
		//input handling goes here
		while (done == 0){
			ch = scan.nextLine();
			ch = check(ch);
			if(ch.equals("help")){
				System.out.println("You can perform these actions here:");
				System.out.println("door, red, green, blue");
			}
			else if (ch.equals("door")){
					if (ron == 1 && bon == 1 && gon == 0){
						System.out.println("You manage to open the door...");
						done = 1;
					}
					else
						System.out.println("The door refuses to open.");
					
			}
		
			else if (ch.equals("red")){
				if (ron == 0){
					System.out.println("You press the red button, causing it to light up.");
					ron = 1;
				}
				else{
					System.out.println("You press the red button again, shutting its light off.");
					ron = 0;
				}
			}
			else if (ch.equals("blue")){
				if (bon == 0){
					System.out.println("You press the blue button, causing it to light up.");
					bon = 1;
				}
				else{
					System.out.println("You press the blue button again, shutting its light off.");
					bon = 0;
				}
			}
			else if (ch.equals("green")){
				if (gon == 0){
					System.out.println("You press the green button, causing it to light up.");
					gon = 1;
				}
				else{
					System.out.println("You press the green button again, shutting its light off.");
					gon = 0;
				}
				
			}
			else{
				System.out.println("Invalid Input");
				}
			}
			
			//switch this to room 3 later
			//scan.close();
			End(scan);
		}
	
	
	public static void Room2(Scanner scan){
		System.out.println("You are now in a somewhat lit hallway… There is a painting on the wall, another window, and some kind of button. \nWhat will you do?");
		
		//Scanner scan = new Scanner(System.in);
		String ch;
		int done = 0;
		
		//input handling goes here
		while (done == 0){
			ch = scan.nextLine();
			ch = check(ch);
			if(ch.equals("help")){
				System.out.println("You can perform these actions here:");
				System.out.println("hallway, window, button, painting");
			}
			else if (ch.equals("hallway")){
					System.out.println("You continue further down the hall.");
					done = 1;
			}
		
			else if (ch.equals("window")){
				System.out.println("Looking out the window, you can faintly see a courtyard. Nothing else of note.");
			}
			else if (ch.equals("button")){
				System.out.println("You investigate the button, but it's old and rusted. Pressing it has no result.");
			}
			else if (ch.equals("painting")){
					System.out.println("The painting is just a plain picture of a meadow. Curious, you remove it from the wall.\nBehind it is a note that says \"r1b1g0\". Perhaps you should note this down.");
				
			}
			else{
				System.out.println("Invalid Input");
				}
			}
			
			//switch this to room 3 later
			//scan.close();
			Room3(scan);
		}
	
	
	
	
	
	
	
	public static void Room1(Scanner scan){
		System.out.println("You are trapped in some sort of dark room...");
		System.out.println("There is a door on your left, some sort of urn in the corner, a closet, and a window.");
		System.out.println("What will you do?");
		//Scanner scan = new Scanner(System.in);
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
			//scan.close();
			Room2(scan);
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
		//scan.close();
		Room1(scan);
		//scan.close();
		
		
	
	
	}

}
