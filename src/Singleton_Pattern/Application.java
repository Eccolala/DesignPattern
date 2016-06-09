package Singleton_Pattern;

/**
 * 主程序
 */
public class Application {
    public static void main(String args[]){
        AppConfig mApp = AppConfig.getInstance();
        mApp.show();
    }
}
