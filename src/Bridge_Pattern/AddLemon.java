package Bridge_Pattern;

/**
 * 给咖啡加柠檬
 */
public class AddLemon extends AddSomethings {
    @Override
    public String showCoffee() {
       return mCoffeeSize.CoffeeSize() + "，已经添加柠檬";
    }
}
