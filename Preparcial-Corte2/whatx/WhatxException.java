
/**
 * Write a description of class WhatxException here.
 * 
 * @author Ronaldo Henao - Cesar Vásquez
 * @version 1.0
 */
public class WhatxException extends Exception
{
    public static final String NO_TAGS = "tags list is empty";
    public static final String TAGGED = "the element is already associated with some tag";
    public static final String NO_MEMBERS = "the element is chat, and it doesn’t have any members.";
    public static final String INCOMPLETE_INFORMATION = "any tags don’t have complete information";
    public static final String NO_TAG = "G There is no tag with that name";
    public static final String FUTURE_DATES = "StartDate and endDate are future dates";
    public static final String START_BEFORE_END = "StartDate is before endDate";
    public WhatxException(String message){
        super(message);
    }
}
