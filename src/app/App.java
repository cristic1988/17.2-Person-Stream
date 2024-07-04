package app;

public class App {

    public static void main(String[] args) {
        DataRepository provider = new DataRepository();
        DataHandler handler = new DataHandler();
        UIOperator uiOperator = new UIOperator();
        uiOperator.getOutput(handler.handleData(provider.getData()));
    }
}
