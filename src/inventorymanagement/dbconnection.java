/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inventorymanagement;

import com.mongodb.BasicDBObject;
import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
import java.util.Iterator;
import org.bson.Document;

/**
 *
 * @author Student.admin
 */
public class dbconnection {

    
    public void Connect(){    
        MongoClient mongoClient = new MongoClient( "localhost" , 27017 ); 
//        System.out.println("Created Mongo Connection successfully");

        MongoDatabase db = mongoClient.getDatabase("bernadez_hims");
//        System.out.println("Get database is successful");
        
        MongoCollection<Document>  collection= db.getCollection("users");
    }
}
