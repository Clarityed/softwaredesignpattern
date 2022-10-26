package structuralmode.adapter.object_adapter;

public class Client {
    public static void main(String[] args) {
        // 创建计算机对象
        Computer computer = new Computer();
        // 读取SD卡中的对象
        String msg = computer.readSD(new SDCardImpl());
        System.out.println(msg);

        System.out.println("===========================");
        // 使用该电脑读取TF卡中的数据
        // 创建适配器类对象 new SDAdapterTF(new TFCardImpl())
        String msg1 = computer.readSD(new SDAdapterTF(new TFCardImpl()));
        System.out.println(msg1);
    }
}
