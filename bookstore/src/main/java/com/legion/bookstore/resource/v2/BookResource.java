/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.legion.bookstore.resource.v2;

import com.legion.bookstore.dto.Book;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import java.util.*;

/**
 *
 * @author Legion
 */
@Path("v2/books")
public class BookResource {
    private List<Book> list = new ArrayList();
    
    public BookResource(){
        list.add(new Book("1", "Tôi thấy hoa vàng trên cỏ xanh", "Nguyễn Nhật Ánh", 35, 2022));
        list.add(new Book("2", "Trên đường băng", "Tony buổi sáng", 1, 2022));
        list.add(new Book("3", "Nhà giả kim", "Không nhớ", 11, 2022));
              
    }
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Book> getAll(){
        return list;
    }
    
    @GET
    @Path("{masach}")
    @Produces(MediaType.APPLICATION_JSON)
    public Book getOne(@PathParam("masach") String isbn){
        for (Book x : list) {
            if(x.getIsbn().equalsIgnoreCase(isbn))
                return x;
        }
        return null;
        
    }
    
}
