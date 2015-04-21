package observerPattern;

public class EmailNotification extends Observer{
	 public EmailNotification( EventSubject s ) { 
		    subj = s; 
		    subj.attach( this ); 
		  }

	@Override
	public void update(String state) {
		// TODO Auto-generated method stub
		System.out.println("Email Notification" +  state);
		
	}

}
