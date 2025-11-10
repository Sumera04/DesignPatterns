package com.cs.observer;


//Step 3: Concrete Subject — maintains a list of observers
class Channel implements Subject {
	private java.util.List<Observer> subscribers = new java.util.ArrayList<>();
	private String channelName;

	public Channel(String channelName) {
		this.channelName = channelName;
	}

	@Override
	public void attach(Observer observer) {
		subscribers.add(observer);
		System.out.println("New subscriber added.");
	}

	@Override
	public void detach(Observer observer) {
		subscribers.remove(observer);
		System.out.println("Subscriber removed.");
	}

	@Override
	public void notifyObservers(String message) {
		for (Observer subscriber : subscribers) {
			subscriber.update(channelName + ": " + message); // Notify each observer
		}
	}

	// Business logic: new video uploaded
	public void uploadVideo(String videoTitle) {
		System.out.println("Video uploaded: " + videoTitle);
		notifyObservers("New video uploaded - " + videoTitle);
	}
}
