/**
 * Created by xuweijie on 2016/10/20.
 */
public class StudentIDSingleton {

    public static StudentIDSingleton studentIDSingleton;
    private StudentBean studentBean;
    private int count;

    public StudentIDSingleton(StudentBean studentBean,int count) {
        this.studentBean = studentBean;
        this.count=count;
    }

    public static StudentIDSingleton getIntence(StudentBean studentBean,int count){
        studentIDSingleton=new StudentIDSingleton(studentBean,count);
        return  studentIDSingleton;
    }

    //生成学号
    public void GeneratedID(){
        for(int i=1;i<=count;i++){
            if(i<10){
                System.out.println("生成学号："+studentBean.getYear()+
                        studentBean.getCollegeID()+studentBean.getProfessionalID()+studentBean.getClassID()+"0"+i);
            }else{
                System.out.println("生成学号："+studentBean.getYear()+
                        studentBean.getCollegeID()+studentBean.getProfessionalID()+studentBean.getClassID()+i);
            }
        }
    }
}
