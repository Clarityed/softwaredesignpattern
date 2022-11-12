package behavioralmodel.newobserver.traditionalmethod2;

/**
 * 客户端
 *
 * @author: clarity
 * @date: 2022年11月12日 14:16
 */
public class Client {

    public static void main(String[] args) {

        // 创建气象局网站
        CurrentConditions currentConditions = new CurrentConditions();

        // 创建气象局，并且将气象局网站传递给气象局
        WeatherData weatherData = new WeatherData(currentConditions);

        // 气象局设置气象数据
        weatherData.setDate(30, 100, 50);

        // 气象数据动态改变
        System.out.println("---------------气象数据发生改变---------------");
        weatherData.setDate(50, 150, 20);

    }

}
