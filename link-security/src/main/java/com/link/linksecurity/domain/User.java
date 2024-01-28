package com.link.linksecurity.domain;

import com.link.linksecurity.constants.ConstantsUserTable;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = ConstantsUserTable.NAME)
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = ConstantsUserTable.Id.NAME)
    private Long id;

    @Column(name = ConstantsUserTable.UserName.NAME,
            unique = true,
            length = ConstantsUserTable.UserName.SIZE)
    private String userName;

    @Column(name = ConstantsUserTable.Email.NAME,
            unique = true)
    private String email;

    @Column(name = ConstantsUserTable.Password.NAME)
    private String password;
}
