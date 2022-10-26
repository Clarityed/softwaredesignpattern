package structuralmode.adapter.object_adapter;

public class SDAdapterTF extends TFCardImpl implements SDCard {

    // 声明适配者类
    private TFCard tfCard;

    public SDAdapterTF(TFCard tfCard) {
        this.tfCard = tfCard;
    }

    @Override
    public String readSD() {
        System.out.println("adapter read TFCard");
        return tfCard.readTF();
    }

    @Override
    public void writeSD(String msg) {
        System.out.println("adapter write TFCard");
        tfCard.writeTF(msg);
    }
}
