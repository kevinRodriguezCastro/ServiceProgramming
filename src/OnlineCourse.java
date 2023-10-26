public class OnlineCourse {
    private String nameCourse;
    private String teacher;
    private String id;
    private int duration;

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
}
