package observerPattern;

public abstract class Observer {
	  protected EventSubject subj; 
	  public abstract void update(String state);
}
