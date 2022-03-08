public class StrategyPattern {
    public static void main(String[] args) throws Exception {
        Context c = new Context();
        Strategy s = new ConcreteStrategyA();
        c.setStrategy(s);
        c.strategyMethod();
        System.out.println("----------------");
        s = new ConcreteStrategyB();
        c.setStrategy(s);
        c.strategyMethod();
    }
}

// 抽象策略类
interface Strategy{
    public void strategyMethod(); //策略方法
}

class ConcreteStrategyA implements Strategy{

    @Override
    public void strategyMethod() {
        // TODO Auto-generated method stub
        System.out.println("具体策略A的策略方法被访问！"); 
    }

}

class ConcreteStrategyB implements Strategy{

    @Override
    public void strategyMethod() {
        // TODO Auto-generated method stub
        System.out.println("具体策略B的策略方法被访问！");
    }

}

class Context{
    private Strategy strategy;

    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
    public void strategyMethod(){
        strategy.strategyMethod();
    }
}