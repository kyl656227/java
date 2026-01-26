package ch11.sec03;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        String[] arr = { "100", "1AA"};

        for(int i = 0; i<=arr.length; i++){
            try{

                int value = Integer.parseInt(arr[i]);
                System.out.printf("arr[%d]: %d\n" , i, value);

            } catch (ArrayIndexOutOfBoundsException e){ //예외마다 다른 처리를 하고 싶을 때 (다른 메세지)
                System.out.println("배열 인덱스가 초과: " + e.getMessage());
            } catch (NumberFormatException e) { //예외마다 다른 처리를 하고 싶을 때 (다른 메세지)
                System.out.println("숫자로 변환할 수 없음: " + e.getMessage());
            } catch (Exception e){ //catch Exeption은 젤 밑에 있는게 좋음
                System.out.println("예외 발생: " + e.getMessage());
            }
        }
    }
}
