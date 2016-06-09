package Bridge_Pattern;

/**
 * 设置咖啡尺寸为小杯
 */
public class Small implements Size {
    @Override
    public String CoffeeSize() {
        return "这是小杯咖啡";
    }
}
