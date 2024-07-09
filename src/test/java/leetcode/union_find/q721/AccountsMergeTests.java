package leetcode.union_find.q721;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.*;

public class AccountsMergeTests {
    @Test
    public void testEmptyAccounts() {
        AccountsMerge ob = new AccountsMerge();
        List<List<String>> accounts = new ArrayList<List<String>>();
        assertEquals(ob.accountsMerge(accounts), accounts);
    }

    @Test
    public void testSingleAccount() {
        AccountsMerge ob = new AccountsMerge();
        List<List<String>> accounts = new ArrayList<List<String>>();
        accounts.add(new ArrayList<String>(Arrays.asList("John", "john@example.com")));
        assertEquals(ob.accountsMerge(accounts), accounts);
    }

    @Test
    public void testMultipleAccountsSeparateNames() {
        AccountsMerge ob = new AccountsMerge();
        List<List<String>> accounts = new ArrayList<List<String>>();
        accounts.add(new ArrayList<String>(Arrays.asList("John Smith", "johnsmith@example.com")));
        accounts.add(new ArrayList<String>(Arrays.asList("Jane Doe", "janedoe@example.com")));
        assertEquals(ob.accountsMerge(accounts), accounts);
    }

    @Test
    public void testMultipleAccountsSameEmail() {
        AccountsMerge ob = new AccountsMerge();
        List<List<String>> accounts = new ArrayList<List<String>>();
        accounts.add(new ArrayList<String>(Arrays.asList("John Smith", "johnsmith@example.com")));
        accounts.add(new ArrayList<String>(Arrays.asList("Jane Doe", "johnsmith@example.com")));
        List<List<String>> merged = new ArrayList<List<String>>();
        merged.add(new ArrayList<String>(Arrays.asList("John Smith", "johnsmith@example.com")));
        merged.add(new ArrayList<String>(Arrays.asList("Jane Doe", "johnsmith@example.com")));
        assertEquals(ob.accountsMerge(accounts), merged);
    }

    @Test
    public void testMultipleAccountsSameName() {
        AccountsMerge ob = new AccountsMerge();
        List<List<String>> accounts = new ArrayList<List<String>>();
        accounts.add(new ArrayList<String>(Arrays.asList("John Smith", "johnsmith@example.com")));
        accounts.add(new ArrayList<String>(Arrays.asList("John Smith", "jsmith@example.com")));
        List<List<String>> merged = new ArrayList<List<String>>();
        merged.add(new ArrayList<String>(Arrays.asList("John Smith", "johnsmith@example.com", "jsmith@example.com")));
        assertEquals(ob.accountsMerge(accounts), merged);
    }

    @Test
    public void testAccountsWithMultipleEmails() {
        AccountsMerge ob = new AccountsMerge();
        List<List<String>> accounts = new ArrayList<List<String>>();
        accounts.add(new ArrayList<String>(Arrays.asList("John Smith", "johnsmith1@example.com", "johnsmith2@example.com")));
        accounts.add(new ArrayList<String>(Arrays.asList("Jane Doe", "janedoe1@example.com", "janedoe2@example.com")));
        List<List<String>> merged = new ArrayList<List<String>>();
        merged.add(new ArrayList<String>(Arrays.asList("John Smith", "johnsmith1@example.com", "johnsmith2@example.com")));
        merged.add(new ArrayList<String>(Arrays.asList("Jane Doe", "janedoe1@example.com", "janedoe2@example.com")));
        assertEquals(ob.accountsMerge(accounts), merged);
    }

    @Test
    public void testAccountsMergeWithSameEmail() {
        AccountsMerge ob = new AccountsMerge();
        List<List<String>> accounts = new ArrayList<List<String>>();
        accounts.add(new ArrayList<String>(Arrays.asList("John Smith", "johnsmith1@example.com", "johnsmith2@example.com")));
        accounts.add(new ArrayList<String>(Arrays.asList("Jane Doe", "janedoe1@example.com", "johnsmith2@example.com")));
        List<List<String>> merged = new ArrayList<List<String>>();
        merged.add(new ArrayList<String>(Arrays.asList("John Smith", "johnsmith1@example.com", "johnsmith2@example.com", "janedoe1@example.com")));
        assertEquals(ob.accountsMerge(accounts), merged);
    }

    @Test
    public void testDuplicateAccounts() {
        AccountsMerge ob = new AccountsMerge();
        List<List<String>> accounts = new ArrayList<List<String>>();
        accounts.add(new ArrayList<String>(Arrays.asList("John Smith", "johnsmith@example.com")));
        accounts.add(new ArrayList<String>(Arrays.asList("John Smith", "johnsmith@example.com")));
        List<List<String>> merged = new ArrayList<List<String>>();
        merged.add(new ArrayList<String>(Arrays.asList("John Smith", "johnsmith@example.com")));
        assertEquals(ob.accountsMerge(accounts), merged);
    }

    @Test
    public void testLongName() {
        AccountsMerge ob = new AccountsMerge();
        List<List<String>> accounts = new ArrayList<List<String>>();
        accounts.add(new ArrayList<String>(Arrays.asList("This is a really long name", "longname@example.com")));
        assertEquals(ob.accountsMerge(accounts), accounts);
    }

    @Test
    public void testEmptyEmails() {
        AccountsMerge ob = new AccountsMerge();
        List<List<String>> accounts = new ArrayList<List<String>>();
        accounts.add(new ArrayList<String>(Arrays.asList("John Smith", "")));
        accounts.add(new ArrayList<String>(Arrays.asList("Jane Doe", "")));
        assertEquals(ob.accountsMerge(accounts), accounts);
    }

    @Test
    public void testInvalidEmailFormat() {
        AccountsMerge ob = new AccountsMerge();
        List<List<String>> accounts = new ArrayList<List<String>>();
        accounts.add(new ArrayList<String>(Arrays.asList("John Smith", "johnsmith@")));
        accounts.add(new ArrayList<String>(Arrays.asList("Jane Doe", "@example.com")));
        assertEquals(ob.accountsMerge(accounts), accounts);
    }
}