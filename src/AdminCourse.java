import java.util.ArrayList;
import java.util.Objects;

public class AdminCourse extends OnlineCourse{
    private ArrayList<String> document;

    public AdminCourse(){

    }
    public AdminCourse(String nameCourse, String teacher, String id, int duration, ArrayList<String> document) {
        super(nameCourse, teacher, id, duration);
        this.document = document;
    }

    public AdminCourse(AdminCourse c) {
        super(c);
        this.document = c.getDocument();
    }

    public ArrayList<String> getDocument() {
        return document;
    }

    public void setDocument(ArrayList<String> document) {
        this.document = document;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        AdminCourse that = (AdminCourse) o;
        return Objects.equals(document, that.document);
    }

    @Override
    public String toString() {
        return super.toString() +
                "document=" + document +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new AdminCourse(this);
    }
}
