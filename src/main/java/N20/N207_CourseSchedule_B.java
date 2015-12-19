package N20;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-12-18
 */

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

/**
 * There are a total of n courses you have to take,
 * labeled from 0 to n - 1.
 * <p/>
 * Some courses may have prerequisites,
 * for example to take course 0 you have to first take course 1,
 * which is expressed as a pair: [0,1]
 * <p/>
 * Given the total number of courses and a list of prerequisite pairs,
 * is it possible for you to finish all courses?
 * <p/>
 * For example:
 * <p/>
 * 2, [[1,0]]
 * There are a total of 2 courses to take.
 * To take course 1 you should have finished course 0. So it is possible.
 * <p/>
 * 2, [[1,0],[0,1]]
 * There are a total of 2 courses to take.
 * To take course 1 you should have finished course 0,
 * and to take course 0 you should also have finished course 1.
 * So it is impossible.
 * <p/>
 * Note:
 * The input prerequisites is a graph represented by a list of edges,
 * not adjacency matrices. Read more about how a graph is represented.
 * <p/>
 * click to show more hints.
 * <p/>
 * Hints:
 * This problem is equivalent to finding if a cycle exists in a directed graph.
 * If a cycle exists,
 * no topological ordering exists and therefore it will be impossible to take all courses.
 * Topological Sort via DFS -
 * A great video tutorial (21 minutes) on Coursera explaining the basic concepts of Topological Sort.
 * Topological sort could also be done via BFS.
 */
public class N207_CourseSchedule_B {
    // BFS
    public boolean canFinishBFS(int numCourses, int[][] edges) {
        if (numCourses == 0 || edges.length == 0) {
            return true;
        }

        // Convert graph presentation from edges to indegree of adjacent list.
        int indegree[] = new int[numCourses];
        // Indegree - how many prerequisites are needed.
        for (int i = 0; i < edges.length; i++) {
            indegree[edges[i][0]]++;
        }

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < numCourses; i++) {
            if (indegree[i] == 0) {
                queue.add(i);
            }
        }

        // How many courses don't need prerequisites.
        int canFinishCount = queue.size();
        while (!queue.isEmpty()) {
            // Already finished this prerequisite course.
            int prerequisite = queue.remove();
            for (int i = 0; i < edges.length; i++) {
                if (edges[i][1] == prerequisite) {
                    indegree[edges[i][0]]--;
                    if (indegree[edges[i][0]] == 0) {
                        canFinishCount++;
                        queue.add(edges[i][0]);
                    }
                }
            }
        }

        return canFinishCount == numCourses;
    }

    HashMap<Integer, Boolean> memo = new HashMap<>();//Memorization HashMap for DFS pruning

    // DFS
    public boolean canFinish(int n, int[][] edges) {
        memo.clear();
        if (edges.length != 0) {
            // Neighbors of each node
            HashMap<Integer, HashSet<Integer>> neighbors = new HashMap<>();
            HashSet<Integer> curPath = new HashSet<>(); // Nodes on the current path
            // Convert graph presentation from edge list to adjacency list
            for (int i = 0; i < edges.length; i++) {
                if (!neighbors.containsKey(edges[i][1])) {
                    neighbors.put(edges[i][1], new HashSet<>());
                }
                neighbors.get(edges[i][1]).add(edges[i][0]);
            }
            // The graph is possibly not connected, so need to check every node.
            for (int a[] : edges) {
                // Use DFS method to check if there's cycle in any curPath
                if (hasCycle(neighbors, a[0], curPath)) {
                    return false;
                }
            }
        }
        return true;
    }

    boolean hasCycle(HashMap<Integer, HashSet<Integer>> neighbors,
                     int kid, HashSet<Integer> curPath) {
        if (memo.containsKey(kid)) {
            return memo.get(kid);
        }
        // The current node is already in the set of the current path
        if (curPath.contains(kid)) {
            return true;
        }
        if (!neighbors.containsKey(kid)) {
            return false;
        }
        curPath.add(kid);
        for (Integer neighbor : neighbors.get(kid)) {
            boolean ret = hasCycle(neighbors, neighbor, curPath);// DFS
            memo.put(kid, ret);
            if (ret) {
                return true;
            }
        }
        curPath.remove(kid);
        return false;
    }
}
