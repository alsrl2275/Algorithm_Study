package Day03_27;

public class Solution1 {
	/*
	 * 양의 정수 x가 하샤드 수이려면 x의 자릿수의 합으로 x가 나누어져야 합니다. 예를 들어 18의 자릿수 합은 1+8=9이고, 18은 9로
	 * 나누어 떨어지므로 18은 하샤드 수입니다. 
	 * 자연수 x를 입력받아 x가 하샤드 수인지 아닌지 검사하는 함수, solution을 완성해주세요.
	 * 제한 조건 x는 1 이상, 10000 이하인 정수입니다.
	 */
	public static void main(String[] args) {
		int x = 13;
		System.out.println(solution(x));
		System.out.println(solution1(x));
	}
	
	public static boolean solution(int x) {
		boolean answer = true;
		int sum = 0;
		int a = x;
		
		while(a > 0) {
			sum += a % 10; // x의 자릿수를 더함
			a = a / 10; // 다음 자릿수로 이동
			
		}
		if(x % sum == 0) {
			answer = true;
		} else {
			answer = false;
		}
		return answer;
	}
	// 다른 풀이
	public static boolean solution1(int x) {
		boolean answer = true;
		String[] str = String.valueOf(x).split("");
		int sum = 0;
		
		for(String s : str) {
			sum += Integer.parseInt(s);
		}
		
		if(x % sum == 0) {
			answer = true;
		} else {
			answer = false;
		}
		return answer;
	}
}
