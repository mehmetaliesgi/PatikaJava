package OgrenciBilgiSistemi;

public class Teacher {
    String name, mpno, branch;

    public Teacher(String name, String mpno, String branch) {
        this.name = name;
        this.mpno = mpno;
        this.branch = branch;
    }

    void printTeacherInfo () {
        System.out.println("Name \t:" + this.name + "\nM.P.N. \t:" + mpno + "\nBranch \t:" + branch);
    }
}
