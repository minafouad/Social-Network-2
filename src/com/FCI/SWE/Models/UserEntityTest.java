package com.FCI.SWE.Models;

import java.util.ArrayList;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.PreparedQuery;
import com.google.appengine.api.datastore.Query;
import com.google.appengine.tools.development.testing.LocalDatastoreServiceTestConfig;
import com.google.appengine.tools.development.testing.LocalServiceTestHelper;
//@Test(groups="user")
public class UserEntityTest {
	
	private final LocalServiceTestHelper helper = new LocalServiceTestHelper(new LocalDatastoreServiceTestConfig());
@BeforeClass
public void setUp(){
	helper.setUp();
}

@AfterClass
public void tearDown(){
	helper.tearDown();
}


UserEntity object=new UserEntity();
	UserEntity ob=new UserEntity("mama" ,"mi");
	UserEntity obj=new UserEntity("mama" ,"mina","123");
	


	
  @Test
  public void AcceptFriend() {
	
	  Assert.assertEquals( true,ob.AcceptFriend().booleanValue());
	 
  }

  

  @Test
  public void addfriend() {
	  Assert.assertEquals(true,ob.addfriend().booleanValue());
  }

  @Test
  public void createpage() {
	  Assert.assertEquals( true,object.createpage("a","mama","b","c").booleanValue());
  }

  

@Test
  public void diplaypst() {
	ArrayList<String>hg= new ArrayList<String>();
	hg.add("e");
	
	Assert.assertEquals(hg ,object.diplaypst("mama","b"));
  }

  @Test
  public void getEmail() {
	 Assert.assertEquals(null,object.getEmail());
  }

  @Test
  public void getName() {
	  Assert.assertEquals(null,object.getName());
  }

  @Test
  public void getPass() {
	  Assert.assertEquals(null ,object.getPass());
  }

  
  @Test
  public void get_all_friends() {
	  ArrayList<String>hg= new ArrayList<String>();
		hg.add("mi");
		hg.add("mi");
		hg.add("said");
		
		 Assert.assertEquals(hg ,object.get_all_friends("mama") );
  }

  @Test
  public void gethash(){
	  int num=0;
	      Assert.assertEquals(num,object.gethash("b") );
	      
  }

  @Test
  public void getpost() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void getsearch() {
	 
	  Assert.assertEquals( obj, object.getsearch("mama"));
  }

  @Test
  public void likepagess() {
	  int count=0;
	  Assert.assertEquals( count, object.likepagess("mama","a"));
  }

  @Test
  public void likepostes() {
	  int count=0;
	  String m="1";
	  Assert.assertEquals( count, object.likepagess("mama",m));
  }

  

  @Test
  public void posts() {
	  
	  Assert.assertEquals( true, object.posts("e","mama","a","b","p").booleanValue());
  }

 

  @Test
  public void sendMsg() {
 Assert.assertEquals( true, object.sendMsg("ef","mina","mama").booleanValue());
  }

  
  @Test
  public void shareposts() {
	  Assert.assertEquals( "e", object.shareposts("3","mama"));
  }
}
