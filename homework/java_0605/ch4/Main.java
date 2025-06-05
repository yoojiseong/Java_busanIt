package homework.java_0605.ch4;

import java.util.Scanner;

public class Main {
    // 자동차 관리 프로그램
    // 자동차 정보 1) 자동차명 2)제조사 3)연식 4) 등록일로 구성
    // 메서드 : showInfo()메서드 만들기
    // 자동차 정보 crud, 추가, 조회 수정 삭제 검색 더미데이터 추가 구형
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);   
    do{
    int menu;
    System.out.println("메뉴를 선택해 주세요");
    System.out.println("1.자동차 정보 추가 2.자동차 정보 조회 3.자동차 정보 수정, 4. 자동차 정보 삭제, 5.자동차 검색 , 6. 더미데이터 추가");
    menu = scanner.nextInt();
    switch(menu){
        case 1:
        Func.addData(scanner);
        break;
        case 2:
        Func.showData();
        break;
        case 3:
        Func.updateData(scanner);
        break;
        case 4:
        Func.deleteData(scanner);
        break;
        case 5:
        Func.searchData(scanner);
        break;
        case 6:
        Func.addDummyData();
        break;
        case 0:
        System.out.println("프로그램을 종료합니다.");
        return;
        default:
        System.out.println("잘못된 메뉴 선택입니다. 다시 시도하세요.");
        break;
    }while(menu != 0); // 메뉴가 0이 아닐 때까지 반복
    }

    }
}
