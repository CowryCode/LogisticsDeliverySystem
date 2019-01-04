/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cowrycode.resources;

import com.cowrycode.entity.CurrierItem;
import com.cowrycode.service.PersistenceService;
import java.util.List;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author JavaEE
 */
@Path("currieritem")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class CurrieritemResource {
    
    @Inject
    PersistenceService persistenceService;
    
    @Inject
    QueryService queryService;
    
    @POST
    @Path("new")
    public Response createCurrierItem(CurrierItem currierItem){
       persistenceService.saveCurrierItem(currierItem);
//       CurrierItem ci = new CurrierItem();
//       persistenceService.saveCurrierItem(currierItem);
        return Response.ok().status(Response.Status.CREATED).build();
    }
    
    @GET
    @Path("item")
    public Response getItems(){
        List<CurrierItem> currierItem = queryService.getItems();
        return Response.ok(currierItem).build();
    }
    
    @GET
    @Path("item/{id}")
    public Response getItem(@PathParam("id") @DefaultValue("0") Long id){
        CurrierItem ci = queryService.findItemByID(id);
        return Response.ok(ci).build();
    }
    
}
