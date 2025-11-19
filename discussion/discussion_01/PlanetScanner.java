public class PlanetScanner {
    Planet[] planets;
    Planet[] scanned_Planets;

    public PlanetScanner(Planet[] planets, int numToScan){
        this.planets = planets;
        this.scanned_Planets = new Planet[0];
        this.scanMorePlanets(numToScan);
    }

    public Planet[] scannedPlants(){
        return this.scanned_Planets;
    }

    public void scanMorePlanets(int numToScan){
        int newSize = this.scanned_Planets.length + numToScan;
        Planet[] newScan = new Planet[newSize];
        for (int i = 0; (i < newSize) && (i < this.planets.length); i++){
            newScan[i] = this.planets[i];
        }
        this.scanned_Planets = newScan;
    }

    public static void main(String[] args) {
        
    }
}
