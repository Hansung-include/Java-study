package arrayList;

public class StudentTest {
    public static void main(String[] args) {
        Student studentLee = new Student(1001, "Lee");
        studentLee.addsubject("국어", 100);
        studentLee.addsubject("수학", 90);
        studentLee.showStudentInfo();

        Student studentKim = new Student(1002, "Kim");
        studentKim.addsubject("국어", 100);
        studentKim.addsubject("수학", 90);
        studentKim.addsubject("영어", 80);
        studentKim.showStudentInfo();
    }
}
