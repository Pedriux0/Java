package classes;
import javax.security.auth.Subject;
import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
       student student1 = new student("Juan Naranjo");
        student1.addSubject = (new grades("Math", 90));
        student student2 = new student("Jane");
        student2.addSubject(new grades("Math", 76));
        student2.addSubject(new grades("English", 69));
        student2.addSubject(new grades("Science", 85));

        System.out.println(student1.getName() + "'s grade: " + student1.getScore());
        System.out.println(student2.getName() + "'s grade: " + student2.getScore());

    }
}
