package com.github.zesetup.mab;


import com.google.inject.Singleton;
import com.mongodb.DB;
import com.mongodb.MongoClient;

@Singleton
public class MongoProviderImpl implements MongoProvider {
  public DB getDatabase() {
    MongoClient mongoClient = new MongoClient("test-server", 27017);
    return mongoClient.getDB("myMongoDb");
  }
}
