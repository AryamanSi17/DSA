import java.util.ArrayDeque;
import java.util.Deque;

public class previousGreaterElement {
    void printGreater(int arr[], int n) {
        Deque<Integer> s = new ArrayDeque<Integer>();
        s.push(arr[0]);

        for (int i = 1; i < n; i++) {
            while (s.isEmpty() == false && s.peek() <= arr[i]) {
                s.pop();
            }
            int pg = s.isEmpty() ? -1 : s.peek();
            System.out.println(pg);
            s.push(arr[i]);
        }
    }
}