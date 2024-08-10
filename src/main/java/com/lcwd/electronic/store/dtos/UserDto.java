package com.lcwd.electronic.store.dtos;

import com.lcwd.electronic.store.validate.ImageNameValid;
import jakarta.validation.constraints.*;
import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserDto {
    private String userId;
    @Size(min = 3, max = 20, message = "invalid Name!!")
    private String name;
    @Pattern(regexp = "^[a-z0-9](\\.?[a-z0-9]){5,}@g(oogle)?mail\\.com$", message = "Invalid Email!!")
    @Email(message = "invalid Email!!")
    private String email;
    @NotBlank(message = "password required!!")
    private String password;
    @Size(min = 3, max = 6, message = "invalid gender!!")
    private String gender;
    @NotBlank(message = "write something about your self")
    private String about;

    @ImageNameValid
    private String imageName;
}
