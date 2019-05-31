package com.rem.du.useraccount.model;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name = "t_uitem")
public class UItem implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	public Long id;
	@Column(nullable = false)
	public String username;
	@Column(nullable = false)
	public String password;
	@Column(nullable = false, unique = true)
	public String email;
	@Column(nullable = false, unique = true)
	public String phonenum;
	@Column(nullable = true, unique = true)
	public String nickname;
	@CreatedDate
	private Date createTime;
	@LastModifiedDate
	private Date updateTime;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "uitem", fetch = FetchType.LAZY)
	public Set<UItemAttr> uItemAttrs;

}