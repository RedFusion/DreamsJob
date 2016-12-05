package ru.menkin.model;

/**
 * @author Menkin
 * @since 3.12.2016
 * User
 */
public class User {
    /**
     * user id
     */
    private String id;

    /**
     * User name
     */
    private String name;

    /**
     * default constructor
     */
    public User() {
    }

    /**
     * create new user
     * @param id user id
     * @param name user name
     */
    public User(final String id, final String name) {
        this.id = id;
        this.name = name;
    }

    /**
     * @return user id
     */
    public String getId() {
        return id;
    }

    /**
     * set user id
     * @param id user id
     */
    public void setId(final String id) {
        this.id = id;
    }

    /**
     * get user name
     * @return user name
     */
    public String getName() {
        return name;
    }

    /**
     * set user name
     * @param name user name
     */
    public void setName(final String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("User id = %s name = %s \n", id, name);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) { return true; }
        if (o == null || getClass() != o.getClass()) { return false; }

        User user = (User) o;

        if (id != null ? !id.equals(user.id) : user.id != null) { return false; }
        return !(name != null ? !name.equals(user.name) : user.name != null);

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}
