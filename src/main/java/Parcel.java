// cost to ship method speed of delivery, distance, dimensions, weight).

public class Parcel {
  private int mHeight;
  private int mWidth;
  private int mLength;
  private double mWeight;

  public Parcel(int height, int width, int length, double weight) {
    mHeight = height;
    mWidth = width;
    mLength = length;
    mWeight = weight;
  }

  public int volume() {
    int volume = (mHeight * mWidth * mLength);
    return volume;
  }

  public double shippingCost() {
    double shippingEstimate = (double) (volume() * mWeight);
    return shippingEstimate;
  }

  // in case we want to call them later in the output
  public int getHeight() {
    return mHeight;
  }
  public int getWidth() {
    return mWidth;
  }
  public int getLength() {
    return mLength;
  }
  public double getWeight() {
    return mWeight;
  }




  //
  // public boolean isEquilateral() {
  //   return ((mSide1 == mSide2) && (mSide2 == mSide3));
  // }
  //
  // // (side1 == side2 and side1 != side3) or (side2 == side3 and side3 != side1) or (side1 == side3 and side1 != side2)
  // public boolean isIsosceles() {
  //   return (((mSide1 == mSide2) && (mSide1 != mSide3)) || ((mSide2 == mSide3) && (mSide3 != mSide1)) || ((mSide1 == mSide3) && (mSide1 != mSide2)));
  // }
  //
  // // (side1 != side2 && side 2 != side3)
  // public boolean isScalene() {
  //   return ((mSide1 != mSide2) && (mSide2 != mSide3) && (mSide1 != mSide3));
  // }
  //
  // // (side1 + side2 > side3) or (side1 + side3 > side2) or (side2 + side3 > side1)
  // public boolean isNotTriangle() {
  //   return (((mSide1 + mSide2) < mSide3) || ((mSide1 + mSide3) < mSide2) || ((mSide2 + mSide3) < mSide1));
  // }
}
