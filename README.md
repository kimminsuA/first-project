이 프로젝트는 자바로 구현된 차량 관리 시스템입니다. 사용자는 새로운 차량 정보를 등록하고, 등록된 차량 정보를 출력, 검색, 삭제할 수 있습니다.

프로그램 실행 시 사용자는 메인 메뉴에서 다음과 같은 옵션을 선택할 수 있습니다.

차량 정보 등록
차량 정보 출력
차량 정보 검색
차량 정보 삭제
종료

1번 옵션을 선택하면 사용자는 차량 번호, 차종, 제조사, 모델 정보를 입력하여 새로운 차량 정보를 등록할 수 있습니다. 이때 등록 가능한 차량 수 제한을 초과하면 예외 처리됩니다.

2번 옵션을 선택하면 등록된 모든 차량 정보가 출력됩니다. 만약 등록된 차량이 없으면 예외 처리됩니다.

3번 옵션을 선택하면 차량 번호를 입력하여 해당하는 차량 정보를 검색할 수 있습니다. 검색된 차량 정보가 없으면 예외 처리됩니다.

4번 옵션을 선택하면 차량 번호를 입력하여 해당하는 차량 정보를 삭제할 수 있습니다. 삭제할 차량 정보가 없으면 예외 처리됩니다.

프로그램에서는 Car 클래스를 정의하여 차량 정보를 담고 있습니다. 이 클래스에는 차량 번호, 차종, 제조사, 모델 정보를 저장하고 있는 필드와 getter/setter 메서드가 정의되어 있습니다.

또한, 프로그램에서는 getIntInput 메소드를 사용하여 사용자로부터 숫자 입력을 받습니다. 이 메소드는 예외 처리를 포함하여 사용자로부터 올바른 입력을 받을 때까지 반복해서 입력을 받습니다.

이 프로젝트를 실행하려면 CarManagementSystem 클래스를 실행하면 됩니다. 프로그램을 종료하려면 9번 옵션을 선택하면 됩니다.
(JDK11)
----------------------------------------------------------------------------------------------------------------------------------


This project is a car management system implemented in Java. Users can register new car information and print, search, and delete registered car information.

When the program is executed, the user can choose the following options from the main menu:

Register car information
Print car information
Search car information
Delete car information
Exit
If the user selects option 1, they can register new car information by entering the car number, car type, manufacturer, and model information. If the number of cars that can be registered exceeds the limit, an exception is handled.

If the user selects option 2, all registered car information is displayed. If there are no registered cars, an exception is handled.

If the user selects option 3, they can search for car information by entering the car number. If no car information is found, an exception is handled.

If the user selects option 4, they can delete car information by entering the car number. If the car information to be deleted does not exist, an exception is handled.

The program defines the Car class to store car information. This class has fields that store car number, car type, manufacturer, and model information, as well as getter/setter methods.

In addition, the program uses the getIntInput method to receive number input from the user. This method repeats input until the user provides valid input, including exception handling.

To run this project, you can execute the CarManagementSystem class. To exit the program, you can select option 9.
(JDK11)
