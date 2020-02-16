public class Parking {


    private int count;
    private int parkingLength;
    private Car[][] arr;

    Parking(int parkingLength) {
        this.parkingLength = parkingLength;
        this.arr = new Car[parkingLength][parkingLength];
    }
    // 0 - CarType.JEEP
    // 1 - CarType.SEDAN
    // 2 - CarType.COUPE

    void addCarInParking(Car car) {
        if (count == parkingLength * parkingLength) {
            System.out.println("Parking is full, please remove a car.");
        } else {
            switch (car.getType()) {
                case JEEP:
                    addCarLogic(0, car);
                    break;
                case SEDAN:
                    addCarLogic(1, car);
                    break;
                case COUPE:
                    addCarLogic(2, car);
                    break;
                default:
                    System.out.println("This type of car cannot be parked here.");
            }
        }
    }

    private void addCarLogic(int floor, Car car) {
        for (int i = 0; i < arr[floor].length - 1; i++) {
            if (arr[floor][i] != null && car.getModel() == arr[floor][i].getModel()) {
                System.out.println("The car is already in parking.");
                break;
            } else if (arr[floor][i] == null) {
                arr[floor][i] = car;
                count += 1;
                System.out.println("Car is added.");
                break;
            } else {
                if (i == arr[floor].length - 1) {
                    System.out.println("This floor is full, bro.");
                }

            }
        }

    }

    public void removeCar(int index) {
        if (index >= 0 && index < arr.length && arr[index] != null) {
            this.count -= 1;
            arr[index] = null;
            System.out.println("The car by index " + index + " is removed from parking.");
        } else {
            System.out.println("That place is empty!");
        }
    }


   /* public void getParkingInfo() {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                System.out.println(i + " :" + arr[i].getInfoLicense());
            }
        }*/

    public int getCount() {
        return count;
    }

    public void getInfo(){
        System.out.println("Count is " + count);
    }
}
