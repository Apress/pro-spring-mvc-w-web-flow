package com.apress.prospringmvc.bookstore.service;

import com.apress.prospringmvc.bookstore.domain.Account;

/**
 * Contract for services that work with an {@link Account}.
 * 
 * @author Marten Deinum
 * @author Koen Serneels
 *
 */
public interface AccountService {

    Account save(Account account);

    /**
     * Handles the login logic. If the {@link Account} can be retrieved and the password is correct we get the
     * {@link Account}. In all other cases we get a {@link AuthenticationException}.
     * @param username the username
     * @param password the password
     * @return the account
     * @throws AuthenticationException if account not found or incorrect password
     */
    Account login(String username, String password) throws AuthenticationException;

    Account getAccount(String username);
}
