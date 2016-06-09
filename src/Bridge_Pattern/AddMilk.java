package Bridge_Pattern;

/**
 * 给咖啡加牛奶
 */
public class AddMilk extends AddSomethings {
    @Override
    public String showCoffee() {
        return mCoffeeSize.CoffeeSize() + "，已经添加牛奶";
    }
}
