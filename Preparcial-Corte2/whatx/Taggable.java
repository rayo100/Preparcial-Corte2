import java.util.*;
/**
 * Write a description of class Tag here.
 * 
 * @author Ronaldo Henao - Cesar Vásquez
 * @version 1.0
 */
public abstract class Taggable
{
    public ArrayList<Tag> tags;
    
    /**
     * Associate elements to business tags
     * @Param tags ArrayList of tags
     */
    public void tag(ArrayList<Tag> tags) throws WhatxException{
        for (Tag i: tags){
            tags.add(i);
        }
    }
    public ArrayList<Tag> getTags(){
        return tags;
    }
    public boolean verificarTag(ArrayList<Tag> tagsV){
        for (Tag i: tagsV){
            if (tags.contains(i)) return true;
        }
        return false;
    }
    public boolean validTag(){
        for (Tag i:tags){
            if (i.getcolor().isEmpty() || i.getname().isEmpty()) return false;
        }
        return true;
    }
    public boolean tagIntags(String tagName){
        for(Tag i: tags){
            if (i.getname() == tagName) return true; 
        }
        return false;
    }
}
