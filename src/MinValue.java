import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Deque;
import java.util.LinkedList;

import java.util.StringTokenizer;




public class MinValue {
	
	/*
	 - 최소값 구하기 -
	 N개의 수 A(1), A(2), ... A(N)과 L이 주어진다. A(i-L+1) ~ A(i)중 최솟값을 D(i)라고 할 떄, D에 저장된
	 수를 출력하는 프로그램을 작성하시오. 이떄 i <= 0 인 A(i)는 무시하고 D를 구해야 한다.
	 */

	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 출력을 버퍼에 넣고 한 번에 출력하기 위해 BufferedWriter 사용		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken()); // 데이터 수 저장
		int L = Integer.parseInt(st.nextToken()); // 최소값을 구하는 범위 지정
		st = new StringTokenizer(br.readLine());
		
		Deque<Node> mydeque = new LinkedList<>();
		for(int i = 0; i < N; i++) {
			int now = Integer.parseInt(st.nextToken()); // 현제 데이터 값
			// 새로운 값이 들어올 때 마다 정렬 대신 현재 수보다 큰 값을 덱에서 제거해 시간 복잡도를 줄임
			while(!mydeque.isEmpty() && mydeque.getLast().value > now ) {
				mydeque.removeLast();
			}
			
			mydeque.addLast(new Node(now, i)); // 덱의 마지막 위치에 now값 저장하기
			if(mydeque.getFirst().index <= i - L) { // 덱의 첫번쨰 위치부터 i-L의 범위를 벗어난 값 제거하기
				mydeque.removeFirst();
		}
			bw.write(mydeque.getFirst().value + " "); 
		}
		bw.flush();
		bw.close();
		

	}
	
	static class Node {
		public int value;
		public int index;
		
		Node(int value, int index) {
			this.value = value;
			this.index = index;
		}
	}

}
