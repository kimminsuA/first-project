package CarManagementSystem;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CarManagementSystem {
	// CARS 리스트와 INPUT_SCANNER 스캐너 선언
    private static final ArrayList<Car> CARS = new ArrayList<>();
    private static final Scanner INPUT_SCANNER = new Scanner(System.in);
    private static final int CARS_LIMIT = 10; // 등록 가능한 차량 수 제한
    public static void main(String[] args) {
        while (true) {
        	 // 메인 메뉴 출력
            System.out.println("=====프로그램 제작자 김민수 =======");
            System.out.println("===== 차량 관리 등록 메뉴 =====");
            System.out.println("1. 차량 정보 등록");
            System.out.println("2. 차량 정보 출력");
            System.out.println("3. 차량 정보 검색");
            System.out.println("4. 차량 정보 삭제");
            System.out.println("9. 종료");
            System.out.print("메뉴를 선택하세요: ");
            // 메뉴 번호 입력 받음
            int menu = getIntInput();

            switch (menu) {
                case 1:
                    addCar(); // 차량 정보 등록
                    break;
                case 2:
                    printCars();// 차량 정보 출력
                    break;
                case 3:
                    int carNumber = getIntInput("검색할 차량 번호: ");
                    searchCar(carNumber);// 차량 정보 검색
                    break;
                case 4:
                    carNumber = getIntInput("삭제할 차량 번호: ");
                    deleteCar(carNumber);// 차량 정보 삭제
                    break;
                case 9:
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default:
                    System.out.println("잘못된 메뉴 선택입니다.");
            }
        }
    }
 // 차량 정보 등록 메소드
    private static void addCar() {
        System.out.println("차량 정보 등록을 시작합니다.");
        if (CARS.size() >= CARS_LIMIT) { // 등록 가능한 차량 수 제한에 도달한 경우 예외 처리
            System.out.println("더 이상 차량 정보를 등록할 수 없습니다.");
            return;
        }
        // 차량 번호 입력 받음
        int carNumber = getIntInput("차량 번호: ");
        String carType = "";
        while (true) {
        	 // 차량 종류 입력 받음
            System.out.print("차량 종류: ");
            carType = INPUT_SCANNER.next();
            if (carType.matches("^[ㄱ-ㅎ가-힣]*$")) { // 한글로만 입력했는지 검사
                break;
            } else {
                System.out.println("잘못된 입력입니다. 한글로만 입력해주세요.");
            }
        }
     // 차량 제조사, 모델 입력 받음
        System.out.print("차량 제조사: ");
        String manufacturer = INPUT_SCANNER.next();

        System.out.print("차량 모델: ");
        String model = INPUT_SCANNER.next();
        
     // 새로운 Car 객체 생성하여 CARS 리스트에 추가
        Car car = new Car(String.format("%04d", carNumber), carType, manufacturer, model);
        CARS.add(car);

        System.out.println("차량 정보 등록이 완료되었습니다.");
    }
 // 차량 정보 출력 메소드
    private static void printCars() {
        System.out.println("등록된 차량 정보를 출력합니다.");

        if (CARS.size() == 0) {	// 등록된 차량이 없을 경우 예외 처리
            System.out.println("등록된 차량이 없습니다.");
            return;
        }

        StringBuilder sb = new StringBuilder();
        for (Car car : CARS) { // 등록된 차량 정보를 문자열로 변환하여 sb에 추가
            sb.append(car).append("\n");
        }
        System.out.println(sb.toString()); // sb에 추가된 문자열 출력
    }
 // 차량 정보 검색 메소드
    private static void searchCar(int carNumber) {
        System.out.println("차량 정보 검색을 시작합니다.");

        for (Car car : CARS) {// 등록된 차량 정보를 하나씩 검사하여 차량 번호가 일치하는 차량 정보 출력
            if (Integer.parseInt(car.getCarNumber()) == carNumber) {
                System.out.println(car);
                return;
            }
        }

        System.out.println("검색된 차량이 없습니다.");// 검색된 차량이 없을 경우 예외 처리
    }
 // 차량 정보 삭제 메소드
    private static void deleteCar(int carNumber) {
    	 System.out.println("차량 정보 삭제를 시작합니다.");
    	   for (Car car : CARS) {// 등록된 차량 정보를 하나씩 검사하여 차량 번호가 일치하는 차량 정보 삭제
    	        if (Integer.parseInt(car.getCarNumber()) == carNumber) {
    	            CARS.remove(car);
    	            System.out.println("차량 정보 삭제가 완료되었습니다.");
    	            return;
    	        }
    	    }

    	    System.out.println("삭제할 차량이 없습니다.");// 삭제할 차량이 없을 경우 예외 처리
    	}
 // 숫자 입력 받는 메소드
    	private static int getIntInput() {
    	    int value = 0;
    	    while (true) {
    	        try {
    	            value = INPUT_SCANNER.nextInt(); // 정수 입력 받음
    	            break;
    	        } catch (InputMismatchException e) {
    	            System.out.println("잘못된 입력입니다. 숫자로만 입력하세요.");
    	            INPUT_SCANNER.next(); // 다음 입력을 위해 버퍼를 비워줌
    	        }
    	    }
    	    return value;
    	}
    	// 메시지와 함께 숫자 입력 받는 메소드
    	private static int getIntInput(String message) {
    	    System.out.print(message);
    	    return getIntInput();
    	}
}
    