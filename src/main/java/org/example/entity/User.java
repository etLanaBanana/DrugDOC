package org.example.entity;

import lombok.*;

import java.util.UUID;

@Builder
@AllArgsConstructor
@Getter
@Setter
public class User {
    public UUID id;
    public String name;
    public String password;

    @Override
    public String toString() {
        return "фармацевт " + name + "\n";
    }

}
