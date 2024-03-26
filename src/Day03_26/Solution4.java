package Day03_26;

public class Solution4 {
	/*
	 * 대문자와 소문자가 섞여있는 문자열 s가 주어집니다. s에 'p'의 개수와 'y'의 개수를 비교해 같으면 True, 다르면 False를
	 * return 하는 solution를 완성하세요. 'p', 'y' 모두 하나도 없는 경우는 항상 True를 리턴합니다. 
	 * 단, 개수를 비교할 때 대문자와 소문자는 구별하지 않습니다.
	 * 
	 * 예를 들어 s가 "pPoooyY"면 true를 return하고 "Pyy"라면 false를 return합니다.
	 * 
	 * 제한사항 문자열 s의 길이 : 50 이하의 자연수 문자열 s는 알파벳으로만 이루어져 있습니다.
	 */
	public static void main(String[] args) {
		
		String s = "PappyyY";
		System.out.println(solution(s));
		System.out.println(solution1(s));
	}
	
    static boolean solution(String s) {
    	
    	String lowercase = s.toLowerCase(); // 문자열을 대소문자 구분하지않기 위해 모두 소문자로 변환
        boolean answer = true;
        
        int countp = 0; // p의 개수 저장
        int county = 0; // y의 개수 저장
        
        for(int i = 0; i < lowercase.length(); i++) {
        	char c = lowercase.charAt(i);
        	if(c == 'p') {
        		countp++;
        	} else if(c == 'y') {
        		county++;
        	}
        }
        
        if(countp == county) {
        	answer = true;
        } else {
        	answer = false;
        }

        return answer;
    }
    // 다른풀이 참고
    static boolean solution1(String s) {
    	
    	boolean answer = true;
    	
    	String lower = s.toLowerCase();
    	
    	int count = 0;
    	
    	for(int i = 0; i < lower.length(); i++) {
    		char c = lower.charAt(i);
    		
    		if(c == 'p') {
    			count++;
    		} else if(c == 'y') {
    			count--;
    		}
    	}
    	
    	if(count == 0) {
    		answer = true;
    	} else {
    		answer = false;
    	}
    	
    	return answer;
    }

}
