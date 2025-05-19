package org.example.model;

public class Todo {
    private int id;
    private String name;
    private String description;
    private boolean done;

    //TODO apres implémentation du service revenir pour ne pas avoir rentrer l'id
    //TODO voir gestion toggle
    public Todo(int id, String name, String description, boolean done) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.done = done;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    @Override
    public String toString() {
        String result= "";
        if (done){
           result= "["+ id +"] " + name  + " - "+description +". (DONE)";
        }else{
            result="["+ id +"] " + name  + " - "+description +". (TODO)";
        }
        return result;
    }
}
