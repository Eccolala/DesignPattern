package Bridge_Pattern;

/**
 *Coffee加东西抽象类
 */
public abstract class AddSomethings {
    //Size接口引用
    Size mCoffeeSize;

    //设置咖啡大小
    public void setSize(Size CoffeeSize){
        this.mCoffeeSize = CoffeeSize;
    }

    public abstract String showCoffee();

}
