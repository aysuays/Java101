package com.patika.dev.SIS;

public class Student {
    String name, stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    double avarage;
    boolean isPass;


    Student(String name, int classes, String stuNo, Course mat, Course fizik, Course kimya) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        calcAvarage();
        this.isPass = false;
    }


    public void addBulkExamNote(int mat, int vmath, int fizik, int vfizik, int kimya, int vkimya) {

        if (mat >= 0 && mat <= 100 && vmath >= 0 && vmath <= 100) {
            this.mat.note = mat;
            this.mat.verbalNote = vmath;
            this.mat.avarageNote();

        }

        if (fizik >= 0 && fizik <= 100 && vfizik >= 0 && vfizik <= 100) {
            this.fizik.note = fizik;
            this.fizik.verbalNote = vfizik;
            this.fizik.avarageNote();
        }

        if (kimya >= 0 && kimya <= 100 && vkimya >= 0 && vkimya <= 100) {
            this.kimya.note = kimya;
            this.kimya.verbalNote = vkimya;
            this.kimya.avarageNote();
        }

    }

    public void isPass() {
        if (
        this.mat.finalNote == 0 || this.fizik.finalNote == 0 || this.kimya.finalNote == 0 || this.mat.verbalNote == 0 || this.fizik.verbalNote == 0
                || this.kimya.verbalNote == 00){
            System.out.println("Notlar tam olarak girilmemiş");
        } else{
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }

    public void calcAvarage() {
        this.avarage = (this.fizik.finalNote + this.kimya.finalNote + this.mat.finalNote) / 3;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote() {
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Notu : " + this.mat.finalNote);
        System.out.println("Fizik Notu : " + this.fizik.finalNote);
        System.out.println("Kimya Notu : " + this.kimya.finalNote);
    }

}
