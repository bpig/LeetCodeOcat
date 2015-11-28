package N04;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-11-18
 */

/**
 * Given a collection of numbers, return all possible permutations.
 * <p/>
 * For example,
 * [1,2,3] have the following permutations:
 * [1,2,3], [1,3,2], [2,1,3], [2,3,1], [3,1,2], and [3,2,1].
 */
public class N046_Permutations_B {
//    private List<List<Integer>> list;
//
//    public List<List<Integer>> permute(int[] nums) {
//        list = new ArrayList<>();
//        backTrack(new ArrayList<>(), 0, nums);
//        return list;
//    }
//
//    private void backTrack(ArrayList<Integer> perm, int i, int[] nums) {
//        if (i == nums.length) {
//            list.add(new ArrayList(perm));
//            return;
//        }
//        //Insert elements in the array by increasing index
//        for (int j = 0; j <= i; j++) {
//            perm.add(j, nums[i]);
//            backTrack(perm, i + 1, nums);
//            perm.remove(j);
//        }
//    }
}
