package org.example.service;

import org.example.TodoDB;
import org.example.model.Todo;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class TodoServiceImpl implements TodoService{



    private int count =1;

    @Override
    public List<Todo> getAll() {

        for(int i=0; i< TodoDB.database.size();i++){
            System.out.println(TodoDB.database.get(i));
        }
        return TodoDB.;
    }

    @Override
    public Todo getById(int id) {
        Todo targetTodo = (TodoDB.getTodo(this.id));
        return targetTodo;
    }

    @Override
    public void add( String name, String description) {
        Todo todo= new Todo(name, description);

        TodoDB.database.put( count++, todo);

    }

    @Override
    public void update(int id, String name, String description, boolean done) {

    }

    @Override
    public void remove(int id) {

    }

    @Override
    public void toggleDone(int id) {

    }
}
