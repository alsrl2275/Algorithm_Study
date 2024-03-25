package Day03_25;

public class Solution3 {
	/*
	 * 자연수 N이 주어지면, N의 각 자릿수의 합을 구해서 return 하는 solution 함수를 만들어 주세요. 예를들어 N = 123이면
	 * 1 + 2 + 3 = 6을 return 하면 됩니다.
	 * 
	 * 제한사항 N의 범위 : 100,000,000 이하의 자연수
	 */
	public static void main(String[] args) {
		int n = 123;
		System.out.println(solution(n));
	}
	
    public static int solution(int n) {
        int answer = 0;
        
        String str = String.valueOf(n); // 숫자 n을 문자열로 변환
        int length = str.length(); // 문자열의 길이, 즉 n의 자릿수를 구함
        
        for(int i = 0; i < length; i++) {
        	answer += Character.getNumericValue(str.charAt(i)); // 각 자릿수의 문자열을 정수로 변환해서 더함
        }
        return answer;
    }
    // 다른 사람 풀이 참고
//    public static int solution(int n) {
//        int answer = 0;
//        
//        while(true) {
//        	answer += n % 10;
//        	
//        	if(n < 10) {
//        		break;
//        	}
//        	n = n / 10;
//        }
//        
//
//        return answer;
//    }
}
