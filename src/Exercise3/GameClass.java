package Exercise3;

import java.util.ArrayList;

public class GameClass implements Runnable, Observable{
	
	private String teamA;
	private String teamB;
	
	private int scoreTeamA;
	private int scoreTeamB;
	
	private String nameMatch;
	private Boolean hodlerOfBall; // When false team A, when true team B
	private ArrayList<Observer> theListOfObserver;
	
	
	public GameClass(String TeamA, String TeamB) {
		super();
		this.teamA = TeamA;
		this.teamB = TeamB;
		scoreTeamA = 0;
		scoreTeamB = 0;
		this.nameMatch = TeamA + " VS " + TeamB;
		hodlerOfBall = false; // When false team A has the ball, when true team B has the ball
		theListOfObserver = new ArrayList<>();

	}
	
	
	public void addObserver(Observer c) {
		
		if(!theListOfObserver.contains(c)) {
			theListOfObserver.add(c);
		}
		
	}
	
	public void removeObserver(Observer c) {
		
		if(theListOfObserver.contains(c)) {
			theListOfObserver.remove(c);
		}
		
	}
	

	@Override
	public void run() {
		
		
		while(true){
//We could set a limit here depending on the game. Could be a time limit, a score, a number of penalty, the weather conditions....			
			
			if(hodlerOfBall)
			{
				scoreTeamA += (int)((((Math.random())) * 2.99) + 1);
				hodlerOfBall = false;
			}else
			{
				scoreTeamB += (int)((((Math.random())) * 2.99) + 1);
				hodlerOfBall = true;
			}
			
			
			try {
				notifyObserver();
				Thread.currentThread();
				Thread.sleep(4500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}


	@Override
	public void notifyObserver() {
		
		for(Observer O : theListOfObserver) {
			O.update(scoreTeamA, scoreTeamB, teamA,  teamB,  nameMatch,  hodlerOfBall);
		}
	
		
	}
	


}
