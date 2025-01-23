package queue;

import java.util.*;

/**
 * @author YoungCR
 * @date 2025/1/22 18:53
 * @descritpion FindCourseOrder
 */
public class FindCourseOrder {

    public int[] findOrder(int numCourses, int[][] prerequisites) {

        List<HashSet<Integer>> adjList = new ArrayList<>(numCourses);

        for (int i = 0; i < numCourses; i++) {
            adjList.add(new HashSet<>());
        }

        int[] inDegree = new int[numCourses];
        for (int[] prerequisite : prerequisites) {
            int course = prerequisite[0];
            int pre    = prerequisite[1];
            adjList.get(pre).add(course);
            inDegree[course]++;
        }

        Queue<Integer> order = new ArrayDeque<>();
        for (int i = 0; i < numCourses; i++) {
            if (inDegree[i] == 0) {
                order.offer(i);
            }
        }

        int[] res   = new int[numCourses];
        int   count = 0;

        while (!order.isEmpty()) {
            Integer head = order.poll();
            res[count++] = head;

            HashSet<Integer> successors = adjList.get(head);
            for (Integer nextCourse : successors) {
                inDegree[nextCourse]--;
                if (inDegree[nextCourse] == 0) {
                    order.offer(nextCourse);
                }
            }
        }

        if (count == numCourses) {
            return res;
        }

        return new int[0];
    }
}
