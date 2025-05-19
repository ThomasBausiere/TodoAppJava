package org.example;

import org.example.model.Todo;

import java.util.HashMap;
import java.util.Map;

public class TodoDB {

    public static Map<Integer, Todo> database = new HashMap<>();

    public static Todo getTodo(int id){
        Todo filterDb = new Todo(id){
        for(int i= 0; i < TodoDB.database.seize; ){
            if (database.get(key).getId() == id) {
                filterDb.put(key, database.get(key));
            }
        }
        return filterDb;
    }

    public static Map<Integer, Todo> getAllTodo(){
        Map<Integer, Todo> filterDb = new HashMap<>();
        for(Integer key: database.keySet()){
            if (database.get(key).getId() == id) {
                filterDb.put(key, database.get(key));
            }
        }
        return filterDb;
    }


}
