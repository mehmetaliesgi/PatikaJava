package OgrenciBilgiSistemi;

public class Course {
    Teacher teacher;
    String name, code, prefix;
    int note, extraNote;

    public Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        int note = 0;
        int extraNote = 0;
    }

    public void addTeacher(Teacher teacher) {
        if (teacher.branch.equals(this.prefix)) {
            this.teacher = teacher;
        } else {
            System.out.println("Öğretmen ve ders bilgileri uyuşmuyor.");
        }
    }

    void teacherInfo() {
        this.teacher.printTeacherInfo();
    }
}
