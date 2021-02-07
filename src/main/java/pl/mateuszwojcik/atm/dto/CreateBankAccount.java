package pl.mateuszwojcik.atm.dto;

import lombok.Data;

public enum CreateBankAccount {
    ;
    @Data
    public static class Request {
        private String name;
        private String lastName;
    }

    @Data
    public static class Response {
        private String id;
    }
}
