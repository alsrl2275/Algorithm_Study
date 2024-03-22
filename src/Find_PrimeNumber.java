
public class Find_PrimeNumber {
	
	public int solution(int[] nums) {
		
		// 소수 구하기
		
		int answer = 0;
		int sum = 0;
		
		for(int i = 0; i < nums.length; i++) { // nums배열을 중복되지않는 수들의 합 구하기
			for(int j = i+1; j < nums.length; j++) {
				for(int k = j+1; k < nums.length; k++) {
					sum = nums[i]+nums[j]+nums[k];
					
					if(Istrue(sum)) {
						answer++;
					}
				}
			}
		}
		
		
		
		return answer;
		
	}
	
	private boolean Istrue(int num) {
		
		for(int i = 2; i < num; i++) { // 1을 나눌 필요가 없기떄문에 2부터
			if(num % i == 0) {
				return false; // 0으로 나누어 떨어지면 소수가 아니기 떄문에 false
			}		
		}
		return true;
	}
}
