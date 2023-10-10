package org.example.prototype;

public class General extends GameUnit {

  private String state = "idle";

  public void boostMorale() {
    this.state = "boosting";
  }

  @Override
  public GameUnit clone() throws CloneNotSupportedException {
    throw new CloneNotSupportedException("Generals are unique");
  }

  @Override
  protected void reset() {
    throw new UnsupportedOperationException("Reset not supported");
  }
}
