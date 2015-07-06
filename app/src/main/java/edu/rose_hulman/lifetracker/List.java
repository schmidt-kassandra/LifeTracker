package edu.rose_hulman.lifetracker;

import java.util.HashMap;

public class List {

    private HashMap<Attribute.AttributeType, Attribute> list = new HashMap<>();

    public List(){
        //nothing to do here for now
    }

    public boolean addToList(Attribute attribute){
        this.list.put(attribute.getAttributeType(), attribute);
        return true;
    }

    public boolean addToList(Attribute.AttributeType attributeType, String data){
        Attribute attribute = new Attribute(attributeType, data);
        return this.addToList(attribute);
    }

    public Attribute getByAttributeType(Attribute.AttributeType attributeType){
        return this.list.get(attributeType);
    }

    public HashMap<Attribute.AttributeType, Attribute> getListStorage(){
        return this.list;
    }

}
