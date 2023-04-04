package CarManagementSystem;

public class Car {
	// 차량 번호, 차종, 제조사, 모델 정보를 담는 클래스
    private String carNumber;// 차량 번호
    private String carType;// 차종
    private String manufacturer;// 제조사
    private String model;// 모델

    public Car(String carNumber, String carType, String manufacturer, String model) {
    	  // Car 클래스의 생성자, 차량 정보를 입력받아 객체를 생성함
        this.carNumber = carNumber; 
        this.carType = carType;
        this.manufacturer = manufacturer;
        this.model = model;
    }

    public String getCarNumber() {
    	 // 차량 번호를 반환하는 메서드
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
    	  // 차량 번호를 설정하는 메서드
        this.carNumber = carNumber;
    }

    public String getCarType() {
    	 // 차종을 반환하는 메서드
        return carType;
    }

    public void setCarType(String carType) {
    	// 차종을 설정하는 메서드
        this.carType = carType;
    }

    public String getManufacturer() {
    	   // 제조사를 반환하는 메서드
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
    	   // 제조사를 설정하는 메서드
        this.manufacturer = manufacturer;
    }

    public String getModel() {
    	 // 모델을 반환하는 메서드
        return model;
    }

    public void setModel(String model) {
    	  // 모델을 설정하는 메서드
        this.model = model;
    }

    @Override
    public String toString() {
    	// 객체 정보를 문자열로 반환하는 메서드
        return "차량번호: " + carNumber + ", 차종: " + carType + ", 제조사: " + manufacturer + ", 모델: " + model;
    }
}