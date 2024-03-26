package Day03_26;

import java.util.Arrays;

public class Solution3 {
	/*
	 * 자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요. 예를들어 n이 12345이면 [5,4,3,2,1]을
	 * 리턴합니다.
	 * 
	 * 제한 조건 n은 10,000,000,000이하인 자연수입니다.
	 */
	public static void main(String[] args) {

		long n = 15971;
		System.out.println(Arrays.toString(solution(n))); // 배열 전체를 문자열로 변환 후 출력
		System.out.println(Arrays.toString(solution1(n)));
	}
	
	public static int[] solution(long n) {
		String str = Long.toString(n);
		int[] answer = new int[str.length()];
		for (int i = 0; i < str.length(); i++) {

			answer[str.length() - i - 1] = Character.getNumericValue(str.charAt(i));
		} // 문자를 정수로 변환하여 배열에 추가
		
		return answer;
	}
	
	// 다른 풀이
	public static int[] solution1(long n) {
		
		String s = String.valueOf(n); // n을 문자열로 변환
		StringBuilder sb = new StringBuilder(s); // StringBuilder에 문자열 저장
		sb = sb.reverse(); // 역순으로 변경
		String[] ss = sb.toString().split(""); // 다시 문자열로 변환 후 각 문자를 배열로 변환
		
		int[] answer = new int[ss.length]; // 문자열 길이만큼 배열 생성
		
		for(int i = 0; i < ss.length; i++) {
			
			answer[i] = Integer.parseInt(ss[i]); // 문자열을 정수로 변환후 배열에 저장
		}



		return answer;
	}
}
