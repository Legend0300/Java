public class HighhighSchoolStudent extends HighSchoolStudent {
    private String highgradeLevel;

    public HighhighSchoolStudent(String name, String address, int age, String gradeLevel , String highgradeLevel) {
        super(name, address, age, gradeLevel);
        this.highgradeLevel = highgradeLevel;
    }

    public int reduceAge() {
        setAge(age + 1);
        return getAge();
    }

    public String toString() {
        return "HighhighSchoolStudent [gradeLevel=" + getGradeLevel() + ", address=" + address + ", age=" + age + ", name=" + name
                +   " highgradeLevel=" + highgradeLevel +"]";
    }
}
    

