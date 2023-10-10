package org.example.prototype;

import java.awt.geom.Point2D;

public abstract class GameUnit implements Cloneable {

  private Point2D position;

  public GameUnit() {
    this.position = new Point2D.Double(0, 0);
  }

  public GameUnit(double x, double y) {
    position = new Point2D.Double(x, y);
  }

  @Override
  public GameUnit clone() throws CloneNotSupportedException {
    GameUnit unit = (GameUnit) super.clone();
    unit.initialize();
    return unit;
  }

  protected void initialize() {
    this.position = new Point2D.Double(0, 0);
    reset();
  }

  protected abstract void reset();

  public void move(double x, double y) {
    this.position.setLocation(x, y);
  }

  public Point2D getPosition() {
    return position;
  }
}
