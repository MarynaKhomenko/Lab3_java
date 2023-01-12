public class WhiteFactory implements BaseFactory {
    @Override
    public Triangle createTriangle(){
        return new WhiteTriangle();
    }
    @Override
    public Circle createCircle(){
        return new WhiteCircle();
    }
}
