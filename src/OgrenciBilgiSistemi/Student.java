package OgrenciBilgiSistemi;

public class Student {
    Course c1, c2, c3;
    String name, stuNo, classes;
    double avarage;
    boolean isPass;

    public Student(Course c1, Course c2, Course c3, String name, String stuNo, String classes) {
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.avarage = 0.0;
        this.isPass = false;
    }

    void addBulkExamNote(int note1, int note2, int note3, int extraNote1, int extraNote2, int extraNote3) {
        if (note1 >= 0 && note1 <= 100)
            this.c1.note = note1;
        if (note2 >= 0 && note2 <= 100)
            this.c2.note = note2;
        if (note3 >= 0 && note3 <= 100)
            this.c3.note = note3;
        if (extraNote1 >= 0 && extraNote1 <= 100)
            this.c1.extraNote = extraNote1;
        if (extraNote2 >= 0 && extraNote2 <= 100)
            this.c2.extraNote = extraNote2;
        if (extraNote3 >= 0 && extraNote3 <= 100)
            this.c3.extraNote = extraNote3;
    }

    void isPass() {
        this.avarage = ((this.c1.note * 0.8 + this.c1.extraNote * 0.20) + (this.c2.note  * 0.8 + this.c2.extraNote * 0.20) + (this.c3.note * 0.8 + this.c3.extraNote * 0.20)) / 3.0;

        if (this.avarage > 55) {
            System.out.println("Sınıfı başarılı bir şekilde geçtiniz!! Ortalamanız: " + this.avarage);
            this.isPass = true;
        } else {
            System.out.println("Sınıfta kaldınız!! Ortalamanız: " + this.avarage);
            this.isPass = false;
        }
        printNote();
    }

    void printNote() {
        System.out.println(this.c1.name + " Notu \t:" + this.c1.note + "\tSözlü Notu \t:" + this.c1.extraNote);
        System.out.println(this.c2.name + " Notu \t:" + this.c2.note + "\tSözlü Notu \t:" + this.c2.extraNote);
        System.out.println(this.c3.name + " Notu \t:" + this.c3.note + "\tSözlü Notu \t:" + this.c3.extraNote);
        System.out.println("=============================");
    }
}
