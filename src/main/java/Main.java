public class Main {


    public static void main(String[] args) {
        Kia kia = new Kia("Forte", Car.CarType.COUPE);
        Parking park = new Parking(3);

        park.addCarInParking(kia);
        park.addCarInParking(kia);
    }

}
