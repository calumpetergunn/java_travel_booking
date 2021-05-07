public class Passenger {

    private String name;
    private int bags;
    private Flight flight;
    private int seatNumber;

    public Passenger(String name, int bags){
        this.name = name;
        this.bags = bags;
        this.flight = null;
        this.seatNumber = 0;
    }

    public String getName(){
        return this.name;
    }

    public int getBags(){
        return this.bags;
    }

    public Flight getFlight(){
        return this.flight;
    }

    public void addFlight(Flight flight){
        this.flight = flight;
    }

    public int getSeatNumber(){
        return this.seatNumber;
    }

    public void assignSeatNumber(int newSeatNumber){
        this.seatNumber = newSeatNumber;
    }

}
