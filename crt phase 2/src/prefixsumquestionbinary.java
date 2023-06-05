import java.util.ArrayList;
import java.util.Scanner;
public class prefixsumquestionbinary {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();

            ArrayList<Integer> arr = new ArrayList<>(n);
            for (int i = 0; i < n; i++) {
                arr.add(scanner.nextInt());
            }

            int k = scanner.nextInt();

            ArrayList<Integer> pref = new ArrayList<>(n);
            pref.add(arr.get(0));
            for (int i = 1; i < n; i++) {
                pref.add(pref.get(i - 1) + arr.get(i));
            }

            int lo = 0, hi = n, ans = -1;
            while (lo <= hi) {
                int mid = (lo + hi) / 2;
                boolean kyaMujheKoiSubarrayMiliJiskaSumLessThanKhai = false;

                for (int i = 0; i < n; i++) {
                    int endPoint = i;
                    int startPoint = i - mid + 1;

                    if (startPoint < 0) continue;

                    if (pref.get(endPoint) - (startPoint - 1 >= 0 ? pref.get(startPoint - 1) : 0) <= k) {
                        kyaMujheKoiSubarrayMiliJiskaSumLessThanKhai = true;
                        break;
                    }
                }

                if (kyaMujheKoiSubarrayMiliJiskaSumLessThanKhai) {
                    ans = mid;
                    lo = mid + 1;
                } else {
                    hi = mid - 1;
                }
            }

            System.out.println(ans);
            scanner.close();
        }
    }


