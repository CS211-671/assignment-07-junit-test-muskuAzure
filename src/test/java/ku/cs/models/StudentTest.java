package ku.cs.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class StudentTest {

    private Student s1;

    @BeforeEach
    void setUp() {
        s1 = new Student("6610405875","tana",30);
    }

    @Test
    void testAddScore(){
        s1.addScore(40);
        assertEquals(40,s1.getScore());
        s1.addScore(30);
        assertEquals(70,s1.getScore());
    }

    @Test
    void testCalculateGrade(){
        s1.addScore(10);
        assertEquals("C", s1.grade() );
    }

}