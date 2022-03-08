public class TemplatePattern {
    public static void main(String[] args) {
        AbstractClass tm = new ConcreteClass();
        tm.TemplateMethod();
    }
}

abstract class AbstractClass {
    // 模板方法
    public void TemplateMethod() {
        SpecificMethod();
        abstractMethod1();
        abstractMethod2();
    }

    // 具体方法
    public void SpecificMethod() {
        System.out.println("抽象类中的具体方法被调用...");
    }

    // 抽象方法
    public abstract void abstractMethod1();

    public abstract void abstractMethod2();
}

class ConcreteClass extends AbstractClass {
    @Override
    public void abstractMethod1() {
        System.out.println("抽象方法1被调用");
    }

    @Override
    public void abstractMethod2() {
        // TODO Auto-generated method stub
        System.out.println("抽象方法2被调用");
    }
}