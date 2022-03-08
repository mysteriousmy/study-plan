public class ChainOfReponsebilityPattern{
    public static void main(String[] args) {
        Handler handler1 = new ConcreateHandler1();
        Handler handler2 = new ConcreateHandler2();
        handler1.setNext(handler2);
        handler1.handleRequest("two");
    }
}