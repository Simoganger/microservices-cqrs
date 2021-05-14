package com.springbank.user.core.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document
public class Account {

    @Size(min = 2, message = "Provide at least 2 characters for the username")
    private String username;

    @Size(min = 6, message = "Password should have at least 6 characters")
    private String password;

    private List<Role> roles;

}
