package structuralmode.bridge;

// RMVB视频文件（具体的实现化角色）
public class RMVBFile implements VideoFile {
    @Override
    public void decode(String fileName) {
        System.out.println("RMVB视频文件" + fileName);
    }
}
