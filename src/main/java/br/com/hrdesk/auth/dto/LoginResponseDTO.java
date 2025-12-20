package br.com.hrdesk.auth.dto;

public class LoginResponseDTO {

    private String message;

    public LoginResponseDTO(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
