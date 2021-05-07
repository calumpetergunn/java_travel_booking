public class FlightManager {

    private Flight flight;

    public FlightManager(Flight flight){
        this.flight = flight;
    }

    public int calculateWeightPerPassengerAllocation(){
        double overallWeight = flight.getPlane().getPayload() / 2;
        double passengerAllocation = overallWeight / flight.getPlane().getCapacity();
        return (int)Math.ceil(passengerAllocation);
    }

    public int calculateBookedWeight(){
        return flight.getPassengerListSize() * this.calculateWeightPerPassengerAllocation();
    }

    public int calculateWeightRemainingOnFlight(){
        return flight.getPlane().getPayload() - this.calculateBookedWeight();
    }

    public void bookTrip(Flight flight, Passenger passenger){
        flight.addPassengerToFlight(passenger);
        passenger.addFlight(flight);

    }





}
