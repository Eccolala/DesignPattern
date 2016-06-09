package Bridge_Pattern;

/**
 * 给咖啡加糖
 */
public class AddSugar extends AddSomethings {
    @Override
    public String showCoffee() {
        return mCoffeeSize.CoffeeSize() + "，已经添加糖";
    }
}
