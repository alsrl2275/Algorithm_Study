import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

public class NumberPartner {
	
	public static void main(String[] args) {
		
        String x = "12321";
        String y = "42531";
		System.out.println(solution(x, y));
	}
	
	/* 숫자 짝꿍
	두 정수 X, Y의 임의의 자리에서 공통으로 나타나는 정수 k(0 ≤ k ≤ 9)들을 이용하여 만들 수 있는 가장 큰 정수를 
	두 수의 짝꿍이라 합니다(단, 공통으로 나타나는 정수 중 서로 짝지을 수 있는 숫자만 사용합니다). 
	X, Y의 짝꿍이 존재하지 않으면, 짝꿍은 -1입니다. X, Y의 짝꿍이 0으로만 구성되어 있다면, 짝꿍은 0입니다.
	예를 들어, X = 3403이고 Y = 13203이라면, X와 Y의 짝꿍은 X와 Y에서 공통으로 나타나는 3, 0, 3으로 만들 수 있는 
	가장 큰 정수인 330입니다. 다른 예시로 X = 5525이고 Y = 1255이면 X와 Y의 짝꿍은 X와 Y에서 공통으로 나타나는
	 2, 5, 5로 만들 수 있는 가장 큰 정수인 552입니다(X에는 5가 3개, Y에는 5가 2개 나타나므로 남는 5 한 개는 
	 짝 지을 수 없습니다.)
	두 정수 X, Y가 주어졌을 때, X, Y의 짝꿍을 return하는 solution 함수를 완성해주세요.
	*/
    public static String solution(String x, String y) {
    	
    	HashMap<Integer, Integer> Xmap = new HashMap<>(); // 공통된 숫자가 등장하는 횟수를 담을 배열
    	HashMap<Integer, Integer> Ymap = new HashMap<>(); // 공통된 숫자가 등장하는 횟수를 담을 배열
    	
    	for(String str : x.split("")) { // 
    		
    		int cur = Integer.parseInt(str); // 문자열 str을 정수로 변환 후 
    		Xmap.put(cur, Xmap.getOrDefault(cur, 0) + 1);
    	}
    	
    	for(String str : y.split("")) {
    		
    		int cur = Integer.parseInt(str);
    		Ymap.put(cur, Ymap.getOrDefault(cur, 0) + 1);
    	}
    	
    	StringBuilder sb = new StringBuilder();
    	
    	for(int i = 9; i >= 0; i--) {
    		if(Xmap.containsKey(i) && Ymap.containsKey(i)) {
    			int count = Math.min(Xmap.get(i),Ymap.get(i));
    			for(int j = 0; j < count; j++) {
    				sb.append(i);
    			}
    		}
    	}
    	
    	if(sb.toString().startsWith("0")) {
    		return "0";
    		
    	} else if(sb.toString().equals("")) {
    		return "-1";
    	} else {
    		return sb.toString();
    	}
    	
    }
}
