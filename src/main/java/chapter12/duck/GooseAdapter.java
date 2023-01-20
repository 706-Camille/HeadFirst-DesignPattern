package main.java.chapter12.duck;

public class GooseAdapter implements Quackable {
	Goose goose;
	Observable observable;

	public GooseAdapter() {
		this.observable = new Observable(this);
	}
 
	public GooseAdapter(Goose goose) {
		this.goose = goose;
	}
 
	public void quack() {
		goose.honk();
	}

	@Override
	public void registerObserver(Observer observer) {
		observable.registerObserver(observer);
	}

	@Override
	public void notifyObservers() {
		observable.notifyObservers();
	}
}
