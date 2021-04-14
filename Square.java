public class Square extends GeometricFigure {

    public Square (int height, int width) {
    height= height;
    width = width;
    System.out.println("I am a square!!");
    }

    @Override
    public int CalculateArea(int height, int width) {
        area= width*width;
        return area;
    }
}
