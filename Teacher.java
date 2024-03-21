/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Raihan
 */
import java.util.Arrays;

public class Teacher extends Person {
    private int numCourses;
    private final String[] courses;

    public Teacher(String name, String address) {
        super(name, address);
        numCourses = 0;
        courses = new String[10]; // Inisialisasi array dengan kapasitas awal 10
    }

    // Metode untuk menambahkan kursus baru
    public boolean addCourse(String course) {
        // Periksa apakah kursus sudah ada sebelumnya
        for (int i = 0; i < numCourses; i++) {
            if (courses[i].equals(course)) {
                return false; // Kursus sudah ada
            }
        }
        // Tambahkan kursus baru dan tambah jumlah kursus
        courses[numCourses] = course;
        numCourses++;
        return true;
    }

    // Metode untuk menghapus kursus
    public boolean removeCourse(String course) {
        for (int i = 0; i < numCourses; i++) {
            if (courses[i].equals(course)) {
                // Geser semua elemen setelah kursus yang akan dihapus
                for (int j = i; j < numCourses - 1; j++) {
                    courses[j] = courses[j + 1];
                }
                // Kurangi jumlah kursus dan set elemen terakhir ke null
                numCourses--;
                courses[numCourses] = null;
                return true;
            }
        }
        return false; // Kursus tidak ditemukan
    }

    // Metode untuk mendapatkan daftar kursus
    public String[] getCourses() {
        return Arrays.copyOf(courses, numCourses);
    }

    // Metode untuk mendapatkan jumlah kursus
    public int getNumCourses() {
        return numCourses;
    }
}
