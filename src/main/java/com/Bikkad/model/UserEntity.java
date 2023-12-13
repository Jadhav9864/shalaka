package com.Bikkad.model;

	import javax.persistence.Column;

	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	import javax.persistence.Table;

	@Entity
	@Table(name="USER_DETAILS")
	public class UserEntity {
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name="USER_ID")
		private int userId;
		@Column(name="USER_USERNAME")
		private String userName;
		@Column(name="USER_EMAIL")
		private String email;
		@Column(name="USER_AGE")
		private int age;

		public int getUserId() {
			return userId;
		}

		public void setUserId(int userId) {
			this.userId = userId;
		}

		public String getUserName() {
			return userName;
		}

		public void setUserName(String userName) {
			this.userName = userName;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		@Override
		public String toString() {
			return "UserEntity [userId=" + userId + ", userName=" + userName + ", email=" + email + ", age=" + age + "]";
		}

	}



