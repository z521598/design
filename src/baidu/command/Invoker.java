package baidu.command;

import java.util.List;

/**
 * Created by Administrator on 2017/3/7.
 */
// 调用者，发起者
public class Invoker {
    private Command command;// 可以多条

    private List<Command> commands;

    public Invoker(List<Command> commands) {
        this.commands = commands;
    }


    // 多条可以批处理
    public void call() {
        for (int i = 0; i < commands.size(); i++) {
            commands.get(0).execute();
        }

    }
}
