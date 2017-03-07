package baidu.command;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/3/7.
 */
public class DemoCleint {
    public static void main(String[] args) {
        Command c = new ConcertCommand(new Receiver());
        List<Command> commands = new ArrayList<>();
        commands.add(c);
        Invoker invoker = new Invoker(commands);
        invoker.call();
    }
}
