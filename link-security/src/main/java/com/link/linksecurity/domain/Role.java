package com.link.linksecurity.domain;

import com.link.linksecurity.constants.ConstantsRolTable;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;

@Entity
@Table
@Getter
@Setter
public class Role implements GrantedAuthority {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = ConstantsRolTable.Id.NAME)
    private Integer roleId;

    private String role;

    @Override
    public String getAuthority() {
        return this.role;
    }
}
