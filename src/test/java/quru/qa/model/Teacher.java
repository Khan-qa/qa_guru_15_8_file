package quru.qa.model;

import java.util.List;

public class Teacher {
    public String name;
    public int age;
    public boolean test;
    public List<String> lessons;
    public Passport passport;

    public static class Passport {
        public int number;
        public String issueDate;
    }
}
