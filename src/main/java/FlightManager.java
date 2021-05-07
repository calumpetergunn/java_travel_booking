public class FlightManager {

    private Flight flight;

    public FlightManager(Flight flight){
        this.flight = flight;
    }

    public int calculateWeightPerPassengerAllocation(){
        int overallWeight = flight.getPlane().getPayload() / 2;
        int passengerAllocation = (int)Math.ceil((double)overallWeight / flight.getPlane().getCapacity());
        return passengerAllocation;
    }

    public int calculateBookedWeight(){
        return flight.getPassengerListSize() * this.calculateWeightPerPassengerAllocation();
    }

    public int calculateWeightRemainingOnFlight(){
        return flight.getPlane().getPayload() - this.calculateBookedWeight();
    }





}
