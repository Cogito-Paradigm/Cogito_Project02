import java.util.Scanner;

public class StarPrint {
	/*	첫째줄에는 별 n개 , 둘째줄에는 별 n-1개, n번째줄에는 별 1개를 찍는 문제
		별출력을 오른쪽을 기준으로 정렬
 		******
 		  *****
 	        ****
 	          ***
 	            **
                  *
    */
	public static void main(String[] args){
		System.out.println("원하는 숫자를 입력하세요.");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		
		//인덱스값 변경 for두개로 해결
		for(int i = 0; i<num; i++){
			for(int j = 0; j<i; j++){
				System.out.print("    ");
			}
			for(int j = 0; j<num-i; j++){
				System.out.print(" * ");
			}
			System.out.println();
		}
	}
}
