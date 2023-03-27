import java.math.*;
import java.util.Scanner;
class Circle {
    int radius;
    
    Circle(int radius)
    {
        this.radius = radius;
    }
    
    double area()
    {
        double area = 3.14*(radius*radius);
        return  area;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the radius");
        int radius = sc.nextInt();
        Circle circle = new Circle(radius);

        System.out.println("Enter the angle of sector in degrees");
        double angle = sc.nextDouble();
        Sector sector = new Sector(radius, angle);

        System.out.println("Enter the length of segment");
        double length = sc.nextDouble();
        Segment segment = new Segment(radius, length);

        double areaOfCircle, areaOfSector, areaOfSegment;
        areaOfCircle =  circle.area();
        areaOfSector = sector.areaSector();
        areaOfSegment = segment.segmentArea();

        System.out.println("Area of circle = "+areaOfCircle);
        System.out.println("Area of sector = "+areaOfSector);
        System.out.println("Area of segment = "+areaOfSegment);
    }
}

class Sector extends Circle{
    double angle;
    Sector(int radius, double angle) {
        super(radius);
        this.angle = angle;
    }


    double areaSector()
    {
        double sectorArea = 0.5*(radius*radius)*angle/360;
        return sectorArea;
    }
}

class Segment extends Circle{
    double length;
    Segment(int radius, double length) {
        super(radius);
        this.length = length;
    }
    double segmentArea()
    {
        double segmentArea = (radius*radius)*Math.sqrt(((radius-length)/radius)-(radius-length)*(2*radius*length-length*length));
        return segmentArea;
    }
}
