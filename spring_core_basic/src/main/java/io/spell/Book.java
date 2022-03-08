package io.spell;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
 
@Component("bookBean")
public class Book {
 
    @Value("12345")
    private long id;
     
    @Value("Le Petit Prince (The Little Prince)")
    private String title;
 
    public long getId() {
        return id;
    }
 
    public void setId(long id) {
        this.id = id;
    }
 
    public String getTitle() {
        return title;
    }
 
    public void setTitle(String title) {
        this.title = title;
    } 
     
    public String getBookInfo(String authorName){
        return authorName + " has writen the book " + title + ", with book id " + ""+ id + ".";
    }
 
    @Override
    public String toString(){
        return title;
    }
}