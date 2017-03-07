package baidu.command;

/**
 * Created by Administrator on 2017/3/7.
 */
public interface Command {
    void execute();
}

class ConcertCommand implements Command {
    public ConcertCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    private Receiver receiver;
    @Override
    public void execute() {
        // 命令之前，执行相关处理
        receiver.action();
        // 命令之后，执行相关处理
    }
}
