package structuralmode.bridge;

public class Client {
    public static void main(String[] args) {
        // 创建一种文件类型
        VideoFile videoFile = new AviFile();
        // 创建一个操作系统
        OperatingSystem operatingSystem = new Windows(videoFile);
        // 播放视频
        operatingSystem.play("CLANNED");
    }
}
