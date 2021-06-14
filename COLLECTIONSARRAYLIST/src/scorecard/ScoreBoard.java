package scorecard;

import java.util.*;

import java.util.Map.Entry;
public class ScoreBoard {

	public static void main(String[] args) 
	{
		Map<String, ScoreCard> m = new HashMap<String, ScoreCard>();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter how many teams");
		int teams = sc.nextInt();
		System.out.println("enter how many matches");
		int matches = sc.nextInt();
		
		System.out.println("enter team " + teams + " names");
		
		for (int i = 1; i <= teams; i++)
		{
			String team = sc.next();
			m.put(team, new ScoreCard(matches,0,0,0));
		}
		
		while (true)
		{
			System.out.println("1.add\n2.display\n3.exit");
			System.out.println("enter the option");
			int option = sc.nextInt();
			
			switch(option)
			{
				case 1: addPoints(m,sc);
					break;
				
				case 2:display(m);
					break;
					
				case 3:System.exit(0);
			}
		}
	}
	
	public static void addPoints(Map<String, ScoreCard> m, Scanner sc)
	{
		System.out.println("enter two teams that are played");
		
		sc.next();
		sc.next();
		
		System.out.println("enter which team won");
		
		String won = sc.next();
		System.out.println("enter which team lost");
		String team2 = sc.next();
		
		m.get(won).setWon(m.get(won).getWon() + 1);
		m.get(won).setPoints(m.get(won).getPoints() + 2);
		m.get(won).setMatches(m.get(won).getMatches() - 1);
		
		m.get(team2).setLoss(m.get(team2).getLoss() + 1);
		m.get(team2).setMatches(m.get(team2).getMatches() - 1);
		
	}
	
	public static void display(Map<String, ScoreCard> m)
	{
		Iterator<Entry<String, ScoreCard>> itr = m.entrySet().iterator();
		
		System.out.println("teams\t\tmatches\twon\tlost\tpoints");
		System.out.println("===============================================");
		
		while (itr.hasNext())
		{
			Entry<String, ScoreCard> i = itr.next();
			
			System.out.println(i.getKey() + "\t\t" + i.getValue().getMatches() + "\t" + i.getValue().getWon() + "\t" + i.getValue().getLoss() + "\t" + i.getValue().getPoints());
		}
	}
}
