package Summer;

public class summercamp {
    private Integer tent1 ;
    private Integer tent2 ;
    private Integer tent3 ;

    public tent summercamp(Integer tent1, Integer tent2, Integer tent3){
        this.tent1 = 1;
        this.tent2 = 2;
        this.tent3 = 3;
        return null;
    }

    public Integer getTent1() {
        return tent1;
    }

    public void setTent1(Integer tent1) {
        this.tent1 = tent1;
    }

    public Integer getTent2() {
        return tent2;
    }

    public void setTent2(Integer tent2) {
        this.tent2 = tent2;
    }

    public Integer getTent3() {
        return tent3;
    }

    public void setTent3(Integer tent3) {
        this.tent3 = tent3;
    }

    @Override
    public String toString() {
        return "summercamp{" +
                "tent1=" + tent1 +
                ", tent2=" + tent2 +
                ", tent3=" + tent3 +
                '}';
    }
}