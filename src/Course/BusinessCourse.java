package Course;

import java.util.Objects;

public class BusinessCourse extends OnlineCourse{
    private String business;

    public BusinessCourse(String nameCourse, String teacher, String id, String business) {
        super(nameCourse, teacher, id, 45);
        this.business = business;
    }

    public BusinessCourse(BusinessCourse b) {
        super(b);
        this.business = b.getBusiness();
    }

    public String getBusiness() {
        return business;
    }

    public void setBusiness(String business) {
        this.business = business;
    }

    @Override
    public String toString() {
        return super.toString()+business;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        BusinessCourse that = (BusinessCourse) o;
        return Objects.equals(business, that.business);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new BusinessCourse(this);
    }
}
