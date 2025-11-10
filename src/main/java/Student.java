package org.example;

import java.time.LocalDate;

/**
 * org.example.Student
 * -------
 * 1:1 object model of the SQL table for org.example.Student
 */
public class Student {
    private int studentId;
    private String firstName;
    private String lastName;
    private String email;
    private LocalDate enrollmentDate;

    public Student(int studentId, String firstName, String lastName, String email, LocalDate enrollmentDate) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.enrollmentDate = enrollmentDate;
    }

    public Student(String firstName, String lastName, String email, LocalDate enrollmentDate) {
        this(0, firstName, lastName, email, enrollmentDate);
    }

    public int getStudentId() { return studentId; }
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getEmail() { return email; }
    public LocalDate getEnrollmentDate() { return enrollmentDate; }

    @Override
    public String toString() {
        return String.format(
                "org.example.Student{id=%d, first_name='%s', last_name='%s', email='%s', enrollment_date=%s}",
                studentId, firstName, lastName, email, enrollmentDate
        );
    }
}
