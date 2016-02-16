import org.junit.*;
import static org.junit.Assert.*;

public class ParcelTest {

  @Test
  public void newParcel_instantiatesParcelCorrectly() {
    Parcel testParcel = new Parcel(3, 4, 5, 12.5);
    assertEquals(true, testParcel instanceof Parcel);
  }

  @Test
  public void newParcel_calculateVolume_16() {
    Parcel testParcel = new Parcel(2, 2, 4, 12.5);
    assertEquals(16, testParcel.volume());
  }

// IF CASTING TO DOUBLE, NEED DELTA (0), IF CASTING TO INT, NONE NEEDED
  @Test
  public void newParcel_calculateShippingCost_30point8() {
    Parcel testParcel = new Parcel(2, 2, 4, 3.85);
    assertEquals(30.8, testParcel.shippingCost(), 0);
  }


  //
  // @Test
  // public void newTriangle_instantiatesCorrectly() {
  //   Triangle testTriangle = new Triangle(2, 2, 2);
  //   assertEquals(true, testTriangle instanceof Triangle);
  // }
  //
  // @Test
  // public void newTriangle_setsSide1() {
  //   Triangle testTriangle = new Triangle(2, 2, 2);
  //   assertEquals(2, testTriangle.getSide1());
  // }
  // @Test
  // public void newTriangle_setsSide2() {
  //   Triangle testTriangle = new Triangle(2, 2, 2);
  //   assertEquals(2, testTriangle.getSide2());
  // }
  // @Test
  // public void newTriangle_setsSide3() {
  //   Triangle testTriangle = new Triangle(2, 2, 2);
  //   assertEquals(2, testTriangle.getSide3());
  // }
  //
  // @Test
  // public void isEquilateral_whenAllSidesEqual_true() {
  //   Triangle testTriangle = new Triangle(3, 3, 3);
  //   assertEquals(true, testTriangle.isEquilateral());
  // }
  //
  // @Test
  // public void isIsosceles_whenTwoSidesEqual_true() {
  //   Triangle testTriangle = new Triangle(4, 4, 5);
  //   assertEquals(true, testTriangle.isIsosceles());
  // }
  //
  // @Test
  // public void isScalene_whenNoSidesEqual_true() {
  //   Triangle testTriangle = new Triangle(3, 4, 5);
  //   assertEquals(true, testTriangle.isScalene());
  // }
  //
  // @Test
  // public void isNotATriangle_whenSumOfTwoSidesIsLessThanLengthOfThird_true() {
  //   Triangle testTriangle = new Triangle(2, 2, 8);
  //   assertEquals(true, testTriangle.isNotTriangle());
  // }

}
