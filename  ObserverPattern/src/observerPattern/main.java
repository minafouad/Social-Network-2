package observerPattern;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EventSubject sub = new EventSubject();
	    // Client configures the number and type of Observers
	    new FaceNotifiction( sub );
	    new EmailNotification( sub );
	  //  new smsNotification( sub );
	 
	    sub.setState("go to  madina ");

	    sub.setState("go to  cinema ");
	}

}
