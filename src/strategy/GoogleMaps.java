package strategy;
// This is an Example for Strategy Design Pattern
enum  Mode {
    CAR,
    BIKE,
    WALK
}
class GoogleMaps1 {
        // Functionality of Finding Path
        void findPath(String source, String destination, Mode mode){
            if(mode == Mode.CAR){
                // Logic for Car
            }
            else if(mode == Mode.BIKE){
                // Logic for Bike
            }
            else if(mode == Mode.WALK){
                // Logic for Bike
            }
        }
}

// Above Code has violation for SRP and OCP
// As an improvement we can take out the logic and Implement a class for each type
class CarPathFinder{void findPath(){}}
class BikePathFinder{void findPath(){}}
class WalkPathFinder{void findPath(){}}
class GoogleMaps2{
    // Functionality of Finding Path
    void findPath(String source, String destination, Mode mode){
        if(mode == Mode.CAR){
            CarPathFinder cpc = new CarPathFinder();
            cpc.findPath();
        }
        else if(mode == Mode.BIKE){
            BikePathFinder bpc = new BikePathFinder();
            bpc.findPath();
        }
        else if(mode == Mode.WALK){
            WalkPathFinder wpc = new WalkPathFinder();
            wpc.findPath();
        }
    }
}

// Above has also SRP and OCP violations as well as DI Issues.
// DI - Classes shouldn't rely on other classes, it should rely on Interface.
// Below is the Strategy Design Pattern

interface PathCalculator{
    void findPath(String source, String destination);
}

class CarPathCalculator implements PathCalculator{
    public void findPath(String source, String destination){
        System.out.println("This is Car Path Calculator");
    }
}

class BikePathCalculator implements PathCalculator{
    public void findPath(String source, String destination){
        System.out.println("This is Bike Path Calculator");
    }
}

class WalkPathCalculator implements PathCalculator{
    public void findPath(String source, String destination){
        System.out.println("This is Walk Path Calculator");
    }
}

// ??????? Need to check Registry DP to Return only SingleTons - Only one object creation for whole program.
class PathCalculatorFactory{
    CarPathCalculator cpc = new CarPathCalculator();
    BikePathCalculator bpc = new BikePathCalculator();
    WalkPathCalculator wpc = new WalkPathCalculator();

    public PathCalculator getMode(Mode mode){
        if(mode == Mode.CAR) return cpc;
        else if(mode == Mode.BIKE) return bpc;
        else if(mode == Mode.WALK) return wpc;
        return null;
    }
}

public  class GoogleMaps{
    void findPath(String source, String destination, Mode mode){
        PathCalculatorFactory pcf = new PathCalculatorFactory();
        PathCalculator pc = pcf.getMode(mode);
        assert pc != null;
        pc.findPath(source, destination);
    }
}