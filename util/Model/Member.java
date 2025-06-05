package util.Model;

public class Member {
    // 사용할 맴버 변수
    // 이름, 패스워드, 이메일, 등록일, 모두 문자열
    // 생성자는 매개변수 4개 구성
    // 각각의 정보를 호출하는 인스턴스 매서드 생성.

    String name;
    String password;
    String email;
    String registrationDate;

    public Member(String name, String password, String email, String reStringationDate) {
        this.name = name;
        this.password = password;
        this.email = email;
        this.registrationDate = reStringationDate;
    }

    public void showInfo() {
        System.out.println("회원 이름 : " + name);
        System.out.println("회원 이메일 : " + email);
        System.out.println("회원 패스워드 : " + password);
        System.out.println("회원 등록일 : " + registrationDate);
    }
}
