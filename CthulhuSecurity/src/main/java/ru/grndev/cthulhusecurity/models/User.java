package ru.grndev.cthulhusecurity.models;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class User {
    private Integer id;
    private String nickname;
    private String password;
    private String email;
    private String description;
}
