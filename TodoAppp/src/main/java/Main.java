////TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClients;
import org.bson.Document;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //create the MangoClient connection
        //Add the maven in java for MongoDB

        var client = MongoClients.create("mongodb://localhost:27017/");

        //to create or access the database
        var todoDB = client.getDatabase("todoDB");

        //to create the collection
        todoDB.createCollection("todolist");

        //to access the collection
        var todocollection = todoDB.getCollection("todolist");

        //to create the document and the data into document
        var todoDocument = new Document();
        todoDocument.append("taskName", "WORK ON MONGODB");
        todoDocument.append("taskDate","12 Aug 2024");
        todoDocument.append("taskTime","20 hrs");
        todoDocument.append("taskStatus", false);

        //add the document into collection

        todocollection.insertOne(todoDocument);

        //to update the document
        todocollection.updateOne(new Document("taskName", "WORK ON MONGODB"),new Document("$set",new Document("taskstatus",true)));

        //change the data if status is false in

        //todocollection.updateMany(new Document("taskStatus",false),new Document("$set",new Document("taskDate","17 Aug 2024")));

        //change the data if status is true in
       // todocollection.deleteOne(new Document("taskStatus",true));

        //to fetch the document from collection
        FindIterable<Document> todolist = todocollection.find();

        for (Document document: todolist)
        {
           // System.out.println("My document "+ document);
            System.out.println("Task Name " + document.getString("taskName") +" Task Date "+document.getString("taskDate"));

        }




    }
}