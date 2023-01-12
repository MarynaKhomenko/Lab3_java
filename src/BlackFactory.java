public class BlackFactory implements BaseFactory {
    @Override
    public Triangle createTriangle(){
        return new BlackTriangle();
    }
    @Override
    public Circle createCircle(){
        return new BlackCircle();
    }
}
