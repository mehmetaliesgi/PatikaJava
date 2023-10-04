package OgrenciBilgiSistemi;

public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Mahmut", "555-111-2233", "TRH");
        Teacher t2 = new Teacher("Graham Bell", "222-111-3334", "FZK");
        Teacher t3 = new Teacher("Kül Yutmaz", "412-124-1212", "BIYO");

        Course tarih = new Course("Tarih", "101", "TRH");
        Course fizik = new Course("Fizik", "102", "FZK");
        Course biyoloji = new Course("Fizik", "102", "BIYO");

        tarih.addTeacher(t1);
        fizik.addTeacher(t2);
        biyoloji.addTeacher(t3);

        Student student1 = new Student(tarih, fizik, biyoloji, "İnek Şaban", "123", "4");
        student1.addBulkExamNote(100, 80, 42, 30, 80, 100);
        student1.isPass();

        Student student2 = new Student(tarih, fizik, biyoloji, "Güdük Necmi", "124", "4");
        student2.addBulkExamNote(80, 30, 68, 100, 40, 90);
        student2.isPass();

    }
}
