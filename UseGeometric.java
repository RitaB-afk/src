public class UseGeometric {
    public static void main (String[] args) {
     Square carre= new Square(1,2);

     System.out.println("The area of the square is: " +carre.CalculateArea(1,2));
     Triangle trekant= new Triangle(1,2);
        System.out.println("The area of the triangle is: " +trekant.CalculateArea(1,2));
     GeometricFigure [] georef= new GeometricFigure [4];
     georef[0]= new Square(2,3);
     georef[1]= new Triangle(3,4);
     georef[2]= new Square(5,6);
     georef[3] = new Triangle(6,7);

    }
}
