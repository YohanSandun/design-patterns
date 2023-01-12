package behavioral.command;

public class CommandPatternTest {

    public static void main(String[] args) {

        Elevator elevator = new Elevator();

        GoUpCommand cmd1 = new GoUpCommand(elevator);
        GoDownCommand cmd2 = new GoDownCommand(elevator);
        GoUpCommand cmd3 = new GoUpCommand(elevator);

        ElevatorQueue queue = new ElevatorQueue();
        queue.add(cmd1);
        queue.add(cmd2);
        queue.add(cmd3);

        queue.startElevator();

    }

}
