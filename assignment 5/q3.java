import java.util.Vector;

class Marks {
    double marks;
    String Rollno;
    String name;

    Marks(double Marks, String Rollno, String name) {
        this.marks = Marks;
        this.Rollno = Rollno;
        this.name = name;
    }
}

class Phsyics extends Marks {
    String Subject_name = "physics";

    Phsyics(double Marks, String Rollno, String name) {
        super(Marks, Rollno, name);
    }
}

class Class_marks {
    private Vector marks_list = new Vector(20);
    int no_of_students;

    void apend(Marks m) {
        marks_list.addElement(m);
    }

    double find_average() {
        int i = 0;
        int a = 0;
        while (i < marks_list.size()) {
            a = a + marks_list.elementAt(i).marks;
            i = i + 1;
        }
        double avg = a / marks_list.size();
        return avg;
    }
}