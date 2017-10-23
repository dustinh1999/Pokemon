public class Pokemon 
{ 
	double HP, HP2;
	int Def,SpDef,Att,SpAtt,Spe; 
	String name,type1,type2; 
	boolean yes=false;
	String moves[][]; 
	String s,s2;
	boolean alive = true;
	
	Pokemon(int h,int a,int d,int sa,int sd, int s, String t1, String t2) 
	{ 
		moves=new String[4][6]; 
		HP=h; 
		HP2 = h;
		Def=d; 
		SpDef=sd; 
		Att=a; 
		SpAtt=sa; 
		Spe=s; 
		type1=t1; 
		type2=t2; 
	} 
	

	
	public int calculateDamage(Pokemon P, int m) //m is the move number
	{
		System.out.println("\n\n"); 
		double damage = 0.0; 
		double r=Math.random()*100; 
		if(r > Double.parseDouble(moves[m][2])) //[m][2] is the accuracy
		{ 
			s=(this.moves[m][0]+" missed!"); 
			return 0; 
		} 
		if(moves[m][4].equals("special")) //[m][4] is type(special or physical)
		{
			damage = SpAtt*Double.parseDouble(moves[m][1])/P.SpDef; //[m][1] is power
		} 
		else 
		{ 
			damage=Att*Double.parseDouble(moves[m][1])/P.Def; //[m][1] is power
		} 
		
		double rawDam=damage; 
		String typem=moves[m][3]; //[m][3] is move type(fire, grass, etc)
		String typep1=P.type1; 
		String typep2=P.type2; 
		if(typep1.equals("fire")) 
		{ 
			if(typem.equals("fire")) 
			{ 
					damage/=2; 
			} 
			else if(typem.equals("water")) 
			{ 
				damage*=2; yes=true; 
			} 
			else if(typem.equals("grass")) 
			{ 
				damage/=2; 
			} 
			else if(typem.equals("ground")) 
			{ 
				damage*=2; yes=true; 
			} 
			else if(typem.equals("rock")) 
			{ 
				damage*=2; yes=true; 
			} 
			else if(typem.equals("ice")) 
			{ 
				damage/=2; 
			}
		}
		else if(typep1.equals("water")) 
		{
			if(typem.equals("fire")) 
			{ 
				damage/=2; 
			} 
			else if(typem.equals("water")) 
			{ 
				damage/=2; 
			} 
			else if(typem.equals("grass")) 
			{ 
				damage*=2; yes=true; 
			} 
			else if(typem.equals("electric")) 
			{ 
				damage*=2; yes=true; 
			} 
			else if(typem.equals("ice")) 
			{ 
				damage/=2; 
			} 
		} 
		else if(typep1.equals("grass")) 
		{ 
			if(typem.equals("fire")) 
			{ 
				damage*=2; yes=true; 
			} 
			else if(typem.equals("water")) 
			{ 
				damage/=2; 
			} 
			else if(typem.equals("grass")) 
			{ 
				damage/=2; 
			} 
			else if(typem.equals("ground")) 
			{ 
				damage/=2;
			} 
			else if(typem.equals("rock")) 
			{ 
				damage*=2; yes=true;
			} 
			else if(typem.equals("ice"))
			{ 
				damage*=2; yes=true; 
			} 
			else if(typem.equals("flying")) 
			{ 
				damage*=2; yes=true; 
			} 
			else if(typem.equals("electric")) 
			{ 
				damage/=2; 
			} 
		} 
		else if(typep1.equals("psychic")) 
		{ 
			if(typem.equals("psychic")) 
			{ 
				damage/=2; 
			} 
			else if(typem.equals("dark")) 
			{ 
				damage*=2; yes=true; 
			} 
			else if(typem.equals("fighting")) 
			{ 
				damage/=2; 
			} 
		} 
		else if(typep1.equals("flying")) 
		{ 
			if(typem.equals("ice")) 
			{ 
				damage*=2; yes=true; 
			} 
			else if(typem.equals("electric")) 
			{ 
				damage*=2; yes=true; 
			} 
			else if(typem.equals("fighting")) 
			{ 
				damage/=2; 
			} 
			else if(typem.equals("rock")) 
			{ 
				damage*=2; yes=true;
			} 
			else if(typem.equals("ground")) 
			{ 
				damage=0; 
			} 
			else if(typem.equals("grass")) 
			{ 
				damage/=2; 
			} 
		} 
		else if(typep1.equals("ground")) 
		{ 
			if(typem.equals("ice")) 
			{ 
				damage*=2; yes=true; 
			} 
			else if(typem.equals("electric")) 
			{ 
				damage=0;
			} 
			else if(typem.equals("water")) 
			{
				damage*=2; yes=true; 
			}	
			else if(typem.equals("grass")) 
			{ 
				damage*=2; yes=true; 
			} 
		}
		else if(typep1.equals("poison")) 
		{ 
			if(typem.equals("ground")) 
			{ 
				damage*=2; yes=true; 
			} 
			else if(typem.equals("psychic")) 
			{ 
				damage*=2; yes=true; 
			} 
			else if(typem.equals("grass")) 
			{ 
				damage/=2; 
			} 
			else if(typem.equals("poison")) 
			{ 
				damage/=2;
			}
			else if(typem.equals("fighting")) 
			{ 
				damage/=2; 
			} 
		} 
		
		if(typep2.equals("null")) 
		{ 
			P.HP-=(int)(damage); 
		} 
		else 
		{ 
			if(typep2.equals("fire")) 
			{ 
				if(typem.equals("fire")) 
				{ 
					damage/=2; 
				} 
				else if(typem.equals("water")) 
				{ 
					damage*=2; yes=true; 
				} 
				else if(typem.equals("grass")) 
				{ 
					damage/=2; 
				} 
				else if(typem.equals("ground")) 
				{ 
					damage*=2; yes=true;
				} 
				else if(typem.equals("rock")) 
				{
					damage*=2; yes=true;
				}
				else if(typem.equals("ice"))
				{ 
					damage/=2;
				} 
				
			} 
			else if(typep2.equals("water")) 
			{ 
				if(typem.equals("fire")) 
				{ 
					damage/=2; 
				} 
				else if(typem.equals("water"))
				{ 
					damage/=2; 
				} 
				else if(typem.equals("grass")) 
				{ 
					damage*=2; yes=true; 
				} 
				else if(typem.equals("electric")) 
				{ 
					damage*=2; yes=true; 
				} 
				else if(typem.equals("ice")) 
				{ 
					damage/=2;
				} 
			} 
			else if(typep2.equals("grass")) 
			{ 
				if(typem.equals("fire")) 
				{ 
					damage*=2; yes=true; 
				} 
				else if(typem.equals("water")) 
				{ 
					damage/=2; 
				} 
				else if(typem.equals("grass")) 
				{ 
					damage/=2; 
				} 
				else if(typem.equals("ground")) 
				{ 
					damage/=2; 
				} 
				else if(typem.equals("rock")) 
				{ 
					damage*=2; yes=true;
				} 
				else if(typem.equals("ice")) 
				{ 
					damage*=2; yes=true; 
				} 
				else if(typem.equals("flying")) 
				{
					damage*=2; yes=true; 
				} 
				else if(typem.equals("electric")) 
				{ 
					damage/=2;
				} 
			}
			else if(typep2.equals("psychic"))
			{ 
				if(typem.equals("psychic")) 
				{ 
					damage/=2;
				} 
				else if(typem.equals("dark")) 
				{ 
					damage*=2; yes=true; 
				}
				else if(typem.equals("fighting")) 
				{ 
					damage/=2; 
				} 
			} 
			else if(typep2.equals("flying")) 
			{ 
				if(typem.equals("ice")) 
				{ 
					damage*=2; yes=true; 
				} 
				else if(typem.equals("electric")) 
				{ 
					damage*=2; yes=true; 
				} 
				else if(typem.equals("fighting")) 
				{ 
					damage/=2; 
				}
				else if(typem.equals("rock"))
				{ 
					damage*=2; yes=true; 
				} 
				else if(typem.equals("ground")) 
				{ 
					damage=0; 
				}
				else if(typem.equals("grass")) 
				{ 
					damage/=2;
				} 
			} 
			else if(typep2.equals("ground")) 
			{ 
				if(typem.equals("ice")) 
				{ 
					damage*=2; yes=true;
				} 
				else if(typem.equals("electric")) 
				{ 
					damage=0; 
				}
				else if(typem.equals("water")) 
				{ 
					damage*=2; yes=true; 
				} 
				else if(typem.equals("grass")) 
				{ 
					damage*=2; yes=true; 
				}
			} 
			else if(typep2.equals("poison"))
			{ 
				if(typem.equals("ground")) 
				{ 
					damage*=2; yes=true; 
				} 
				else if(typem.equals("psychic")) 
				{ 
					damage*=2; yes=true;
				} 
				else if(typem.equals("grass"))
				{ 
					damage/=2;
				} 
				else if(typem.equals("poison")) 
				{ 
					damage/=2;
				} 
				else if(typem.equals("fighting")) 
				{ 
					damage/=2;
				} 
			}
			
			P.HP-=(int)(damage); 
		} 
		s=(this.name+" used "+ moves[m][0]);
		if(damage==0) 
		{
			s2=(moves[m][0] +" has no effect on "+P.name);
		
		}
		else if(damage>rawDam) 
		{ 
			s2=(moves[m][0] +" is Super Effective on "+P.name); 
			
		} 
		else if(damage<rawDam) 
		{ 
			s2=(moves[m][0] +" is Not Very Effective on "+P.name);
			
		} 
		else
			s2="";

		return (int)(damage);
	}
	
	public String output()
	{
		return s;
	}
	public String output2()
	{
		return s2;
	}

	public boolean compareTo(Pokemon p) 
	{
		if((p.name).equals(this.name))
			return true;
		else
			return false;
	} 
} 

class Charizard extends Pokemon 
{ 
	Charizard() 
	{ 
		super(360,293,280,348,295,328,"fire","flying"); 
		name = "Charizard";
		moves[0][0]= "Flamethrower"; 
		moves[0][1]= "90"; 
		moves[0][2]= "95"; 
		moves[0][3]= "fire"; 
		moves[0][4]= "special"; 
		moves[1][0]= "Earthquake"; 
		moves[1][1]= "100"; 
		moves[1][2]= "100"; 
		moves[1][3]= "ground"; 
		moves[1][4]= "physical"; 
		moves[2][0]= "Air Slash"; 
		moves[2][1]= "85"; 
		moves[2][2]= "80"; 
		moves[2][3]= "flying"; 
		moves[2][4]= "special"; 
		moves[3][0]= "Rock Slide"; 
		moves[3][1]= "80"; 
		moves[3][2]= "85"; 
		moves[3][3]= "rock"; 
		moves[3][4]= "physical"; 
	} 
} 

class Blastoise extends Pokemon 
{ 
	Blastoise() 
	{ 
		super(362,291,328,295,339,280,"water","null");
		name = "Blastoise";
		moves[0][0]= "Surf"; 
		moves[0][1]= "95";
		moves[0][2]= "90";
		moves[0][3]= "water";
		moves[0][4]= "special";
		moves[1][0]= "Skull Bash";
		moves[1][1]= "80";
		moves[1][2]= "90";
		moves[1][3]= "normal";
		moves[1][4]= "physical";
		moves[2][0]= "Ice Beam";
		moves[2][1]= "95";
		moves[2][2]= "95";
		moves[2][3]= "ice";
		moves[2][4]= "special";
		moves[3][0]= "Earthquake";
		moves[3][1]= "100"; 
		moves[3][2]= "100"; 
		moves[3][3]= "ground"; 
		moves[3][4]= "physical"; 
	} 
} 

class Venasaur extends Pokemon 
{ 
	Venasaur() 
	{
		super(364,289,291,328,328,284,"grass","poison"); 
		name = "Venasaur";
		moves[0][0]= "Solar Beam"; 
		moves[0][1]= "120"; 
		moves[0][2]= "75"; 
		moves[0][3]= "grass"; 
		moves[0][4]= "special"; 
		moves[1][0]= "Sludge Bomb"; 
		moves[1][1]= "90";
		moves[1][2]= "95"; 
		moves[1][3]= "poison"; 
		moves[1][4]= "special"; 
		moves[2][0]="Wood Hammer"; 
		moves[2][1]= "85"; 
		moves[2][2]= "90"; 
		moves[2][3]= "grass"; 
		moves[2][4]= "physical"; 
		moves[3][0]= "Bulldoze"; 
		moves[3][1]= "60"; 
		moves[3][2]= "100"; 
		moves[3][3]= "ground"; 
		moves[3][4]= "physical"; 
	} 
} 

class Feraligatr extends Pokemon 
{ 
	Feraligatr() 
	{ 
		super(374,339,328,282,291,280,"water","null");
		name = "Feraligatr";
		moves[0][0]= "Hydro Pump"; 
		moves[0][1]= "120";
		moves[0][2]= "75"; 
		moves[0][3]= "water"; 
		moves[0][4]= "special"; 
		moves[1][0]= "Superpower"; 
		moves[1][1]= "120";
		moves[1][2]= "80"; 
		moves[1][3]= "fighting";
		moves[1][4]= "physical";
		moves[2][0]= "Ice Fang";
		moves[2][1]= "65";
		moves[2][2]= "90";
		moves[2][3]= "ice";
		moves[2][4]= "physical";
		moves[3][0]= "Crunch";
		moves[3][1]= "80";
		moves[3][2]= "100";
		moves[3][3]= "dark";
		moves[3][4]= "physical"; 
	} 
} 

class Typhlosion extends Pokemon 
{ 
	Typhlosion() 
	{ 
		super(360,293,280,348,295,328,"fire","null"); 
		name = "Typhlosion";
		moves[0][0]= "Fire Blast"; 
		moves[0][1]= "5000"; 
		moves[0][2]= "75"; 
		moves[0][3]= "fire"; 
		moves[0][4]= "special"; 
		moves[1][0]= "Body Slam"; 
		moves[1][1]= "80"; 
		moves[1][2]= "100"; 
		moves[1][3]= "normal"; 
		moves[1][4]= "physical"; 
		moves[2][0]= "Brick Break"; 
		moves[2][1]= "75"; 
		moves[2][2]= "100"; 
		moves[2][3]= "fighting"; 
		moves[2][4]= "physical"; 
		moves[3][0]= "Fire Punch"; 
		moves[3][1]= "75"; 
		moves[3][2]= "100"; 
		moves[3][3]= "fire"; 
		moves[3][4]= "physical"; 
	} 
} 

class Mewtwo extends Pokemon 
{ 
	Mewtwo() 
	{ 
		super(416,350,306,447,306,394,"psychic","null");
		name = "Mewtwo";
		moves[0][0]= "Psychstrike"; 
		moves[0][1]= "100"; 
		moves[0][2]= "100";
		moves[0][3]= "psychic";
		moves[0][4]= "special";
		moves[1][0]= "Aura Sphere";
		moves[1][1]= "100";
		moves[1][2]= "100";
		moves[1][3]= "fighting"; 
		moves[1][4]= "special";
		moves[2][0]= "Thunderbolt";
		moves[2][1]= "95";
		moves[2][2]= "100";
		moves[2][3]= "electric";
		moves[2][4]= "special";
		moves[3][0]= "Ice Beam"; 
		moves[3][1]= "95";
		moves[3][2]= "95";
		moves[3][3]= "ice"; 
		moves[3][4]= "special"; 
	} 
} 

class Swampert extends Pokemon 
{ 
	Swampert() 
	{ 
		super(404,350,306,295,306,240,"water","ground"); 
		name = "Swampert";
		moves[0][0]= "Muddy Water"; 
		moves[0][1]= "90"; 
		moves[0][2]= "90"; 
		moves[0][3]= "water"; 
		moves[0][4]= "special"; 
		moves[1][0]= "Hammer Arm";
		moves[1][1]= "100";
		moves[1][2]= "85"; 
		moves[1][3]= "figthing"; 
		moves[1][4]= "physical"; 
		moves[2][0]= "Blizzard"; 
		moves[2][1]= "120";
		moves[2][2]= "75"; 
		moves[2][3]= "ice"; 
		moves[2][4]= "special"; 
		moves[3][0]= "Earthquake"; 
		moves[3][1]= "100"; 
		moves[3][2]= "100";
		moves[3][3]= "ground"; 
		moves[3][4]= "physical"; 
	} 
} 

class Blaziken extends Pokemon 
{ 
	Blaziken() 
	{ 
		super(364,372,262,350,262,284,"fire","fighting");
		name = "Blaziken";
		moves[0][0]= "Brave Bird"; 
		moves[0][1]= "100"; 
		moves[0][2]= "90"; 
		moves[0][3]= "flying";
		moves[0][4]= "physical";
		moves[1][0]= "Flare Blitz";
		moves[1][1]= "120";
		moves[1][2]= "75";
		moves[1][3]= "fire";
		moves[1][4]= "physical";
		moves[2][0]= "Solar Beam";
		moves[2][1]= "120";
		moves[2][2]= "75";
		moves[2][3]= "grass";
		moves[2][4]= "special";
		moves[3][0]= "Sky Uppercut";
		moves[3][1]= "90";
		moves[3][2]= "85";
		moves[3][3]= "fighting";
		moves[3][4]= "physical"; 
	} 
} 

class Sceptile extends Pokemon 
{ 
	Sceptile() 
	{ 
		super(344,295,251,339,295,372,"grass","null"); 
		name = "Sceptile";
		moves[0][0]= "Faint Attack"; 
		moves[0][1]= "60"; 
		moves[0][2]= "100"; 
		moves[0][3]= "dark"; 
		moves[0][4]= "special"; 
		moves[1][0]= "Leaf Blade";
		moves[1][1]= "85"; 
		moves[1][2]= "100"; 
		moves[1][3]= "grass"; 
		moves[1][4]= "physical";
		moves[2][0]= "Psychic";
		moves[2][1]= "90";
		moves[2][2]= "90";
		moves[2][3]= "psychic"; 
		moves[2][4]= "special";
		moves[3][0]= "Aerial Ace";
		moves[3][1]= "65"; 
		moves[3][2]= "100";
		moves[3][3]= "flying"; 
		moves[3][4]= "physical"; 
	} 
}