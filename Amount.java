package assessment;
import java.util.Arrays;
public class Amount {
public static int coinChange(int[] coins, int amt) {
	int[] value = new int[amt + 1];
	Arrays.fill(value, amt + 1);
	value[0] = 0;
	for (int i = 0; i <= amt; i++) {
    for (int j = 0; j < coins.length; j++) {
        if (coins[j] <= i) {
            value[i] = Math.min(value[i], value[i - coins[j]] + 1);
        }
    }
}
	return amt;
    }
public static void main(String[] args) {
     int[] coins = {1, 2, 5};
     int amt = 11;
     int result = coinChange(coins, amt);
     System.out.println(result);
}
}
