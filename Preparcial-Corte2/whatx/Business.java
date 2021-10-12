import java.util.ArrayList;

/**
 * Write a description of class Business here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Business extends User{

    private String description;
    private String adress;
    private String email;
    private ArrayList<Tag> configTags;
    
    /**
     * Create a new tag for user business
     * @param name - Tag name
     * @param color - Tag color
     */
    public void createTag(String name, String color) {
        configTags.add(new Tag(name, color));
    }
}