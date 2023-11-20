package Course;

import java.util.Objects;

public abstract class OnlineCourse {
    private String nameCourse;
    private String teacher;
    private String id;
    private int duration;

    public OnlineCourse(String nameCourse, String teacher, String id, int duration) {
        this.nameCourse = nameCourse;
        this.teacher = teacher;
        this.id = id;
        this.duration = duration;
    }
    public OnlineCourse(OnlineCourse course){
        this.nameCourse = course.getNameCourse();
        this.teacher = course.getTeacher();
        this.id = course.getId();
        this.duration = course.getDuration();
    }

    public String getNameCourse() {
        return nameCourse;
    }

    public void setNameCourse(String nameCourse) {
        if(nameCourse.length()<4)return;
        this.nameCourse = nameCourse;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher.trim().replace(" ",",");
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = nameCourse.charAt(0)+id.trim()+teacher.charAt(0);
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        if (duration<30)return;
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Course.OnlineCourse{" +
                "nameCourse='" + nameCourse + '\'' +
                ", teacher='" + teacher + '\'' +
                ", id='" + id + '\'' +
                ", duration=" + duration +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OnlineCourse that = (OnlineCourse) o;
        return duration == that.duration && Objects.equals(nameCourse, that.nameCourse) && Objects.equals(teacher, that.teacher) && Objects.equals(id, that.id);
    }

    /*
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new Course.OnlineCourse(this);
    }*/
}
