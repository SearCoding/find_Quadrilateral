package find_Quadrilateral;

public class Quadrilateral {
  PointClass p1;
  PointClass p2;
  PointClass p3;
  PointClass p4;

  public Quadrilateral(PointClass p1, PointClass p2, PointClass p3, PointClass p4) {
    this.p1 = p1;
    this.p2 = p2;
    this.p3 = p3;
    this.p4 = p4;
  }

  public boolean getAngle(double d1, double d2) {
    double diagnoal = Math.sqrt(Math.pow(d1, 2) + Math.pow(d2, 2));

    int angle1 = (int) (Math.acos(d1 / diagnoal) * (180 / Math.PI));
    int angle2 = (int) (Math.acos(d2 / diagnoal) * (180 / Math.PI));

    if (angle1 == 45 && angle2 == 45) {
      return true;
    } else {
      return false;
    }
  }

  public boolean isRectangle() {
    double distance1to2 = Math.abs(p1.distanceTo(p2));
    double distance2to3 = Math.abs(p2.distanceTo(p3));
    double distance3to4 = Math.abs(p3.distanceTo(p4));
    double distance4to1 = Math.abs(p4.distanceTo(p1));

    double[] distances = { distance1to2, distance2to3, distance3to4, distance4to1 };
    boolean sameLength = false;
    double setDistance = distances[0];

    for (int i = 0; i < distances.length; i++) {
      if (setDistance == distances[i]) {
        sameLength = true;
      } else {
        sameLength = false;
      }
    }

    if (distance1to2 == distance3to4 && distance2to3 == distance4to1 && sameLength == false) {
      if (getAngle(distance1to2, distance3to4) == true && getAngle(distance2to3, distance4to1) == true) {
        return true;
      } else {
        return false;
      }
    } else {
      return false;
    }
  }

  public boolean isSquare() {
    double distance1to2 = Math.abs(p1.distanceTo(p2));
    double distance2to3 = Math.abs(p2.distanceTo(p3));
    double distance3to4 = Math.abs(p3.distanceTo(p4));
    double distance4to1 = Math.abs(p4.distanceTo(p1));

    boolean sameLength = false;

    double[] distances = { distance1to2, distance2to3, distance3to4, distance4to1 };
    double setDistance = distances[0];

    for (int i = 0; i < distances.length; i++) {
      if (setDistance == distances[i]) {
        sameLength = true;
      } else {
        sameLength = false;
      }
    }

    if (sameLength == true) {
      if (getAngle(distance1to2, distance3to4) == true && getAngle(distance2to3, distance4to1) == true) {
        return true;
      } else {
        return false;
      }
    } else {
      return false;
    }
  }
}
