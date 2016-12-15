/**
 * Created by xuweijie on 2016/10/20.
 */
public class StudentBean {
    private String year;
    private String collegeID;
    private String professionalID;
    private String classID;
//    private String serialID;

    public StudentBean(String year, String collegeID, String professionalID, String classID) {
        this.year = year;
        this.collegeID = collegeID;
        this.professionalID = professionalID;
        this.classID = classID;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getCollegeID() {
        return collegeID;
    }

    public void setCollegeID(String collegeID) {
        this.collegeID = collegeID;
    }

    public String getProfessionalID() {
        return professionalID;
    }

    public void setProfessionalID(String professionalID) {
        this.professionalID = professionalID;
    }

    public String getClassID() {
        return classID;
    }

    public void setClassID(String classID) {
        this.classID = classID;
    }

}
