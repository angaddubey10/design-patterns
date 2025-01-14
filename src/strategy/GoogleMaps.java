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

// Above Code has voilation for SRP and OCP
// As an improvement we can take out the logic and Impelment a class for each type
class CarPathFinder{void findPath(){}}
class BikePathFinder{void findPath(){}}
class WalkPathFinder{void findPath(){}}
class GoogleMaps{
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


