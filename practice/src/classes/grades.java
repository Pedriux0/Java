package classes;

public class grades {
    private String name;
    private double score;

    public grades(String name, double score) {
            this.name = name;
            this.score = score;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public double getScore(){
        return score;
    }

    public void setScore(double score){
        this.score = score;
    }
}

