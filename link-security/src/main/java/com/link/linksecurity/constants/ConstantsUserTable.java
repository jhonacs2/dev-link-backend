package com.link.linksecurity.constants;

public class ConstantsUserTable {
    public static final String NAME = "user_table";

    public static class Id {
        public static final String NAME = "user_id";
    }

    public static class UserName {
        public static final String NAME = "username";
        public static final int SIZE = 20;
    }

    public static class Email {
        public static final String NAME = "user_email";
    }

    public static class Password {
        public static final String NAME = "user_password";
    }

    public static class FirstName {
        public static final String NAME = "user_first_name";
        public static final int LENGTH = 20;
    }

    public static class LastName {
        public static final String NAME = "user_last_name";
        public static final int LENGTH = 20;
    }
}
