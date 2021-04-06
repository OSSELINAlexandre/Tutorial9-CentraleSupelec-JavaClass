package Exercise3;

public class Main {

	public static void main(String[] args) {

		GameClass nba = new GameClass("Spurs", "LAkers");
		GameClass nfl = new GameClass("MNVikings", "Bclions");
		GameClass nhl = new GameClass("MNWild", "CalagaryFlames");

		Viewer alex = new Viewer("Alex");
		Viewer pierre = new Viewer("Pierre");
		Viewer bernard = new Viewer("Bernard");
		Viewer celine = new Viewer("Céline");
		Viewer andy = new Viewer("Andy");
		Viewer lola = new Viewer("Lola");
		Viewer matt = new Viewer("Matt");
		Viewer catherine = new Viewer("Catherine");
		Viewer sophie = new Viewer("Sophie");

		nba.addObserver(alex);
		nba.addObserver(pierre);
		nba.addObserver(bernard);
		nba.addObserver(celine);
		nfl.addObserver(alex);
		nfl.addObserver(andy);
		nfl.addObserver(lola);
		nhl.addObserver(matt);
		nhl.addObserver(catherine);
		nhl.addObserver(sophie);

		Thread T1 = new Thread(nba);
		Thread T2 = new Thread(nfl);
		Thread T3 = new Thread(nhl);

		T1.start();
		T2.start();
		T3.start();

	}

}
