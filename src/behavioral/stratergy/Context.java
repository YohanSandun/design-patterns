package behavioral.stratergy;

public class Context {

    private IStrategy strategy;

    public void setStrategy(IStrategy strategy) {
        this.strategy = strategy;
    }

    public IStrategy getStrategy() {
        return strategy;
    }

    public void execute() {
        strategy.execute();
    }

}
