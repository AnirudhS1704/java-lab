import java.math.*;
public class Circle {
    int radius;
    Circle()
    {
        this.radius = radius;
    }
    double area()
    {
        double area = 3.14*(radius^2);
        return  area;
    }
}

class Sector extends Circle{
    double angle;
    Sector(int radius, double angle) {
        super();
        this.angle = angle;
    }


    double areaSector()
    {
        double sectorArea = 0.5*(radius^2)*angle;
        return sectorArea;
    }
}

class Segment extends Circle{
    double length;
    Segment(int radius, double length) {
        super();
        this.length = length;
    }
    double segmentArea()
    {
        double segmentArea = (radius^2)*Math.sqrt(((radius-length)/radius)-(radius-length)*(2*radius*length-length*length));
        return segmentArea;
    }
}
