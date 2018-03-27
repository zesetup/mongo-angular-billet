package com.github.zesetup.mab;


import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;

@SuppressWarnings("serial")
public class SampleDataLoader { 
/*extends HttpServlet {
  public void init() throws ServletException
  {
        System.out.println("----------");
        System.out.println("---------- App Initialized successfully ----------");
        System.out.println("----------");
        MongoClient mongoClient = new MongoClient("dms1.iae.lt", 27017);
        DB database = mongoClient.getDB("myMongoDb");
        database.createCollection("employees", null);
        database.getCollectionNames().forEach( v-> System.out.println(v));
        DBCollection collection = database.getCollection("employees");
        BasicDBObject searchQuery = new BasicDBObject();
        collection.remove(searchQuery);
        BasicDBObject document = new BasicDBObject();
        document.put("name", "John ");
        document.put("Surname", "Smith");
        collection.insert(document);
  }*/
}
