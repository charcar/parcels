import org.junit.*;
import static org.junit.Assert.*;

public class ParcelTest {

  @Test
  public void newParcel_instantiatesParcelCorrectly() {
    Parcel testParcel = new Parcel(3, 4, 5, 12.5, 50, 2);
    assertEquals(true, testParcel instanceof Parcel);
  }

  @Test
  public void newParcel_calculateVolume_16() {
    Parcel testParcel = new Parcel(2, 2, 4, 12.5, 50, 2);
    assertEquals(16, testParcel.volume());
  }

// IF CASTING TO DOUBLE, NEED DELTA (0), IF CASTING TO INT, NONE NEEDED
  @Test
  public void newParcel_calculateShippingCost_30point8() {
    Parcel testParcel = new Parcel(2, 2, 4, 3.85, 50, 2);
    assertEquals(30.8, testParcel.shippingCost(), 0);
  }

}
