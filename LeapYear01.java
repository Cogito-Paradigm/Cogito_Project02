import java.util.Scanner;

public class LeapYear01 {
	//평년과 윤년을 구하는 main
	public static void main(String[] args){
		System.out.println("연도를 입력하세요");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		sc.close();
		
		if(year%400==0){
			System.out.println(year+"은 윤년입니다.");
		}else if(year%100!=0&&year%4==0){
			System.out.println(year+"은 윤년입니다.");
		}else{
			System.out.println(year+"은 평년입니다.");
		}
	}		
}
