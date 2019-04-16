package org.brohede.marcus.listviewapp;

public class Mountain {
    private String name;
    private String location;
    private int height;

        //default constructor
    public Mountain(){
        name = "Saknar namn";
        location = "Saknar plats";
        height=1;
    }

    //En constructor som skapar ett nytt mountain
    public Mountain(String n, String l, int h){
        name = n;
        location = l;
        height = h;
    }

    //Method att visa mountain med
    public String info(){
        String tmp = new String();
        tmp+=name+" is located in mountain range "+location+" and reaches "+height+"m above sea level.";
        return tmp;
    }

    public void setName(String n){
        name=n;
    }

    public String getName(){
        return name;
    }
}
