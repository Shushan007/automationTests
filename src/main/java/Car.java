public abstract class Car {
    private int currentSpeed;
    private boolean engineState;
    private CarType type;
    private String model;

    enum CarType {
        SEDAN,
        JEEP,
        COUPE
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public CarType getType() {
        return type;
    }

    public void setType(CarType type) {
        this.type = type;
    }

    public boolean isEngineState() {
        return engineState;
    }

    public void setEngineState(boolean engineState) {
        this.engineState = engineState;
    }

    void changeSpeed(int speed){
        if(speed>0){
            System.out.println("Your speed will be added by "+ speed + " km/h.");
        }
        else {
            System.out.println("Your speed will decreased by " + speed + " km/h.");
        }
        currentSpeed += speed;
        System.out.println("Current speed is " + currentSpeed);
    }

    abstract void startEngine();
    abstract void stopEngine();


}
