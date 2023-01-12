public class Main {
    public static void main(String[] args) {
        AbstractFactory abstractFactory = new AbstractFactory();

        BaseFactory whiteFactory = abstractFactory.getFactory("WhiteFactory");
        BaseFactory blackFactory = abstractFactory.getFactory("BlackFactory");

        Circle whiteCircle = whiteFactory.createCircle();
        System.out.println(whiteCircle.shape());
        Triangle whiteTriangle = whiteFactory.createTriangle();
        System.out.println(whiteTriangle.shape());

        Circle blackCircle = blackFactory.createCircle();
        System.out.println(blackCircle.shape());
        Triangle blackTriangle = blackFactory.createTriangle();
        System.out.println(blackTriangle.shape());
    }
}
