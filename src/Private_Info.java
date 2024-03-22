import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class Private_Info {
	
	// 개인정보 수집 문제
	
	public static void main(String[] args) {
    	String today = "2022.05.19";
    	String[] terms = {"A 6", "B 12", "C 3"};
    	String[] privacies = {"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"};
    	System.out.println(Arrays.toString(solution(today,terms, privacies)));
	}
    public static int[] solution(String today, String[] terms, String[] privacies) {
    	

        List<Integer> list = new ArrayList<>();
        HashMap<String, String> map = new HashMap<>();
        
        for(int i = 0; i < terms.length; i++) { // terms의 배열에 공백을 기준으로 Key값과 Value값을 나눈다.
        	map.put(terms[i].split(" ")[0], terms[i].split(" ")[1]); 
        }
        
        // .을 기준으로 연,월,일 선언
        int year = Integer.parseInt(today.split("\\.")[0]);
        int month = Integer.parseInt(today.split("\\.")[1]);
        int day = Integer.parseInt(today.split("\\.")[2]);
        
        for(int i = 0; i < privacies.length; i++) { 
        	String date = privacies[i].split(" ")[0];
        	int type = Integer.parseInt(map.get(privacies[i].split(" ")[1])) * 28;
        	
        	
//        	System.out.println(type);
        	
        	 int num = (year - Integer.parseInt(date.split("\\.")[0]))*28*12
        			 + (month - Integer.parseInt(date.split("\\.")[1]))*28
        			 + (day - Integer.parseInt(date.split("\\.")[2]));
//        	System.out.println(num);
        	
        	if(num >= type) {
        		list.add(i+1);
        	}
        	
        }
        
        
        
        
        return list.stream().filter(i -> i != null).mapToInt(i -> i).toArray();
    }
    
}
