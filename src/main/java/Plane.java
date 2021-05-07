public class Plane {

    private PlaneType planeType;

    public Plane(PlaneType planeType){
        this.planeType = planeType;
    }

    public PlaneType getPlaneType(){
        return this.planeType;
    }

    public int getPlaneCapacity(){
        return this.planeType.getCapacity();
    }

    public int getPlanePayload(){
        return this.planeType.getPayload();
    }

}
