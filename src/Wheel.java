import javax.swing.ImageIcon;
import java.util.Random;
import javax.swing.JOptionPane;

public class Wheel {
	public String in(String s){
		return JOptionPane.showInputDialog(s);
	}
	public void msg(String s){
		JOptionPane.showMessageDialog(null, s);
		
	}
	public void start(){
	 	msg("Welcome to wheel of fortune, Rico Challenge Edition. \n" +
	 			"The Rules are simple \n" +
	 			"1. There is only 1 player in the game, YOU \n" +
	 			"2. There are many puzzles that you may receive so each has its own challenge\n" +
	 			"3. First you Spin the wheel\n" +
	 			"4. Next you will call for a letter EXCLUDING A,E,I,O,U\n" +
	 			"5. Then you will be asked to buy a vowel, if you dont want to or dont have the money to, just say 'no thanks'\n" +
	 			"6. Repeat steps  3 to 5 until you beat the puzzle.\n" +
	 			"7. When you get Bankrupt, you lose all of your money, but since your the only player just spin once again.\n" +
	 			"8. You will not be able to solve the puzzle by giving the whole answer at once, you must go thru each letter of the puzzle\n" +
	 			"9. After you beat 1 puzzle, you will receive another one, don't worry all you money is kept and you just keep playing until you solve them.\n" +
	 			"10. The 1992 version of the Wheel of Fortune will be playing in the background so you can pull out our earbuds\n" +
	 			"11. To quit, just click the big QUIT button where it is found\n" +
	 			"12. Everytime you place a letter or Vowel it will appear on the board\n" +
	 			"13. Whenever there is a white picture, it means that function cannot be used right now\n" +
	 			"14. I think that's about it, HAVE FUN WITH THIS AMAZING GAME!");
	 	home();
	}
	Random gene = new Random();
	ImageIcon QUIT = new ImageIcon(Wheel.class.getResource("QUIT.png"));
	ImageIcon SPIN = new ImageIcon(Wheel.class.getResource("SPIN.png"));
	ImageIcon LETTER = new ImageIcon(Wheel.class.getResource("LETTERS.png"));
	ImageIcon BLANK = new ImageIcon(Wheel.class.getResource("BLANK.png"));
	ImageIcon VOWELS = new ImageIcon(Wheel.class.getResource("VOWELS.png"));
	ImageIcon[] DATA = {SPIN,BLANK,BLANK,QUIT};
	String ss0 = "CHAPTERANDVERSE";
	String ss1 = "BLISSFULLYQUIET";
	String ss2 = "AFISHOUTOFWATER";
	String ss3 = "ACASEOFTHEBLAHS";
	String ss4 = "AFEATHERINMYCAP";
	String ss5 = "AMONTHOFSUNDAYS";
	String ss6 = "BACKINTHESADDLE";
	String ss7 = "BRIGHTANDBUBBLY";
	String ss8 = "CREATINGAFUTURE";
	String ss9 = "CREATEDWITHLOVE";
	String ss10 = "CORPORATELADDER";
	String ss11 = "DONTDOTHATAGAIN";
	String ss12 = "ENERGYEFFICIENT";
	String ss13 = "FIRSTINTHECLASS";
	String ss14 = "FASHIONABLYLATE";
	String ss15 = "GATEWAYTOALASKA";
	String ss16 = "HEREGOESNOTHING";
	String ss17 = "HURRYUPANDWHAIT";
	String ss18 = "ISLEPTLIKEAROCK";
	String ss19 = "KNUCKLESANDWICH";
	String ss20 = "JUSTLUCKYIGUESS";
	String ss21 = "LASTBUTNOTLEAST";
	String ss22 = "LETYOURHAIRDOWN";
	String ss23 = "LETSPLAYITBYEAR";
	String ss24 = "LIVEINTHEMOMENT";
	String ss25 = "LOVETISINTHEAIR";
	String ss26 = "MACHINEWASHABLE";
	String ss27 = "MAJESTICCOUNTRY";
	String ss28 = "MAKINGPUPPYEYES";
	String ss29 = "MAXIMUMSTRENGTH";
	String ss30 = "METWITHOPENARMS";
	String ss31 = "NATRUALREACTION";
	String ss32 = "NECTAROFTHEGODS";
	String ss33 = "NOWHERETOBESEEN";
	String ss34 = "NOTHINGPERSONAL";
	String ss35 = "NOWMORETHANEVER";
	String ss36 = "ONTOPOFTHEWORLD";
	String ss37 = "ONCEINABLUEMOON";
	String ss38 = "ONEFROMTHEHEART";
	String ss39 = "ONETHINGATATIME";
	String ss40 = "PEARLOFTHESOUTH";
	String ss41 = "PICKUPTHEPIECES";
	String ss42 = "PLAYINGTHEFIELD";
	String ss43 = "POINTOFPURCHASE";
	String ss44 = "PROHIBITEDBYLAW";
	String ss45 = "READYANDWILLING";
	String ss46 = "READYWHENYOUARE";
	String ss47 = "REFRESHMYMEMORY";
	String ss48 = "REPEATMYCOMMAND";
	String ss49 = "RICHLONGHISTORY";
	String ss50 = "ROCKETTOSTARDOM";
	String ss51 = "SAYITWITHASMILE";
	String ss52 = "SCHOOLOFTHOUGHT";
	String ss53 = "SECONDHONEYMOON";
	String ss54 = "SETTINGTHESTAGE";
	String ss55 = "SHOOTFROMTHEHIP";
	String ss56 = "SICKTOMYSTOMACH";
	String ss57 = "STANDYOURGROUND";
	String ss58 = "TAKEITORLEAVEIT";
	String ss59 = "THERESNOIINTEAM";
	String ss60 = "THEWILDFRONTIER";
	String ss61 = "TOUGHTIMESAHEAD";
	String ss62 = "TRYSOMETHINGNEW";
	String ss63 = "UNIVERSALAPPEAL";
	String ss64 = "UNSPOILEDBEAUTY";
	String ss65 = "VAGUELYFAMILIAR";
	String ss66 = "VISITOUTWEBSITE";
	String ss67 = "WHERETHEHEARTIS";
	String ss68 = "WORKOUTTHEKINKS";
	String ss69 = "YOUCANCOUNTONME";
	String ss70 = "ZIPUPYOURJACKET";
	String[] Set = {ss0,ss1,ss2,ss3,ss4,ss5,ss6,ss7,ss8,ss9,ss10,ss11,ss12,ss13,ss14,ss15,ss16,ss17,ss18,ss19,
			ss20,ss21,ss22,ss23,ss24,ss25,ss26,ss27,ss28,ss29,ss30,ss31,ss32,ss33,ss34,ss35,ss36,ss37,ss38,ss39
			,ss40,ss41,ss42,ss43,ss44,ss45,ss46,ss47,ss48,ss49,ss50,ss51,ss52,ss53,ss54,ss55,ss56,ss57,ss58,ss59
			,ss60,ss61,ss62,ss63,ss64,ss65,ss66,ss67,ss68,ss69,ss70};
	String input = "_______________";
	String[] Player = {};
	String SSS = "Spin";
	double money = 0;
	boolean b = false;
	int i;
	int Mwon = 0;
	boolean d1 = true;
	boolean d2 = false;
	boolean d3 = false;
	boolean d4 = false;
	
	public void home(){
		if(b == false){
			i = gene.nextInt(Set.length);
			b = true;
		}
		if(input.equals(Set[i])){
			win();
		}
		int x = JOptionPane.showOptionDialog(null, "Board: \n" +
				input.substring(0, 1) + " " + input.substring(1, 2) + " " + input.substring(2, 3) + " " + input.substring(3, 4) + " " + input.substring(4, 5) + " " + input.substring(5, 6) + " " + input.substring(6, 7) + " " + input.substring(7, 8) + " " + input.substring(8, 9) + " " + input.substring(9, 10) + " " + input.substring(10, 11) + " " + input.substring(11, 12) + " " + input.substring(12, 13) + " "+ input.substring(13, 14) + " "+ input.substring(14, 15) + " " +
				"\n Your Options are to " + SSS + 
				"\n Your Money is : " + money + 
				"The money amount you just spun for : " + Mwon, "Wheel of Fortune", 0,
				JOptionPane.INFORMATION_MESSAGE, null, DATA, DATA);
		if(x == 0){
			if(d1 == true){
				DATA[1] = LETTER;
				DATA[0] = BLANK;
				d1 = false;
				SSS = "Chose a Letter";
				Spin();
			}else{
				msg("You cannot Spin right now");
			}
			home();
		}if(x == 1){
			if(d2 == true){
				DATA[2] = VOWELS;
				DATA[1] = BLANK;
				d2 = false;
				SSS = "Buy a Vowel";
				Letter();
			}else{
				msg("You cannot Spin right now");
			}
			home();
		}if(x == 2){
			if(d3 == true){
				DATA[0] = SPIN;
				DATA[2] = BLANK;
				d3 = false;
				SSS = "Spin";
				Vowel();
			}else{
				msg("You cannot Spin right now");
			}
			home();
		}else{
			System.exit(0);
		}
	}
	
	public void Spin(){
		int j = gene.nextInt(24)+ 1;
		if(j == 1 || j == 2 ||j == 3 ||j == 4){
			Mwon = 500;
		}if(j == 5){
			Mwon = 550;
		}if(j == 6 || j == 7){
			Mwon = 600;
		}if(j == 8 || j == 9){
			Mwon = 650;
		}if(j == 10 || j == 11 || j == 12){
			Mwon = 700;
		}if(j == 13 || j == 14){
			Mwon = 800;
		}if(j == 15 || j == 16 || j == 17){
			Mwon = 900;
		}if(j == 18){
			Mwon = 2500;
		}if(j == 19 || j == 20 || j == 21){
			 money = 0;
			 Mwon = 0;
			 DATA[0] = SPIN;
			 DATA[1] = BLANK;
			DATA[2] = BLANK;
			d1 = true;
			SSS = "Spin";
			d2 = false;
			 msg("You landed on a Bankrupt. You lost all of your money.");
			 home();
		}if(j == 22){
			Mwon = 5000;
		}if(j == 23){
			Mwon = 750;
		}if(j == 24){
			Mwon = 400;
		}
		d2 = true;
		home();
	}
	
	boolean a0 = true;
	boolean a1 = true;
	boolean a2 = true;
	boolean a3 = true;
	boolean a4 = true;
	boolean a5 = true;
	boolean a6 = true;
	boolean a7 = true;
	boolean a8 = true;
	boolean a9 = true;
	boolean a10 = true;
	boolean a11 = true;
	boolean a12 = true;
	boolean a13 = true;
	boolean a14 = true;
	boolean a15 = true;
	boolean a16 = true;
	boolean a17 = true;
	boolean a18 = true;
	boolean a19 = true;
	boolean a20 = true;
	
	boolean c0 = true;
	boolean c1 = true;
	boolean c2 = true;
	boolean c3 = true;
	boolean c4 = true;
		
	public void Letter(){
		String[] DATA = {"B","C","D","F","G","H","J","K","L","M","N","P","Q","R","S","T","V","W","X","Y","Z"};
		int x = JOptionPane.showOptionDialog(null, "What letter do you want?", "Wheel of Fortune", 0,
				JOptionPane.INFORMATION_MESSAGE, null, DATA, DATA);
		if(x == 0){
			if(a0 == true){
				a0 = false;
				Calc("B");
			}else{
				msg("This Letter was already called upon");
			}
			d3 = true;
			home();
		}else if(x == 1){
			if(a1 == true){
				a1 = false;
				Calc("C");
			}else{
				msg("This Letter was already called upon");
			}
			d3 = true;
			home();
		}else if(x == 2){
			if(a2 == true){
				a2 = false;
				Calc("D");
				}else{
				msg("This Letter was already called upon");
			}
			d3 = true;
			home();
		}else if(x == 3){
			if(a3 == true){
				a3 = false;
				Calc("F");
			}else{
				msg("This Letter was already called upon");
			}
			d3 = true;
			home();
		}else if(x == 4){
			if(a4 == true){
				Calc("G");
				a4 = false;
			}else{
				msg("This Letter was already called upon");
			}
			d3 = true;
			home();
		}else if(x == 5){
			if(a5 == true){
				Calc("H");
				a5 = false;
			}else{
				msg("This Letter was already called upon");
			}
			d3 = true;
			home();
		}else if(x == 6){
			if(a6 == true){
				Calc("J");
				a6 = false;
			}else{
				msg("This Letter was already called upon");
			}
			d3 = true;
			home();
		}else if(x == 7){
			if(a7 == true){
				Calc("K");
				a7 = false;
			}else{
				msg("This Letter was already called upon");
			}
			d3 = true;
			home();
		}else if(x == 8){
			if(a8 == true){
				Calc("L");
				a8 = false;
			}else{
				msg("This Letter was already called upon");
			}
			d3 = true;
			home();
		}else if(x == 9){
			if(a9 == true){
				Calc("M");
				a9 = false;
			}else{
				msg("This Letter was already called upon");
			}
			d3 = true;
			home();
		}else if(x == 10){
			if(a10 = true){
				Calc("N");
				a10 = false;
			}else{
				msg("This Letter was already called upon");
			}
			d3 = true;
			home();
		}else if(x == 11){
			if(a11 == true){
				Calc("P");
				a11 = false;
			}else{
				msg("This Letter was already called upon");
			}
			d3 = true;
			home();
		}else if(x == 12){
			if(a12 == true){
				Calc("Q");
				a12 = false;
			}else{
				msg("This Letter was already called upon");
			}
			d3 = true;
			home();
		}else if(x == 13){
			if(a13 == true){
				Calc("R");
				a13 = false;
			}else{
				msg("This Letter was already called upon");
			}
			d3 = true;
			home();
		}else if(x == 14){
			if(a14 == true){
				Calc("S");
				a14 = false;
			}else{
				msg("This Letter was already called upon");
			}
			d3 = true;
			home();
		}else if(x == 15){
			if(a15 == true){
				Calc("T");
				a15 = false;
			}else{
				msg("This Letter was already called upon");
			}
			d3 = true;
			home();
		}else if(x == 16){
			if(a16 == true){
				Calc("V");
				a16 = false;
			}else{
				msg("This Letter was already called upon");
			}
			d3 = true;
			home();
		}else if(x == 17){
			if(a17 == true){
				Calc("W");
				a17 = false;
			}else{
				msg("This Letter was already called upon");
			}
			d3 = true;
			home();
		}else if(x == 18){
			if(a18 == true){
				Calc("X");
				a18 = false;
			}else{
				msg("This Letter was already called upon");
			}
			d3 = true;
			home();
		}else if(x == 19){
			if(a19 == true){
				Calc("Y");
				a19 = false;
			}else{
				msg("This Letter was already called upon");
			}
			d3 = true;
			home();
		}else if(x == 20){
			if(a20 == true){
				Calc("Z");
				a20 = false;
			}else{
				msg("This Letter was already called upon");
			}
			d3 = true;
			home();
		}
	}
	public void Vowel(){
		String[] DATA = {"A","E","I","O","U","No thanks"};
		int x = JOptionPane.showOptionDialog(null, "Which Vowel do you want to buy? They all cost the $500", "Wheel of Fortune", 0,
				JOptionPane.INFORMATION_MESSAGE, null, DATA, DATA);
		if(x == 0){
			if(c0 == true){
				if(money >= 500){
					c0 = false;
					money -= 500;
					CalcV("A");
				}else{
					msg("You do not have enough money for a Vowel");
				}
			}else{
				msg("You already bought this Vowel");
			}
			d1 = true;
			home();
		}if(x == 1){
			if(c1 == true){
				if(money >= 500){
					c1 = false;
					money -= 500;
					CalcV("E");
				}else{
					msg("You do not have enough money for a Vowel");
				}
			}else{
				msg("You already bought this Vowel");
			}
			d1 = true;
			home();
		}if(x == 2){
			if(c2 == true){
				if(money >= 500){
					c2 = false;
					money -= 500;
					CalcV("I");
				}else{
					msg("You do not have enough money for a Vowel");
				}
			}else{
				msg("You already bought this Vowel");
			}
			d1 = true;
			home();
		}if(x == 3){
			if(c3 == true){
				if(money >= 500){
					c3 = false;
					money -= 500;
					CalcV("O");
				}else{
					msg("You do not have enough money for a Vowel");
				}
			}else{
				msg("You already bought this Vowel");
			}
			d1 = true;
			home();
		}if(x == 4){
			if(c4 == true){
				if(money >= 500){
					c4 = false;
					money -= 500;
					CalcV("U");
				}else{
					msg("You do not have enough money for a Vowel");
				}
			}else{
				msg("You already bought this Vowel");
			}
			d1 = true;
			home();
		}if(x == 5){
			d1 = true;
			home();
		}
	}
	
	public void Calc(String s){
		int count = 0;
		for(int j = 1; j < input.length()+ 1; j++){
			if(Set[i].substring(j - 1 , j).equals(s)){
				count++;
				String t = input.substring(0, j - 1);
				String r = input.substring(j, input.length());
				input = t + s + r;
			}

		}
		money += (Mwon*count);
	}
	
	public void CalcV(String s){
		for(int j = 1; j < input.length()+ 1; j++){
			if(Set[i].substring(j - 1 , j).equals(s)){
				String t = input.substring(0, j - 1);
				String r = input.substring(j, input.length());
				input = t + s + r;
			}

		}
	}
	public void win(){
		a0 = true;
		a1 = true;
		a2 = true;
		a3 = true;
		a4 = true;
		a5 = true;
		a6 = true;
		a7 = true;
		a8 = true;
		a9 = true;
		a10 = true;
		a11 = true;
		a12 = true;
		a13 = true;
		a14 = true;
		a15 = true;
		a16 = true;
		a17 = true;
		a18 = true;
		a19 = true;
		a20 = true;
		c0 = true;
		c1 = true;
		c2 = true;
		c3 = true;
		c4 = true;
		d1 = true;
		d2 = false;
		d3 = false;
		d4 = false;
		b = false;
		input = "_______________";
		DATA[0] = SPIN;
		DATA[1] = BLANK;
		DATA[2] = BLANK;
		
		msg("You have beaten the puzzle! \n" + 
		" You will now get a new puzzle for you to solve \n " + 
		"HAVE FUN!!!!!!!!!!!!");
		
		home();
	}
}
