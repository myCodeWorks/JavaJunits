package learning.basics;

import java.util.*;

public class JavaUtil {

    public static void listStructure() {
        List<Integer> arrayList = new ArrayList<>();

        arrayList.add(123);
        arrayList.add(321);
        arrayList.add(231);

        System.out.println("List");
        //iterate using plain old for loop
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println("old convention - integer value -> " + arrayList.get(i));
        }
        //iterate using enhanced for loop
        System.out.println();
        for (Integer integer : arrayList) {
            System.out.println("enhanced for loop -> integer value -> " + integer);
        }

        //iterate using listIterator
        System.out.println();
        Iterator<Integer> listIterator = arrayList.listIterator();
        while (listIterator.hasNext()) {
            System.out.println("using listIterator -> integer value -> " + listIterator.next());
        }
    }

    public static void setStructure() {
        //do not allow duplicates
        Set<Integer> hashSet = new HashSet<>();

        //order of insertion can't be guaranteed
        hashSet.add(123);
        hashSet.add(321);
        hashSet.add(231);
        hashSet.add(321);
        hashSet.add(123);
        hashSet.add(1234);

        //can't use plain old for loop for set as it does not have a get method like list
        //iterate using enhanced for loop
        System.out.println("\nset");
        for (Integer integer : hashSet) {
            System.out.println("enhanced for loop -> integer value -> " + integer);
        }

        //iterate using list iterator
        System.out.println();
        Iterator<Integer> iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            System.out.println("using iterator -> integer value -> " + iterator.next());
        }

    }

    public static void populateMarks(Student studentData, int... marks){
        for(int i=0;i< studentData.getSubjects().length;i++){
            studentData.getSubjects()[i].setMarks(marks[i]);
        }
    }

    public static Map<Long,Student> populateStudentData(){
        Map<Long,Student> students = new HashMap<>();

        Student stud1 = new Student(1,"SG");
        Student stud2 = new Student(3,"GS");
        Student stud3 = new Student(2,"GSS");

        students.put(stud1.getRegistrationNumber(),stud1);
        students.put(stud2.getRegistrationNumber(),stud2);
        students.put(stud3.getRegistrationNumber(),stud3);

        Subject subject1 = new Subject("Math");
        Subject subject2 = new Subject("Science");
        Subject subject3 = new Subject("Computer Science");
        Subject[] subjects = {subject1,subject2,subject3};

        stud1.setSubjects(subjects);
        populateMarks(stud1,52,37,56);
        stud2.setSubjects(subjects);
        populateMarks(stud2,43,47,66);
        stud3.setSubjects(subjects);
        populateMarks(stud3,73,67,46);

        return students;
    }

    public static void mapStructure(){
        Map<Long,Student> students = populateStudentData();
        System.out.println();
        for (Map.Entry<Long,Student> entry:students.entrySet()
             ) {
            System.out.println("\nKey -> Regn#->"+entry.getKey()+
            "\nValue -> Student Object ->"+entry.getValue());
        }
    }

    public static void main(String[] args) {
        listStructure();
        setStructure();
        mapStructure();
    }
}
