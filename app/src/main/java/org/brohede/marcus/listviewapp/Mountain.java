package org.brohede.marcus.listviewapp;

public class Mountain {
    private String name;
    private String location;
    private int height;

        //default constructor
    public Mountain(){
        name = "Saknar namn";
        location = "Saknar plats";
        height=-1;
    }

    //En constructor som skapar ett nytt mountain
    public Mountain(String n, String l, int h){
        name = n;
        location = l;
        height = h;
    }

    public Mountain(String n){
        name = n;
        location = "nowhere";
        height = -1;
    }

    //Method att visa mountain med
    public String info(){
        String tmp = new String();
        tmp+="   "+name+"\n Location: "+location+"\n Height: "+height+"M";
        return tmp;
    }

    public void setName(String n){
        name=n;
    }

    public String getName(){
        return name;
    }

    @Override
    public String toString(){
        return name;
    }
}
