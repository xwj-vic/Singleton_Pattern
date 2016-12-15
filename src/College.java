/**
 * Created by xuweijie on 2016/10/20.
 */
public class College {

    public static String collegeId(String name){
        switch (name){
            case "信息学院":
                return "01";
            case "计算机学院":
                return "02";
            case "外国语学院":
                return "03";
        }
        return null;
    }
}
