package Person;

import Course.OnlineCourse;

import java.util.ArrayList;
import java.util.Objects;

public class Teacher extends Person{
    private OnlineCourse course;
    private ArrayList<Student> students;

    public Teacher() {
    }

    public Teacher(String name, String surname, String email, OnlineCourse course, ArrayList<Student> students) {
        super(name, surname, email);
        this.course = course;
        this.students = students;
    }

    public Teacher(Teacher p) {
        super(p);
        this.course = p.course;
        this.students = p.students;
    }

    public OnlineCourse getCourse() {
        return course;
    }

    public void setCourse(OnlineCourse course) {
        this.course = course;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "course=" + course +
                ", students=" + students +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Teacher teacher = (Teacher) o;
        return Objects.equals(course, teacher.course) && Objects.equals(students, teacher.students);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new Teacher(this);
    }
}
