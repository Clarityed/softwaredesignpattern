package behavioralmodel.strategy;

public class Client {
    public static void main(String[] args) {
        //春节来了，使用春节促销活动
        Strategy strategyA = new StrategyA();
        SalesMan salesMan = new SalesMan(strategyA);
        //展示促销活动
        salesMan.salesManShow();

        System.out.println("========================");
 
        //中秋节来了，使用中秋节活动
        SalesMan salesMan2 = new SalesMan(new StrategyB());
        //展示促销活动
        salesMan2.salesManShow();

        System.out.println("========================");

        //圣诞节来了，使用圣诞节活动
        salesMan.setStrategy(new StrategyC());
        salesMan.salesManShow();

    }
}
