package com.example.demo.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserDTO {
	private String id;
	private String wallet;
	private String alias;
	private String auth;
}