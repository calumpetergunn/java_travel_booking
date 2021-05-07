import java.util.ArrayList;

public class Flight {

    private ArrayList<Passenger> passengerList;
    private Plane plane;
    private String flightNumber;
    private String destination;
    private String origin;
    private String departTime;

    public Flight(Plane plane, String flightNumber, String destination, String origin, String departTime){
        this.passengerList = new ArrayList<>();
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.origin = origin;
        this.departTime = departTime;
    }

    public int getPassengerListSize(){
        return this.passengerList.size();
    }

    public PlaneType getPlane() {
        return this.plane.getPlaneType();
    }

    public String getFlightNumber() {
        return this.flightNumber;
    }

    public String getDestination() {
        return this.destination;
    }

    public String getOrigin() {
        return this.origin;
    }

    public String getDepartTime(){
        return this.departTime;
    }

    public int getAvailableSeats(){
        if(passengerList.size() < plane.getPlaneCapacity()){
            return plane.getPlaneCapacity() - passengerList.size();
        } else {
            return 0;
        }
    }

    public void addPassengerToFlight(Passenger passenger){
        if(getAvailableSeats() > 0 ){
            this.passengerList.add(passenger);
        }
    }
}
