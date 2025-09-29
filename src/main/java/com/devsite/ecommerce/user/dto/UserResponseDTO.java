package com.devsite.ecommerce.user.dto;

public class UserResponseDTO {

    private Long id;
    private String email;
    private String Password;

    public UserResponseDTO() {
    }

    public UserResponseDTO(Long id, String email, String password) {
        this.id = id;
        this.email = email;
        Password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }
}
