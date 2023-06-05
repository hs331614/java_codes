import java.util.*;

public class binary2 {
        public static void main(String[] args) {

            // Read the input
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }

            System.out.println(Arrays.toString(arr));

            // Create a map to store the occurrences of each element
            Map<Integer, List<Integer>> occ = new HashMap<>();
            for (int i = 0; i < n; i++) {
                List<Integer> list = occ.getOrDefault(arr[i], new ArrayList<>());
                list.add(i);
                occ.put(arr[i], list);
            }

            System.out.println(occ);


            // Read the queries
            int q = scanner.nextInt();
            while (q-- > 0) {
                int x = scanner.nextInt();
                int y = scanner.nextInt();

                // Binary search to find the first occurrence of the element x at or after position y
                int lo = 0;
                int hi = occ.get(x).size() - 1;
                int ans = -1;
                while (lo <= hi) {
                    int mid = (lo + hi) / 2;
                    if (occ.get(x).get(mid) >= y) {
                        ans = occ.get(x).get(mid);
                        hi = mid - 1;
                    } else {
                        lo = mid + 1;
                    }
                }

                // Print the answer
                System.out.println(ans);
            }
        }
    }



