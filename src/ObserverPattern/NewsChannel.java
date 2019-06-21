package ObserverPattern;

public class NewsChannel implements IObserver {

	NewsAgency newsProvider;
	String channelName;
	public NewsChannel(String channelName, NewsAgency newsProvider) {
		this.channelName = channelName;
		this.newsProvider = newsProvider;
	}
	
	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println(this.channelName + " reporting. Got some fresh news from the agency");
		
		System.out.println(this.newsProvider.getNews());
	}

}
