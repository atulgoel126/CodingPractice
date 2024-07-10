# Accounts Merge

Given a list of accounts where each element accounts[i] is a list of strings representing an email address, name, and a list of email addresses associated with the account, perform a merge of the accounts in order to group together all the accounts that belong to the same person.

Note: The accounts may be in any order and the emails in each account may not be in the same order as the original list. Additionally, the accounts can have varying lengths.

Return the list of merged accounts in the following format - [i, j, k] where i is the name, and j and k are the remaining email addresses associated with that account, sorted in lexicographical order.

Example 1:

Input: accounts = [["John", "johnsmith@mail.com", "john00@mail.com"], ["John", "johnnybravo@mail.com"], ["John", "johnsmith@mail.com", "john_newyork@mail.com"], ["Mary", "mary@mail.com"]]

Output: [["John", "john00@mail.com", "john_newyork@mail.com", "johnsmith@mail.com"], ["John", "johnnybravo@mail.com"], ["Mary", "mary@mail.com"]]

Explanation: The first account, John, is merged with the third account, which has the same name and one common email address. The second account, John, remains unchanged as it has no common email address with any other account. The fourth account, Mary, is left as is since it has no common email address with any other account.

Constraints:
- 1 <= accounts.length <= 1000
- 2 <= accounts[i].length <= 10
- 1 <= accounts[i][j] <= 30
- accounts[i][0] consists of English letters
- accounts[i][j] (for j > 0) is a valid email address