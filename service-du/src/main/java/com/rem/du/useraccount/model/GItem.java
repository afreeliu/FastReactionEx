package com.rem.du.useraccount.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
public class GItem implements Serializable {

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
    @OneToMany(mappedBy = "gitem", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    public Set<GItemAttr> gItemAttrs;

    @ManyToMany
    public Set<UItem> uitems;

}