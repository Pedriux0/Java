package classes;


import java.util.ArrayList;
import java.util.List;

public class student {

    public grades addSubject;
    private String name;
    private List<grades> subjects;

    public student(String name){
        this.name= name;
        this.subjects = new ArrayList<grades>();
    }
    public String getName(String name){
        return name;
    }
    public void addSubject(grades subject){
        subjects.add(subject);
    }

    public double getAverage(){
        int sum = 0;
        for(grades subject : subjects){
            sum += subject.getScore();
        }
        return (double) sum / subjects.size();
    }

    public char getScore(){
        double averageGrade = getAverage();
        if (averageGrade >= 90.00 && averageGrade <= 100.00){
            return 'A';
        } else if (averageGrade >= 80.00 && averageGrade <= 90.00){
            return 'B';
        }else if (averageGrade >= 70.00 && averageGrade <= 80.00){
            return 'C';
        }else if (averageGrade >= 60.00 && averageGrade <= 70.00){
            return 'D';
        }else {
            return 'F';
        }
    }
}
