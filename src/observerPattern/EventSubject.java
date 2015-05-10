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
	  
	  public String setState( String in ) {
	    state = in;
	   String inbox= notify_();
	   return  inbox;
	  }

	  private String notify_() {
		  String box="";
	    for (int i=0; i < observers.size(); i++) {
	    box+=  observers.get(i).update( state);
	    
	    }
	    return box;
	  }
}
