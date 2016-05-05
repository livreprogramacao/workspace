package org.mano.example;

import java.util.Arrays;
import java.util.List;

import org.bson.Document;

import com.mongodb.Block;
import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.ServerAddress;
import com.mongodb.client.FindIterable;

public class CRUD {

   private final static String HOST = "localhost";
   private final static int  PORT = 27017;
   private final static String DATABASE = "mydb";
   private final static String USER = "user";
   private final static String PASSWORD = "abc123";

   private MongoCredential mongoCredential;
   private MongoClient mongoClient;

   public CRUD() {
      mongoCredential = MongoCredential.createCredential
         (USER, DATABASE, PASSWORD.toCharArray());
      mongoClient = new MongoClient(new ServerAddress
         (HOST, PORT), Arrays.asList(mongoCredential));
   }

   public void create(String title, String isbn,
         List<String> authors, List<String> category) {
      try {
         mongoClient.getDatabase(DATABASE)
         .getCollection("library").insertOne(new Document()
         .append("tite", title).append("isbn", isbn)
         .append("authors", authors).append("category", category));
      } catch (Exception ex) {
         System.out.println(ex.getMessage());
      }
   }

   public void readAll() {
      try {
         FindIterable<Document> iter = mongoClient
            .getDatabase(DATABASE)
            .getCollection("library").find();

         iter.forEach(new Block<Document>() {
            @Override
            public void apply(Document doc) {
               System.out.println(doc);
            }
         });

      } catch (Exception ex) {
          System.out.println(ex.getMessage());
      }
   }

   public void updateCategory(String isbn, List<String> category) {

      try {
         mongoClient.getDatabase(DATABASE).getCollection("library")
         .updateOne(new Document("isbn", isbn),
         new Document("$set", new Document("category", category)));

      } catch (Exception ex) {
         System.out.println(ex.getMessage());
      }
   }

   public void delete(String isbn) {

      try {
         mongoClient.getDatabase(DATABASE).getCollection("library")
         .deleteOne(new Document("isbn", isbn));

      } catch (Exception ex) {
         System.out.println(ex.getMessage());
      }
    }

}