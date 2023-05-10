public class Practice {
	public static int[] calculate(int times) {		
	int[] result = new int[8];
		for(int i=0; i < result.length; i++) {
		    result[i] = times * (i + 1);
		}
		return result;
	}
	 
	public static void print(int[] result) {
		for(int i=0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}
	
	public static void main(String[] args) {
		for(int i = 2; i < 9; i++) {
			int[] result = calculate(i);
			print(result);
		}
	}		
}
//		int[] num = new int[10];
//		int max, min;
//		Scanner sc = new Scanner(System.in);
//		System.out.println("10개의 정수를 입력하시오.");
//		for (int i = 0; i < num.length; i++) {
//			num[i] = sc.nextInt();			
//		}
//		max = num[0];
//		min = num[0];
//		for (int i = 0; i < num.length; i++) {
//			if (max < num[i]) {
//				max = num[i];
//			}
//			if (min > num[i]) {
//				min = num[i];
//			}
//		}
//			System.out.println("최대값 :" + max);
//			System.out.println("최소값 :" + min);
//		}
//	}
//	public static void main(String[] args) {
//	int[] score = { 93, 75, 95, 76, 70};  
//	int sum = 0;
//	for (int i = 0; i < score.length; i++) {
//		sum += score[i]; // sum = sum + score[i];
//	}
//		float avg = (float) sum / score.length;
//		System.out.println("점수 합계 :" + sum);
//		System.out.println("점수 평균 :" + avg);
		
	
	