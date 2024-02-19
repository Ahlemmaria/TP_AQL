package org.example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThrows;
import org.junit.Before;
import org.junit.Test;

public class BankAccountTest {
    private BankAccount account;
    private BankAccount otherAccount;

    @Before
    public void setUp() {
        account = new BankAccount(1000, 0.05);
        otherAccount = new BankAccount(500, 0.05);
    }

    @Test
    public void testDeposit() {
        account.deposit(500);
        assertEquals(1500, account.getBalance(), 0.01);
    }

    @Test
    public void testWithdraw() {
        account.withdraw(500);
        assertEquals(500, account.getBalance(), 0.01);
    }

    @Test
    public void testTransfer() {
        account.transfer(300, otherAccount);
        assertEquals(700, account.getBalance(), 0.01);
        assertEquals(800, otherAccount.getBalance(), 0.01);
    }

    @Test
    public void testAddInterest() {
        account.addInterest();
        assertEquals(1050, account.getBalance(), 0.01);
    }

    @Test
    public void testGetBalance() {
        assertEquals(1000, account.getBalance(), 0.01);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDepositNegativeAmount() {
        account.deposit(-500);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithdrawNegativeAmount() {
        account.withdraw(-500);
    }

    @Test(expected = IllegalStateException.class)
    public void testWithdrawInsufficientBalance() {
        account.withdraw(1500);
    }

    @Test(expected = NullPointerException.class)
    public void testTransferWithNullAccount() {
        account.transfer(300, null);
    }
}
