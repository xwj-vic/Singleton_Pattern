/**
 * Created by xuweijie on 2016/10/20.
 */
public class Professional {

    public static String professionalID(String name){
        switch (name){
            case "计算机科学与技术":
                return "01";
            case "软件工程":
                return "02";
            case "网络工程":
                return "03";
            case "数字媒体与技术":
                return "04";
        }
        return null;
    }
}
