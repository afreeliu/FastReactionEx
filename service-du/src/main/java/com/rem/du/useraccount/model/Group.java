package com.rem.du.useraccount.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Group implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    private Long id;
    @Column(nullable = false, unique = false)
    private String name;
    @Column(nullable = false, unique = false)
    private String modifytime;

    private String createtime;


}
