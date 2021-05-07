public enum PlaneType {

    BOEING747(416, 16000),
    AIRBUSA380(525, 20000),
    DOUGLASDC3(25, 2700),
    LEARJET75(9, 1320),
    CESSNA172(3, 345);


    private final int capacity;
    private final int payload;

    PlaneType(int capacity, int payload){
        this.capacity = capacity;
        this.payload = payload;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public int getPayload(){
        return this.payload;
    }
}
