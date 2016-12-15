/**
 * Created by xuweijie on 2016/10/20.
 */
public class ShowMain {
    public static void main(String[] args){
        StudentBean studentBean=new StudentBean(
                YearIn.YearInId("2014"),College.collegeId("计算机学院"),
                Professional.professionalID("软件工程"),MyClass.MyClassID("二班")
        );
        StudentIDSingleton.getIntence(studentBean,1).GeneratedID();


        StudentBean studentBean1=new StudentBean(
                YearIn.YearInId("2015"),College.collegeId("计算机学院"),
                Professional.professionalID("计算机科学与技术"),MyClass.MyClassID("三班")
        );
        StudentIDSingleton.getIntence(studentBean1,1).GeneratedID();
    }
}
