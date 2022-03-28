import java.util.ArrayList;
import java.util.Collections;


public class person implements Comparable<person>{
    String name;
    int weight,height;
    person(String name,int weight,int height){
        this.name=name;
        this.weight=weight;
        this.height=height;
    }
    @Override
    public int compareTo(person p){
        return this.name.compareTo(p.name);
    }   @Override
    public int compareTo(person p){
        if(weight==p.weight)
        return 0;
        else if(weight>p.weight)
        return 1;
        else
        return -1;

    }@Override
    public int compareTo(person p){
        if(height==p.height)
        return 0;
        else if(height>p.height)
        return 1;
        else
        return -1;
        
    }
    

     public static void main(String[] args) {
        ArrayList<person> al= new ArrayList<>();
        al.add(new person("Rahul",70,180));
        al.add(new person("Guna",60,165));
        al.add(new person("Santhosh",65,185));
        Collections.sort(al);
        for (person p : al) {
            System.out.println(p.name + " " + p.weight + " " + p.height);
            
        }


        
    }
  
    
}
