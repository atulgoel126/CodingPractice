Title: Employee Free Time

Question Description:

You are given a list of schedules for each employee in a company. Each schedule is a list of intervals representing the employee's working time. 

Find the collective free time for all employees in the company. 

Note: 
- The intervals are sorted by start time in ascending order.
- All intervals are in the format of (start, end), where start and end are integer values representing hours in a day.

Example:
Input: [[1,3], [2,4], [5,6]]
Output: [[4,5]]

Explanation: 
The first employee is free from 3 to 5, the second employee is free from 4 to 5, so both employees have one hour free time which is [4,5].

Constraints:
- 1 <= schedules.length <= 50
- 0 <= schedules[i].length <= 10
- 0 <= schedules[i][0] < schedules[i][1] <= 24