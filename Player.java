import java.io.*;

public class Player
{
	int id;
	String name;
	int scores;
	int no_matches_played;

	Player(int id,String name,int scores,int no_matches_played)
	{
		this.id=id;
		this.name=name;
		this.scores=scores;
		this.no_matches_played=no_matches_played;
	}

	void calculate()
	{
		float score = (float)(scores/no_matches_played)*100;
		System.out.println("Id="+id);
		System.out.println("Player Name="+name);
		System.out.println("Score="+score);
	}

	

































	public static void main(String[] args)
	{
 	Player p1 = new Player(1,"varad",100,5);
 	p1.calculate();
 	Player p2 = new Player(2,"Sharan",69,4);
 	p2.calculate();

	}
}