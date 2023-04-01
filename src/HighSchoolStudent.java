public class HighSchoolStudent extends Student {
    private String gradeLevel;

    public HighSchoolStudent(String name, String address, int age, String gradeLevel) {
        super(name, address, age);
        this.gradeLevel = gradeLevel;
    }
    

    public String getGradeLevel() {
        return gradeLevel;
    }

    public void setGradeLevel(String gradeLevel) {
        this.gradeLevel = gradeLevel;
    }

    public String toString() {
        return "HighSchoolStudent [gradeLevel=" + gradeLevel + ", address=" + address + ", age=" + age + ", name=" + name
                + "]";
    }
}
    
