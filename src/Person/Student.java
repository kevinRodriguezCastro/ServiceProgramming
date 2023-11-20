package Person;

import Course.OnlineCourse;

import java.util.Objects;

public class Student extends Person{
    private OnlineCourse course;

    public Student() {
    }

    public Student(String name, String surname, String email, OnlineCourse course) {
        super(name, surname, email);
        this.course = course;
    }

    public Student(Student p) {
        super(p);
        this.course = p.course;
    }

    public OnlineCourse getCourse() {
        return course;
    }

    public void setCourse(OnlineCourse course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "course=" + course +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Student student = (Student) o;
        return Objects.equals(course, student.course);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new Student(this);
    }
}
