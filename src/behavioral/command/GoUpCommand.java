package behavioral.command;

public class GoUpCommand implements Command {

    private final Elevator elevator;

    public GoUpCommand(Elevator elevator) {
        this.elevator = elevator;
    }

    @Override
    public void execute() {
        elevator.goUp();
    }
}
