package behavioral.command;

public class GoDownCommand implements Command {

    private final Elevator elevator;

    public GoDownCommand(Elevator elevator) {
        this.elevator = elevator;
    }

    @Override
    public void execute() {
        elevator.goDown();
    }

}
