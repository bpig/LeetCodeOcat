package N27;

/**
 * Created by wenwen.xww on 2015/10/30.
 */
public class N275_HIndex2_O {
    public int hIndex(int[] citations) {
        if (citations.length == 0)
            return 0;
        int start = 0;
        int end = citations.length-1;
        while (start < end) {
            int mid = start + (end - start)/2;
            if  (citations[mid] >= citations.length - mid) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        if (citations[start] >= citations.length - start )
            return citations.length - start;
        else
            return citations.length - start -1;
    }
}
