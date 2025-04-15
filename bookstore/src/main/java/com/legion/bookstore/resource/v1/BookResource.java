/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.legion.bookstore.resource.v1;

import com.legion.bookstore.dto.Book;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

/**
 *
 * @author Legion
 */
@Path("v1/books")
public class BookResource {
    
//    @GET
//    @Produces(MediaType.TEXT_PLAIN)
//    public String sayHello(){
//        return "Welcome to Bookstore";
//    }
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Book getBook(){
        return new Book("12345", "Bombardiro Crocodilo", "Akira Toriyama", 1, 2000);
    }
}
