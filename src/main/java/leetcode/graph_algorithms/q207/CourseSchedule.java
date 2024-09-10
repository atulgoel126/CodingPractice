package leetcode.graph_algorithms.q207;

import java.util.ArrayList;
import java.util.List;

public class CourseSchedule {
    public boolean canFinish(int numCourses, int[][] prerequisites) {

        List<Subject> subjects = new ArrayList<>();

        for (int i = 0; i < numCourses; i++) {
            subjects.add(new Subject(i, new ArrayList<>()));
        }

        for (int[] preq: prerequisites) {
            Subject s = subjects.get(preq[0]);
            s.addDependency(subjects.get(preq[1]));
        }

        boolean[] visited = new boolean[numCourses];
        boolean[] inStack = new boolean[numCourses];

        for (int i = 0; i < numCourses; i++) {
            if (hasCycle(subjects.get(i), visited, inStack)) {
                return false;  // Cycle detected, cannot finish all courses
            }
        }

        return true;
    }

    private boolean hasCycle(Subject sub, boolean[] visited, boolean[] inStack) {
        if (inStack[sub.id]) {
            return true;
        }
        if (visited[sub.id]) {
            return false;
        }

        inStack[sub.id] = true;
        visited[sub.id] = true;

        for (Subject dep: sub.dependencies) {
            if (hasCycle(dep, visited, inStack)) {
                return true;
            }
        }

        inStack[sub.id] = false;
        return false;
    }

    private static class Subject {
        // TODO: Use Lombok
        public List<Subject> dependencies;
        public int id;

        public Subject(int id, List<Subject> dependencies) {
            this.id = id;
            this.dependencies = dependencies;
        }

        public void addDependency(Subject dep) {
            dependencies.add(dep);
        }
    }}
