package N21;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-12-18
 */

import java.util.*;

/**
 * There are a total of n courses you have to take, labeled from 0 to n - 1.
 * <p/>
 * Some courses may have prerequisites,
 * for example to take course 0 you have to first take course 1,
 * which is expressed as a pair: [0,1]
 * <p/>
 * Given the total number of courses and a list of prerequisite pairs,
 * return the ordering of courses you should take to finish all courses.
 * <p/>
 * There may be multiple correct orders,
 * you just need to return one of them.
 * If it is impossible to finish all courses, return an empty array.
 * <p/>
 * For example:
 * <p/>
 * 2, [[1,0]]
 * There are a total of 2 courses to take.
 * To take course 1 you should have finished course 0.
 * So the correct course order is [0,1]
 * <p/>
 * 4, [[1,0],[2,0],[3,1],[3,2]]
 * There are a total of 4 courses to take.
 * To take course 3 you should have finished both courses 1 and 2.
 * Both courses 1 and 2 should be taken after you finished course 0.
 * So one correct course order is [0,1,2,3]. Another correct ordering is[0,2,1,3].
 */
public class N210_CourseScheduleII_B {

    public static int[] findOrder(int numCourses, int[][] edges) {
        int[] result = new int[numCourses];
        int[] preCnt = new int[numCourses];
        List<List<Integer>> nextSet = new ArrayList<>();
        for (int i = 0; i < numCourses; ++i) {
            nextSet.add(new ArrayList<>());
        }

        for (int[] edge : edges) {
            preCnt[edge[0]]++;
            nextSet.get(edge[1]).add(edge[0]);
        }

        Queue<Integer> sourceNode = new LinkedList<>();
        for (int i = 0; i < numCourses; i++) {
            if (preCnt[i] == 0) {
                sourceNode.add(i);
            }
        }

        for (int i = 0; i < numCourses; i++) {
            if (sourceNode.isEmpty()) {
                return new int[0];
            }
            int n = sourceNode.poll();
            result[i] = n;
            for (int next : nextSet.get(n)) {
                preCnt[next]--;
                if (preCnt[next] == 0) {
                    sourceNode.add(next);
                }
            }
        }
        return result;
    }

    int[] ans;
    int idx;

    // some slow
    public int[] scoreA(int numCourses, int[][] edges) {
        ans = new int[numCourses];
        idx = 0;
        Arrays.fill(ans, -1);
        // 0 for white, unvisited
        // 1 for grey, in stack
        // 2 for black, fully explored
        int[] status = new int[numCourses];
        for (int i = 0; i < numCourses; i++) {
            if (status[i] == 0) {
                if (!DFS(i, edges, status)) {
                    return new int[0];
                }
            }
        }
        return ans;
    }

    private boolean DFS(int curr, int[][] edges, int[] status) {
        if (status[curr] == 1) {
            return false;
        }
        status[curr] = 1;
        for (int[] edge : edges) {
            if (edge[0] == curr && status[edge[1]] != 2) {
                if (!DFS(edge[1], edges, status)) {
                    return false;
                }
            }
        }
        ans[idx++] = curr;
        status[curr] = 2;
        return true;
    }


    // timeout for 2000 course ~~~ maybe need dfs
    public int[] findOrderBFS(int numCourses, int[][] edges) {
        int[] indegrees = new int[numCourses];
        for (int[] pair : edges) {
            indegrees[pair[0]]++;
        }
        Queue<Integer> queue = new ArrayDeque<>();
        for (int i = 0; i < numCourses; ++i) {
            if (indegrees[i] == 0) {
                queue.add(i);
            }
        }
        int[] ans = new int[numCourses];
        int idx = 0;
        while (!queue.isEmpty()) {
            int pre = queue.poll();
            ans[idx++] = pre;
            for (int[] pair : edges) {
                if (pair[1] != pre) {
                    continue;
                }
                int course = pair[0];
                --indegrees[course];
                if (indegrees[course] == 0) {
                    queue.add(course);
                }
            }
        }
        return idx == numCourses ? ans : new int[0];
    }
}
