public class CommandPattern {
    public static void main(String[] args) {
        Command cmd = new ConcreteCommand();
        Invoker ir = new Invoker(cmd);
        System.out.println("客户调用ir");
        ir.call();
    }
}
//调用者
class Invoker{
    private Command command;

    
    public Invoker(Command command) {
        this.command = command;
    }


    public void setCommand(Command command) {
        this.command = command;
    }

    public void call(){
        System.out.println("调用者执行命令");
        command.execute();
    }
}
interface Command{
    public abstract void execute();
}
class ConcreteCommand implements Command{
    private Receiver receiver;

    public ConcreteCommand() {
        receiver = new Receiver();
    }

    @Override
    public void execute() {
        // TODO Auto-generated method stub
        receiver.action();
    }
}

//接收者
class Receiver {
    public void action(){
        System.out.println("接收者的action方法被调用");
    }
}