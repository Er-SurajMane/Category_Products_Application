package projects;
import java.lang.*;
import java.util.Scanner;


public class Criconn 
{
	
	public static void main(String[] args)
	{
		login l = new login();
		l.login();
		
		

	}
	
}

interface I
	{
	   void login();	
	}

	class login implements I
	{
		String username;
		String password;
		private long mobileno;
		
		public Long getMobileno() 
		{
			return mobileno;
		}
		 		
		public void login()
		{
			System.out.println("Login Details");
			System.out.println("");
			Scanner sc=new Scanner(System.in);
			
			System.out.println("username :- " );
			String username =sc.nextLine();
			
			System.out.println("======================");
			System.out.println("password :- " );
			String password=sc.nextLine();
			
			System.out.println("======================");
			System.out.println("Mobile no :- " );
			long mb=sc.nextLong();
			
			if(mb>=1000000000 || mb==9999999999L) 
				
			{
				login2();
			}
			
			else
				
			{
				System.out.println("============================");
				System.out.println("Please enter 10 digit number");
				System.out.println("");
				System.out.println("Mobile no :- " );
				long mb2=sc.nextLong();
				
				if(mb2>=1000000000 || mb2==9999999999L) 
					
				{
					login2();
				}
				
				else
					
				{
					System.out.println("===============");
					System.out.println("2 WRONG ATTEMPT");
					System.out.println("PLEASE RE-LOGIN");
					System.out.println("===============");
					login();
				}
				
			}
			
		}
		
		public void login2()
		{
			System.out.println("===========================");
			System.out.println("Login Successful ");
			System.out.println("Enter 1 to IPL");
			System.out.println("Enter 2 TO CHANGE DETAILS ");
			System.out.println("===========================");
			
			
			
			Criconn ref1 =new Ipl();
			Ipl ref2 = (Ipl)ref1;
			
			I ref3 = new login();
			
			Scanner s =new Scanner(System.in);
			String a= s.nextLine();
			
			switch(a)
			{
			case "1": ref2.Ipl();
			break;
			case "2": ref3.login();
			break;
			default : System.out.println("Invalid Input");
			login2();	
			
			}	
		}
}

class Ipl extends Criconn
{
	public void Ipl()
	{
	System.out.println("=========================");
	System.out.println("enter 1 for Teams");
	System.out.println("enter 2 for fixtures");
	System.out.println("=========================");
	
	Ipl ref1 = new Teams();
	Teams ref2 = (Teams)ref1;
	
	Ipl ref3 = new fixtures();
	fixtures ref4 = (fixtures)ref3;
	
	Scanner s =new Scanner(System.in);
	String a= s.nextLine();
	
	switch(a)
	{
		case "1": ref2.Teams();
		break;
		case "2": ref4.fixtures();
		break;
		default : System.out.println("Invalid Input");
		Ipl();	
	
	}
	
	}	
}

class Teams extends Ipl
{	
	public void Teams()
	{
		System.out.println("========================================================");
		System.out.println("                                                        ");
		System.out.println("group_a		  ||  group_b");
		System.out.println("                  ||                                      ");
		System.out.println("MUMBAI_INDIANS	  ||  CHENNAI_SUPER_KINGS");
		System.out.println("DELHI_CAPITALS    ||  ROYAL_CHALLENGERS_BANGALORE");
		System.out.println("GUJARAT_TITANS    ||  KOLKATA_KNIGHT_RIDERS");
		System.out.println("PUNJAB_KINGS      ||  LUCKNOW_SUPER_GIANTS");
		System.out.println("RAJASTHAN_ROYALS  ||  SUNRISERS_HYDERABAD");
		System.out.println("                                                        ");
		System.out.println("                                                        ");
		System.out.println("enter 1 for group_a");
		System.out.println("enter 2 for group_b");
		System.out.println("enter 3 for back_menu");
		System.out.println("                                                        ");
		System.out.println("========================================================");

		Teams ref1 = new group_a(); 
		group_a ref2 = (group_a)ref1; 

		Teams ref3 = new group_b(); 
		group_b ref4 = (group_b)ref3;                           
		
		Criconn ref5 = new Ipl();
		Ipl ref6 = (Ipl)ref5;

		Scanner s1 = new Scanner(System.in);
		String s2 = s1.nextLine();
		
		switch (s2)
		{
			case "1" : ref2.group_a();
			break;
			case "2" : ref4.group_b();
			break;											
			case "3" : ref6.Ipl();
			break;																
			default: System.out.println("invalid input");
			Teams();
		}
	}
		
}

class group_a extends Teams 
{
	public void group_a()
	{
		System.out.println("=================================");
		System.out.println("group_a			");
		System.out.println("                                 ");
		System.out.println("enter 1 for MUMBAI_INDIANS	");
		System.out.println("enter 2 for DELHI_CAPITALS  ");
		System.out.println("enter 3 for GUJARAT_TITANS  ");
		System.out.println("enter 4 for PUNJAB_KINGS    ");
		System.out.println("enter 5 for RAJASTHAN_ROYALS");
		System.out.println("enter 6 for back_menu");
		System.out.println("                                 ");
		System.out.println("=================================");
				
		group_a ref1 = new MUMBAI_INDIANS();
		MUMBAI_INDIANS ref2 = (MUMBAI_INDIANS) ref1;
		
		group_a ref3 = new DELHI_CAPITALS();
		DELHI_CAPITALS ref4 = (DELHI_CAPITALS) ref3;
		
		group_a ref5 = new GUJARAT_TITANS();
		GUJARAT_TITANS ref6 = (GUJARAT_TITANS) ref5;
		
		group_a ref7 = new PUNJAB_KINGS();
		PUNJAB_KINGS ref8 = (PUNJAB_KINGS) ref7;
		
		group_a ref9 = new RAJASTHAN_ROYALS();
		RAJASTHAN_ROYALS ref10 = (RAJASTHAN_ROYALS) ref9;                     
		
		Criconn ref11 = new Teams(); 
		Teams ref12 = (Teams)ref11; 
		
		Scanner s1 = new Scanner(System.in);
		String s2 = s1.nextLine();
		
		switch (s2)
		{
			case "1" : ref2.MUMBAI_INDIANS();
			break;
			case "2" : ref4.DELHI_CAPITALS();
			break;
			case "3" : ref6.GUJARAT_TITANS();
			break;
			case "4" : ref8.PUNJAB_KINGS();
			break;
			case "5" : ref10.RAJASTHAN_ROYALS();
			break;											
			case "6" : ref12.Teams();
			break;										             	
			default: System.out.println("invalid input");
			group_a();
		}		
		
	}
	
	
}


class MUMBAI_INDIANS extends group_a
{
	public void MUMBAI_INDIANS()
	{
		System.out.println("=========================");
		System.out.println("enter 1 for batsman");
		System.out.println("enter 2 for bowler");
		System.out.println("enter 3 for all_rounder");
		System.out.println("enter 4 for back_menu");
		System.out.println("=========================");
		
		MUMBAI_INDIANS ref1 = new batsman1();
		batsman1 ref2 = (batsman1) ref1;			
		
		MUMBAI_INDIANS ref3 = new bowler1();
		bowler1 ref4 = (bowler1) ref3;
		
		MUMBAI_INDIANS ref5 = new all_rounder1();
		all_rounder1 ref6 = (all_rounder1) ref5;		
		
		Teams ref7 = new group_a(); 
		group_a ref8 = (group_a)ref7; 
		
		Scanner s1 = new Scanner(System.in);
		String s2 = s1.nextLine();
		
		switch (s2)
		{
			case "1" : ref2.batsman1();
			break;
			case "2" : ref4.bowler1();
			break;
			case "3" : ref6.all_rounder1(); 				
			break;								
			case "4" : ref8.group_a();
			break;										             	
			default: System.out.println("invalid input");
			MUMBAI_INDIANS();
		}
	}
}

class batsman1 extends MUMBAI_INDIANS
{
	public void batsman1()
	{
	System.out.println("=================================");
	System.out.println("enter 1 for Rohit_Sharma");
	System.out.println("enter 2 for Suryakumar_Yadav");
	System.out.println("enter 3 for Ishan_Kishan");
	System.out.println("enter 4 for Tilak_Varma");
	System.out.println("enter 5 for Tim_David");
	System.out.println("enter 6 for back_menu");
	System.out.println("=================================");
	
	Rohit_Sharma ref1 = new Rohit_Sharma();
	Suryakumar_Yadav ref2 = new Suryakumar_Yadav();
	Ishan_Kishan ref3 = new Ishan_Kishan();
	Tilak_Varma ref4 = new Tilak_Varma();
	Tim_David ref5 = new Tim_David();
	group_a ref6 = new MUMBAI_INDIANS(); 
	MUMBAI_INDIANS ref7 = (MUMBAI_INDIANS)ref6;
	
		
	Scanner s1 = new Scanner(System.in);
	String s2 = s1.nextLine();
	
	switch (s2)
		{
			case "1" : ref1.bat();
			break;
			case "2" : ref2.bat();
			break;
			case "3" : ref3.bat();
			break;
			case "4" : ref4.bat();
			break;
			case "5" : ref5.bat();
			break;
			case "6" : ref7.MUMBAI_INDIANS();
			break;
			default: System.out.println("invalid input");
			batsman1();
		}
	
	System.out.println("enter 1 for back_menu");
	
	Scanner s3 = new Scanner(System.in);
	String s4 = s3.nextLine();
	
	switch (s4)
	{
		case "1" : ref7.MUMBAI_INDIANS();
		break;
	}
	
	}
}
	
class Rohit_Sharma extends batsman1
{
	
	String Name = "Rohit_Sharma";
	String Nationality = "Indian";
	private int Price = 0;
	public int getPrice()
	{
		return Price;
	}
	public void setPrice(int price)
	{
		this.Price=price;
	}
	public static void bat()
	{
		Rohit_Sharma ref1 = new Rohit_Sharma();
		System.out.println("=================================");
		System.out.println("Name        : " + ref1.Name);
		System.out.println("Nationality : " + ref1.Nationality);
		ref1.setPrice(160000000);
		System.out.println("price Paid  : " + ref1.getPrice());
		System.out.println("=================================");
	}
}


class Suryakumar_Yadav extends batsman1
{
	
	String Name = "Suryakumar_Yadav";
	String Nationality = "Indian";
	private int Price = 0;
	public int getPrice()
	{
		return Price;
	}
	public void setPrice(int price)
	{
		this.Price=price;
	}
	public static void bat()
	{
		Suryakumar_Yadav ref1 = new Suryakumar_Yadav();
		System.out.println("=================================");
		System.out.println("Name        : " + ref1.Name);
		System.out.println("Nationality : " + ref1.Nationality);
		ref1.setPrice(80000000);
		System.out.println("price Paid  : " + ref1.getPrice());
		System.out.println("=================================");
	}
}

class Ishan_Kishan extends batsman1
{
	
	String Name = "Ishan_Kishan";
	String Nationality = "Indian";
	private int Price = 0;
	public int getPrice()
	{
		return Price;
	}
	public void setPrice(int price)
	{
		this.Price=price;
	}
	public static void bat()
	{
		Ishan_Kishan ref1 = new Ishan_Kishan();
		System.out.println("=================================");
		System.out.println("Name        : " + ref1.Name);
		System.out.println("Nationality : " + ref1.Nationality);
		ref1.setPrice(150000000);
		System.out.println("price Paid  : " + ref1.getPrice());
		System.out.println("=================================");
	}
}

class Tilak_Varma extends batsman1
{
	
	String Name = "Tilak_Varma";
	String Nationality = "Indian";
	private int Price = 0;
	public int getPrice()
	{
		return Price;
	}
	public void setPrice(int price)
	{
		this.Price=price;
	}
	public static void bat()
	{
		Tilak_Varma ref1 = new Tilak_Varma();
		System.out.println("=================================");
		System.out.println("Name        : " + ref1.Name);
		System.out.println("Nationality : " + ref1.Nationality);
		ref1.setPrice(20000000);
		System.out.println("price Paid  : " + ref1.getPrice());
		System.out.println("=================================");
	}
}

class Tim_David extends batsman1
{
	
	String Name = "Tim_David";
	String Nationality = "Overseas";
	private int Price = 0;
	public int getPrice()
	{
		return Price;
	}
	public void setPrice(int price)
	{
		this.Price=price;
	}
	public static void bat()
	{
		Tim_David ref1 = new Tim_David();
		System.out.println("=================================");
		System.out.println("Name        : " + ref1.Name);
		System.out.println("Nationality : " + ref1.Nationality);
		ref1.setPrice(20000000);
		System.out.println("price Paid  : " + ref1.getPrice());
		System.out.println("=================================");
	}
}


class bowler1 extends MUMBAI_INDIANS
{
	public void bowler1()
	{
	System.out.println("=================================");
	System.out.println("enter 1 for Jasprit_Bumrah");
	System.out.println("enter 2 for Kumar_Kartikeya");
	System.out.println("enter 3 for Hrithik_Shokeen");
	System.out.println("enter 4 for Jhye_Richardson");
	System.out.println("enter 5 for back_menu");
	System.out.println("=================================");
	
	Jasprit_Bumrah ref1 = new Jasprit_Bumrah();
	Kumar_Kartikeya ref2 = new Kumar_Kartikeya();
	Hrithik_Shokeen ref3 = new Hrithik_Shokeen();
	Jhye_Richardson ref4 = new Jhye_Richardson();
	group_a ref5 = new MUMBAI_INDIANS(); 
	MUMBAI_INDIANS ref6 = (MUMBAI_INDIANS)ref5;
	
		
	Scanner s1 = new Scanner(System.in);
	String s2 = s1.nextLine();
	
	switch (s2)
		{
			case "1" : ref1.bowl();
			break;
			case "2" : ref2.bowl();
			break;
			case "3" : ref3.bowl();
			break;
			case "4" : ref4.bowl();
			break;
			case "5" : ref6.MUMBAI_INDIANS();
			break;
			default: System.out.println("invalid input");
			bowler1();
		}
	
	System.out.println("enter 1 for back_menu");
	
	Scanner s3 = new Scanner(System.in);
	String s4 = s3.nextLine();
	
	switch (s4)
	{
		case "1" : ref6.MUMBAI_INDIANS();
		break;
	}
	
	}
}
	
class Jasprit_Bumrah extends bowler1
{
	
	String Name = "Jasprit_Bumrah";
	String Nationality = "Indian";
	private int Price = 0;
	public int getPrice()
	{
		return Price;
	}
	public void setPrice(int price)
	{
		this.Price=price;
	}
	public static void bowl()
	{
		Jasprit_Bumrah ref1 = new Jasprit_Bumrah();
		System.out.println("=================================");
		System.out.println("Name        : " + ref1.Name);
		System.out.println("Nationality : " + ref1.Nationality);
		ref1.setPrice(160000000);
		System.out.println("price Paid  : " + ref1.getPrice());
		System.out.println("=================================");
	}
}


class Kumar_Kartikeya extends bowler1
{
	
	String Name = "Kumar_Kartikeya";
	String Nationality = "Indian";
	private int Price = 0;
	public int getPrice()
	{
		return Price;
	}
	public void setPrice(int price)
	{
		this.Price=price;
	}
	public static void bowl()
	{
		Kumar_Kartikeya ref1 = new Kumar_Kartikeya();
		System.out.println("=================================");
		System.out.println("Name        : " + ref1.Name);
		System.out.println("Nationality : " + ref1.Nationality);
		ref1.setPrice(80000000);
		System.out.println("price Paid  : " + ref1.getPrice());
		System.out.println("=================================");
	}
}

class Hrithik_Shokeen extends bowler1
{
	
	String Name = "Hrithik_Shokeen";
	String Nationality = "Indian";
	private int Price = 0;
	public int getPrice()
	{
		return Price;
	}
	public void setPrice(int price)
	{
		this.Price=price;
	}
	public static void bowl()
	{
		Hrithik_Shokeen ref1 = new Hrithik_Shokeen();
		System.out.println("=================================");
		System.out.println("Name        : " + ref1.Name);
		System.out.println("Nationality : " + ref1.Nationality);
		ref1.setPrice(150000000);
		System.out.println("price Paid  : " + ref1.getPrice());
		System.out.println("=================================");
	}
}

class Jhye_Richardson extends bowler1
{
	
	String Name = "Jhye_Richardson";
	String Nationality = "Overseas";
	private int Price = 0;
	public int getPrice()
	{
		return Price;
	}
	public void setPrice(int price)
	{
		this.Price=price;
	}
	public static void bowl()
	{
		Jhye_Richardson ref1 = new Jhye_Richardson();
		System.out.println("=================================");
		System.out.println("Name        : " + ref1.Name);
		System.out.println("Nationality : " + ref1.Nationality);
		ref1.setPrice(20000000);
		System.out.println("price Paid  : " + ref1.getPrice());
		System.out.println("=================================");
	}
}



class all_rounder1 extends MUMBAI_INDIANS
{
	public void all_rounder1()
	{
	System.out.println("=================================");
	System.out.println("enter 1 for Cameron_Green");
	System.out.println("enter 2 for Jofra_Archer");
	System.out.println("enter 3 for back_menu");
	System.out.println("=================================");
	
	Cameron_Green ref1 = new Cameron_Green();
	Jofra_Archer ref2 = new Jofra_Archer();
	group_a ref3 = new MUMBAI_INDIANS(); 
	MUMBAI_INDIANS ref4 = (MUMBAI_INDIANS)ref3;
	
		
	Scanner s1 = new Scanner(System.in);
	String s2 = s1.nextLine();
	
	switch (s2)
		{
			case "1" : ref1.all_round();
			break;
			case "2" : ref2.all_round();
			break;
			case "3" : ref4.MUMBAI_INDIANS();
			break;
			default: System.out.println("invalid input");
			all_rounder1();
		}
	
	System.out.println("enter 1 for back_menu");
	
	Scanner s3 = new Scanner(System.in);
	String s4 = s3.nextLine();
	
	switch (s4)
	{
		case "1" : ref4.MUMBAI_INDIANS();
		break;
	}
	
	}
}
	
class Cameron_Green extends all_rounder1
{
	
	String Name = "Cameron_Green";
	String Nationality = "Overseas";
	private int Price = 0;
	public int getPrice()
	{
		return Price;
	}
	public void setPrice(int price)
	{
		this.Price=price;
	}
	public static void all_round()
	{
		Cameron_Green ref1 = new Cameron_Green();
		System.out.println("=================================");
		System.out.println("Name        : " + ref1.Name);
		System.out.println("Nationality : " + ref1.Nationality);
		ref1.setPrice(160000000);
		System.out.println("price Paid  : " + ref1.getPrice());
		System.out.println("=================================");
	}
}


class Jofra_Archer extends all_rounder1
{
	
	String Name = "Jofra_Archer";
	String Nationality = "Overseas";
	private int Price = 0;
	public int getPrice()
	{
		return Price;
	}
	public void setPrice(int price)
	{
		this.Price=price;
	}
	public static void all_round()
	{
		Jofra_Archer ref1 = new Jofra_Archer();
		System.out.println("=================================");
		System.out.println("Name        : " + ref1.Name);
		System.out.println("Nationality : " + ref1.Nationality);
		ref1.setPrice(80000000);
		System.out.println("price Paid  : " + ref1.getPrice());
		System.out.println("=================================");
	}
}


class DELHI_CAPITALS extends group_a
{
	public void DELHI_CAPITALS()
	{
		System.out.println("=========================");
		System.out.println("enter 1 for batsman");
		System.out.println("enter 2 for bowler");
		System.out.println("enter 3 for all_rounder");
		System.out.println("enter 4 for back_menu");
		System.out.println("=========================");
		
		DELHI_CAPITALS ref1 = new batsman2();
		batsman2 ref2 = (batsman2) ref1;			
		
		DELHI_CAPITALS ref3 = new bowler2();
		bowler2 ref4 = (bowler2) ref3;
		
		DELHI_CAPITALS ref5 = new all_rounder2();
		all_rounder2 ref6 = (all_rounder2) ref5;		
		
		Teams ref7 = new group_a(); 
		group_a ref8 = (group_a)ref7; 
		
		Scanner s1 = new Scanner(System.in);
		String s2 = s1.nextLine();
		
		switch (s2)
		{
			case "1" : ref2.batsman2();
			break;
			case "2" : ref4.bowler2();
			break;
			case "3" : ref6.all_rounder2(); 				
			break;								
			case "4" : ref8.group_a();
			break;										             	
			default: System.out.println("invalid input");
			DELHI_CAPITALS();
		}
	}
}

class batsman2 extends DELHI_CAPITALS
{
	public void batsman2()
	{
	System.out.println("=================================");
	System.out.println("enter 1 for David_Warner");
	System.out.println("enter 2 for Prithvi_Shaw");
	System.out.println("enter 3 for Mitchell_Marsh");
	System.out.println("enter 4 for Manish_Pandey");
	System.out.println("enter 5 for Sarfaraz_Khan");
	System.out.println("enter 6 for back_menu");
	System.out.println("=================================");
	
	David_Warner ref1 = new David_Warner();
	Prithvi_Shaw ref2 = new Prithvi_Shaw();
	Mitchell_Marsh ref3 = new Mitchell_Marsh();
	Manish_Pandey ref4 = new Manish_Pandey();
	Sarfaraz_Khan ref5 = new Sarfaraz_Khan();
	group_a ref6 = new DELHI_CAPITALS(); 
	DELHI_CAPITALS ref7 = (DELHI_CAPITALS)ref6;
	
		
	Scanner s1 = new Scanner(System.in);
	String s2 = s1.nextLine();
	
	switch (s2)
		{
			case "1" : ref1.bat();
			break;
			case "2" : ref2.bat();
			break;
			case "3" : ref3.bat();
			break;
			case "4" : ref4.bat();
			break;
			case "5" : ref5.bat();
			break;
			case "6" : ref7.DELHI_CAPITALS();
			break;
			default: System.out.println("invalid input");
			batsman2();
		}
	
	System.out.println("enter 1 for back_menu");
	
	Scanner s3 = new Scanner(System.in);
	String s4 = s3.nextLine();
	
	switch (s4)
	{
		case "1" : ref7.DELHI_CAPITALS();
		break;
	}
	
	}
}
	
class David_Warner extends batsman2
{
	
	String Name = "David_Warner";
	String Nationality = "Overseas";
	private int Price = 0;
	public int getPrice()
	{
		return Price;
	}
	public void setPrice(int price)
	{
		this.Price=price;
	}
	public static void bat()
	{
		David_Warner ref1 = new David_Warner();
		System.out.println("=================================");
		System.out.println("Name        : " + ref1.Name);
		System.out.println("Nationality : " + ref1.Nationality);
		ref1.setPrice(160000000);
		System.out.println("price Paid  : " + ref1.getPrice());
		System.out.println("=================================");
	}
}


class Prithvi_Shaw extends batsman2
{
	
	String Name = "Prithvi_Shaw";
	String Nationality = "Indian";
	private int Price = 0;
	public int getPrice()
	{
		return Price;
	}
	public void setPrice(int price)
	{
		this.Price=price;
	}
	public static void bat()
	{
		Prithvi_Shaw ref1 = new Prithvi_Shaw();
		System.out.println("=================================");
		System.out.println("Name        : " + ref1.Name);
		System.out.println("Nationality : " + ref1.Nationality);
		ref1.setPrice(80000000);
		System.out.println("price Paid  : " + ref1.getPrice());
		System.out.println("=================================");
	}
}

class Mitchell_Marsh extends batsman2
{
	
	String Name = "Mitchell_Marsh";
	String Nationality = "Overseas";
	private int Price = 0;
	public int getPrice()
	{
		return Price;
	}
	public void setPrice(int price)
	{
		this.Price=price;
	}
	public static void bat()
	{
		Mitchell_Marsh ref1 = new Mitchell_Marsh();
		System.out.println("=================================");
		System.out.println("Name        : " + ref1.Name);
		System.out.println("Nationality : " + ref1.Nationality);
		ref1.setPrice(150000000);
		System.out.println("price Paid  : " + ref1.getPrice());
		System.out.println("=================================");
	}
}

class Manish_Pandey extends batsman2
{
	
	String Name = "Manish_Pandey";
	String Nationality = "Indian";
	private int Price = 0;
	public int getPrice()
	{
		return Price;
	}
	public void setPrice(int price)
	{
		this.Price=price;
	}
	public static void bat()
	{
		Manish_Pandey ref1 = new Manish_Pandey();
		System.out.println("=================================");
		System.out.println("Name        : " + ref1.Name);
		System.out.println("Nationality : " + ref1.Nationality);
		ref1.setPrice(20000000);
		System.out.println("price Paid  : " + ref1.getPrice());
		System.out.println("=================================");
	}
}

class Sarfaraz_Khan extends batsman2
{
	
	String Name = "Sarfaraz_Khan";
	String Nationality = "Overseas";
	private int Price = 0;
	public int getPrice()
	{
		return Price;
	}
	public void setPrice(int price)
	{
		this.Price=price;
	}
	public static void bat()
	{
		Sarfaraz_Khan ref1 = new Sarfaraz_Khan();
		System.out.println("=================================");
		System.out.println("Name        : " + ref1.Name);
		System.out.println("Nationality : " + ref1.Nationality);
		ref1.setPrice(20000000);
		System.out.println("price Paid  : " + ref1.getPrice());
		System.out.println("=================================");
	}
}


class bowler2 extends DELHI_CAPITALS
{
	public void bowler2()
	{
	System.out.println("=================================");
	System.out.println("enter 1 for Kuldeep_Yadav");
	System.out.println("enter 2 for Anrich_Nortje");
	System.out.println("enter 3 for Khaleel_Ahmed");
	System.out.println("enter 4 for Chetan_Sakariya");
	System.out.println("enter 5 for back_menu");
	System.out.println("=================================");
	
	Kuldeep_Yadav ref1 = new Kuldeep_Yadav();
	Anrich_Nortje ref2 = new Anrich_Nortje();
	Khaleel_Ahmed ref3 = new Khaleel_Ahmed();
	Chetan_Sakariya ref4 = new Chetan_Sakariya();
	group_a ref5 = new DELHI_CAPITALS(); 
	DELHI_CAPITALS ref6 = (DELHI_CAPITALS)ref5;
	
		
	Scanner s1 = new Scanner(System.in);
	String s2 = s1.nextLine();
	
	switch (s2)
		{
			case "1" : ref1.bowl();
			break;
			case "2" : ref2.bowl();
			break;
			case "3" : ref3.bowl();
			break;
			case "4" : ref4.bowl();
			break;
			case "5" : ref6.DELHI_CAPITALS();
			break;
			default: System.out.println("invalid input");
			bowler2();
		}
	
	System.out.println("enter 1 for back_menu");
	
	Scanner s3 = new Scanner(System.in);
	String s4 = s3.nextLine();
	
	switch (s4)
	{
		case "1" : ref6.DELHI_CAPITALS();
		break;
	}
	
	}
}
	
class Kuldeep_Yadav extends bowler2
{
	
	String Name = "Kuldeep_Yadav";
	String Nationality = "Indian";
	private int Price = 0;
	public int getPrice()
	{
		return Price;
	}
	public void setPrice(int price)
	{
		this.Price=price;
	}
	public static void bowl()
	{
		Kuldeep_Yadav ref1 = new Kuldeep_Yadav();
		System.out.println("=================================");
		System.out.println("Name        : " + ref1.Name);
		System.out.println("Nationality : " + ref1.Nationality);
		ref1.setPrice(160000000);
		System.out.println("price Paid  : " + ref1.getPrice());
		System.out.println("=================================");
	}
}


class Anrich_Nortje extends bowler2
{
	
	String Name = "Anrich_Nortje";
	String Nationality = "Overseas";
	private int Price = 0;
	public int getPrice()
	{
		return Price;
	}
	public void setPrice(int price)
	{
		this.Price=price;
	}
	public static void bowl()
	{
		Anrich_Nortje ref1 = new Anrich_Nortje();
		System.out.println("=================================");
		System.out.println("Name        : " + ref1.Name);
		System.out.println("Nationality : " + ref1.Nationality);
		ref1.setPrice(80000000);
		System.out.println("price Paid  : " + ref1.getPrice());
		System.out.println("=================================");
	}
}

class Khaleel_Ahmed extends bowler2
{
	
	String Name = "Khaleel_Ahmed";
	String Nationality = "Indian";
	private int Price = 0;
	public int getPrice()
	{
		return Price;
	}
	public void setPrice(int price)
	{
		this.Price=price;
	}
	public static void bowl()
	{
		Khaleel_Ahmed ref1 = new Khaleel_Ahmed();
		System.out.println("=================================");
		System.out.println("Name        : " + ref1.Name);
		System.out.println("Nationality : " + ref1.Nationality);
		ref1.setPrice(150000000);
		System.out.println("price Paid  : " + ref1.getPrice());
		System.out.println("=================================");
	}
}

class Chetan_Sakariya extends bowler2
{
	
	String Name = "Chetan_Sakariya";
	String Nationality = "Overseas";
	private int Price = 0;
	public int getPrice()
	{
		return Price;
	}
	public void setPrice(int price)
	{
		this.Price=price;
	}
	public static void bowl()
	{
		Chetan_Sakariya ref1 = new Chetan_Sakariya();
		System.out.println("=================================");
		System.out.println("Name        : " + ref1.Name);
		System.out.println("Nationality : " + ref1.Nationality);
		ref1.setPrice(20000000);
		System.out.println("price Paid  : " + ref1.getPrice());
		System.out.println("=================================");
	}
}



class all_rounder2 extends DELHI_CAPITALS
{
	public void all_rounder2()
	{
	System.out.println("=================================");
	System.out.println("enter 1 for Riyan_Parag");
	System.out.println("enter 2 for Jason_Holder");
	System.out.println("enter 3 for back_menu");
	System.out.println("=================================");
	
	Riyan_Parag ref1 = new Riyan_Parag();
	Jason_Holder ref2 = new Jason_Holder();
	group_a ref3 = new DELHI_CAPITALS(); 
	DELHI_CAPITALS ref4 = (DELHI_CAPITALS)ref3;
	
		
	Scanner s1 = new Scanner(System.in);
	String s2 = s1.nextLine();
	
	switch (s2)
		{
			case "1" : ref1.all_round();
			break;
			case "2" : ref2.all_round();
			break;
			case "3" : ref4.DELHI_CAPITALS();
			break;
			default: System.out.println("invalid input");
			all_rounder2();
		}
	
	System.out.println("enter 1 for back_menu");
	
	Scanner s3 = new Scanner(System.in);
	String s4 = s3.nextLine();
	
	switch (s4)
	{
		case "1" : ref4.DELHI_CAPITALS();
		break;
	}
	
	}
}
	
class Riyan_Parag extends all_rounder2
{
	
	String Name = "Riyan_Parag";
	String Nationality = "Overseas";
	private int Price = 0;
	public int getPrice()
	{
		return Price;
	}
	public void setPrice(int price)
	{
		this.Price=price;
	}
	public static void all_round()
	{
		Riyan_Parag ref1 = new Riyan_Parag();
		System.out.println("=================================");
		System.out.println("Name        : " + ref1.Name);
		System.out.println("Nationality : " + ref1.Nationality);
		ref1.setPrice(160000000);
		System.out.println("price Paid  : " + ref1.getPrice());
		System.out.println("=================================");
	}
}


class Jason_Holder extends all_rounder2
{
	
	String Name = "Jason_Holder";
	String Nationality = "Overseas";
	private int Price = 0;
	public int getPrice()
	{
		return Price;
	}
	public void setPrice(int price)
	{
		this.Price=price;
	}
	public static void all_round()
	{
		Jason_Holder ref1 = new Jason_Holder();
		System.out.println("=================================");
		System.out.println("Name        : " + ref1.Name);
		System.out.println("Nationality : " + ref1.Nationality);
		ref1.setPrice(80000000);
		System.out.println("price Paid  : " + ref1.getPrice());
		System.out.println("=================================");
	}
}



class GUJARAT_TITANS extends group_a
{
	public void GUJARAT_TITANS()
	{
		System.out.println("=========================");
		System.out.println("enter 1 for batsman");
		System.out.println("enter 2 for bowler");
		System.out.println("enter 3 for all_rounder");
		System.out.println("enter 4 for back_menu");
		System.out.println("=========================");
		
		GUJARAT_TITANS ref1 = new batsman3();
		batsman3 ref2 = (batsman3) ref1;			
		
		GUJARAT_TITANS ref3 = new bowler3();
		bowler3 ref4 = (bowler3) ref3;
		
		GUJARAT_TITANS ref5 = new all_rounder3();
		all_rounder3 ref6 = (all_rounder3) ref5;		
		
		Teams ref7 = new group_a(); 
		group_a ref8 = (group_a)ref7; 
		
		Scanner s1 = new Scanner(System.in);
		String s2 = s1.nextLine();
		
		switch (s2)
		{
			case "1" : ref2.batsman3();
			break;
			case "2" : ref4.bowler3();
			break;
			case "3" : ref6.all_rounder3(); 				
			break;								
			case "4" : ref8.group_a();
			break;										             	
			default: System.out.println("invalid input");
			GUJARAT_TITANS();
		}
	}
}

class batsman3 extends GUJARAT_TITANS
{
	public void batsman3()
	{
	System.out.println("=================================");
	System.out.println("enter 1 for Shubman_Gill");
	System.out.println("enter 2 for Wriddhiman_Saha");
	System.out.println("enter 3 for Kane_Williamson");
	System.out.println("enter 4 for Hardik_Pandya");
	System.out.println("enter 5 for Matthew_Wade");
	System.out.println("enter 6 for back_menu");
	System.out.println("=================================");
	
	Shubman_Gill ref1 = new Shubman_Gill();
	Wriddhiman_Saha ref2 = new Wriddhiman_Saha();
	Kane_Williamson ref3 = new Kane_Williamson();
	Hardik_Pandya ref4 = new Hardik_Pandya();
	Matthew_Wade ref5 = new Matthew_Wade();
	group_a ref6 = new GUJARAT_TITANS(); 
	GUJARAT_TITANS ref7 = (GUJARAT_TITANS)ref6;
	
		
	Scanner s1 = new Scanner(System.in);
	String s2 = s1.nextLine();
	
	switch (s2)
		{
			case "1" : ref1.bat();
			break;
			case "2" : ref2.bat();
			break;
			case "3" : ref3.bat();
			break;
			case "4" : ref4.bat();
			break;
			case "5" : ref5.bat();
			break;
			case "6" : ref7.GUJARAT_TITANS();
			break;
			default: System.out.println("invalid input");
			batsman3();
		}
	System.out.println("enter 1 for back_menu");
	
	Scanner s3 = new Scanner(System.in);
	String s4 = s3.nextLine();
	
	switch (s4)
	{
		case "1" : ref7.GUJARAT_TITANS();
		break;
	}
	
	}
}
	
class Shubman_Gill extends batsman3
{
	
	String Name = "Shubman_Gill";
	String Nationality = "Indian";
	private int Price = 0;
	public int getPrice()
	{
		return Price;
	}
	public void setPrice(int price)
	{
		this.Price=price;
	}
	public static void bat()
	{
		Shubman_Gill ref1 = new Shubman_Gill();
		System.out.println("=================================");
		System.out.println("Name        : " + ref1.Name);
		System.out.println("Nationality : " + ref1.Nationality);
		ref1.setPrice(160000000);
		System.out.println("price Paid  : " + ref1.getPrice());
		System.out.println("=================================");
	}
}


class Wriddhiman_Saha extends batsman3
{
	
	String Name = "Wriddhiman_Saha";
	String Nationality = "Indian";
	private int Price = 0;
	public int getPrice()
	{
		return Price;
	}
	public void setPrice(int price)
	{
		this.Price=price;
	}
	public static void bat()
	{
		Wriddhiman_Saha ref1 = new Wriddhiman_Saha();
		System.out.println("=================================");
		System.out.println("Name        : " + ref1.Name);
		System.out.println("Nationality : " + ref1.Nationality);
		ref1.setPrice(80000000);
		System.out.println("price Paid  : " + ref1.getPrice());
		System.out.println("=================================");
	}
}

class Kane_Williamson extends batsman3
{
	
	String Name = "Kane_Williamson";
	String Nationality = "Overseas";
	private int Price = 0;
	public int getPrice()
	{
		return Price;
	}
	public void setPrice(int price)
	{
		this.Price=price;
	}
	public static void bat()
	{
		Kane_Williamson ref1 = new Kane_Williamson();
		System.out.println("=================================");
		System.out.println("Name        : " + ref1.Name);
		System.out.println("Nationality : " + ref1.Nationality);
		ref1.setPrice(150000000);
		System.out.println("price Paid  : " + ref1.getPrice());
		System.out.println("=================================");
	}
}

class Hardik_Pandya extends batsman3
{
	
	String Name = "Hardik_Pandya";
	String Nationality = "Indian";
	private int Price = 0;
	public int getPrice()
	{
		return Price;
	}
	public void setPrice(int price)
	{
		this.Price=price;
	}
	public static void bat()
	{
		Hardik_Pandya ref1 = new Hardik_Pandya();
		System.out.println("=================================");
		System.out.println("Name        : " + ref1.Name);
		System.out.println("Nationality : " + ref1.Nationality);
		ref1.setPrice(20000000);
		System.out.println("price Paid  : " + ref1.getPrice());
		System.out.println("=================================");
	}
}

class Matthew_Wade extends batsman3
{
	
	String Name = "Matthew_Wade";
	String Nationality = "Overseas";
	private int Price = 0;
	public int getPrice()
	{
		return Price;
	}
	public void setPrice(int price)
	{
		this.Price=price;
	}
	public static void bat()
	{
		Matthew_Wade ref1 = new Matthew_Wade();
		System.out.println("=================================");
		System.out.println("Name        : " + ref1.Name);
		System.out.println("Nationality : " + ref1.Nationality);
		ref1.setPrice(20000000);
		System.out.println("price Paid  : " + ref1.getPrice());
		System.out.println("=================================");
	}
}


class bowler3 extends GUJARAT_TITANS
{
	public void bowler3()
	{
	System.out.println("=================================");
	System.out.println("enter 1 for Shivam_Mavi");
	System.out.println("enter 2 for Alzarri_Joseph");
	System.out.println("enter 3 for Mohammad_Shami");
	System.out.println("enter 4 for R_Sai_Kishorev");
	System.out.println("enter 5 for back_menu");
	System.out.println("=================================");
	
	Shivam_Mavi ref1 = new Shivam_Mavi();
	Alzarri_Joseph ref2 = new Alzarri_Joseph();
	Mohammad_Shami ref3 = new Mohammad_Shami();
	R_Sai_Kishorev ref4 = new R_Sai_Kishorev();
	group_a ref5 = new GUJARAT_TITANS(); 
	GUJARAT_TITANS ref6 = (GUJARAT_TITANS)ref5;
	
		
	Scanner s1 = new Scanner(System.in);
	String s2 = s1.nextLine();
	
	switch (s2)
		{
			case "1" : ref1.bowl();
			break;
			case "2" : ref2.bowl();
			break;
			case "3" : ref3.bowl();
			break;
			case "4" : ref4.bowl();
			break;
			case "5" : ref6.GUJARAT_TITANS();
			break;
			default: System.out.println("invalid input");
			bowler3();
		}
	
System.out.println("enter 1 for back_menu");
	
	Scanner s3 = new Scanner(System.in);
	String s4 = s3.nextLine();
	
	switch (s4)
	{
		case "1" : ref6.GUJARAT_TITANS();
		break;
	}
	
	}
}
	
class Shivam_Mavi extends bowler3
{
	
	String Name = "Shivam_Mavi";
	String Nationality = "Indian";
	private int Price = 0;
	public int getPrice()
	{
		return Price;
	}
	public void setPrice(int price)
	{
		this.Price=price;
	}
	public static void bowl()
	{
		Shivam_Mavi ref1 = new Shivam_Mavi();
		System.out.println("=================================");
		System.out.println("Name        : " + ref1.Name);
		System.out.println("Nationality : " + ref1.Nationality);
		ref1.setPrice(160000000);
		System.out.println("price Paid  : " + ref1.getPrice());
		System.out.println("=================================");
	}
}


class Alzarri_Joseph extends bowler3
{
	
	String Name = "Alzarri_Joseph";
	String Nationality = "Overseas";
	private int Price = 0;
	public int getPrice()
	{
		return Price;
	}
	public void setPrice(int price)
	{
		this.Price=price;
	}
	public static void bowl()
	{
		Alzarri_Joseph ref1 = new Alzarri_Joseph();
		System.out.println("=================================");
		System.out.println("Name        : " + ref1.Name);
		System.out.println("Nationality : " + ref1.Nationality);
		ref1.setPrice(80000000);
		System.out.println("price Paid  : " + ref1.getPrice());
		System.out.println("=================================");
	}
}

class Mohammad_Shami extends bowler3
{
	
	String Name = "Mohammad_Shami";
	String Nationality = "Indian";
	private int Price = 0;
	public int getPrice()
	{
		return Price;
	}
	public void setPrice(int price)
	{
		this.Price=price;
	}
	public static void bowl()
	{
		Mohammad_Shami ref1 = new Mohammad_Shami();
		System.out.println("=================================");
		System.out.println("Name        : " + ref1.Name);
		System.out.println("Nationality : " + ref1.Nationality);
		ref1.setPrice(150000000);
		System.out.println("price Paid  : " + ref1.getPrice());
		System.out.println("=================================");
	}
}

class R_Sai_Kishorev extends bowler3
{
	
	String Name = "R_Sai_Kishorev";
	String Nationality = "Overseas";
	private int Price = 0;
	public int getPrice()
	{
		return Price;
	}
	public void setPrice(int price)
	{
		this.Price=price;
	}
	public static void bowl()
	{
		R_Sai_Kishorev ref1 = new R_Sai_Kishorev();
		System.out.println("=================================");
		System.out.println("Name        : " + ref1.Name);
		System.out.println("Nationality : " + ref1.Nationality);
		ref1.setPrice(20000000);
		System.out.println("price Paid  : " + ref1.getPrice());
		System.out.println("=================================");
	}
}



class all_rounder3 extends GUJARAT_TITANS
{
	public void all_rounder3()
	{
	System.out.println("=================================");
	System.out.println("enter 1 for Rashid_Khan");
	System.out.println("enter 2 for Rahul_Tewatia");
	System.out.println("enter 3 for back_menu");
	System.out.println("=================================");
	
	Rashid_Khan ref1 = new Rashid_Khan();
	Rahul_Tewatia ref2 = new Rahul_Tewatia();
	group_a ref3 = new GUJARAT_TITANS(); 
	GUJARAT_TITANS ref4 = (GUJARAT_TITANS)ref3;
	
		
	Scanner s1 = new Scanner(System.in);
	String s2 = s1.nextLine();
	
	switch (s2)
		{
			case "1" : ref1.all_round();
			break;
			case "2" : ref2.all_round();
			break;
			case "3" : ref4.GUJARAT_TITANS();
			break;
			default: System.out.println("invalid input");
			all_rounder3();
		}
	
	System.out.println("enter 1 for back_menu");
	
	Scanner s3 = new Scanner(System.in);
	String s4 = s3.nextLine();
	
	switch (s4)
	{
		case "1" : ref4.GUJARAT_TITANS();
		break;
	}
	
	}
}
	
class Rashid_Khan extends all_rounder3
{
	
	String Name = "Rashid_Khan";
	String Nationality = "Overseas";
	private int Price = 0;
	public int getPrice()
	{
		return Price;
	}
	public void setPrice(int price)
	{
		this.Price=price;
	}
	public static void all_round()
	{
		Rashid_Khan ref1 = new Rashid_Khan();
		System.out.println("=================================");
		System.out.println("Name        : " + ref1.Name);
		System.out.println("Nationality : " + ref1.Nationality);
		ref1.setPrice(160000000);
		System.out.println("price Paid  : " + ref1.getPrice());
		System.out.println("=================================");
	}
}


class Rahul_Tewatia extends all_rounder3
{
	
	String Name = "Rahul_Tewatia";
	String Nationality = "Indian";
	private int Price = 0;
	public int getPrice()
	{
		return Price;
	}
	public void setPrice(int price)
	{
		this.Price=price;
	}
	public static void all_round()
	{
		Rahul_Tewatia ref1 = new Rahul_Tewatia();
		System.out.println("=================================");
		System.out.println("Name        : " + ref1.Name);
		System.out.println("Nationality : " + ref1.Nationality);
		ref1.setPrice(80000000);
		System.out.println("price Paid  : " + ref1.getPrice());
		System.out.println("=================================");
	}
}



class PUNJAB_KINGS extends group_a
{
	public void PUNJAB_KINGS()
	{
		System.out.println("=========================");
		System.out.println("enter 1 for batsman");
		System.out.println("enter 2 for bowler");
		System.out.println("enter 3 for all_rounder");
		System.out.println("enter 4 for back_menu");
		System.out.println("=========================");
		
		PUNJAB_KINGS ref1 = new batsman4();
		batsman4 ref2 = (batsman4) ref1;			
		
		PUNJAB_KINGS ref3 = new bowler4();
		bowler4 ref4 = (bowler4) ref3;
		
		PUNJAB_KINGS ref5 = new all_rounder4();
		all_rounder4 ref6 = (all_rounder4) ref5;		
		
		Teams ref7 = new group_a(); 
		group_a ref8 = (group_a)ref7; 
		
		Scanner s1 = new Scanner(System.in);
		String s2 = s1.nextLine();
		
		switch (s2)
		{
			case "1" : ref2.batsman4();
			break;
			case "2" : ref4.bowler4();
			break;
			case "3" : ref6.all_rounder4(); 				
			break;								
			case "4" : ref8.group_a();
			break;										             	
			default: System.out.println("invalid input");
			PUNJAB_KINGS();
		}
	}
}

class batsman4 extends PUNJAB_KINGS
{
	public void batsman4()
	{
	System.out.println("=================================");
	System.out.println("enter 1 for Shikhar_Dhawan");
	System.out.println("enter 2 for Jonny_Bairstow");
	System.out.println("enter 3 for Liam_Livingstone");
	System.out.println("enter 4 for Shahrukh_Khan");
	System.out.println("enter 5 for Jitesh_Sharma");
	System.out.println("enter 6 for back_menu");
	System.out.println("=================================");
	
	Shikhar_Dhawan ref1 = new Shikhar_Dhawan();
	Jonny_Bairstow ref2 = new Jonny_Bairstow();
	Liam_Livingstone ref3 = new Liam_Livingstone();
	Shahrukh_Khan ref4 = new Shahrukh_Khan();
	Jitesh_Sharma ref5 = new Jitesh_Sharma();
	group_a ref6 = new PUNJAB_KINGS(); 
	PUNJAB_KINGS ref7 = (PUNJAB_KINGS)ref6;
	
		
	Scanner s1 = new Scanner(System.in);
	String s2 = s1.nextLine();
	
	switch (s2)
		{
			case "1" : ref1.bat();
			break;
			case "2" : ref2.bat();
			break;
			case "3" : ref3.bat();
			break;
			case "4" : ref4.bat();
			break;
			case "5" : ref5.bat();
			break;
			case "6" : ref7.PUNJAB_KINGS();
			break;
			default: System.out.println("invalid input");
			batsman4();
		}
	
	System.out.println("enter 1 for back_menu");
	
	Scanner s3 = new Scanner(System.in);
	String s4 = s3.nextLine();
	
	switch (s4)
	{
		case "1" : ref7.PUNJAB_KINGS();
		break;
	}
	
	}
}
	
class Shikhar_Dhawan extends batsman4
{
	
	String Name = "Shikhar_Dhawan";
	String Nationality = "Indian";
	private int Price = 0;
	public int getPrice()
	{
		return Price;
	}
	public void setPrice(int price)
	{
		this.Price=price;
	}
	public static void bat()
	{
		Shikhar_Dhawan ref1 = new Shikhar_Dhawan();
		System.out.println("=================================");
		System.out.println("Name        : " + ref1.Name);
		System.out.println("Nationality : " + ref1.Nationality);
		ref1.setPrice(160000000);
		System.out.println("price Paid  : " + ref1.getPrice());
		System.out.println("=================================");
	}
}


class Jonny_Bairstow extends batsman4
{
	
	String Name = "Jonny_Bairstow";
	String Nationality = "Overseas";
	private int Price = 0;
	public int getPrice()
	{
		return Price;
	}
	public void setPrice(int price)
	{
		this.Price=price;
	}
	public static void bat()
	{
		Jonny_Bairstow ref1 = new Jonny_Bairstow();
		System.out.println("=================================");
		System.out.println("Name        : " + ref1.Name);
		System.out.println("Nationality : " + ref1.Nationality);
		ref1.setPrice(80000000);
		System.out.println("price Paid  : " + ref1.getPrice());
		System.out.println("=================================");
	}
}

class Liam_Livingstone extends batsman4
{
	
	String Name = "Liam_Livingstone";
	String Nationality = "Overseas";
	private int Price = 0;
	public int getPrice()
	{
		return Price;
	}
	public void setPrice(int price)
	{
		this.Price=price;
	}
	public static void bat()
	{
		Liam_Livingstone ref1 = new Liam_Livingstone();
		System.out.println("=================================");
		System.out.println("Name        : " + ref1.Name);
		System.out.println("Nationality : " + ref1.Nationality);
		ref1.setPrice(150000000);
		System.out.println("price Paid  : " + ref1.getPrice());
		System.out.println("=================================");
	}
}

class Shahrukh_Khan extends batsman4
{
	
	String Name = "Shahrukh_Khan";
	String Nationality = "Indian";
	private int Price = 0;
	public int getPrice()
	{
		return Price;
	}
	public void setPrice(int price)
	{
		this.Price=price;
	}
	public static void bat()
	{
		Shahrukh_Khan ref1 = new Shahrukh_Khan();
		System.out.println("=================================");
		System.out.println("Name        : " + ref1.Name);
		System.out.println("Nationality : " + ref1.Nationality);
		ref1.setPrice(20000000);
		System.out.println("price Paid  : " + ref1.getPrice());
		System.out.println("=================================");
	}
}

class Jitesh_Sharma extends batsman4
{
	
	String Name = "Jitesh_Sharma";
	String Nationality = "Indian";
	private int Price = 0;
	public int getPrice()
	{
		return Price;
	}
	public void setPrice(int price)
	{
		this.Price=price;
	}
	public static void bat()
	{
		Jitesh_Sharma ref1 = new Jitesh_Sharma();
		System.out.println("=================================");
		System.out.println("Name        : " + ref1.Name);
		System.out.println("Nationality : " + ref1.Nationality);
		ref1.setPrice(20000000);
		System.out.println("price Paid  : " + ref1.getPrice());
		System.out.println("=================================");
	}
}


class bowler4 extends PUNJAB_KINGS
{
	public void bowler4()
	{
	System.out.println("=================================");
	System.out.println("enter 1 for Harpreet_Brar");
	System.out.println("enter 2 for Kagiso_Rabada");
	System.out.println("enter 3 for Arshdeep_Singh");
	System.out.println("enter 4 for Rahul_Chahar");
	System.out.println("enter 5 for back_menu");
	System.out.println("=================================");
	
	Harpreet_Brar ref1 = new Harpreet_Brar();
	Kagiso_Rabada ref2 = new Kagiso_Rabada();
	Arshdeep_Singh ref3 = new Arshdeep_Singh();
	Rahul_Chahar ref4 = new Rahul_Chahar();
	group_a ref5 = new PUNJAB_KINGS(); 
	PUNJAB_KINGS ref6 = (PUNJAB_KINGS)ref5;
	
		
	Scanner s1 = new Scanner(System.in);
	String s2 = s1.nextLine();
	
	switch (s2)
		{
			case "1" : ref1.bowl();
			break;
			case "2" : ref2.bowl();
			break;
			case "3" : ref3.bowl();
			break;
			case "4" : ref4.bowl();
			break;
			case "5" : ref6.PUNJAB_KINGS();
			break;
			default: System.out.println("invalid input");
			bowler4();
		}
	
			System.out.println("enter 1 for back_menu");
			Scanner s3 = new Scanner(System.in);
			String s4 = s3.nextLine();
	
			switch (s4)
			{
				case "1" : ref6.PUNJAB_KINGS();
				break;
			}
	
	}
}
	
class Harpreet_Brar extends bowler4
{
	
	String Name = "Harpreet_Brar";
	String Nationality = "Indian";
	private int Price = 0;
	public int getPrice()
	{
		return Price;
	}
	public void setPrice(int price)
	{
		this.Price=price;
	}
	public static void bowl()
	{
		Harpreet_Brar ref1 = new Harpreet_Brar();
		System.out.println("=================================");
		System.out.println("Name        : " + ref1.Name);
		System.out.println("Nationality : " + ref1.Nationality);
		ref1.setPrice(160000000);
		System.out.println("price Paid  : " + ref1.getPrice());
		System.out.println("=================================");
	}
}


class Kagiso_Rabada extends bowler4
{
	
	String Name = "Kagiso_Rabada";
	String Nationality = "Overseas";
	private int Price = 0;
	public int getPrice()
	{
		return Price;
	}
	public void setPrice(int price)
	{
		this.Price=price;
	}
	public static void bowl()
	{
		Kagiso_Rabada ref1 = new Kagiso_Rabada();
		System.out.println("=================================");
		System.out.println("Name        : " + ref1.Name);
		System.out.println("Nationality : " + ref1.Nationality);
		ref1.setPrice(80000000);
		System.out.println("price Paid  : " + ref1.getPrice());
		System.out.println("=================================");
	}
}

class Arshdeep_Singh extends bowler4
{
	
	String Name = "Arshdeep_Singh";
	String Nationality = "Indian";
	private int Price = 0;
	public int getPrice()
	{
		return Price;
	}
	public void setPrice(int price)
	{
		this.Price=price;
	}
	public static void bowl()
	{
		Arshdeep_Singh ref1 = new Arshdeep_Singh();
		System.out.println("=================================");
		System.out.println("Name        : " + ref1.Name);
		System.out.println("Nationality : " + ref1.Nationality);
		ref1.setPrice(150000000);
		System.out.println("price Paid  : " + ref1.getPrice());
		System.out.println("=================================");
	}
}

class Rahul_Chahar extends bowler4
{
	
	String Name = "Rahul_Chahar";
	String Nationality = "Indian";
	private int Price = 0;
	public int getPrice()
	{
		return Price;
	}
	public void setPrice(int price)
	{
		this.Price=price;
	}
	public static void bowl()
	{
		Rahul_Chahar ref1 = new Rahul_Chahar();
		System.out.println("=================================");
		System.out.println("Name        : " + ref1.Name);
		System.out.println("Nationality : " + ref1.Nationality);
		ref1.setPrice(20000000);
		System.out.println("price Paid  : " + ref1.getPrice());
		System.out.println("=================================");
	}
}



class all_rounder4 extends PUNJAB_KINGS
{
	public void all_rounder4()
	{
	System.out.println("=================================");
	System.out.println("enter 1 for Sam_Curran");
	System.out.println("enter 2 for Rishi_Dhawan");
	System.out.println("enter 3 for back_menu");
	System.out.println("=================================");
	
	Sam_Curran ref1 = new Sam_Curran();
	Rishi_Dhawan ref2 = new Rishi_Dhawan();
	group_a ref3 = new PUNJAB_KINGS(); 
	PUNJAB_KINGS ref4 = (PUNJAB_KINGS)ref3;
	
		
	Scanner s1 = new Scanner(System.in);
	String s2 = s1.nextLine();
	
	switch (s2)
		{
			case "1" : ref1.all_round();
			break;
			case "2" : ref2.all_round();
			break;
			case "3" : ref4.PUNJAB_KINGS();
			break;
			default: System.out.println("invalid input");
			all_rounder4();
		}
	
		System.out.println("enter 1 for back_menu");
		
		Scanner s3 = new Scanner(System.in);
		String s4 = s3.nextLine();
		
		switch (s4)
		{
			case "1" : ref4.PUNJAB_KINGS();
			break;
		}
	}
}
	
class Sam_Curran extends all_rounder4
{
	
	String Name = "Sam_Curran";
	String Nationality = "Overseas";
	private int Price = 0;
	public int getPrice()
	{
		return Price;
	}
	public void setPrice(int price)
	{
		this.Price=price;
	}
	public static void all_round()
	{
		Sam_Curran ref1 = new Sam_Curran();
		System.out.println("=================================");
		System.out.println("Name        : " + ref1.Name);
		System.out.println("Nationality : " + ref1.Nationality);
		ref1.setPrice(160000000);
		System.out.println("price Paid  : " + ref1.getPrice());
		System.out.println("=================================");
	}
}


class Rishi_Dhawan extends all_rounder4
{
	
	String Name = "Rishi_Dhawan";
	String Nationality = "Indian";
	private int Price = 0;
	public int getPrice()
	{
		return Price;
	}
	public void setPrice(int price)
	{
		this.Price=price;
	}
	public static void all_round()
	{
		Rishi_Dhawan ref1 = new Rishi_Dhawan();
		System.out.println("=================================");
		System.out.println("Name        : " + ref1.Name);
		System.out.println("Nationality : " + ref1.Nationality);
		ref1.setPrice(80000000);
		System.out.println("price Paid  : " + ref1.getPrice());
		System.out.println("=================================");
	}
}


class RAJASTHAN_ROYALS extends group_a
{
	public void RAJASTHAN_ROYALS()
	{
		System.out.println("=========================");
		System.out.println("enter 1 for batsman");
		System.out.println("enter 2 for bowler");
		System.out.println("enter 3 for all_rounder");
		System.out.println("enter 4 for back_menu");
		System.out.println("=========================");
		
		RAJASTHAN_ROYALS ref1 = new batsman5();
		batsman5 ref2 = (batsman5) ref1;			
		
		RAJASTHAN_ROYALS ref3 = new bowler5();
		bowler5 ref4 = (bowler5) ref3;
		
		RAJASTHAN_ROYALS ref5 = new all_rounder5();
		all_rounder5 ref6 = (all_rounder5) ref5;		
		
		Teams ref7 = new group_a(); 
		group_a ref8 = (group_a)ref7; 
		
		Scanner s1 = new Scanner(System.in);
		String s2 = s1.nextLine();
		
		switch (s2)
		{
			case "1" : ref2.batsman5();
			break;
			case "2" : ref4.bowler5();
			break;
			case "3" : ref6.all_rounder5(); 				
			break;								
			case "4" : ref8.group_a();
			break;										             	
			default: System.out.println("invalid input");
			RAJASTHAN_ROYALS();
		}
	}
}

class batsman5 extends RAJASTHAN_ROYALS
{
	public void batsman5()
	{
	System.out.println("=================================");
	System.out.println("enter 1 for Jos_Buttler");
	System.out.println("enter 2 for Yashasvi_Jaiswal");
	System.out.println("enter 3 for Sanju_Samson");
	System.out.println("enter 4 for Devdutt_Padikkal");
	System.out.println("enter 5 for Shimron_Hetmyer");
	System.out.println("enter 6 for back_menu");
	System.out.println("=================================");
	
	Jos_Buttler ref1 = new Jos_Buttler();
	Yashasvi_Jaiswal ref2 = new Yashasvi_Jaiswal();
	Sanju_Samson ref3 = new Sanju_Samson();
	Devdutt_Padikkal ref4 = new Devdutt_Padikkal();
	Shimron_Hetmyer ref5 = new Shimron_Hetmyer();
	group_a ref6 = new RAJASTHAN_ROYALS(); 
	RAJASTHAN_ROYALS ref7 = (RAJASTHAN_ROYALS)ref6;
	
		
	Scanner s1 = new Scanner(System.in);
	String s2 = s1.nextLine();
	
	switch (s2)
		{
			case "1" : ref1.bat();
			break;
			case "2" : ref2.bat();
			break;
			case "3" : ref3.bat();
			break;
			case "4" : ref4.bat();
			break;
			case "5" : ref5.bat();
			break;
			case "6" : ref7.RAJASTHAN_ROYALS();
			break;
			default: System.out.println("invalid input");
			batsman5();
		}
	
	System.out.println("enter 1 for back_menu");
	
	Scanner s3 = new Scanner(System.in);
	String s4 = s3.nextLine();
	
	switch (s4)
	{
		case "1" : ref7.RAJASTHAN_ROYALS();
		break;
	}
	
	}
}
	
class Jos_Buttler extends batsman5
{
	
	String Name = "Jos_Buttler";
	String Nationality = "Overseas";
	private int Price = 0;
	public int getPrice()
	{
		return Price;
	}
	public void setPrice(int price)
	{
		this.Price=price;
	}
	public static void bat()
	{
		Jos_Buttler ref1 = new Jos_Buttler();
		System.out.println("=================================");
		System.out.println("Name        : " + ref1.Name);
		System.out.println("Nationality : " + ref1.Nationality);
		ref1.setPrice(160000000);
		System.out.println("price Paid  : " + ref1.getPrice());
		System.out.println("=================================");
	}
}


class Yashasvi_Jaiswal extends batsman5
{
	
	String Name = "Yashasvi_Jaiswal";
	String Nationality = "Indian";
	private int Price = 0;
	public int getPrice()
	{
		return Price;
	}
	public void setPrice(int price)
	{
		this.Price=price;
	}
	public static void bat()
	{
		Yashasvi_Jaiswal ref1 = new Yashasvi_Jaiswal();
		System.out.println("=================================");
		System.out.println("Name        : " + ref1.Name);
		System.out.println("Nationality : " + ref1.Nationality);
		ref1.setPrice(80000000);
		System.out.println("price Paid  : " + ref1.getPrice());
		System.out.println("=================================");
	}
}

class Sanju_Samson extends batsman5
{
	
	String Name = "Sanju_Samson";
	String Nationality = "Indian";
	private int Price = 0;
	public int getPrice()
	{
		return Price;
	}
	public void setPrice(int price)
	{
		this.Price=price;
	}
	public static void bat()
	{
		Sanju_Samson ref1 = new Sanju_Samson();
		System.out.println("=================================");
		System.out.println("Name        : " + ref1.Name);
		System.out.println("Nationality : " + ref1.Nationality);
		ref1.setPrice(150000000);
		System.out.println("price Paid  : " + ref1.getPrice());
		System.out.println("=================================");
	}
}

class Devdutt_Padikkal extends batsman5
{
	
	String Name = "Devdutt_Padikkal";
	String Nationality = "Indian";
	private int Price = 0;
	public int getPrice()
	{
		return Price;
	}
	public void setPrice(int price)
	{
		this.Price=price;
	}
	public static void bat()
	{
		Devdutt_Padikkal ref1 = new Devdutt_Padikkal();
		System.out.println("=================================");
		System.out.println("Name        : " + ref1.Name);
		System.out.println("Nationality : " + ref1.Nationality);
		ref1.setPrice(20000000);
		System.out.println("price Paid  : " + ref1.getPrice());
		System.out.println("=================================");
	}
}

class Shimron_Hetmyer extends batsman5
{
	
	String Name = "Shimron_Hetmyer";
	String Nationality = "Overseas";
	private int Price = 0;
	public int getPrice()
	{
		return Price;
	}
	public void setPrice(int price)
	{
		this.Price=price;
	}
	public static void bat()
	{
		Shimron_Hetmyer ref1 = new Shimron_Hetmyer();
		System.out.println("=================================");
		System.out.println("Name        : " + ref1.Name);
		System.out.println("Nationality : " + ref1.Nationality);
		ref1.setPrice(20000000);
		System.out.println("price Paid  : " + ref1.getPrice());
		System.out.println("=================================");
	}
}


class bowler5 extends RAJASTHAN_ROYALS
{
	public void bowler5()
	{
	System.out.println("=================================");
	System.out.println("enter 1 for R_Ashwin");
	System.out.println("enter 2 for Navdeep_Saini");
	System.out.println("enter 3 for Yuzvendra_Chahal");
	System.out.println("enter 4 for Trent_Boult");
	System.out.println("enter 5 for back_menu");
	System.out.println("=================================");
	
	R_Ashwin ref1 = new R_Ashwin();
	Navdeep_Saini ref2 = new Navdeep_Saini();
	Yuzvendra_Chahal ref3 = new Yuzvendra_Chahal();
	Trent_Boult ref4 = new Trent_Boult();
	group_a ref5 = new RAJASTHAN_ROYALS(); 
	RAJASTHAN_ROYALS ref6 = (RAJASTHAN_ROYALS)ref5;
	
		
	Scanner s1 = new Scanner(System.in);
	String s2 = s1.nextLine();
	
	switch (s2)
		{
			case "1" : ref1.bowl();
			break;
			case "2" : ref2.bowl();
			break;
			case "3" : ref3.bowl();
			break;
			case "4" : ref4.bowl();
			break;
			case "5" : ref6.RAJASTHAN_ROYALS();
			break;
			default: System.out.println("invalid input");
			bowler5();
		}
	
	System.out.println("enter 1 for back_menu");
	
	Scanner s3 = new Scanner(System.in);
	String s4 = s3.nextLine();
	
	switch (s4)
	{
		case "1" : ref6.RAJASTHAN_ROYALS();
		break;
	}
	
	}
}
	
class R_Ashwin extends bowler5
{
	
	String Name = "R_Ashwin";
	String Nationality = "Indian";
	private int Price = 0;
	public int getPrice()
	{
		return Price;
	}
	public void setPrice(int price)
	{
		this.Price=price;
	}
	public static void bowl()
	{
		R_Ashwin ref1 = new R_Ashwin();
		System.out.println("=================================");
		System.out.println("Name        : " + ref1.Name);
		System.out.println("Nationality : " + ref1.Nationality);
		ref1.setPrice(160000000);
		System.out.println("price Paid  : " + ref1.getPrice());
		System.out.println("=================================");
	}
}


class Navdeep_Saini extends bowler5
{
	
	String Name = "Navdeep_Saini";
	String Nationality = "Indian";
	private int Price = 0;
	public int getPrice()
	{
		return Price;
	}
	public void setPrice(int price)
	{
		this.Price=price;
	}
	public static void bowl()
	{
		Navdeep_Saini ref1 = new Navdeep_Saini();
		System.out.println("=================================");
		System.out.println("Name        : " + ref1.Name);
		System.out.println("Nationality : " + ref1.Nationality);
		ref1.setPrice(80000000);
		System.out.println("price Paid  : " + ref1.getPrice());
		System.out.println("=================================");
	}
}

class Yuzvendra_Chahal extends bowler5
{
	
	String Name = "Yuzvendra_Chahal";
	String Nationality = "Indian";
	private int Price = 0;
	public int getPrice()
	{
		return Price;
	}
	public void setPrice(int price)
	{
		this.Price=price;
	}
	public static void bowl()
	{
		Yuzvendra_Chahal ref1 = new Yuzvendra_Chahal();
		System.out.println("=================================");
		System.out.println("Name        : " + ref1.Name);
		System.out.println("Nationality : " + ref1.Nationality);
		ref1.setPrice(150000000);
		System.out.println("price Paid  : " + ref1.getPrice());
		System.out.println("=================================");
	}
}

class Trent_Boult extends bowler5
{
	
	String Name = "Trent_Boult";
	String Nationality = "Overseas";
	private int Price = 0;
	public int getPrice()
	{
		return Price;
	}
	public void setPrice(int price)
	{
		this.Price=price;
	}
	public static void bowl()
	{
		Trent_Boult ref1 = new Trent_Boult();
		System.out.println("=================================");
		System.out.println("Name        : " + ref1.Name);
		System.out.println("Nationality : " + ref1.Nationality);
		ref1.setPrice(20000000);
		System.out.println("price Paid  : " + ref1.getPrice());
		System.out.println("=================================");
	}
}



class all_rounder5 extends RAJASTHAN_ROYALS
{
	public void all_rounder5()
	{
	System.out.println("=================================");
	System.out.println("enter 1 for Donovan_Ferreira");
	System.out.println("enter 2 for Adam_Zampa");
	System.out.println("enter 3 for back_menu");
	System.out.println("=================================");
	
	Donovan_Ferreira ref1 = new Donovan_Ferreira();
	Adam_Zampa ref2 = new Adam_Zampa();
	group_a ref3 = new RAJASTHAN_ROYALS(); 
	RAJASTHAN_ROYALS ref4 = (RAJASTHAN_ROYALS)ref3;
	
		
	Scanner s1 = new Scanner(System.in);
	String s2 = s1.nextLine();
	
	switch (s2)
		{
			case "1" : ref1.all_round();
			break;
			case "2" : ref2.all_round();
			break;
			case "3" : ref4.RAJASTHAN_ROYALS();
			break;
			default: System.out.println("invalid input");
			all_rounder5();
		}
	
	System.out.println("enter 1 for back_menu");
	
	Scanner s3 = new Scanner(System.in);
	String s4 = s3.nextLine();
	
	switch (s4)
	{
		case "1" : ref4.RAJASTHAN_ROYALS();
		break;
	}
	
	}
}
	
class Donovan_Ferreira extends all_rounder5
{
	
	String Name = "Donovan_Ferreira";
	String Nationality = "Overseas";
	private int Price = 0;
	public int getPrice()
	{
		return Price;
	}
	public void setPrice(int price)
	{
		this.Price=price;
	}
	public static void all_round()
	{
		Donovan_Ferreira ref1 = new Donovan_Ferreira();
		System.out.println("=================================");
		System.out.println("Name        : " + ref1.Name);
		System.out.println("Nationality : " + ref1.Nationality);
		ref1.setPrice(160000000);
		System.out.println("price Paid  : " + ref1.getPrice());
		System.out.println("=================================");
	}
}


class Adam_Zampa extends all_rounder5
{
	
	String Name = "Adam_Zampa";
	String Nationality = "Overseas";
	private int Price = 0;
	public int getPrice()
	{
		return Price;
	}
	public void setPrice(int price)
	{
		this.Price=price;
	}
	public static void all_round()
	{
		Adam_Zampa ref1 = new Adam_Zampa();
		System.out.println("=================================");
		System.out.println("Name        : " + ref1.Name);
		System.out.println("Nationality : " + ref1.Nationality);
		ref1.setPrice(80000000);
		System.out.println("price Paid  : " + ref1.getPrice());
		System.out.println("=================================");
	}
}



class group_b extends Teams 
{
	public void group_b()
	{
		System.out.println("=================================");
		System.out.println("group_b");
		System.out.println("                                 ");
		System.out.println("enter 1 for CHENNAI_SUPER_KINGS");
		System.out.println("enter 2 for ROYAL_CHALLENGERS_BANGALORE");
		System.out.println("enter 3 for KOLKATA_KNIGHT_RIDERS");
		System.out.println("enter 4 for LUCKNOW_SUPER_GIANTS");
		System.out.println("enter 5 for SUNRISERS_HYDERABAD");
		System.out.println("enter 6 for back_menu");
		System.out.println("                                 ");
		System.out.println("=================================");
				
		group_b ref1 = new CHENNAI_SUPER_KINGS();
		CHENNAI_SUPER_KINGS ref2 = (CHENNAI_SUPER_KINGS) ref1;
		
		group_b ref3 = new ROYAL_CHALLENGERS_BANGALORE();
		ROYAL_CHALLENGERS_BANGALORE ref4 = (ROYAL_CHALLENGERS_BANGALORE) ref3;
		
		group_b ref5 = new KOLKATA_KNIGHT_RIDERS();
		KOLKATA_KNIGHT_RIDERS ref6 = (KOLKATA_KNIGHT_RIDERS) ref5;
		
		group_b ref7 = new LUCKNOW_SUPER_GIANTS();
		LUCKNOW_SUPER_GIANTS ref8 = (LUCKNOW_SUPER_GIANTS) ref7;
		
		group_b ref9 = new SUNRISERS_HYDERABAD();
		SUNRISERS_HYDERABAD ref10 = (SUNRISERS_HYDERABAD) ref9;                     
		
		Criconn ref11 = new Teams(); 
		Teams ref12 = (Teams)ref11; 
		
		Scanner s1 = new Scanner(System.in);
		String s2 = s1.nextLine();
		
		switch (s2)
		{
			case "1" : ref2.CHENNAI_SUPER_KINGS();
			break;
			case "2" : ref4.ROYAL_CHALLENGERS_BANGALORE();
			break;
			case "3" : ref6.KOLKATA_KNIGHT_RIDERS();
			break;
			case "4" : ref8.LUCKNOW_SUPER_GIANTS();
			break;
			case "5" : ref10.SUNRISERS_HYDERABAD();          
			break;											
			case "6" : ref12.Teams();
			break;										             	
			default: System.out.println("invalid input");
			group_b();
		}		
		
	}
	
}



class CHENNAI_SUPER_KINGS extends group_b
{
	public void CHENNAI_SUPER_KINGS()
	{
		System.out.println("=========================");
		System.out.println("enter 1 for batsman");
		System.out.println("enter 2 for bowler");
		System.out.println("enter 3 for all_rounder");
		System.out.println("enter 4 for back_menu");
		System.out.println("=========================");
		
		CHENNAI_SUPER_KINGS ref1 = new batsman6();
		batsman6 ref2 = (batsman6) ref1;			
		
		CHENNAI_SUPER_KINGS ref3 = new bowler6();
		bowler6 ref4 = (bowler6) ref3;
		
		CHENNAI_SUPER_KINGS ref5 = new all_rounder6();
		all_rounder6 ref6 = (all_rounder6) ref5;		
		
		Teams ref7 = new group_b(); 
		group_b ref8 = (group_b)ref7; 
		
		Scanner s1 = new Scanner(System.in);
		String s2 = s1.nextLine();
		
		switch (s2)
		{
			case "1" : ref2.batsman6();
			break;
			case "2" : ref4.bowler6();
			break;
			case "3" : ref6.all_rounder6(); 				
			break;								
			case "4" : ref8.group_b();
			break;										             	
			default: System.out.println("invalid input");
			CHENNAI_SUPER_KINGS();
		}
	}
}

class batsman6 extends CHENNAI_SUPER_KINGS
{
	public void batsman6()
	{
	System.out.println("=================================");
	System.out.println("enter 1 for Devon_Conway");
	System.out.println("enter 2 for Ruturaj_Gaikwad");
	System.out.println("enter 3 for Shivam_Dube");
	System.out.println("enter 4 for Ambati_Rayudu");
	System.out.println("enter 5 for Ben_Stokes");
	System.out.println("enter 6 for back_menu");
	System.out.println("=================================");
	
	Devon_Conway ref1 = new Devon_Conway();
	Ruturaj_Gaikwad ref2 = new Ruturaj_Gaikwad();
	Shivam_Dube ref3 = new Shivam_Dube();
	Ambati_Rayudu ref4 = new Ambati_Rayudu();
	Ben_Stokes ref5 = new Ben_Stokes();
	group_b ref6 = new CHENNAI_SUPER_KINGS(); 
	CHENNAI_SUPER_KINGS ref7 = (CHENNAI_SUPER_KINGS)ref6;
	
		
	Scanner s1 = new Scanner(System.in);
	String s2 = s1.nextLine();
	
	switch (s2)
		{
			case "1" : ref1.bat();
			break;
			case "2" : ref2.bat();
			break;
			case "3" : ref3.bat();
			break;
			case "4" : ref4.bat();
			break;
			case "5" : ref5.bat();
			break;
			case "6" : ref7.CHENNAI_SUPER_KINGS();
			break;
			default: System.out.println("invalid input");
			batsman6();
		}
	
	System.out.println("enter 1 for back_menu");
	
	Scanner s3 = new Scanner(System.in);
	String s4 = s3.nextLine();
	
	switch (s4)
	{
		case "1" : ref7.CHENNAI_SUPER_KINGS();
		break;
	}
	
	}
}
	
class Devon_Conway extends batsman6
{
	
	String Name = "Devon_Conway";
	String Nationality = "Overseas";
	private int Price = 0;
	public int getPrice()
	{
		return Price;
	}
	public void setPrice(int price)
	{
		this.Price=price;
	}
	public static void bat()
	{
		Devon_Conway ref1 = new Devon_Conway();
		System.out.println("=================================");
		System.out.println("Name        : " + ref1.Name);
		System.out.println("Nationality : " + ref1.Nationality);
		ref1.setPrice(160000000);
		System.out.println("price Paid  : " + ref1.getPrice());
		System.out.println("=================================");
	}
}


class Ruturaj_Gaikwad extends batsman6
{
	
	String Name = "Ruturaj_Gaikwad";
	String Nationality = "Indian";
	private int Price = 0;
	public int getPrice()
	{
		return Price;
	}
	public void setPrice(int price)
	{
		this.Price=price;
	}
	public static void bat()
	{
		Ruturaj_Gaikwad ref1 = new Ruturaj_Gaikwad();
		System.out.println("=================================");
		System.out.println("Name        : " + ref1.Name);
		System.out.println("Nationality : " + ref1.Nationality);
		ref1.setPrice(80000000);
		System.out.println("price Paid  : " + ref1.getPrice());
		System.out.println("=================================");
	}
}

class Shivam_Dube extends batsman6
{
	
	String Name = "Shivam_Dube";
	String Nationality = "Indian";
	private int Price = 0;
	public int getPrice()
	{
		return Price;
	}
	public void setPrice(int price)
	{
		this.Price=price;
	}
	public static void bat()
	{
		Shivam_Dube ref1 = new Shivam_Dube();
		System.out.println("=================================");
		System.out.println("Name        : " + ref1.Name);
		System.out.println("Nationality : " + ref1.Nationality);
		ref1.setPrice(150000000);
		System.out.println("price Paid  : " + ref1.getPrice());
		System.out.println("=================================");
	}
}

class Ambati_Rayudu extends batsman6
{
	
	String Name = "Ambati_Rayudu";
	String Nationality = "Indian";
	private int Price = 0;
	public int getPrice()
	{
		return Price;
	}
	public void setPrice(int price)
	{
		this.Price=price;
	}
	public static void bat()
	{
		Ambati_Rayudu ref1 = new Ambati_Rayudu();
		System.out.println("=================================");
		System.out.println("Name        : " + ref1.Name);
		System.out.println("Nationality : " + ref1.Nationality);
		ref1.setPrice(20000000);
		System.out.println("price Paid  : " + ref1.getPrice());
		System.out.println("=================================");
	}
}

class Ben_Stokes extends batsman6
{
	
	String Name = "Ben_Stokes";
	String Nationality = "Overseas";
	private int Price = 0;
	public int getPrice()
	{
		return Price;
	}
	public void setPrice(int price)
	{
		this.Price=price;
	}
	public static void bat()
	{
		Ben_Stokes ref1 = new Ben_Stokes();
		System.out.println("=================================");
		System.out.println("Name        : " + ref1.Name);
		System.out.println("Nationality : " + ref1.Nationality);
		ref1.setPrice(20000000);
		System.out.println("price Paid  : " + ref1.getPrice());
		System.out.println("=================================");
	}
}


class bowler6 extends CHENNAI_SUPER_KINGS
{
	public void bowler6()
	{
	System.out.println("=================================");
	System.out.println("enter 1 for Deepak_Chahar");
	System.out.println("enter 2 for Mukesh_Choudhary");
	System.out.println("enter 3 for Kyle_Jamieson");
	System.out.println("enter 4 for Maheesh_Theekshana");
	System.out.println("enter 5 for back_menu");
	System.out.println("=================================");
	
	Deepak_Chahar ref1 = new Deepak_Chahar();
	Mukesh_Choudhary ref2 = new Mukesh_Choudhary();
	Kyle_Jamieson ref3 = new Kyle_Jamieson();
	Maheesh_Theekshana ref4 = new Maheesh_Theekshana();
	group_b ref5 = new CHENNAI_SUPER_KINGS(); 
	CHENNAI_SUPER_KINGS ref6 = (CHENNAI_SUPER_KINGS)ref5;
	
		
	Scanner s1 = new Scanner(System.in);
	String s2 = s1.nextLine();
	
	switch (s2)
		{
			case "1" : ref1.bowl();
			break;
			case "2" : ref2.bowl();
			break;
			case "3" : ref3.bowl();
			break;
			case "4" : ref4.bowl();
			break;
			case "5" : ref6.CHENNAI_SUPER_KINGS();
			break;
			default: System.out.println("invalid input");
			bowler6();
		}
	
	System.out.println("enter 1 for back_menu");
	
	Scanner s3 = new Scanner(System.in);
	String s4 = s3.nextLine();
	
	switch (s4)
	{
		case "1" : ref6.CHENNAI_SUPER_KINGS();
		break;
	}
	
	}
}
	
class Deepak_Chahar extends bowler6
{
	
	String Name = "Deepak_Chahar";
	String Nationality = "Indian";
	private int Price = 0;
	public int getPrice()
	{
		return Price;
	}
	public void setPrice(int price)
	{
		this.Price=price;
	}
	public static void bowl()
	{
		Deepak_Chahar ref1 = new Deepak_Chahar();
		System.out.println("=================================");
		System.out.println("Name        : " + ref1.Name);
		System.out.println("Nationality : " + ref1.Nationality);
		ref1.setPrice(160000000);
		System.out.println("price Paid  : " + ref1.getPrice());
		System.out.println("=================================");
	}
}


class Mukesh_Choudhary extends bowler6
{
	
	String Name = "Mukesh_Choudhary";
	String Nationality = "Indian";
	private int Price = 0;
	public int getPrice()
	{
		return Price;
	}
	public void setPrice(int price)
	{
		this.Price=price;
	}
	public static void bowl()
	{
		Mukesh_Choudhary ref1 = new Mukesh_Choudhary();
		System.out.println("=================================");
		System.out.println("Name        : " + ref1.Name);
		System.out.println("Nationality : " + ref1.Nationality);
		ref1.setPrice(80000000);
		System.out.println("price Paid  : " + ref1.getPrice());
		System.out.println("=================================");
	}
}

class Kyle_Jamieson extends bowler6
{
	
	String Name = "Kyle_Jamieson";
	String Nationality = "Overseas";
	private int Price = 0;
	public int getPrice()
	{
		return Price;
	}
	public void setPrice(int price)
	{
		this.Price=price;
	}
	public static void bowl()
	{
		Kyle_Jamieson ref1 = new Kyle_Jamieson();
		System.out.println("=================================");
		System.out.println("Name        : " + ref1.Name);
		System.out.println("Nationality : " + ref1.Nationality);
		ref1.setPrice(150000000);
		System.out.println("price Paid  : " + ref1.getPrice());
		System.out.println("=================================");
	}
}

class Maheesh_Theekshana extends bowler6
{
	
	String Name = "Maheesh_Theekshana";
	String Nationality = "Overseas";
	private int Price = 0;
	public int getPrice()
	{
		return Price;
	}
	public void setPrice(int price)
	{
		this.Price=price;
	}
	public static void bowl()
	{
		Maheesh_Theekshana ref1 = new Maheesh_Theekshana();
		System.out.println("=================================");
		System.out.println("Name        : " + ref1.Name);
		System.out.println("Nationality : " + ref1.Nationality);
		ref1.setPrice(20000000);
		System.out.println("price Paid  : " + ref1.getPrice());
		System.out.println("=================================");
	}
}



class all_rounder6 extends CHENNAI_SUPER_KINGS
{
	public void all_rounder6()
	{
	System.out.println("=================================");
	System.out.println("enter 1 for MS_Dhoni");
	System.out.println("enter 2 for Ravindra_Jadeja");
	System.out.println("enter 3 for back_menu");
	System.out.println("=================================");
	
	MS_Dhoni ref1 = new MS_Dhoni();
	Ravindra_Jadeja ref2 = new Ravindra_Jadeja();
	group_b ref3 = new CHENNAI_SUPER_KINGS(); 
	CHENNAI_SUPER_KINGS ref4 = (CHENNAI_SUPER_KINGS)ref3;
	
		
	Scanner s1 = new Scanner(System.in);
	String s2 = s1.nextLine();
	
	switch (s2)
		{
			case "1" : ref1.all_round();
			break;
			case "2" : ref2.all_round();
			break;
			case "3" : ref4.CHENNAI_SUPER_KINGS();
			break;
			default: System.out.println("invalid input");
			all_rounder6();
		}
	
	System.out.println("enter 1 for back_menu");
	
	Scanner s3 = new Scanner(System.in);
	String s4 = s3.nextLine();
	
	switch (s4)
	{
		case "1" : ref4.CHENNAI_SUPER_KINGS();
		break;
	}
	
	}
}
	
class MS_Dhoni extends all_rounder6
{
	
	String Name = "MS_Dhoni";
	String Nationality = "Indian";
	private int Price = 0;
	public int getPrice()
	{
		return Price;
	}
	public void setPrice(int price)
	{
		this.Price=price;
	}
	public static void all_round()
	{
		MS_Dhoni ref1 = new MS_Dhoni();
		System.out.println("=================================");
		System.out.println("Name        : " + ref1.Name);
		System.out.println("Nationality : " + ref1.Nationality);
		ref1.setPrice(160000000);
		System.out.println("price Paid  : " + ref1.getPrice());
		System.out.println("=================================");
	}
}


class Ravindra_Jadeja extends all_rounder6
{
	
	String Name = "Ravindra_Jadeja";
	String Nationality = "Indian";
	private int Price = 0;
	public int getPrice()
	{
		return Price;
	}
	public void setPrice(int price)
	{
		this.Price=price;
	}
	public static void all_round()
	{
		Ravindra_Jadeja ref1 = new Ravindra_Jadeja();
		System.out.println("=================================");
		System.out.println("Name        : " + ref1.Name);
		System.out.println("Nationality : " + ref1.Nationality);
		ref1.setPrice(80000000);
		System.out.println("price Paid  : " + ref1.getPrice());
		System.out.println("=================================");
	}
}



class ROYAL_CHALLENGERS_BANGALORE extends group_b
{
	public void ROYAL_CHALLENGERS_BANGALORE()
	{
		System.out.println("=========================");
		System.out.println("enter 1 for batsman");
		System.out.println("enter 2 for bowler");
		System.out.println("enter 3 for all_rounder");
		System.out.println("enter 4 for back_menu");
		System.out.println("=========================");
		
		ROYAL_CHALLENGERS_BANGALORE ref1 = new batsman7();
		batsman7 ref2 = (batsman7) ref1;			
		
		ROYAL_CHALLENGERS_BANGALORE ref3 = new bowler7();
		bowler7 ref4 = (bowler7) ref3;
		
		ROYAL_CHALLENGERS_BANGALORE ref5 = new all_rounder7();
		all_rounder7 ref6 = (all_rounder7) ref5;		
		
		Teams ref7 = new group_b(); 
		group_b ref8 = (group_b)ref7; 
		
		Scanner s1 = new Scanner(System.in);
		String s2 = s1.nextLine();
		
		switch (s2)
		{
			case "1" : ref2.batsman7();
			break;
			case "2" : ref4.bowler7();
			break;
			case "3" : ref6.all_rounder7(); 				
			break;								
			case "4" : ref8.group_b();
			break;										             	
			default: System.out.println("invalid input");
			ROYAL_CHALLENGERS_BANGALORE();
		}
	}
}

class batsman7 extends ROYAL_CHALLENGERS_BANGALORE
{
	public void batsman7()
	{
	System.out.println("=================================");
	System.out.println("enter 1 for Faf_du_Plessis");
	System.out.println("enter 2 for Virat_Kohli");
	System.out.println("enter 3 for Rajat_Patidar");
	System.out.println("enter 4 for Mahipal_Lomror");
	System.out.println("enter 5 for Glenn_Maxwell");
	System.out.println("enter 6 for back_menu");
	System.out.println("=================================");
	
	Faf_du_Plessis ref1 = new Faf_du_Plessis();
	Virat_Kohli ref2 = new Virat_Kohli();
	Rajat_Patidar ref3 = new Rajat_Patidar();
	Mahipal_Lomror ref4 = new Mahipal_Lomror();
	Glenn_Maxwell ref5 = new Glenn_Maxwell();
	group_b ref6 = new ROYAL_CHALLENGERS_BANGALORE(); 
	ROYAL_CHALLENGERS_BANGALORE ref7 = (ROYAL_CHALLENGERS_BANGALORE)ref6;
	
		
	Scanner s1 = new Scanner(System.in);
	String s2 = s1.nextLine();
	
	switch (s2)
		{
			case "1" : ref1.bat();
			break;
			case "2" : ref2.bat();
			break;
			case "3" : ref3.bat();
			break;
			case "4" : ref4.bat();
			break;
			case "5" : ref5.bat();
			break;
			case "6" : ref7.ROYAL_CHALLENGERS_BANGALORE();
			break;
			default: System.out.println("invalid input");
			batsman7();
		}
	
	System.out.println("enter 1 for back_menu");
	
	Scanner s3 = new Scanner(System.in);
	String s4 = s3.nextLine();
	
	switch (s4)
	{
		case "1" : ref7.ROYAL_CHALLENGERS_BANGALORE();
		break;
	}
	
	}
}
	
class Faf_du_Plessis extends batsman7
{
	
	String Name = "Faf_du_Plessis";
	String Nationality = "Overseas";
	private int Price = 0;
	public int getPrice()
	{
		return Price;
	}
	public void setPrice(int price)
	{
		this.Price=price;
	}
	public static void bat()
	{
		Faf_du_Plessis ref1 = new Faf_du_Plessis();
		System.out.println("=================================");
		System.out.println("Name        : " + ref1.Name);
		System.out.println("Nationality : " + ref1.Nationality);
		ref1.setPrice(160000000);
		System.out.println("price Paid  : " + ref1.getPrice());
		System.out.println("=================================");
	}
}


class Virat_Kohli extends batsman7
{
	
	String Name = "Virat_Kohli";
	String Nationality = "Indian";
	private int Price = 0;
	public int getPrice()
	{
		return Price;
	}
	public void setPrice(int price)
	{
		this.Price=price;
	}
	public static void bat()
	{
		Virat_Kohli ref1 = new Virat_Kohli();
		System.out.println("=================================");
		System.out.println("Name        : " + ref1.Name);
		System.out.println("Nationality : " + ref1.Nationality);
		ref1.setPrice(80000000);
		System.out.println("price Paid  : " + ref1.getPrice());
		System.out.println("=================================");
	}
}

class Rajat_Patidar extends batsman7
{
	
	String Name = "Rajat_Patidar";
	String Nationality = "Indian";
	private int Price = 0;
	public int getPrice()
	{
		return Price;
	}
	public void setPrice(int price)
	{
		this.Price=price;
	}
	public static void bat()
	{
		Rajat_Patidar ref1 = new Rajat_Patidar();
		System.out.println("=================================");
		System.out.println("Name        : " + ref1.Name);
		System.out.println("Nationality : " + ref1.Nationality);
		ref1.setPrice(150000000);
		System.out.println("price Paid  : " + ref1.getPrice());
		System.out.println("=================================");
	}
}

class Mahipal_Lomror extends batsman7
{
	
	String Name = "Mahipal_Lomror";
	String Nationality = "Indian";
	private int Price = 0;
	public int getPrice()
	{
		return Price;
	}
	public void setPrice(int price)
	{
		this.Price=price;
	}
	public static void bat()
	{
		Mahipal_Lomror ref1 = new Mahipal_Lomror();
		System.out.println("=================================");
		System.out.println("Name        : " + ref1.Name);
		System.out.println("Nationality : " + ref1.Nationality);
		ref1.setPrice(20000000);
		System.out.println("price Paid  : " + ref1.getPrice());
		System.out.println("=================================");
	}
}

class Glenn_Maxwell extends batsman7
{
	
	String Name = "Glenn_Maxwell";
	String Nationality = "Overseas";
	private int Price = 0;
	public int getPrice()
	{
		return Price;
	}
	public void setPrice(int price)
	{
		this.Price=price;
	}
	public static void bat()
	{
		Glenn_Maxwell ref1 = new Glenn_Maxwell();
		System.out.println("=================================");
		System.out.println("Name        : " + ref1.Name);
		System.out.println("Nationality : " + ref1.Nationality);
		ref1.setPrice(20000000);
		System.out.println("price Paid  : " + ref1.getPrice());
		System.out.println("=================================");
	}
}


class bowler7 extends ROYAL_CHALLENGERS_BANGALORE
{
	public void bowler7()
	{
	System.out.println("=================================");
	System.out.println("enter 1 for Shahbaz_Ahmed");
	System.out.println("enter 2 for Harshal_Patel");
	System.out.println("enter 3 for Josh_Hazlewood");
	System.out.println("enter 4 for Mohammed_Siraj");
	System.out.println("enter 5 for back_menu");
	System.out.println("=================================");
	
	Shahbaz_Ahmed ref1 = new Shahbaz_Ahmed();
	Harshal_Patel ref2 = new Harshal_Patel();
	Josh_Hazlewood ref3 = new Josh_Hazlewood();
	Mohammed_Siraj ref4 = new Mohammed_Siraj();
	group_b ref5 = new ROYAL_CHALLENGERS_BANGALORE(); 
	ROYAL_CHALLENGERS_BANGALORE ref6 = (ROYAL_CHALLENGERS_BANGALORE)ref5;
	
		
	Scanner s1 = new Scanner(System.in);
	String s2 = s1.nextLine();
	
	switch (s2)
		{
			case "1" : ref1.bowl();
			break;
			case "2" : ref2.bowl();
			break;
			case "3" : ref3.bowl();
			break;
			case "4" : ref4.bowl();
			break;
			case "5" : ref6.ROYAL_CHALLENGERS_BANGALORE();
			break;
			default: System.out.println("invalid input");
			bowler7();
		}
	
	System.out.println("enter 1 for back_menu");
	
	Scanner s3 = new Scanner(System.in);
	String s4 = s3.nextLine();
	
	switch (s4)
	{
		case "1" : ref6.ROYAL_CHALLENGERS_BANGALORE();
		break;
	}
	
	}
}
	
class Shahbaz_Ahmed extends bowler7
{
	
	String Name = "Shahbaz_Ahmed";
	String Nationality = "Indian";
	private int Price = 0;
	public int getPrice()
	{
		return Price;
	}
	public void setPrice(int price)
	{
		this.Price=price;
	}
	public static void bowl()
	{
		Shahbaz_Ahmed ref1 = new Shahbaz_Ahmed();
		System.out.println("=================================");
		System.out.println("Name        : " + ref1.Name);
		System.out.println("Nationality : " + ref1.Nationality);
		ref1.setPrice(160000000);
		System.out.println("price Paid  : " + ref1.getPrice());
		System.out.println("=================================");
	}
}


class Harshal_Patel extends bowler7
{
	
	String Name = "Harshal_Patel";
	String Nationality = "Indian";
	private int Price = 0;
	public int getPrice()
	{
		return Price;
	}
	public void setPrice(int price)
	{
		this.Price=price;
	}
	public static void bowl()
	{
		Harshal_Patel ref1 = new Harshal_Patel();
		System.out.println("=================================");
		System.out.println("Name        : " + ref1.Name);
		System.out.println("Nationality : " + ref1.Nationality);
		ref1.setPrice(80000000);
		System.out.println("price Paid  : " + ref1.getPrice());
		System.out.println("=================================");
	}
}

class Josh_Hazlewood extends bowler7
{
	
	String Name = "Josh_Hazlewood";
	String Nationality = "Overseas";
	private int Price = 0;
	public int getPrice()
	{
		return Price;
	}
	public void setPrice(int price)
	{
		this.Price=price;
	}
	public static void bowl()
	{
		Josh_Hazlewood ref1 = new Josh_Hazlewood();
		System.out.println("=================================");
		System.out.println("Name        : " + ref1.Name);
		System.out.println("Nationality : " + ref1.Nationality);
		ref1.setPrice(150000000);
		System.out.println("price Paid  : " + ref1.getPrice());
		System.out.println("=================================");
	}
}

class Mohammed_Siraj extends bowler7
{
	
	String Name = "Mohammed_Siraj";
	String Nationality = "Indian";
	private int Price = 0;
	public int getPrice()
	{
		return Price;
	}
	public void setPrice(int price)
	{
		this.Price=price;
	}
	public static void bowl()
	{
		Mohammed_Siraj ref1 = new Mohammed_Siraj();
		System.out.println("=================================");
		System.out.println("Name        : " + ref1.Name);
		System.out.println("Nationality : " + ref1.Nationality);
		ref1.setPrice(20000000);
		System.out.println("price Paid  : " + ref1.getPrice());
		System.out.println("=================================");
	}
}



class all_rounder7 extends ROYAL_CHALLENGERS_BANGALORE
{
	public void all_rounder7()
	{
	System.out.println("=================================");
	System.out.println("enter 1 for Dinesh_Karthik");
	System.out.println("enter 2 for Wanindu_Hasaranga");
	System.out.println("enter 3 for back_menu");
	System.out.println("=================================");
	
	Dinesh_Karthik ref1 = new Dinesh_Karthik();
	Wanindu_Hasaranga ref2 = new Wanindu_Hasaranga();
	group_b ref3 = new ROYAL_CHALLENGERS_BANGALORE(); 
	ROYAL_CHALLENGERS_BANGALORE ref4 = (ROYAL_CHALLENGERS_BANGALORE)ref3;
	
		
	Scanner s1 = new Scanner(System.in);
	String s2 = s1.nextLine();
	
	switch (s2)
		{
			case "1" : ref1.all_round();
			break;
			case "2" : ref2.all_round();
			break;
			case "3" : ref4.ROYAL_CHALLENGERS_BANGALORE();
			break;
			default: System.out.println("invalid input");
			all_rounder7();
		}
	
	System.out.println("enter 1 for back_menu");
	
	Scanner s3 = new Scanner(System.in);
	String s4 = s3.nextLine();
	
	switch (s4)
	{
		case "1" : ref4.ROYAL_CHALLENGERS_BANGALORE();
		break;
	}
	
	}
}
	
class Dinesh_Karthik extends all_rounder7
{
	
	String Name = "Dinesh_Karthik";
	String Nationality = "Indian";
	private int Price = 0;
	public int getPrice()
	{
		return Price;
	}
	public void setPrice(int price)
	{
		this.Price=price;
	}
	public static void all_round()
	{
		Dinesh_Karthik ref1 = new Dinesh_Karthik();
		System.out.println("=================================");
		System.out.println("Name        : " + ref1.Name);
		System.out.println("Nationality : " + ref1.Nationality);
		ref1.setPrice(160000000);
		System.out.println("price Paid  : " + ref1.getPrice());
		System.out.println("=================================");
	}
}


class Wanindu_Hasaranga extends all_rounder7
{
	
	String Name = "Wanindu_Hasaranga";
	String Nationality = "Overseas";
	private int Price = 0;
	public int getPrice()
	{
		return Price;
	}
	public void setPrice(int price)
	{
		this.Price=price;
	}
	public static void all_round()
	{
		Wanindu_Hasaranga ref1 = new Wanindu_Hasaranga();
		System.out.println("=================================");
		System.out.println("Name        : " + ref1.Name);
		System.out.println("Nationality : " + ref1.Nationality);
		ref1.setPrice(80000000);
		System.out.println("price Paid  : " + ref1.getPrice());
		System.out.println("=================================");
	}
}




class KOLKATA_KNIGHT_RIDERS extends group_b
{
	public void KOLKATA_KNIGHT_RIDERS()
	{
		System.out.println("=========================");
		System.out.println("enter 1 for batsman");
		System.out.println("enter 2 for bowler");
		System.out.println("enter 3 for all_rounder");
		System.out.println("enter 4 for back_menu");
		System.out.println("=========================");
		
		KOLKATA_KNIGHT_RIDERS ref1 = new batsman8();
		batsman8 ref2 = (batsman8) ref1;			
		
		KOLKATA_KNIGHT_RIDERS ref3 = new bowler8();
		bowler8 ref4 = (bowler8) ref3;
		
		KOLKATA_KNIGHT_RIDERS ref5 = new all_rounder8();
		all_rounder8 ref6 = (all_rounder8) ref5;		
		
		Teams ref7 = new group_b(); 
		group_b ref8 = (group_b)ref7; 
		
		Scanner s1 = new Scanner(System.in);
		String s2 = s1.nextLine();
		
		switch (s2)
		{
			case "1" : ref2.batsman8();
			break;
			case "2" : ref4.bowler8();
			break;
			case "3" : ref6.all_rounder8(); 				
			break;								
			case "4" : ref8.group_b();
			break;										             	
			default: System.out.println("invalid input");
			KOLKATA_KNIGHT_RIDERS();
		}
	}
}

class batsman8 extends KOLKATA_KNIGHT_RIDERS
{
	public void batsman8()
	{
	System.out.println("=================================");
	System.out.println("enter 1 for Rahmanullah_Gurbaz");
	System.out.println("enter 2 for Venkatesh_Iyer");
	System.out.println("enter 3 for Shreyas_Iyer");
	System.out.println("enter 4 for Nitish_Rana");
	System.out.println("enter 5 for Rinku_Singh");
	System.out.println("enter 6 for back_menu");
	System.out.println("=================================");
	
	Rahmanullah_Gurbaz ref1 = new Rahmanullah_Gurbaz();
	Venkatesh_Iyer ref2 = new Venkatesh_Iyer();
	Shreyas_Iyer ref3 = new Shreyas_Iyer();
	Nitish_Rana ref4 = new Nitish_Rana();
	Rinku_Singh ref5 = new Rinku_Singh();
	group_b ref6 = new KOLKATA_KNIGHT_RIDERS(); 
	KOLKATA_KNIGHT_RIDERS ref7 = (KOLKATA_KNIGHT_RIDERS)ref6;
	
		
	Scanner s1 = new Scanner(System.in);
	String s2 = s1.nextLine();
	
	switch (s2)
		{
			case "1" : ref1.bat();
			break;
			case "2" : ref2.bat();
			break;
			case "3" : ref3.bat();
			break;
			case "4" : ref4.bat();
			break;
			case "5" : ref5.bat();
			break;
			case "6" : ref7.KOLKATA_KNIGHT_RIDERS();
			break;
			default: System.out.println("invalid input");
			batsman8();
		}
	
	System.out.println("enter 1 for back_menu");
	
	Scanner s3 = new Scanner(System.in);
	String s4 = s3.nextLine();
	
	switch (s4)
	{
		case "1" : ref7.KOLKATA_KNIGHT_RIDERS();
		break;
	}
	
	}
}
	
class Rahmanullah_Gurbaz extends batsman8
{
	
	String Name = "Rahmanullah_Gurbaz";
	String Nationality = "Overseas";
	private int Price = 0;
	public int getPrice()
	{
		return Price;
	}
	public void setPrice(int price)
	{
		this.Price=price;
	}
	public static void bat()
	{
		Rahmanullah_Gurbaz ref1 = new Rahmanullah_Gurbaz();
		System.out.println("=================================");
		System.out.println("Name        : " + ref1.Name);
		System.out.println("Nationality : " + ref1.Nationality);
		ref1.setPrice(160000000);
		System.out.println("price Paid  : " + ref1.getPrice());
		System.out.println("=================================");
	}
}


class Venkatesh_Iyer extends batsman8
{
	
	String Name = "Venkatesh_Iyer";
	String Nationality = "Indian";
	private int Price = 0;
	public int getPrice()
	{
		return Price;
	}
	public void setPrice(int price)
	{
		this.Price=price;
	}
	public static void bat()
	{
		Venkatesh_Iyer ref1 = new Venkatesh_Iyer();
		System.out.println("=================================");
		System.out.println("Name        : " + ref1.Name);
		System.out.println("Nationality : " + ref1.Nationality);
		ref1.setPrice(80000000);
		System.out.println("price Paid  : " + ref1.getPrice());
		System.out.println("=================================");
	}
}

class Shreyas_Iyer extends batsman8
{
	
	String Name = "Shreyas_Iyer";
	String Nationality = "Indian";
	private int Price = 0;
	public int getPrice()
	{
		return Price;
	}
	public void setPrice(int price)
	{
		this.Price=price;
	}
	public static void bat()
	{
		Shreyas_Iyer ref1 = new Shreyas_Iyer();
		System.out.println("=================================");
		System.out.println("Name        : " + ref1.Name);
		System.out.println("Nationality : " + ref1.Nationality);
		ref1.setPrice(150000000);
		System.out.println("price Paid  : " + ref1.getPrice());
		System.out.println("=================================");
	}
}

class Nitish_Rana extends batsman8
{
	
	String Name = "Nitish_Rana";
	String Nationality = "Indian";
	private int Price = 0;
	public int getPrice()
	{
		return Price;
	}
	public void setPrice(int price)
	{
		this.Price=price;
	}
	public static void bat()
	{
		Nitish_Rana ref1 = new Nitish_Rana();
		System.out.println("=================================");
		System.out.println("Name        : " + ref1.Name);
		System.out.println("Nationality : " + ref1.Nationality);
		ref1.setPrice(20000000);
		System.out.println("price Paid  : " + ref1.getPrice());
		System.out.println("=================================");
	}
}

class Rinku_Singh extends batsman8
{
	
	String Name = "Rinku_Singh";
	String Nationality = "Indian";
	private int Price = 0;
	public int getPrice()
	{
		return Price;
	}
	public void setPrice(int price)
	{
		this.Price=price;
	}
	public static void bat()
	{
		Rinku_Singh ref1 = new Rinku_Singh();
		System.out.println("=================================");
		System.out.println("Name        : " + ref1.Name);
		System.out.println("Nationality : " + ref1.Nationality);
		ref1.setPrice(20000000);
		System.out.println("price Paid  : " + ref1.getPrice());
		System.out.println("=================================");
	}
}


class bowler8 extends KOLKATA_KNIGHT_RIDERS
{
	public void bowler8()
	{
	System.out.println("=================================");
	System.out.println("enter 1 for Umesh_Yadav");
	System.out.println("enter 2 for Varun_Chakravarthy");
	System.out.println("enter 3 for Lockie_Ferguson");
	System.out.println("enter 4 for Shardul_Thakur");
	System.out.println("enter 5 for back_menu");
	System.out.println("=================================");
	
	Umesh_Yadav ref1 = new Umesh_Yadav();
	Varun_Chakravarthy ref2 = new Varun_Chakravarthy();
	Lockie_Ferguson ref3 = new Lockie_Ferguson();
	Shardul_Thakur ref4 = new Shardul_Thakur();
	group_b ref5 = new KOLKATA_KNIGHT_RIDERS(); 
	KOLKATA_KNIGHT_RIDERS ref6 = (KOLKATA_KNIGHT_RIDERS)ref5;
	
		
	Scanner s1 = new Scanner(System.in);
	String s2 = s1.nextLine();
	
	switch (s2)
		{
			case "1" : ref1.bowl();
			break;
			case "2" : ref2.bowl();
			break;
			case "3" : ref3.bowl();
			break;
			case "4" : ref4.bowl();
			break;
			case "5" : ref6.KOLKATA_KNIGHT_RIDERS();
			break;
			default: System.out.println("invalid input");
			bowler8();
		}
	
	System.out.println("enter 1 for back_menu");
	
	Scanner s3 = new Scanner(System.in);
	String s4 = s3.nextLine();
	
	switch (s4)
	{
		case "1" : ref6.KOLKATA_KNIGHT_RIDERS();
		break;
	}
	
	}
}
	
class Umesh_Yadav extends bowler8
{
	
	String Name = "Umesh_Yadav";
	String Nationality = "Indian";
	private int Price = 0;
	public int getPrice()
	{
		return Price;
	}
	public void setPrice(int price)
	{
		this.Price=price;
	}
	public static void bowl()
	{
		Umesh_Yadav ref1 = new Umesh_Yadav();
		System.out.println("=================================");
		System.out.println("Name        : " + ref1.Name);
		System.out.println("Nationality : " + ref1.Nationality);
		ref1.setPrice(160000000);
		System.out.println("price Paid  : " + ref1.getPrice());
		System.out.println("=================================");
	}
}


class Varun_Chakravarthy extends bowler8
{
	
	String Name = "Varun_Chakravarthy";
	String Nationality = "Indian";
	private int Price = 0;
	public int getPrice()
	{
		return Price;
	}
	public void setPrice(int price)
	{
		this.Price=price;
	}
	public static void bowl()
	{
		Varun_Chakravarthy ref1 = new Varun_Chakravarthy();
		System.out.println("=================================");
		System.out.println("Name        : " + ref1.Name);
		System.out.println("Nationality : " + ref1.Nationality);
		ref1.setPrice(80000000);
		System.out.println("price Paid  : " + ref1.getPrice());
		System.out.println("=================================");
	}
}

class Lockie_Ferguson extends bowler8
{
	
	String Name = "Lockie_Ferguson";
	String Nationality = "Overseas";
	private int Price = 0;
	public int getPrice()
	{
		return Price;
	}
	public void setPrice(int price)
	{
		this.Price=price;
	}
	public static void bowl()
	{
		Lockie_Ferguson ref1 = new Lockie_Ferguson();
		System.out.println("=================================");
		System.out.println("Name        : " + ref1.Name);
		System.out.println("Nationality : " + ref1.Nationality);
		ref1.setPrice(150000000);
		System.out.println("price Paid  : " + ref1.getPrice());
		System.out.println("=================================");
	}
}

class Shardul_Thakur extends bowler8
{
	
	String Name = "Shardul_Thakur";
	String Nationality = "Indian";
	private int Price = 0;
	public int getPrice()
	{
		return Price;
	}
	public void setPrice(int price)
	{
		this.Price=price;
	}
	public static void bowl()
	{
		Shardul_Thakur ref1 = new Shardul_Thakur();
		System.out.println("=================================");
		System.out.println("Name        : " + ref1.Name);
		System.out.println("Nationality : " + ref1.Nationality);
		ref1.setPrice(20000000);
		System.out.println("price Paid  : " + ref1.getPrice());
		System.out.println("=================================");
	}
}



class all_rounder8 extends KOLKATA_KNIGHT_RIDERS
{
	public void all_rounder8()
	{
	System.out.println("=================================");
	System.out.println("enter 1 for Andre_Russell");
	System.out.println("enter 2 for Sunil_Narine");
	System.out.println("enter 3 for back_menu");
	System.out.println("=================================");
	
	Andre_Russell ref1 = new Andre_Russell();
	Sunil_Narine ref2 = new Sunil_Narine();
	group_b ref3 = new KOLKATA_KNIGHT_RIDERS(); 
	KOLKATA_KNIGHT_RIDERS ref4 = (KOLKATA_KNIGHT_RIDERS)ref3;
	
		
	Scanner s1 = new Scanner(System.in);
	String s2 = s1.nextLine();
	
	switch (s2)
		{
			case "1" : ref1.all_round();
			break;
			case "2" : ref2.all_round();
			break;
			case "3" : ref4.KOLKATA_KNIGHT_RIDERS();
			break;
			default: System.out.println("invalid input");
			all_rounder8();
		}
	
	System.out.println("enter 1 for back_menu");
	
	Scanner s3 = new Scanner(System.in);
	String s4 = s3.nextLine();
	
	switch (s4)
	{
		case "1" : ref4.KOLKATA_KNIGHT_RIDERS();
		break;
	}
	
	}
}
	
class Andre_Russell extends all_rounder8
{
	
	String Name = "Andre_Russell";
	String Nationality = "Overseas";
	private int Price = 0;
	public int getPrice()
	{
		return Price;
	}
	public void setPrice(int price)
	{
		this.Price=price;
	}
	public static void all_round()
	{
		Andre_Russell ref1 = new Andre_Russell();
		System.out.println("=================================");
		System.out.println("Name        : " + ref1.Name);
		System.out.println("Nationality : " + ref1.Nationality);
		ref1.setPrice(160000000);
		System.out.println("price Paid  : " + ref1.getPrice());
		System.out.println("=================================");
	}
}


class Sunil_Narine extends all_rounder8
{
	
	String Name = "Sunil_Narine";
	String Nationality = "Overseas";
	private int Price = 0;
	public int getPrice()
	{
		return Price;
	}
	public void setPrice(int price)
	{
		this.Price=price;
	}
	public static void all_round()
	{
		Sunil_Narine ref1 = new Sunil_Narine();
		System.out.println("=================================");
		System.out.println("Name        : " + ref1.Name);
		System.out.println("Nationality : " + ref1.Nationality);
		ref1.setPrice(80000000);
		System.out.println("price Paid  : " + ref1.getPrice());
		System.out.println("=================================");
	}
}




class LUCKNOW_SUPER_GIANTS extends group_b
{
	public void LUCKNOW_SUPER_GIANTS()
	{
		System.out.println("=========================");
		System.out.println("enter 1 for batsman");
		System.out.println("enter 2 for bowler");
		System.out.println("enter 3 for all_rounder");
		System.out.println("enter 4 for back_menu");
		System.out.println("=========================");
		
		LUCKNOW_SUPER_GIANTS ref1 = new batsman9();
		batsman9 ref2 = (batsman9) ref1;			
		
		LUCKNOW_SUPER_GIANTS ref3 = new bowler9();
		bowler9 ref4 = (bowler9) ref3;
		
		LUCKNOW_SUPER_GIANTS ref5 = new all_rounder9();
		all_rounder9 ref6 = (all_rounder9) ref5;		
		
		Teams ref7 = new group_b(); 
		group_b ref8 = (group_b)ref7; 
		
		Scanner s1 = new Scanner(System.in);
		String s2 = s1.nextLine();
		
		switch (s2)
		{
			case "1" : ref2.batsman9();
			break;
			case "2" : ref4.bowler9();
			break;
			case "3" : ref6.all_rounder9(); 				
			break;								
			case "4" : ref8.group_b();
			break;										             	
			default: System.out.println("invalid input");
			LUCKNOW_SUPER_GIANTS();
		}
	}
}

class batsman9 extends LUCKNOW_SUPER_GIANTS
{
	public void batsman9()
	{
	System.out.println("=================================");
	System.out.println("enter 1 for Quinton_de_Kock");
	System.out.println("enter 2 for KL_Rahul");
	System.out.println("enter 3 for Deepak_Hooda");
	System.out.println("enter 4 for Nicholas_Pooran");
	System.out.println("enter 5 for Ayush_Badoni");
	System.out.println("enter 6 for back_menu");
	System.out.println("=================================");
	
	Quinton_de_Kock ref1 = new Quinton_de_Kock();
	KL_Rahul ref2 = new KL_Rahul();
	Deepak_Hooda ref3 = new Deepak_Hooda();
	Nicholas_Pooran ref4 = new Nicholas_Pooran();
	Ayush_Badoni ref5 = new Ayush_Badoni();
	group_b ref6 = new LUCKNOW_SUPER_GIANTS(); 
	LUCKNOW_SUPER_GIANTS ref7 = (LUCKNOW_SUPER_GIANTS)ref6;
	
		
	Scanner s1 = new Scanner(System.in);
	String s2 = s1.nextLine();
	
	switch (s2)
		{
			case "1" : ref1.bat();
			break;
			case "2" : ref2.bat();
			break;
			case "3" : ref3.bat();
			break;
			case "4" : ref4.bat();
			break;
			case "5" : ref5.bat();
			break;
			case "6" : ref7.LUCKNOW_SUPER_GIANTS();
			break;
			default: System.out.println("invalid input");
			batsman9();
		}
	
	System.out.println("enter 1 for back_menu");
	
	Scanner s3 = new Scanner(System.in);
	String s4 = s3.nextLine();
	
	switch (s4)
	{
		case "1" : ref7.LUCKNOW_SUPER_GIANTS();
		break;
	}
	
	}
}
	
class Quinton_de_Kock extends batsman9
{
	
	String Name = "Quinton_de_Kock";
	String Nationality = "Overseas";
	private int Price = 0;
	public int getPrice()
	{
		return Price;
	}
	public void setPrice(int price)
	{
		this.Price=price;
	}
	public static void bat()
	{
		Quinton_de_Kock ref1 = new Quinton_de_Kock();
		System.out.println("=================================");
		System.out.println("Name        : " + ref1.Name);
		System.out.println("Nationality : " + ref1.Nationality);
		ref1.setPrice(160000000);
		System.out.println("price Paid  : " + ref1.getPrice());
		System.out.println("=================================");
	}
}


class KL_Rahul extends batsman9
{
	
	String Name = "KL_Rahul";
	String Nationality = "Indian";
	private int Price = 0;
	public int getPrice()
	{
		return Price;
	}
	public void setPrice(int price)
	{
		this.Price=price;
	}
	public static void bat()
	{
		KL_Rahul ref1 = new KL_Rahul();
		System.out.println("=================================");
		System.out.println("Name        : " + ref1.Name);
		System.out.println("Nationality : " + ref1.Nationality);
		ref1.setPrice(80000000);
		System.out.println("price Paid  : " + ref1.getPrice());
		System.out.println("=================================");
	}
}

class Deepak_Hooda extends batsman9
{
	
	String Name = "Deepak_Hooda";
	String Nationality = "Indian";
	private int Price = 0;
	public int getPrice()
	{
		return Price;
	}
	public void setPrice(int price)
	{
		this.Price=price;
	}
	public static void bat()
	{
		Deepak_Hooda ref1 = new Deepak_Hooda();
		System.out.println("=================================");
		System.out.println("Name        : " + ref1.Name);
		System.out.println("Nationality : " + ref1.Nationality);
		ref1.setPrice(150000000);
		System.out.println("price Paid  : " + ref1.getPrice());
		System.out.println("=================================");
	}
}

class Nicholas_Pooran extends batsman9
{
	
	String Name = "Nicholas_Pooran";
	String Nationality = "Overseas";
	private int Price = 0;
	public int getPrice()
	{
		return Price;
	}
	public void setPrice(int price)
	{
		this.Price=price;
	}
	public static void bat()
	{
		Nicholas_Pooran ref1 = new Nicholas_Pooran();
		System.out.println("=================================");
		System.out.println("Name        : " + ref1.Name);
		System.out.println("Nationality : " + ref1.Nationality);
		ref1.setPrice(20000000);
		System.out.println("price Paid  : " + ref1.getPrice());
		System.out.println("=================================");
	}
}

class Ayush_Badoni extends batsman9
{
	
	String Name = "Ayush_Badoni";
	String Nationality = "Indian";
	private int Price = 0;
	public int getPrice()
	{
		return Price;
	}
	public void setPrice(int price)
	{
		this.Price=price;
	}
	public static void bat()
	{
		Ayush_Badoni ref1 = new Ayush_Badoni();
		System.out.println("=================================");
		System.out.println("Name        : " + ref1.Name);
		System.out.println("Nationality : " + ref1.Nationality);
		ref1.setPrice(20000000);
		System.out.println("price Paid  : " + ref1.getPrice());
		System.out.println("=================================");
	}
}


class bowler9 extends LUCKNOW_SUPER_GIANTS
{
	public void bowler9()
	{
	System.out.println("=================================");
	System.out.println("enter 1 for Ravi_Bishnoi");
	System.out.println("enter 2 for Avesh_Khan");
	System.out.println("enter 3 for Mark_Wood");
	System.out.println("enter 4 for Mohsin_Khan");
	System.out.println("enter 5 for back_menu");
	System.out.println("=================================");
	
	Ravi_Bishnoi ref1 = new Ravi_Bishnoi();
	Avesh_Khan ref2 = new Avesh_Khan();
	Mark_Wood ref3 = new Mark_Wood();
	Mohsin_Khan ref4 = new Mohsin_Khan();
	group_b ref5 = new LUCKNOW_SUPER_GIANTS(); 
	LUCKNOW_SUPER_GIANTS ref6 = (LUCKNOW_SUPER_GIANTS)ref5;
	
		
	Scanner s1 = new Scanner(System.in);
	String s2 = s1.nextLine();
	
	switch (s2)
		{
			case "1" : ref1.bowl();
			break;
			case "2" : ref2.bowl();
			break;
			case "3" : ref3.bowl();
			break;
			case "4" : ref4.bowl();
			break;
			case "5" : ref6.LUCKNOW_SUPER_GIANTS();
			break;
			default: System.out.println("invalid input");
			bowler9();
		}
	
	System.out.println("enter 1 for back_menu");
	
	Scanner s3 = new Scanner(System.in);
	String s4 = s3.nextLine();
	
	switch (s4)
	{
		case "1" : ref6.LUCKNOW_SUPER_GIANTS();
		break;
	}
	
	}
}
	
class Ravi_Bishnoi extends bowler9
{
	
	String Name = "Ravi_Bishnoi";
	String Nationality = "Indian";
	private int Price = 0;
	public int getPrice()
	{
		return Price;
	}
	public void setPrice(int price)
	{
		this.Price=price;
	}
	public static void bowl()
	{
		Ravi_Bishnoi ref1 = new Ravi_Bishnoi();
		System.out.println("=================================");
		System.out.println("Name        : " + ref1.Name);
		System.out.println("Nationality : " + ref1.Nationality);
		ref1.setPrice(160000000);
		System.out.println("price Paid  : " + ref1.getPrice());
		System.out.println("=================================");
	}
}


class Avesh_Khan extends bowler9
{
	
	String Name = "Avesh_Khan";
	String Nationality = "Indian";
	private int Price = 0;
	public int getPrice()
	{
		return Price;
	}
	public void setPrice(int price)
	{
		this.Price=price;
	}
	public static void bowl()
	{
		Avesh_Khan ref1 = new Avesh_Khan();
		System.out.println("=================================");
		System.out.println("Name        : " + ref1.Name);
		System.out.println("Nationality : " + ref1.Nationality);
		ref1.setPrice(80000000);
		System.out.println("price Paid  : " + ref1.getPrice());
		System.out.println("=================================");
	}
}

class Mark_Wood extends bowler9
{
	
	String Name = "Mark_Wood";
	String Nationality = "Overseas";
	private int Price = 0;
	public int getPrice()
	{
		return Price;
	}
	public void setPrice(int price)
	{
		this.Price=price;
	}
	public static void bowl()
	{
		Mark_Wood ref1 = new Mark_Wood();
		System.out.println("=================================");
		System.out.println("Name        : " + ref1.Name);
		System.out.println("Nationality : " + ref1.Nationality);
		ref1.setPrice(150000000);
		System.out.println("price Paid  : " + ref1.getPrice());
		System.out.println("=================================");
	}
}

class Mohsin_Khan extends bowler9
{
	
	String Name = "Mohsin_Khan";
	String Nationality = "Indian";
	private int Price = 0;
	public int getPrice()
	{
		return Price;
	}
	public void setPrice(int price)
	{
		this.Price=price;
	}
	public static void bowl()
	{
		Mohsin_Khan ref1 = new Mohsin_Khan();
		System.out.println("=================================");
		System.out.println("Name        : " + ref1.Name);
		System.out.println("Nationality : " + ref1.Nationality);
		ref1.setPrice(20000000);
		System.out.println("price Paid  : " + ref1.getPrice());
		System.out.println("=================================");
	}
}



class all_rounder9 extends LUCKNOW_SUPER_GIANTS
{
	public void all_rounder9()
	{
	System.out.println("=================================");
	System.out.println("enter 1 for Marcus_Stoinis");
	System.out.println("enter 2 for Krunal_Pandya");
	System.out.println("enter 3 for back_menu");
	System.out.println("=================================");
	
	Marcus_Stoinis ref1 = new Marcus_Stoinis();
	Krunal_Pandya ref2 = new Krunal_Pandya();
	group_b ref3 = new LUCKNOW_SUPER_GIANTS(); 
	LUCKNOW_SUPER_GIANTS ref4 = (LUCKNOW_SUPER_GIANTS)ref3;
	
		
	Scanner s1 = new Scanner(System.in);
	String s2 = s1.nextLine();
	
	switch (s2)
		{
			case "1" : ref1.all_round();
			break;
			case "2" : ref2.all_round();
			break;
			case "3" : ref4.LUCKNOW_SUPER_GIANTS();
			break;
			default: System.out.println("invalid input");
			all_rounder9();
		}
	
	System.out.println("enter 1 for back_menu");
	
	Scanner s3 = new Scanner(System.in);
	String s4 = s3.nextLine();
	
	switch (s4)
	{
		case "1" : ref4.LUCKNOW_SUPER_GIANTS();
		break;
	}
	
	}
}
	
class Marcus_Stoinis extends all_rounder9
{
	
	String Name = "Marcus_Stoinis";
	String Nationality = "Overseas";
	private int Price = 0;
	public int getPrice()
	{
		return Price;
	}
	public void setPrice(int price)
	{
		this.Price=price;
	}
	public static void all_round()
	{
		Marcus_Stoinis ref1 = new Marcus_Stoinis();
		System.out.println("=================================");
		System.out.println("Name        : " + ref1.Name);
		System.out.println("Nationality : " + ref1.Nationality);
		ref1.setPrice(160000000);
		System.out.println("price Paid  : " + ref1.getPrice());
		System.out.println("=================================");
	}
}


class Krunal_Pandya extends all_rounder9
{
	
	String Name = "Krunal_Pandya";
	String Nationality = "Indian";
	private int Price = 0;
	public int getPrice()
	{
		return Price;
	}
	public void setPrice(int price)
	{
		this.Price=price;
	}
	public static void all_round()
	{
		Krunal_Pandya ref1 = new Krunal_Pandya();
		System.out.println("=================================");
		System.out.println("Name        : " + ref1.Name);
		System.out.println("Nationality : " + ref1.Nationality);
		ref1.setPrice(80000000);
		System.out.println("price Paid  : " + ref1.getPrice());
		System.out.println("=================================");
	}
}


class SUNRISERS_HYDERABAD extends group_b
{
	public void SUNRISERS_HYDERABAD()
	{
		System.out.println("=========================");
		System.out.println("enter 1 for batsman");
		System.out.println("enter 2 for bowler");
		System.out.println("enter 3 for all_rounder");
		System.out.println("enter 4 for back_menu");
		System.out.println("=========================");
		
		SUNRISERS_HYDERABAD ref1 = new batsman10();
		batsman10 ref2 = (batsman10) ref1;			
		
		SUNRISERS_HYDERABAD ref3 = new bowler10();
		bowler10 ref4 = (bowler10) ref3;
		
		SUNRISERS_HYDERABAD ref5 = new all_rounder10();
		all_rounder10 ref6 = (all_rounder10) ref5;		
		
		Teams ref7 = new group_b(); 
		group_b ref8 = (group_b)ref7; 
		
		Scanner s1 = new Scanner(System.in);
		String s2 = s1.nextLine();
		
		switch (s2)
		{
			case "1" : ref2.batsman10();
			break;
			case "2" : ref4.bowler10();
			break;
			case "3" : ref6.all_rounder10(); 				
			break;								
			case "4" : ref8.group_b();
			break;										             	
			default: System.out.println("invalid input");
			SUNRISERS_HYDERABAD();
		}
	}
}

class batsman10 extends SUNRISERS_HYDERABAD
{
	public void batsman10()
	{
	System.out.println("=================================");
	System.out.println("enter 1 for Mayank_Agarwal");
	System.out.println("enter 2 for Abhishek_Sharma");
	System.out.println("enter 3 for Rahul_Tripathi");
	System.out.println("enter 4 for Aiden_Markram");
	System.out.println("enter 5 for Harry_Brook");
	System.out.println("enter 6 for back_menu");
	System.out.println("=================================");
	
	Mayank_Agarwal ref1 = new Mayank_Agarwal();
	Abhishek_Sharma ref2 = new Abhishek_Sharma();
	Rahul_Tripathi ref3 = new Rahul_Tripathi();
	Aiden_Markram ref4 = new Aiden_Markram();
	Harry_Brook ref5 = new Harry_Brook();
	group_b ref6 = new SUNRISERS_HYDERABAD(); 
	SUNRISERS_HYDERABAD ref7 = (SUNRISERS_HYDERABAD)ref6;
	
		
	Scanner s1 = new Scanner(System.in);
	String s2 = s1.nextLine();
	
	switch (s2)
		{
			case "1" : ref1.bat();
			break;
			case "2" : ref2.bat();
			break;
			case "3" : ref3.bat();
			break;
			case "4" : ref4.bat();
			break;
			case "5" : ref5.bat();
			break;
			case "6" : ref7.SUNRISERS_HYDERABAD();
			break;
			default: System.out.println("invalid input");
			batsman10();
		}
	
	System.out.println("enter 1 for back_menu");
	
	Scanner s3 = new Scanner(System.in);
	String s4 = s3.nextLine();
	
	switch (s4)
	{
		case "1" : ref7.SUNRISERS_HYDERABAD();
		break;
	}
	
	}
}
	
class Mayank_Agarwal extends batsman10
{
	
	String Name = "Mayank_Agarwal";
	String Nationality = "Indian";
	private int Price = 0;
	public int getPrice()
	{
		return Price;
	}
	public void setPrice(int price)
	{
		this.Price=price;
	}
	public static void bat()
	{
		Mayank_Agarwal ref1 = new Mayank_Agarwal();
		System.out.println("=================================");
		System.out.println("Name        : " + ref1.Name);
		System.out.println("Nationality : " + ref1.Nationality);
		ref1.setPrice(160000000);
		System.out.println("price Paid  : " + ref1.getPrice());
		System.out.println("=================================");
	}
}


class Abhishek_Sharma extends batsman10
{
	
	String Name = "Abhishek_Sharma";
	String Nationality = "Indian";
	private int Price = 0;
	public int getPrice()
	{
		return Price;
	}
	public void setPrice(int price)
	{
		this.Price=price;
	}
	public static void bat()
	{
		Abhishek_Sharma ref1 = new Abhishek_Sharma();
		System.out.println("=================================");
		System.out.println("Name        : " + ref1.Name);
		System.out.println("Nationality : " + ref1.Nationality);
		ref1.setPrice(80000000);
		System.out.println("price Paid  : " + ref1.getPrice());
		System.out.println("=================================");
	}
}

class Rahul_Tripathi extends batsman10
{
	
	String Name = "Rahul_Tripathi";
	String Nationality = "Indian";
	private int Price = 0;
	public int getPrice()
	{
		return Price;
	}
	public void setPrice(int price)
	{
		this.Price=price;
	}
	public static void bat()
	{
		Rahul_Tripathi ref1 = new Rahul_Tripathi();
		System.out.println("=================================");
		System.out.println("Name        : " + ref1.Name);
		System.out.println("Nationality : " + ref1.Nationality);
		ref1.setPrice(150000000);
		System.out.println("price Paid  : " + ref1.getPrice());
		System.out.println("=================================");
	}
}

class Aiden_Markram extends batsman10
{
	
	String Name = "Aiden_Markram";
	String Nationality = "Overseas";
	private int Price = 0;
	public int getPrice()
	{
		return Price;
	}
	public void setPrice(int price)
	{
		this.Price=price;
	}
	public static void bat()
	{
		Aiden_Markram ref1 = new Aiden_Markram();
		System.out.println("=================================");
		System.out.println("Name        : " + ref1.Name);
		System.out.println("Nationality : " + ref1.Nationality);
		ref1.setPrice(20000000);
		System.out.println("price Paid  : " + ref1.getPrice());
		System.out.println("=================================");
	}
}

class Harry_Brook extends batsman10
{
	
	String Name = "Harry_Brook";
	String Nationality = "Overseas";
	private int Price = 0;
	public int getPrice()
	{
		return Price;
	}
	public void setPrice(int price)
	{
		this.Price=price;
	}
	public static void bat()
	{
		Harry_Brook ref1 = new Harry_Brook();
		System.out.println("=================================");
		System.out.println("Name        : " + ref1.Name);
		System.out.println("Nationality : " + ref1.Nationality);
		ref1.setPrice(20000000);
		System.out.println("price Paid  : " + ref1.getPrice());
		System.out.println("=================================");
	}
}


class bowler10 extends SUNRISERS_HYDERABAD
{
	public void bowler10()
	{
	System.out.println("=================================");
	System.out.println("enter 1 for Bhuvneshwar_Kumar");
	System.out.println("enter 2 for Umran_Malik");
	System.out.println("enter 3 for Adil_Rashid");
	System.out.println("enter 4 for T_Natarajan");
	System.out.println("enter 5 for back_menu");
	System.out.println("=================================");
	
	Bhuvneshwar_Kumar ref1 = new Bhuvneshwar_Kumar();
	Umran_Malik ref2 = new Umran_Malik();
	Adil_Rashid ref3 = new Adil_Rashid();
	T_Natarajan ref4 = new T_Natarajan();
	group_b ref5 = new SUNRISERS_HYDERABAD(); 
	SUNRISERS_HYDERABAD ref6 = (SUNRISERS_HYDERABAD)ref5;
	
		
	Scanner s1 = new Scanner(System.in);
	String s2 = s1.nextLine();
	
	switch (s2)
		{
			case "1" : ref1.bowl();
			break;
			case "2" : ref2.bowl();
			break;
			case "3" : ref3.bowl();
			break;
			case "4" : ref4.bowl();
			break;
			case "5" : ref6.SUNRISERS_HYDERABAD();
			break;
			default: System.out.println("invalid input");
			bowler10();
		}
	
	System.out.println("enter 1 for back_menu");
	
	Scanner s3 = new Scanner(System.in);
	String s4 = s3.nextLine();
	
	switch (s4)
	{
		case "1" : ref6.SUNRISERS_HYDERABAD();
		break;
	}
	
	}
}
	
class Bhuvneshwar_Kumar extends bowler10
{
	
	String Name = "Bhuvneshwar_Kumar";
	String Nationality = "Indian";
	private int Price = 0;
	public int getPrice()
	{
		return Price;
	}
	public void setPrice(int price)
	{
		this.Price=price;
	}
	public static void bowl()
	{
		Bhuvneshwar_Kumar ref1 = new Bhuvneshwar_Kumar();
		System.out.println("=================================");
		System.out.println("Name        : " + ref1.Name);
		System.out.println("Nationality : " + ref1.Nationality);
		ref1.setPrice(160000000);
		System.out.println("price Paid  : " + ref1.getPrice());
		System.out.println("=================================");
	}
}


class Umran_Malik extends bowler10
{
	
	String Name = "Umran_Malik";
	String Nationality = "Indian";
	private int Price = 0;
	public int getPrice()
	{
		return Price;
	}
	public void setPrice(int price)
	{
		this.Price=price;
	}
	public static void bowl()
	{
		Umran_Malik ref1 = new Umran_Malik();
		System.out.println("=================================");
		System.out.println("Name        : " + ref1.Name);
		System.out.println("Nationality : " + ref1.Nationality);
		ref1.setPrice(80000000);
		System.out.println("price Paid  : " + ref1.getPrice());
		System.out.println("=================================");
	}
}

class Adil_Rashid extends bowler10
{
	
	String Name = "Adil_Rashid";
	String Nationality = "Overseas";
	private int Price = 0;
	public int getPrice()
	{
		return Price;
	}
	public void setPrice(int price)
	{
		this.Price=price;
	}
	public static void bowl()
	{
		Adil_Rashid ref1 = new Adil_Rashid();
		System.out.println("=================================");
		System.out.println("Name        : " + ref1.Name);
		System.out.println("Nationality : " + ref1.Nationality);
		ref1.setPrice(150000000);
		System.out.println("price Paid  : " + ref1.getPrice());
		System.out.println("=================================");
	}
}

class T_Natarajan extends bowler10
{
	
	String Name = "T_Natarajan";
	String Nationality = "Indian";
	private int Price = 0;
	public int getPrice()
	{
		return Price;
	}
	public void setPrice(int price)
	{
		this.Price=price;
	}
	public static void bowl()
	{
		T_Natarajan ref1 = new T_Natarajan();
		System.out.println("=================================");
		System.out.println("Name        : " + ref1.Name);
		System.out.println("Nationality : " + ref1.Nationality);
		ref1.setPrice(20000000);
		System.out.println("price Paid  : " + ref1.getPrice());
		System.out.println("=================================");
	}
}



class all_rounder10 extends SUNRISERS_HYDERABAD
{
	public void all_rounder10()
	{
	System.out.println("=================================");
	System.out.println("enter 1 for Glenn_Phillips");
	System.out.println("enter 2 for Washington_Sundar");
	System.out.println("enter 3 for back_menu");
	System.out.println("=================================");
	
	Glenn_Phillips ref1 = new Glenn_Phillips();
	Washington_Sundar ref2 = new Washington_Sundar();
	group_b ref3 = new SUNRISERS_HYDERABAD(); 
	SUNRISERS_HYDERABAD ref4 = (SUNRISERS_HYDERABAD)ref3;
	
		
	Scanner s1 = new Scanner(System.in);
	String s2 = s1.nextLine();
	
	switch (s2)
		{
			case "1" : ref1.all_round();
			break;
			case "2" : ref2.all_round();
			break;
			case "3" : ref4.SUNRISERS_HYDERABAD();
			break;
			default: System.out.println("invalid input");
			all_rounder10();
		}
	
	System.out.println("enter 1 for back_menu");
	
	Scanner s3 = new Scanner(System.in);
	String s4 = s3.nextLine();
	
	switch (s4)
	{
		case "1" : ref4.SUNRISERS_HYDERABAD();
		break;
	}
	
	}
}
	
class Glenn_Phillips extends all_rounder10
{
	
	String Name = "Glenn_Phillips";
	String Nationality = "Overseas";
	private int Price = 0;
	public int getPrice()
	{
		return Price;
	}
	public void setPrice(int price)
	{
		this.Price=price;
	}
	public static void all_round()
	{
		Glenn_Phillips ref1 = new Glenn_Phillips();
		System.out.println("=================================");
		System.out.println("Name        : " + ref1.Name);
		System.out.println("Nationality : " + ref1.Nationality);
		ref1.setPrice(160000000);
		System.out.println("price Paid  : " + ref1.getPrice());
		System.out.println("=================================");
	}
}


class Washington_Sundar extends all_rounder10
{
	
	String Name = "Washington_Sundar";
	String Nationality = "Indian";
	private int Price = 0;
	public int getPrice()
	{
		return Price;
	}
	public void setPrice(int price)
	{
		this.Price=price;
	}
	public static void all_round()
	{
		Washington_Sundar ref1 = new Washington_Sundar();
		System.out.println("=================================");
		System.out.println("Name        : " + ref1.Name);
		System.out.println("Nationality : " + ref1.Nationality);
		ref1.setPrice(80000000);
		System.out.println("price Paid  : " + ref1.getPrice());
		System.out.println("=================================");
	}
}


class fixtures extends Ipl
{
	public void book_ticket()
	{
			System.out.println("============================");
			System.out.println("                            ");
			System.out.println("Enter 1 for PLATINUM");
			System.out.println("Enter 2 for GOLD    ");
			System.out.println("Enter 3 for SILVER  ");
			System.out.println("                    ");
			System.out.println("Enter 4 for back_menu");
			System.out.println("                            ");
			System.out.println("============================");
						
			fixtures ref1 = new GT_vs_CSK();
			GT_vs_CSK ref2 = (GT_vs_CSK)ref1;
			
			Scanner sc = new Scanner(System.in);
			String a = sc.next();
			switch (a)
			{
			case "1" : 
				System.out.println("==============================");
			System.out.println("PLATINUM : 6000");
			payment();
			break;
			
			case "2" : 
				System.out.println("==============================");
			System.out.println("GOLD : 4000");
			payment();
			break;
			
			case "3" : 
				System.out.println("==============================");
			System.out.println("SILVER : 2000");
			payment();
			break;
			
			case "4" : ref2.GT_vs_CSK();
			break;
			
			default : System.out.println("Invalid Input");
			book_ticket();
			}
	}
			
	public void payment()
	{
		
		System.out.println("                                ");
		  System.out.println("Enter 1 for UPI");
		  System.out.println("Enter 2 for Debit Card");
		  System.out.println("                              ");
		  System.out.println("Enter 3 for back_menu");
		  System.out.println("                              ");
		  System.out.println("==============================");
		  
		  fixtures ref1 = new GT_vs_CSK();
		  GT_vs_CSK ref2 = (GT_vs_CSK)ref1;
		  
		  Scanner sc=new Scanner(System.in);
		  String b=sc.next();
		  
		  switch (b)
		  {
		  case "1": System.out.println("=======================");
		  			Scanner sc1=new Scanner(System.in);
		  			System.out.println("enter UPI number");
		  			long uno = sc1.nextLong();
		  			System.out.println("enter UPI pin");
		  			long upin = sc1.nextLong();
		  			System.out.println("                  ");
			  		System.out.println("Payment Successful");
		  			System.out.println("                  ");
		  			System.out.println("Thank You..!!");
		  			System.out.println("=======================");
		  break;
		  
		  case "2": System.out.println("=======================");
		  			Scanner sc2=new Scanner(System.in);
		  			System.out.println("enter Debit Card Number");
		  			long udc = sc2.nextLong();
		  			System.out.println("enter cvv");
		  			long ucvv = sc2.nextLong();
		  			System.out.println("                  ");
			  		System.out.println("Payment Successful");
					System.out.println("                  ");
					System.out.println("Thank You..!!");
					System.out.println("=======================");			
		  break;
		  
		  case "3": ref2.book_ticket();
		  break;
		  
		  default: System.out.println("Invalid Input");
		  payment();
		  }
		 
		  System.out.println("=======================");
		  System.out.println("                       ");
		  System.out.println("Enter 1 for back_menu"  );
		  System.out.println("                       ");
		  System.out.println("=======================");
		  
		  Scanner dc=new Scanner(System.in);
		  String d=sc.next();
		  
		  switch (d)
		  {
		  case "1" : payment();
		  }
	}
	
	public void fixtures() 
	{
		System.out.println("=================================");
		System.out.println("                                 ");
		System.out.println("enter 1 for GT_vs_CSK");
		System.out.println("enter 2 for PK_vs_KKR");
		System.out.println("enter 3 for LSG_vs_DC");
		System.out.println("enter 4 for SRH_vs_RR");
		System.out.println("enter 5 for RCB_vs_MI");
		System.out.println("enter 6 for CSK_vs_LSG");
		System.out.println("enter 7 for DC_vs_GT");
		System.out.println("enter 8 for RR_vs_PK");
		System.out.println("enter 9 for KKR_vs_RCB");
		System.out.println("enter 10 for LSG_vs_SRH");		
		System.out.println("                                 ");
		System.out.println("enter 11 for Back_Menu");
		System.out.println("                                 ");
		System.out.println("=================================");
		
		fixtures ref1 = new GT_vs_CSK();
		GT_vs_CSK ref2 = (GT_vs_CSK)ref1;
		
		fixtures ref3 = new PK_vs_KKR();
		PK_vs_KKR ref4 = (PK_vs_KKR)ref3;
		
		fixtures ref5 = new LSG_vs_DC();
		LSG_vs_DC ref6 = (LSG_vs_DC)ref5;
		
		fixtures ref7 = new SRH_vs_RR();
		SRH_vs_RR ref8 = (SRH_vs_RR)ref7;
		
		fixtures ref9 = new RCB_vs_MI();
		RCB_vs_MI ref10 = (RCB_vs_MI)ref9;
		
		fixtures ref11 = new CSK_vs_LSG();
		CSK_vs_LSG ref12 = (CSK_vs_LSG)ref11;
		
		fixtures ref13 = new DC_vs_GT();
		DC_vs_GT ref14 = (DC_vs_GT)ref13;
		
		fixtures ref15 = new RR_vs_PK();
		RR_vs_PK ref16 = (RR_vs_PK)ref15;
		
		fixtures ref17 = new KKR_vs_RCB();
		KKR_vs_RCB ref18 = (KKR_vs_RCB)ref17;
		
		fixtures ref19 = new LSG_vs_SRH();
		LSG_vs_SRH ref20 = (LSG_vs_SRH)ref19;
		
		Criconn ref21 = new Ipl();
		Ipl ref22 = (Ipl)ref21;
		
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
				
		switch (a)
		{
		case "1" : ref2.GT_vs_CSK();
		break;
		
		case "2" : ref4.PK_vs_KKR();
		break;
		
		case "3" : ref6.LSG_vs_DC();
		break;
		
		case "4" : ref8.SRH_vs_RR();
		break;
		
		case "5" : ref10.RCB_vs_MI();
		break;
		
		case "6" : ref12.CSK_vs_LSG();
		break;
		
		case "7" : ref14.DC_vs_GT();
		break;
		
		case "8" : ref16.RR_vs_PK();
		break;
		
		case "9" : ref18.KKR_vs_RCB();
		break;
		
		case "10" : ref20.LSG_vs_SRH();
		break;
		
		case "11" : ref22.Ipl();
		break;																
		default: System.out.println("invalid input");
		fixtures();
		}
		
	}	
}


class GT_vs_CSK extends fixtures
{
	public void GT_vs_CSK()
	{
		System.out.println("=================================");
		System.out.println("                                 ");
		System.out.println("enter 1 for match_info");
		System.out.println("enter 2 for book_ticket");
		System.out.println("                                 ");
		System.out.println("enter 3 for back_menu");
		System.out.println("                                 ");
		System.out.println("=================================");
		
		Ipl ref1 = new fixtures();
		fixtures ref2 = (fixtures)ref1;
		
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
				
		switch (a)
		{
		case "1" : 
		System.out.println("Gujarat Titans vs Chennai Super Kings");
		System.out.println("Date : Mar 31, Fri");
		System.out.println("Time : 7:30 PM");
		System.out.println("Location : Narendra Modi Stadium, Ahmedabad");
		break;

		case "2" : book_ticket();
		break;
		
		case "3" : ref2.fixtures();
		break;																
		default: System.out.println("Invalid Input");
		GT_vs_CSK();
		
		}
	}
		
}


class PK_vs_KKR extends fixtures
{
	public void PK_vs_KKR()
	{
		System.out.println("=================================");
		System.out.println("                                 ");
		System.out.println("enter 1 for match_info");
		System.out.println("enter 2 for book_ticket");
		System.out.println("                                 ");
		System.out.println("enter 3 for back_menu");
		System.out.println("                                 ");
		System.out.println("=================================");
		
		Ipl ref1 = new fixtures();
		fixtures ref2 = (fixtures)ref1;
		
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
				
		switch (a)
		{
		case "1" : 
		System.out.println("Punjab Kings vs Kolkata Knight Riders");
		System.out.println("Date : Apr 01, Sat");
		System.out.println("Time : 3:30 PM");
		System.out.println("Location : Punjab Cricket Association IS Bindra Stadium, Mohali");
		break;

		case "2" : book_ticket();
		break;
		
		case "3" : ref2.fixtures();
		break;																
		default: System.out.println("Invalid Input");
		PK_vs_KKR();
		
		}
	}
}

class LSG_vs_DC extends fixtures
{
	public void LSG_vs_DC()
	{
		System.out.println("=================================");
		System.out.println("                                 ");
		System.out.println("enter 1 for match_info");
		System.out.println("enter 2 for book_ticket");
		System.out.println("                                 ");
		System.out.println("enter 3 for back_menu");
		System.out.println("                                 ");
		System.out.println("=================================");
		
		Ipl ref1 = new fixtures();
		fixtures ref2 = (fixtures)ref1;
		
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
				
		switch (a)
		{
		case "1" : 
		System.out.println("Lucknow Super Giants vs Delhi Capitals");
		System.out.println("Date : Apr 1, Sat");
		System.out.println("Time : 7:30 PM");
		System.out.println("Location : Bharat Ratna Shri Atal Bihari Vajpayee Ekana Cricket Stadium, Lucknow");
		break;

		case "2" : book_ticket();
		break;
		
		case "3" : ref2.fixtures();
		break;																
		default: System.out.println("Invalid Input");
		LSG_vs_DC();
		
		}
	}
		
}


class SRH_vs_RR extends fixtures
{
	public void SRH_vs_RR()
	{
		System.out.println("=================================");
		System.out.println("                                 ");
		System.out.println("enter 1 for match_info");
		System.out.println("enter 2 for book_ticket");
		System.out.println("                                 ");
		System.out.println("enter 3 for back_menu");
		System.out.println("                                 ");
		System.out.println("=================================");
		
		Ipl ref1 = new fixtures();
		fixtures ref2 = (fixtures)ref1;
		
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
				
		switch (a)
		{
		case "1" : 
		System.out.println("Sunrisers Hyderabad vs Rajasthan Royals");
		System.out.println("Date : Apr 2, Sun");
		System.out.println("Time : 3:30 PM");
		System.out.println("Location : Rajiv Gandhi International Stadium, Hyderabad");
		break;

		case "2" : book_ticket();
		break;
		
		case "3" : ref2.fixtures();
		break;																
		default: System.out.println("Invalid Input");
		SRH_vs_RR();
		
		}
	}
		
}


class RCB_vs_MI extends fixtures
{
	public void RCB_vs_MI()
	{
		System.out.println("=================================");
		System.out.println("                                 ");
		System.out.println("enter 1 for match_info");
		System.out.println("enter 2 for book_ticket");
		System.out.println("                                 ");
		System.out.println("enter 3 for back_menu");
		System.out.println("                                 ");
		System.out.println("=================================");
		
		Ipl ref1 = new fixtures();
		fixtures ref2 = (fixtures)ref1;
		
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
				
		switch (a)
		{
		case "1" : 
		System.out.println("Royal Challengers Bangalore vs Mumbai Indians");
		System.out.println("Date : Apr 2, Sun");
		System.out.println("Time : 7:30 PM");
		System.out.println("Location : M.Chinnaswamy Stadium, Bengaluru");
		break;

		case "2" : book_ticket();
		break;
		
		case "3" : ref2.fixtures();
		break;																
		default: System.out.println("Invalid Input");
		RCB_vs_MI();
		
		}
	}		
}


class CSK_vs_LSG extends fixtures
{
	public void CSK_vs_LSG()
	{
		System.out.println("=================================");
		System.out.println("                                 ");
		System.out.println("enter 1 for match_info");
		System.out.println("enter 2 for book_ticket");
		System.out.println("                                 ");
		System.out.println("enter 3 for back_menu");
		System.out.println("                                 ");
		System.out.println("=================================");
		
		Ipl ref1 = new fixtures();
		fixtures ref2 = (fixtures)ref1;
		
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
				
		switch (a)
		{
		case "1" : 
		System.out.println("Chennai Super Kings vs Lucknow Super Giants");
		System.out.println("Date : Apr 3, Mon");
		System.out.println("Time : 7:30 PM");
		System.out.println("Location : MA Chidambaram Stadium, Chennai");
		break;

		case "2" : book_ticket();
		break;
		
		case "3" : ref2.fixtures();
		break;																
		default: System.out.println("Invalid Input");
		CSK_vs_LSG();
		
		}
	}		
}


class DC_vs_GT extends fixtures
{
	public void DC_vs_GT()
	{
		System.out.println("=================================");
		System.out.println("                                 ");
		System.out.println("enter 1 for match_info");
		System.out.println("enter 2 for book_ticket");
		System.out.println("                                 ");
		System.out.println("enter 3 for back_menu");
		System.out.println("                                 ");
		System.out.println("=================================");
		
		Ipl ref1 = new fixtures();
		fixtures ref2 = (fixtures)ref1;
		
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
				
		switch (a)
		{
		case "1" : 
		System.out.println("Delhi Capitals vs Gujarat Titans");
		System.out.println("Date : Apr 4, Tue");
		System.out.println("Time : 7:30 PM");
		System.out.println("Location : Arun Jaitley Stadium, Delhi ");
		break;

		case "2" : book_ticket();
		break;
		
		case "3" : ref2.fixtures();
		break;																
		default: System.out.println("Invalid Input");
		DC_vs_GT();
		
		}
	}		
}


class RR_vs_PK extends fixtures
{
	public void RR_vs_PK()
	{
		System.out.println("=================================");
		System.out.println("                                 ");
		System.out.println("enter 1 for match_info");
		System.out.println("enter 2 for book_ticket");
		System.out.println("                                 ");
		System.out.println("enter 3 for back_menu");
		System.out.println("                                 ");
		System.out.println("=================================");
		
		Ipl ref1 = new fixtures();
		fixtures ref2 = (fixtures)ref1;
		
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
				
		switch (a)
		{
		case "1" : 
		System.out.println("Rajasthan Royals vs Punjab Kings");
		System.out.println("Date : Apr 5, wed");
		System.out.println("Time : 7:30 PM");
		System.out.println("Location : Barsapara Cricket Stadium, Guwahati");
		break;

		case "2" : book_ticket();
		break;
		
		case "3" : ref2.fixtures();
		break;																
		default: System.out.println("Invalid Input");
		RR_vs_PK();
		
		}
	}		
}


class KKR_vs_RCB extends fixtures
{
	public void KKR_vs_RCB()
	{
		System.out.println("=================================");
		System.out.println("                                 ");
		System.out.println("enter 1 for match_info");
		System.out.println("enter 2 for book_ticket");
		System.out.println("                                 ");
		System.out.println("enter 3 for back_menu");
		System.out.println("                                 ");
		System.out.println("=================================");
		
		Ipl ref1 = new fixtures();
		fixtures ref2 = (fixtures)ref1;
		
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
				
		switch (a)
		{
		case "1" : 
		System.out.println("Kolkata Knight Riders vs Royal Challengers Bangalore");
		System.out.println("Date : Apr 6, Thu");
		System.out.println("Time : 7:30 PM");
		System.out.println("Location : Eden Gardens, Kolkata");
		break;

		case "2" : book_ticket();
		break;
		
		case "3" : ref2.fixtures();
		break;																
		default: System.out.println("Invalid Input");
		KKR_vs_RCB();
		
		}
	}		
}


class LSG_vs_SRH extends fixtures
{
	public void LSG_vs_SRH()
	{
		System.out.println("=================================");
		System.out.println("                                 ");
		System.out.println("enter 1 for match_info");
		System.out.println("enter 2 for book_ticket");
		System.out.println("                                 ");
		System.out.println("enter 3 for back_menu");
		System.out.println("                                 ");
		System.out.println("=================================");
		
		Ipl ref1 = new fixtures();
		fixtures ref2 = (fixtures)ref1;
		
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
				
		switch (a)
		{
		case "1" : 
		System.out.println("Lucknow Super Giants vs Sunrisers Hyderabad");
		System.out.println("Date : Apr 7, Fri");
		System.out.println("Time : 7:30 PM");
		System.out.println("Location : Bharat Ratna Shri Atal Bihari Vajpayee Ekana Cricket Stadium, Lucknow");
		break;

		case "2" : book_ticket();
		break;
		
		case "3" : ref2.fixtures();
		break;																
		default: System.out.println("Invalid Input");
		LSG_vs_SRH();
		
		}
	}		
}

