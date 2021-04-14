public class Triangle extends GeometricFigure{

    public Triangle (int height, int width) {
     height= height;
     width = width;
     System.out.println("I am a triangle!");
    }
    @Override
    public int CalculateArea(int height, int width) {
        area= (width*height)/2;
        return area;
    }
}

