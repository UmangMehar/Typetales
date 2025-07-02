package com.typetales.blog.payloads;


import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class UserDto {


    private int id;
    @NotEmpty
    @Size(min = 4, message = "User name must be of 4 characters !!")
    private String name;
    @Email(message = "Email Address is not valid!!")
    private String  email;
    @NotEmpty
    @Size(min = 8, max = 12, message="Password should min of 8 char and maximum of 12")
    private String password;
    @NotBlank
    private String about;
}
