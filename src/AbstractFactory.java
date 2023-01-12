public class AbstractFactory {
    public BaseFactory getFactory(String factories) {
        switch (factories) {
            case "WhiteFactory":
                return new WhiteFactory();
            case "BlackFactory":
                return new BlackFactory();
            default:
                throw new IllegalArgumentException("Factory not exists");
        }
    }
}
