// cost to ship method speed of delivery, distance, dimensions, weight).

public class Parcel {
  private int mHeight;
  private int mWidth;
  private int mLength;
  private double mWeight;
  private int mDistance;
  private int mSpeed;

  public Parcel(int height, int width, int length, double weight, int distance, int speed) {
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
    double shippingEstimate = (double) ((volume() * mWeight) / 2);
    double totalShippingCost = (double) ((shippingEstimate + (mDistance/50) * (mSpeed / 2)));
    return totalShippingCost;
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

}
