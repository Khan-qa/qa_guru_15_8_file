package home.work.homeWorkModel;

import java.util.List;

public class DendiModel {
    public String name, lastName, birthday, country;
    public List<String> org;
    public int age;
    public DendiModel.Hero hero;


    public static class Hero {
        public String hero;
        public String mid;
        public String hard;
        public String izi;
    }
}
