package edu.rose_hulman.lifetracker;

/**
 * Created by Billy York on 6/28/2015.
 */
public class Attribute {

    private AttributeType attributeType;
    private String data;

    public static enum AttributeType{
        NAME, DESCRIPTION, PRICE, QUANTITY, PRIORITY, VOICE, IMAGE, REMINDER, LOCATION, WEB_SOURCE
    }

    public Attribute(AttributeType attributeType, String data){
        this.attributeType = attributeType;
        this.data = data;
    }

    public AttributeType getAttributeType(){
        return this.attributeType;
    }

    public String getData(){
        return this.data;
    }

}
