import java.io.*;

public class Player
{
	int id;
	String name;
	int scores;
	boolean no_matches_played;

	Player(int id,String name,int scores,boolean no_matches_played)
	{
		this.id=id;
		this.name=name;
		this.scores=scores;
		this.no_matches_played=no_matches_played;
		System.out.println("Working");
	}

	void display()
	{}

































	public static void main(String[] args)
	{
 	System.out.println("test");
 	Player p1 = new Player(1,"varad",2,false);
	}
}