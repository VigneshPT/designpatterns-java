package ObserverPattern;

import java.util.ArrayList;

public class NewsAgency implements IObservable {

	ArrayList<IObserver> newsChannels = new ArrayList<IObserver>();
	private String news;
	@Override
	public void addObserver(IObserver observer) {
		// TODO Auto-generated method stub
		newsChannels.add(observer);
	}

	@Override
	public void removeObserver(IObserver observer) {
		// TODO Auto-generated method stub
		newsChannels.remove(observer);
	}

	@Override
	public void setStateChanged() {
		// TODO Auto-generated method stub
		for(IObserver newsChannel : newsChannels) {
			newsChannel.update();
		}
	}
	
	public void setNews(String news) {
		this.news = news;
		setStateChanged();
	}
	
	public String getNews() {
		return this.news;
	}

}
