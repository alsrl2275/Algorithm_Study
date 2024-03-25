import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class AlonePlay {
	
	

	public static void main(String[] args) {
		int[] cards = {8, 6, 3, 7, 2, 5, 1, 4};
		System.out.println(solution(cards));
	}
	
    public static int solution(int[] cards) {
    	
    	int N = cards.length;
    	boolean visit[] = new boolean[N]; // 방문여부 배열
    	List<Integer> groups = new ArrayList<>(); // 각 카드의 그룹 크기
    	
    	for(int i = 0; i < N; i++) {
    		int now = i; // 현재 카드 번호
    		int cnt = 0; // 그룹의 크기
    		
    		while(!visit[now]) { // 방문하지 않은 카드를 만날떄까지 반복 
    			cnt++; // 크기 증가
    			visit[now] = true; // 현재 카드를 방문 했다는 표시
    			now = cards[now] - 1; // 다음에 방문할 카드 인덱스 저장
    			
    		}
    		groups.add(cnt);
    	}
    	
    	Collections.sort(groups, Comparator.reverseOrder()); // 내림차 순 정렬
    	return (groups.size() == 1 ? 0 : groups.get(0) * groups.get(1)); // 가장 큰 수 곱
    }

}
