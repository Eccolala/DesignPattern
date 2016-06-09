package Bridge_Pattern;

/**
 * 主程序
 */
public class Application {
    public static void main(String args[]){
        Jorum jorum = new Jorum();
        Medium medium = new Medium();
        Small small = new Small();


        //提供大杯咖啡加糖
        AddSomethings JorumAddSugar = new AddSugar();
        JorumAddSugar.setSize(jorum);
        System.out.println(JorumAddSugar.showCoffee());

        //提供大杯咖啡加柠檬
        AddSomethings JorumAddLemon = new AddLemon();
        JorumAddLemon.setSize(jorum);
        System.out.println(JorumAddLemon.showCoffee());

        //提供大杯咖啡加牛奶
        AddSomethings JorumAddMilk = new AddMilk();
        JorumAddMilk.setSize(jorum);
        System.out.println(JorumAddMilk.showCoffee());
        System.out.println("====================================");


        //提供中杯咖啡加糖
        AddSomethings MediumAddSugar = new AddSugar();
        MediumAddSugar.setSize(medium);
        System.out.println(MediumAddSugar.showCoffee());

        //提供中杯咖啡加柠檬
        AddSomethings MediumAddLemon = new AddLemon();
        MediumAddLemon.setSize(medium);
        System.out.println(MediumAddLemon.showCoffee());

        //提供中杯咖啡牛奶
        AddSomethings MediumAddMilk = new AddMilk();
        MediumAddMilk.setSize(medium);
        System.out.println(MediumAddMilk.showCoffee());
        System.out.println("====================================");



        //提供小杯咖啡加糖
        AddSomethings SmallAddSugar = new AddSugar();
        SmallAddSugar.setSize(small);
        System.out.println(SmallAddSugar.showCoffee());

        //提供小杯咖啡加柠檬
        AddSomethings SmallAddLemon = new AddLemon();
        SmallAddLemon.setSize(small);
        System.out.println(SmallAddLemon.showCoffee());

        //提供小杯咖啡加牛奶
        AddSomethings SmallAddMilk = new AddMilk();
        SmallAddMilk.setSize(small);
        System.out.println(SmallAddMilk.showCoffee());
        System.out.println("====================================");

        
    }
}
