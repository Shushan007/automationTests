public class Subaru extends Car {

    Subaru (String model, CarType type){
        setModel(model);
        setType(type);
    }

    void startEngine() {
        if (isEngineState()) {
            System.out.println("Engine is already started.");
        } else {
            setEngineState(true);
            System.out.println("Engine started");
        }
    }

    void stopEngine() {
        if (isEngineState()) {
            setEngineState(false);
            System.out.println("Engine is turned off.");
        } else {
            System.out.println("Engine is already turned off.");
        }
    }
}
