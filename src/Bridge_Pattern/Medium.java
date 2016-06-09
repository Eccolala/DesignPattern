package Bridge_Pattern;

/**
 * 设置咖啡尺寸为中杯
 */
public class Medium implements Size {
    @Override
    public String CoffeeSize() {
        return "这是中杯咖啡";
    }
}
