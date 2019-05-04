package com.rem.du.useraccount.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
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
	@Column(nullable = false)
	public String regtime;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "uitem", fetch = FetchType.LAZY)
	public Set<UItemAttr> uItemAttrs;

	@ManyToMany(cascade = CascadeType.DETACH)
	public Set<GItem> gitems;
	@ManyToMany
	public Set<DItem> ditems;

}