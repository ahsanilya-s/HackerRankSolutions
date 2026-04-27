import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

/*
 * Revision notes (Problem #15: Count Affordable Pairs)
 *
 * Goal:
 * - Count how many index pairs (i < j) have prices[i] + prices[j] <= budget.
 *
 * Current approach in this file:
 * - Brute force over all pairs using two pointers (j, i) that enumerate every (j, i) combination.
 *
 * Complexity:
 * - Time: O(n^2)
 * - Space: O(1) extra (excluding input)
 *
 * Interview tip:
 * - If asked to optimize, sort prices and use two-pointer counting to get O(n log n) time.
 */



class Result {

    /*
     * Complete the 'countAffordablePairs' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY prices
     *  2. INTEGER budget
     */

public static int countAffordablePairs(List<Integer> prices, int budget) {
    if(prices.size() < 2) return 0;
    
    int j = 0;
    int i = j + 1;
    int count = 0;
    
    while(j < prices.size() - 1) {
        if(i < prices.size()) {
            int result = prices.get(j) + prices.get(i);
            if(result <= budget) {
                count++;
            }
            i++;
        } else {
            j++;
            i = j + 1;
        }
    }
    return count;
}

}

public class CountAffordablePairs {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int pricesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> prices = IntStream.range(0, pricesCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .map(String::trim)
            .map(Integer::parseInt)
            .collect(toList());

        int budget = Integer.parseInt(bufferedReader.readLine().trim());

        int result = Result.countAffordablePairs(prices, budget);

        System.out.println(result);

        bufferedReader.close();
    }
}

