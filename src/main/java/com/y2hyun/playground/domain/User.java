package com.y2hyun.playground.domain;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table
public class User implements Serializable {

	private static final long serialVersionUID = 1L;

	public static final class Status {
		public static final Character INVALID = '0';
		public static final Character VALID = '1';
	}
	
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long userId;
	
	@Column
	private String name;
	
	@Column
	private String password;
	
	@Column(unique = true)
	private String email;
	
	@Column
	private LocalDateTime createDate;
	
	@Column
	private LocalDateTime updateDate;
	
	@Builder.Default
	@Column
	private Character status = Status.VALID;
	

}
