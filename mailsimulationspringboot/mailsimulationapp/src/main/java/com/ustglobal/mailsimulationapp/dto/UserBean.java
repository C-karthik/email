package com.ustglobal.mailsimulationapp.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.ToString.Exclude;

@Entity
@Table(name="user_info")
public class UserBean {

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column
	private String username;
	
	@Column(unique = true)
	private String email;
	
	@Column
	private String password;
	
	@JsonIgnore
	@Exclude
	@OneToMany(mappedBy = "user")
	private List<MailBean> mails;
	
	@JsonIgnore
	@Exclude
	@OneToMany(mappedBy = "userBean")
	private List<MailBean> mailBean;
	
	
	public List<MailBean> getMails() {
		return mails;
	}
	public void setMails(List<MailBean> mails) {
		this.mails = mails;
	}
	public List<MailBean> getMailBean() {
		return mailBean;
	}
	public void setMailBean(List<MailBean> mailBean) {
		this.mailBean = mailBean;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	
}
