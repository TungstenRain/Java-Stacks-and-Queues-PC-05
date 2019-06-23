package ch21pc05;

import java.util.ArrayList;

/**
 * 
 * @author frank
 */
public class Person {
    String name;
    ArrayList<String> childrens;
    String parent;
    
    public Person(String name) {
        this.name = name;
    }
    
    public void addChild(String c) {
        if(childrens == null) {
            childrens = new ArrayList<String>();
        } else {
            childrens.add(c);
        }
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public ArrayList<String> getChildrens() {
        return childrens;
    }
    
    public void setChildrens(ArrayList<String> childrens) {
        this.childrens = childrens;
    }
    
    public String getParent() {
        return parent;
    }
    
    public void setParent(String parent) {
        this.parent = parent;
    }
}
