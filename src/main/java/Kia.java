public class Kia extends Car{

    Kia (String model, CarType type){
        setModel(model);
        setType(type);
    }



    @Override
    void startEngine() {
        if(isEngineState()){
            System.out.println("Engine is already started.");
        } else {
            setEngineState(true);
            System.out.println("Engine started");
        }
    }

    @Override
    void stopEngine() {
        if(isEngineState()){
            setEngineState(false);
            System.out.println("Engine is turned off.");
        } else{
            System.out.println("Engine is already turned off.");
        }

    }


}
