import org.joda.time.DateTime;

import java.util.ArrayList;

public class Driver {

    public static void main(String[] args) {

            Course c1 = new Course("BP", new DateTime(2020, 9, 28, 0,0),new DateTime(2021, 6, 4, 0,0));
            Course c2 = new Course("CSIT", new DateTime(2020, 9, 28, 0,0),new DateTime(2021, 6, 4, 0,0));

            Module m1 = new Module("Software Engineering III", "CT417");
            Module m2 = new Module("Digital Signal Processing", "EE445");
            Module m3 = new Module("Advanced Professional Skills", "CT436");
            Module m4 = new Module("Machine Learning", "CT4101");

            Student s1 = new Student("Paul Kielty", new DateTime(1999,4,9,0,0), 10001);
            Student s2 = new Student("Maya McDevitt", new DateTime(1998,4,9,0,0), 10002);
            Student s3 = new Student("Enda Kilgarriff", new DateTime(2000,4,9,0,0), 10003);
            Student s4 = new Student("Harrison Ford", new DateTime(1942,7,13,0,0), 10004);

            // 1 - Add modules to course 1
            c1.addModule(m1);
            c1.addModule(m2);
            c1.addModule(m4);

            // Add modules to course 2
            c2.addModule(m1);
            c2.addModule(m3);
            c2.addModule(m4);

            // Enroll students to courses 1 & 2
            c1.enrollStudent(s1);
            c1.enrollStudent(s2);
            c2.enrollStudent(s3);

            // Print courses 1 & 2 (including modules and students enrolled)
            System.out.println("1 - Course 1 and 2 with modules and students enrolled:");
            System.out.println("COURSE 1:\n"+c1);
            System.out.println("COURSE 2:\n"+c2);

            // 2 - Add student to module independent of course
            System.out.println("\n\n\n2 - Student added to module 4 independent of course:");
            m4.addStudent(s4);
            // Print Module m4 students, includes the students from courses AND the student added independently
            System.out.println("MODULE 4 - "+m4.getModuleName()+" - registered students:\n"+m4.getStudentListString());


            // 3 - Student removed from module but not from other modules in their course: (e.g. if exempt from module)
            System.out.println("\n\n\n3 - Student removed from module 1 but not from other modules in their course:");
            m1.removeStudent(s1);
            System.out.println(s1.getName()+" - Modules:\n"+s1.getModuleListString());
            System.out.println("MODULE 1 - "+m1.getModuleName()+" - registered students:\n"+m1.getStudentListString());


            // 4 - Module removed from course, so any students enrolled in the course have that module automatically removed
            c1.removeModule(m4);
            System.out.println("\n\n\n4 - Module 4 removed from course 1, so any students enrolled in course 1 have that module automatically removed:");
            System.out.println("COURSE 1:\n"+c1);
            System.out.println("MODULE 4 - "+m4.getModuleName()+" - registered students:\n"+m4.getStudentListString());


            //5 - Final States
            System.out.println("\n\n\nFINAL STATE - COURSES");
            System.out.println("COURSE 1:\n"+c1);
            System.out.println("COURSE 2:\n"+c2);

            System.out.println("FINAL STATE - MODULES");
            System.out.println("MODULE 1 - "+m1.getModuleName()+"\nCourse(s):\n"+ m1.getCourseListString() +"Registered students:\n"+m1.getStudentListString());
            System.out.println("MODULE 2 - "+m2.getModuleName()+"\nCourse(s):\n"+ m2.getCourseListString() +"Registered students:\n"+m2.getStudentListString());
            System.out.println("MODULE 3 - "+m3.getModuleName()+"\nCourse(s):\n"+ m3.getCourseListString() +"Registered students:\n"+m3.getStudentListString());
            System.out.println("MODULE 4 - "+m4.getModuleName()+"\nCourse(s):\n"+ m4.getCourseListString() +"Registered students:\n"+m4.getStudentListString());

            System.out.println("FINAL STATE - STUDENTS");
            System.out.println("STUDENT 1 - "+s1.getName()+"\nCourse(s): "+s1.getCourseListString()+"\nModule(s):\n"+s1.getModuleListString());
            System.out.println("STUDENT 2 - "+s2.getName()+"\nCourse(s): "+s2.getCourseListString()+"\nModule(s):\n"+s2.getModuleListString());
            System.out.println("STUDENT 3 - "+s3.getName()+"\nCourse(s): "+s3.getCourseListString()+"\nModule(s):\n"+s3.getModuleListString());
            System.out.println("STUDENT 4 - "+s4.getName()+"\nCourse(s): "+s4.getCourseListString()+"\nModule(s):\n"+s4.getModuleListString());
    }
}
