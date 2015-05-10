package observerPattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class friendrequestnotification extends Observer {

	
public friendrequestnotification( EventSubject s ) { 
	    subj = s; 
	    subj.attach( this ); 
	  }

@Override
public String update(String loginName ) {

	String serviceUrl = "http://localhost:8888/rest/sfrservice";
	try {
		URL url = new URL(serviceUrl);
		String urlParameters = "uname="+loginName  ;
		HttpURLConnection connection = (HttpURLConnection) url
				.openConnection();
		connection.setDoOutput(true);
		connection.setDoInput(true);
		connection.setInstanceFollowRedirects(false);
		connection.setRequestMethod("POST");
		connection.setConnectTimeout(60000);  //60 Seconds
		connection.setReadTimeout(60000);  //60 Seconds
		
		connection.setRequestProperty("Content-Type",
				"application/x-www-form-urlencoded;charset=UTF-8");
		OutputStreamWriter writer = new OutputStreamWriter(
				connection.getOutputStream());
		writer.write(urlParameters);
		writer.flush();
		String line, retJson = ""; 
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				connection.getInputStream()));
		while ((line = reader.readLine()) != null) {
			retJson += line;
		}
		writer.close();
		reader.close();
		
		JSONParser parser = new JSONParser();
		Object obj = parser.parse(retJson);
		JSONObject object = (JSONObject) obj;
	
			 ArrayList<String> sfr = (ArrayList<String>)object.get("sfr");
             String html = "<p>" ;
		     for ( int i = 0 ;i < sfr.size() ; i++ )
		    	 html += "you have friend request from " + sfr.get(i)+  "</p><br><br> <p>------------- </p>" ;
		
		     return html ;
		
	}
	
	catch (MalformedURLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	/*
	 * UserEntity user = new UserEntity(uname, email, pass);
	 * user.saveUser(); return uname;
	 */
	return null;

}

}
