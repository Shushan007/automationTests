import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class CarTest {
    Parking parking;
    Kia kia = new Kia("Kia", Car.CarType.SEDAN);
    Subaru subaru = new Subaru("Subaru", Car.CarType.COUPE);

    // boolean state = kia.startEngine();

    @BeforeMethod
    public void beforeMethod() {
        parking = new Parking(3);


    }

    @Test
    public void parkCar() {
        parking.addCarInParking(kia);
        Assert.assertTrue(parking.getCount() == 1);

    }

    @Test
    public void parkCarSame() {
        parking.addCarInParking(kia);
        Assert.assertTrue(parking.getCount() == 1);
    }

    @Test
    public void parCar2() {
        parking.addCarInParking(subaru);
        Assert.assertTrue(parking.getCount() == 1);
    }

    @Test
    public void remove() {
        parking.addCarInParking(kia);
        parking.addCarInParking(subaru);
        parking.removeCar(0);
        Assert.assertTrue(parking.getCount()==1);

    }

/*    @Test
    public boolean start(){
        kia.startEngine();
        Assert.assertTrue(kia.startEngine());
        return true;
    }*/
}
