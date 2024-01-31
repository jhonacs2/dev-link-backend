package com.link.linksecurity.domain;

import com.link.linksecurity.constants.ConstantsRolTable;
import com.link.linksecurity.constants.ConstantsUserTable;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.Set;

@Entity
@Getter
@Setter
@Table(name = ConstantsUserTable.NAME)
public class User implements UserDetails {
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

    @Column(
            name = ConstantsUserTable.FirstName.NAME,
            length = ConstantsUserTable.FirstName.LENGTH
    )
    private String firstName;

    @Column(
            name = ConstantsUserTable.LastName.NAME,
            length = ConstantsUserTable.LastName.LENGTH
    )
    private String lastName;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "user_role_junction",
            joinColumns = {@JoinColumn(name = ConstantsUserTable.Id.NAME)},
            inverseJoinColumns = {@JoinColumn(name = ConstantsRolTable.Id.NAME)}
    )
    private Set<Role> roles;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return this.roles;
    }

    @Override
    public String getUsername() {
        return this.userName;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
