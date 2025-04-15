/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.legion.bookstore.dto;

//import com.fasterxml.jackson.annotation.JsonAutoDetect;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 *
 * @author Legion
 */

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
//@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class Book implements Serializable{
    
    private String isbn;
    private String title;
    private String author;
    private int edition;
    private int publishedYear;

    
}
