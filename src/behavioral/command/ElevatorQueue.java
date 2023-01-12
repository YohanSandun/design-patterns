package behavioral.command;

import java.util.ArrayList;
import java.util.List;

public class ElevatorQueue {

    private List<Command> queue = new ArrayList<>();

    public void add(Command command) {
        queue.add(command);
    }

    public void startElevator() {
        for (Command cmd: queue) {
            cmd.execute();
        }
        queue.clear();
    }

}
