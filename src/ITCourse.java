import java.util.Objects;

public class ITCourse extends OnlineCourse {
    Specialization specialization;

    public ITCourse(String nameCourse, String teacher, String id, Specialization specialization) {
        super(nameCourse, teacher, id, specialization.getDuration());
        this.specialization = specialization;
    }

    public ITCourse(ITCourse it) {
        super(it);
        this.specialization = it.getSpecialization();
    }

    public Specialization getSpecialization() {
        return specialization;
    }

    public void setSpecialization(Specialization specialization) {
        this.specialization = specialization;
    }

    @Override
    public String toString() {
        return super.toString()+specialization;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ITCourse itCourse = (ITCourse) o;
        return specialization == itCourse.specialization;
    }

}
