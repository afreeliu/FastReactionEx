package com.rem.du.useraccount.model;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name = "t_uitem_attr")
public class UItemAttr implements Serializable {

    @Id
    @GeneratedValue
    public Long id;
    @Column(nullable = false)
    public String attrname;
    @Column(nullable = false)
    public String attrvalue;
    @CreatedDate
    private Date createTime;
    @LastModifiedDate
    private Date updateTime;
    @ManyToOne
    public UItem uitem;

}

