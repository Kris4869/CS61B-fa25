import java.util.ArrayList;
import java.util.List;

public class Planet {
    // static variable
    static List<Planet> L = new ArrayList<>();

    // instance variable
    double x,y;
    String name;

    // constructor
    public Planet(double x, double y, String name){
        this.x = x;
        this.y = y;
        this.name = name;
        L.add(this);
    }

    public static List<Planet> allPlanetsCreated(){
        return L;
    }

    // Fill-in-the blank (however, I this way below is not so efficient)
    public static double maxDistance(List<Planet> planets){
        double max = 0;
        for (Planet P : planets){
            for (Planet other : planets){
                if ((Math.pow(p.x - other.x, 2) + Math.pow(P.y - other.y,2)) > max){
                    max = Math.pow(p.x - other.x, 2) + Math.pow(P.y - other.y,2);
                }
            }
        }
        return Math.sqrt(max);
    }

    public double distanceTo(Planet other){
        int distance = Math.sqrt(Math.pow(this.x - other.x, 2) + Math.pow(this.y - other.y,2));
        return distance;
    }



    public static void main(String[] args) {
        
    }
}
