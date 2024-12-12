package com.jsp.entity;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class Student {
	@NotNull(message = "id can not be null")
	private Integer id;
	@NotNull(message = "name can not be null")
	@Size(min = 5, max = 30)
//	@Pattern(regexp ="[A_Z][a-z]*")
	private String name;
	@NotNull(message = "email can not be null")
	@Email
	private String email;
	@NotNull(message = "marks can not be null")
	@Min(1)
	@Max(100)
	private Integer marks;
}
