package com.FCI.SWE.Models;

import java.util.List;

import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.FetchOptions;
import com.google.appengine.api.datastore.PreparedQuery;
import com.google.appengine.api.datastore.Query;

public class PostEntity {

	
	
	public Boolean posts(String post,String uname,String feelings,String hash,String privacy) {
		DatastoreService datastore = DatastoreServiceFactory
				.getDatastoreService();
		Query gaeQuery = new Query("posts");
		PreparedQuery pq = datastore.prepare(gaeQuery);
		List<Entity> list = pq.asList(FetchOptions.Builder.withDefaults());

		Entity employee = new Entity("posts", list.size() + 1);

		employee.setProperty("name", uname);
		employee.setProperty("post", post);
		employee.setProperty(" feelings",  feelings);
		employee.setProperty("like", 0);
		employee.setProperty("hash", hash);
		employee.setProperty("privacy", privacy);
		employee.setProperty("who shared post","null");
		datastore.put(employee);

		return true;
		}
	
	public Boolean likepostes(String rname,String ID ) {

		DatastoreService datastore = DatastoreServiceFactory
				.getDatastoreService();
		Query gaeQuery = new Query("posts");
		PreparedQuery pq = datastore.prepare(gaeQuery);
		
		for (Entity entity : pq.asIterable()) {
	//String y=	long.toString(entity.getKey().getId());
    	if (entity.getProperty("ID").toString().equals(ID)) {
    		//System.out.println(name  + " " + name2+"\n");
    	String x=entity.getProperty("like").toString().trim();
    		
    int z=	Integer.parseInt(x);
    	z++;
    		    entity.setProperty("like",z);
				datastore.put(entity);
				break;
			}
      
		
		}

		return true;
	}
	public String shareposts(String uname, String ID) {
		DatastoreService datastore = DatastoreServiceFactory
				.getDatastoreService();

		Query gaeQuery = new Query("posts");
		PreparedQuery pq = datastore.prepare(gaeQuery);
		List<Entity> list = pq.asList(FetchOptions.Builder.withDefaults());
		Entity employee = new Entity("posts", list.size() + 1);

		
		for (Entity entity : pq.asIterable()) {
			
			if (entity.getProperty("ID").toString().equals(ID)) {
				employee.setProperty("who shared post", uname);
				 String post =  (entity.getProperty("post").toString());
				return post;
			}
		}
		return null;
	}
}
