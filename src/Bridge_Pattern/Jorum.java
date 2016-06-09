package Bridge_Pattern;

/**
 * 设置咖啡尺寸为大杯
 */
public class Jorum implements Size {
    @Override
    public String CoffeeSize() {
        return "这是大杯咖啡";
    }
}
