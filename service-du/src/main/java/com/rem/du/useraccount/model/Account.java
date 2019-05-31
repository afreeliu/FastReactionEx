package com.rem.du.useraccount.model;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "t_account")
@EntityListeners(AuditingEntityListener.class)
public class Account {

    @Id
    @GeneratedValue
    public Long id;

    @Column(nullable = false)
    public String username;
    @Column(nullable = false)
    public String domain;
    @Column(unique = true)
    public String useraccount;
    @Column(nullable = false)
    public String password;
    @Column(nullable = false)
    public String accounttype;
    @CreatedDate
    private Date createTime;
    @LastModifiedDate
    private Date updateTime;

}