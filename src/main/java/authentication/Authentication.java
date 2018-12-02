package authentication;

/**
 * Interface provide to authentication of the users.
 */
interface Authentication {
    /**
     * Method to authenticate if a user is valid into the system.
     * @param username that want you authenticate it.
     * @return true if user name is valid or false otherwise.
     */
    boolean isValidUser(String username);
}
