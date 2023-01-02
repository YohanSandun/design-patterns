package behavioral.stratergy;

public class StrategyPatternTest {
    
    public static void main(String[] args) {

        Context context = new Context();

        IStrategy firstStrategy = new FirstStrategy();
        context.setStrategy(firstStrategy);
        context.execute();

        IStrategy secondStrategy = new SecondStrategy();
        context.setStrategy(secondStrategy);
        context.execute();

    }

}
