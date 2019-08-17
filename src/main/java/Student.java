public class Student implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private Integer studentId;
    private String studentName;
    private String studentAge;
    private StudentInformation studentInfo;

    public Student() {
    }

    public Student(String studentName, String studentAge) {
        this.studentName = studentName;
        this.studentAge = studentAge;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public Integer getStudentId() {
        return this.studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return this.studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentAge() {
        return this.studentAge;
    }

    public void setStudentAge(String studentAge) {
        this.studentAge = studentAge;
    }

    public StudentInformation getStudentInfo() {
        return studentInfo;
    }

    public void setStudentInfo(StudentInformation studentInfo) {
        this.studentInfo = studentInfo;
    }
}
