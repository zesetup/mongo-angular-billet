package com.github.zesetup.mab;

import com.mongodb.DB;

public interface MongoProvider {
  public DB getDatabase();
}
