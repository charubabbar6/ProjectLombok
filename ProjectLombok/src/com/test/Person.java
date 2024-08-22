package com.test;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // Generates getters, setters, toString, equals, and hashCode
@AllArgsConstructor // Generates a constructor with all fields as parameters
@NoArgsConstructor  // Generates a no-argument constructor
public class Person {
	 private String name;
	    private int age;
	    private String email;
}
//lombok.jar added in a referenced libraries...
//
//What is the need of Project Lombok ?
//To reduce Boilerplate code in Java like getters,setters, toString methods ,constructor etc.
//Languages like Kotlin and Scala which is also JVM based doesn't have this boilerplate code
//
//What is Project Lombok ?
//Project lombok is a Java library tool which is used to minimize/remove the boilerplate code and save the precious time of developer during development.
//We can achieve this thing by using some annotation provided by lombok
//It also increases the readability of the source code and saves some space
//
//How to configure project lombok to eclipse
//
//Comparison of Code with and without lombok
//
//Lombok Annotation
//@Getter and @Setter
//@NoArgsConstructor
//@AllArgsConstructor
//@ToString
//@EqualsAndHashCode
//@Data
