package observerPattern;

import java.awt.List;
import java.util.ArrayList;

public class EventSubject {
	  private ArrayList<Observer> observers=new ArrayList<Observer>();
	  private String state;
	  public void attach( Observer o ) {
	    observers.add(o);
	  }

	  public String getState() {
	    return state;
	  }
	  
	  public void setState( String in ) {
	    state = in;
	    notify_();
	  }

	  private void notify_() {
	    for (int i=0; i < observers.size(); i++) {
	      observers.get(i).update( state);
	    }
	  }
}
