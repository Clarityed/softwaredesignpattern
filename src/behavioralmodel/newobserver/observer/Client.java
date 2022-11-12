package behavioralmodel.newobserver.observer;

/**
 * 客户端（测试类）
 *
 * @author: clarity
 * @date: 2022年11月12日 19:59
 */
public class Client {

    public static void main(String[] args) {

        // 创建气象局，也就目标对象
        WeatherData weatherData = new WeatherData();

        // 创建观察者
        CurrentConditions currentConditions = new CurrentConditions();
        // 可以在不修改代码的情况下，只需要添加观察者即可实现，项目的扩建，遵循 ocp 原则
        YuanShenSite yuanShenSite = new YuanShenSite();

        // 像目标对象加入观察者
        weatherData.registerObserver(currentConditions);
        weatherData.registerObserver(yuanShenSite);

        // 设置气象数据
        System.out.println();
        weatherData.setDate(45f, 50f, 22.0f);

        // 移除气象局网站，并且更新气象数据
        weatherData.removeObserver(currentConditions);
        System.out.println();
        weatherData.setDate(46f, 51f, 22.4f);

    }

}
