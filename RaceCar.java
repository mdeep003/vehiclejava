public class RaceCar {
    private int currentFuel; 
    private int currentSpeed;
    private int speedLimit; 
    private int maxFuelCapacity; 
    public RaceCar(int currentFuel, int currentSpeed, int speedLimit, int maxFuelCapacity){
        this.currentFuel=currentFuel;
        this.currentSpeed=0;
        this.speedLimit=speedLimit; 
        this.maxFuelCapacity=maxFuelCapacity; 
    }

    public boolean increaseSpeed (int speedFactor){

        if(speedFactor<=0)
        {
            return false;
        }
         
        this.currentSpeed+=speedFactor; 

        return true; 

        

    }
    public boolean decrease(int speedFactor){

        if(speedFactor<0 || speedFactor>this.currentSpeed)
        {
            return false;
        }

        this.currentSpeed-=speedFactor; 

        return true; 

    }
    public boolean increaseFuel (int fuel){

        if(fuel<=0)
        {
            return false;
        }
         
        this.currentFuel+=fuel; 

        return true; 

    }
    public boolean decreaseFuel (int fuel){
        if(fuel<0 || fuel>this.currentFuel)
        {
            return false;
        }

        this.currentFuel-=fuel; 

        return true; 

    }
    public void emptyFuel(){

        currentFuel=0;
    }
    public int getSpeed(){
    
        return this.currentSpeed; 
    }
    public int getFuel(){
    
        return this.currentFuel; 
    }
}
