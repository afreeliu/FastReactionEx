package com.rem.du.useraccount.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class DItemAttr implements Serializable {
    @Id
    @GeneratedValue
    public Long id;
    @Column(nullable = false)
    public String attrname;
    @Column(nullable = false)
    public String attrvalue;
    @ManyToOne
    public DItem ditem;
}
