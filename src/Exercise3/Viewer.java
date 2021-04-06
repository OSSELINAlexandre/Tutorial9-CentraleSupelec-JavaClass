package Exercise3;

public class Viewer implements Observer{

	
	private int followScoreA;
	private int followScoreB;
	private String teamA;
	private String teamB;
	private Boolean hodler; // Not used, but it could be usefull to know which team is currenly holding the Ball
	private String followedMatch;
	private String nameOfTheViewer;
	
	
//We could have an ArrayList<GameClass> of followed game, but for this exercise, we simplify by having only one game followed at the time.	
	
	public Viewer(String name) {
		super();
		this.nameOfTheViewer = name;
		
	}
	
	public String currentSituation() {
		String temp = "";
		if(!hodler) {
			temp = teamA;
		}else {
			temp = teamB;
		}
		return followedMatch + ", current score : " + followScoreA + " : " + followScoreB + ", current holder of the ball : " + temp;
	}


	@Override
	public void update(int ScoreA, int ScoreB, String TA, String TB, String NameMatch, Boolean Ball) {
		
		followScoreA  = ScoreA;
		followScoreB = ScoreB;
		teamA = TA;
		teamB = TB;
		followedMatch = NameMatch;
		hodler = Ball;
		System.out.println("=====" + this.nameOfTheViewer + " is watching " + currentSituation()); 
		
	}

	



	

}
