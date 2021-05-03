package cz.educanet.praha;

import cz.educanet.praha.school.School;

public class SchoolCountAllStudents {

    public static int countAllStudents(School school) {
        int r = 0;
        for (int i = 0; i < school.classes.length;i++){
            r = r + school.classes.length + i;
        }

        return r;
    }
}
