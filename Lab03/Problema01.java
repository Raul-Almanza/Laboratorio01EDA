import java.util.Stack;

public class Problema01 {
	
	public static void main(String[] args) {
		
        int[] h1 = {1, 1, 1, 2, 3};
        int[] h2 = {2, 3, 4};
        int[] h3 = {1, 4, 1, 1};

        int result = equalStacks(h1, h2, h3);
        System.out.println("Altura máxima de las pilas: " + result);
    }
	
	
    public static int equalStacks(int[] h1, int[] h2, int[] h3) {
    	
        Stack<Integer> H1 = new Stack<>();
        Stack<Integer> H2 = new Stack<>();
        Stack<Integer> H3 = new Stack<>();

        int sum1 = 0, sum2 = 0, sum3 = 0;

        for (int i = h1.length - 1; i >= 0; i--) {
            H1.push(h1[i]);
            sum1 += h1[i];
        }

        for (int i = h2.length - 1; i >= 0; i--) {
            H2.push(h2[i]);
            sum2 += h2[i];
        }

        for (int i = h3.length - 1; i >= 0; i--) {
            H3.push(h3[i]);
            sum3 += h3[i];
        }

        while (true) {
            if (H1.isEmpty() || H2.isEmpty() || H3.isEmpty())
                return 0;
            if (sum1 == sum2 && sum2 == sum3)
                return sum1;
            if (sum1 >= sum2 && sum1 >= sum3)
                sum1 -= H1.pop();
            else if (sum2 >= sum1 && sum2 >= sum3)
                sum2 -= H2.pop();
            else if (sum3 >= sum1 && sum3 >= sum2)
                sum3 -= H3.pop();
        }
    }
}
