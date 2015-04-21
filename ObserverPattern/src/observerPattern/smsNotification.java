package observerPattern;

public class smsNotification extends Observer{
	 public smsNotification( EventSubject s ) { 
		    subj = s; 
		    subj.attach( this ); 
		  }

	@Override
	public void update(String state ) {
		// TODO Auto-generated method stub
		System.out.println("SMS Notification" +  state);
		
	}
}
