package Day03_26;

import java.util.Arrays;


public class Solution6 {
	/*
	 * 함수 solution은 정수 n을 매개변수로 입력받습니다. 
	 * n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요.
	 * 예를들어 n이 118372면 873211을 리턴하면 됩니다.
	 * 
	 * 제한 조건 n은 1이상 8000000000 이하인 자연수입니다.
	 */
	public static void main(String[] args) {
		long n = 16729145;
		System.out.println(solution(n));
		System.out.println(solution1(n));
	}

	public static long solution(long n) {
		long answer = 0;
		
		String str = String.valueOf(n);
		int[] arr = new int[str.length()];
		for(int i = 0; i < str.length(); i++) {
			arr[i] = Character.getNumericValue(str.charAt(i));
			
		}
		
        // 오름차순 정렬
		Arrays.sort(arr);
		
        // 정렬된 배열을 이용하여 answer 계산
        for (int i = arr.length - 1; i >= 0; i--) {
            answer = answer * 10 + arr[i];
        }

        return answer;
	}

	// 다른사람 풀이
	public static long solution1(long n) {
		int answer = 0;
		
		String[] str1 = String.valueOf(n).split(""); // n을 문자열로 변환 후 배열에 저장
		Arrays.sort(str1); // 오름차순 정렬
		
		StringBuilder sb = new StringBuilder();
		
		for(String str2 : str1) { 
			sb.append(str2);		
		}
		
		return Long.parseLong(sb.reverse().toString()); // sb를 역순으로 정렬 후 Long타입으로 파싱
	}
}
