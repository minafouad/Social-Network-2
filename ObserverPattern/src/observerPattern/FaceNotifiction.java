package observerPattern;

public class FaceNotifiction extends Observer{
	 public FaceNotifiction( EventSubject s ) { 
		    subj = s; 
		    subj.attach( this ); 
		  }

	@Override
	public void update(String state) {
		// TODO Auto-generated method stub
		System.out.println("Face Notification" + state);
		
	}
}
