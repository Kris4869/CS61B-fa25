import java.util.ArrayList;
import java.util.List;

public class Planet {
    // static variable
    private static List<Planet> allPlanets = new ArrayList<>();

    // instance variable
    private double x,y;
    private String name;

    // constructor
    public Planet(double x, double y, String name){
        this.x = x;
        this.y = y;
        this.name = name;
        allPlanets.add(this);
    }

    public static List<Planet> allPlanetsCreated(){
        return allPlanets;
    }

    // Fill-in-the blank (however, I this way below is not so efficient)
    public static double maxDistance(List<Planet> planets){
        double max = 0;
        for (Planet P : planets){
            for (Planet other : planets){
                if (P.distanceTo(other) > max){
                    max = P.distanceTo(other);
                }
            }
        }
        return max;
    }

    public double distanceTo(Planet other){
        int distance = Math.sqrt(Math.pow(this.x - other.x, 2) + Math.pow(this.y - other.y,2));
        return distance;
    }



    public static void main(String[] args) {
        System.out.println("test");
    }
}
