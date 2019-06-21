package ObserverPattern;

public class NewsSimulation {
	public static void main(String[] args) {
		NewsAgency newsAgency = new NewsAgency();
		NewsChannel aajTak = new NewsChannel("Aaj Tak", newsAgency);
		NewsChannel timesNew = new NewsChannel("Times New", newsAgency);
		newsAgency.addObserver(aajTak);
		newsAgency.addObserver(timesNew);
		newsAgency.setNews("There is going to be a Tsunami in the East coast");
	}
}
