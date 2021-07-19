
import java.util.ArrayList;
import java.util.List;
public class Item  {

    private String name;
    private double weight;
    public Item(String name,double weight){
        this.name =name;
        this.weight =weight;
    }

    public String toString(){
        return "Name:"+this.name+",Weight:"+this.weight;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}