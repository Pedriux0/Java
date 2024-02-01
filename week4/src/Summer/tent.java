package Summer;

public class tent {
    private String student;
    private String student2;

    private Integer ages1;

    private Integer ages2;

    public tent(String student , String student2, Integer ages1, Integer ages2){
        this.student = student;
        this.student2= student;
        this.ages1 = ages1;
        this.ages2 = ages2;
    }

    public String getStudent() {
        return student;
    }

    public void setStudent(String student) {
        this.student = student;
    }

    public String getStudent2() {
        return student2;
    }

    public void setStudent2(String student2) {
        this.student2 = student2;
    }

    public Integer getAges1() {
        return ages1;
    }

    public void setAges1(Integer ages1) {
        this.ages1 = ages1;
    }

    public Integer getAges2() {
        return ages2;
    }

    public void setAges2(Integer ages2) {
        this.ages2 = ages2;
    }

    @Override
    public String toString() {
        return "tent{" +
                "student='" + student + '\'' +
                ", student2='" + student2 + '\'' +
                ", ages1=" + ages1 +
                ", ages2=" + ages2 +
                '}';
    }
}

