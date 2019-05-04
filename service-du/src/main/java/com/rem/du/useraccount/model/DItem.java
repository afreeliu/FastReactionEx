package com.rem.du.useraccount.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
public class DItem implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue
    public Long id;
    @Column(nullable = false)
    public String name;
    @Column(nullable = false)
    public String modifytime;
    @Column(nullable = false)
    public String createtime;
    @OneToMany(mappedBy = "ditem", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    public Set<DItemAttr> dItemAttrs;

    @ManyToMany
    public Set<UItem> uitems;

}
