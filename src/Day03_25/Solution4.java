package Day03_25;

public class Solution4 {
	
	/*
	 * 문자열 s를 숫자로 변환한 결과를 반환하는 함수, solution을 완성하세요.
	 * 
	 * 제한 조건 s의 길이는 1 이상 5이하입니다. s의 맨앞에는 부호(+, -)가 올 수 있습니다. s는 부호와 숫자로만 이루어져있습니다.
	 * s는 "0"으로 시작하지 않습니다.
	 */
	
	public static void main(String[] args) {
		String s = "-1234";
		System.out.println(solution(s));
	}
	
    public static int solution(String s) {
        int answer = 0;
        int sign = 1;
        
        if(s.charAt(0) == '-') { // 문자열 첫번쨰에 '-'가 있다면 sign을 -1로 초기화 후 첫번쨰 문자열 제외한 문자열 반환
        	sign = -1; 
        	s = s.substring(1);
        }
        for(int i = 0; i < s.length(); i++) {
        	char c = s.charAt(i);
        	if(Character.isDigit(c)) { // c가 숫자인경우에 true를 반환 
        		answer = answer * 10 + (c - '0'); // 문자열을 정수로 변환 '0'은 ASCII코드 48이기 때문에 
        	}
        }
        
        return answer * sign;
    }
}
