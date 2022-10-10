package learning.basics;

import java.util.Arrays;

public class Student {
    long registrationNumber;
    String fullName;
    long rank;
    Subject[] subjects = new Subject[2];

    public Student(long registrationNumber, String fullName) {
        this.registrationNumber = registrationNumber;
        this.fullName = fullName;
    }

    public long getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(long registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public long getRank() {
        return rank;
    }

    public void setRank(long rank) {
        this.rank = rank;
    }

    public Subject[] getSubjects() {
        return subjects;
    }

    public void setSubjects(Subject[] subjects) {
        this.subjects = subjects;
    }

    @Override
    public String toString() {
        return "Student{" +
                "registrationNumber=" + registrationNumber +
                ", fullName='" + fullName + '\'' +
                ", rank=" + rank +
                ", Subjects Data=" + Arrays.toString(subjects) +
                '}';
    }
}
