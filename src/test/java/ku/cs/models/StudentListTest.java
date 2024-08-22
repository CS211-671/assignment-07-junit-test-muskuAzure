package ku.cs.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class StudentListTest {

    private StudentList studentList;

    @BeforeEach
    void setUp() {
        studentList = new StudentList();
    }

    @Test
    void testAddStudent() {

        studentList.addNewStudent("6510450445", "boss");
        studentList.addNewStudent("6510402141", "tong");
        studentList.addNewStudent("6510405875", "tana");

        Student s1 = studentList.findStudentById("6510405875");

        assertEquals("tana",s1.getName());

    }

    @Test
    void testAddStudentWithScore(){
        studentList.addNewStudent("6510450445", "boss",1);
        studentList.addNewStudent("6510402141", "tong",2);
        studentList.addNewStudent("6510405875", "tana",3);

        Student s1 = studentList.findStudentById("6510405875");

        assertEquals(3,s1.getScore());

    }

    @Test
    void testFindStudentById(){
        studentList.addNewStudent("6510405875", "tana",3);

        Student s1 = studentList.findStudentById("6510405875");

        assertEquals("tana",s1.getName());
    }

    @Test
    void giveScoreTo() {

        studentList.addNewStudent("6510450445", "boss");
        studentList.addNewStudent("6510402141", "tong");
        studentList.addNewStudent("6510405875", "tana");

        studentList.giveScoreToId("6510405875",7);

        Student s1 = studentList.findStudentById("6510405875");

        assertEquals(7,s1.getScore());
    }

    @Test
    void getGradeOfId(){

        studentList.addNewStudent("6510405875", "tana",100);

        assertEquals("A",studentList.viewGradeOfId("6510405875"));


    }





}
