package interfaceex;

public class CompleteCalc extends Calculator{
    public int times(int num1, int num2) {
        return num1 * num2;
    }

    public int divide(int num1, int num2) {
        if(num2 != 0) {
            return num1 / num2;
        }
        return -999999999;
    }

    public void showInfo(){
        System.out.println("Calc 인터페이스를 구현하였습니다.");
    }
}
