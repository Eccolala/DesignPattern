package Singleton_Pattern;

/**
 * AppConfig单例类
 */
public class AppConfig {
    private static AppConfig appConfig;
    private String info;

    private AppConfig(){
        appConfig = this;
        info = "已创建AppConfig单例类";
    }

    public static synchronized AppConfig getInstance(){
        if (appConfig == null){
            appConfig = new AppConfig();
        }
        return appConfig;
    }

    public void show(){
        System.out.print("已创建AppConfig单例类");
    }
}
