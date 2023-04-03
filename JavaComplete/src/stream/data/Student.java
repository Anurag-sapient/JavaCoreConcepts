package stream.data;

import java.util.List;

public class Student {
    private String name;
    private Integer gradLevel;
    private Integer gpa;
    private String gender;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gradLevel=" + gradLevel +
                ", gpa=" + gpa +
                ", gender='" + gender + '\'' +
                ", activites=" + activites +
                '}';
    }

    private List<String>activites;

    public Student(String name, Integer gradLevel, Integer gpa, String gender, List<String> activites) {
        this.name = name;
        this.gradLevel = gradLevel;
        this.gpa = gpa;
        this.gender = gender;
        this.activites = activites;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getGradLevel() {
        return gradLevel;
    }

    public void setGradLevel(Integer gradLevel) {
        this.gradLevel = gradLevel;
    }

    public Integer getGpa() {
        return gpa;
    }

    public void setGpa(Integer gpa) {
        this.gpa = gpa;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public List<String> getActivites() {
        return activites;
    }

    public void setActivites(List<String> activites) {
        this.activites = activites;
    }
}
