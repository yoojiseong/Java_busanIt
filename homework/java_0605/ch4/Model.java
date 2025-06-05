package homework.java_0605.ch4;

public class Model {
    String carnames;
    String company;
    String year;
    String registrationDate;

    public Model(String carname, String company, String year, String registratinoDate) {
        this.carnames = carname;
        this.company = company;
        this.year = year;
        this.registrationDate = registratinoDate;
    }

    public void showInfo() {
        System.out.println("자동차 이름 : " + carnames);
        System.out.println("제조사 : " + company);
        System.out.println("연식 : " + year);
        System.out.println("등록일 : " + registrationDate);
    }
}
