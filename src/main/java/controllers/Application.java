/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import ninja.Result;
import ninja.Results;

/**
 *
 * @author joelauer
 */
public class Application {
    
    public Result index() {
        return Results.ok().html().template("views/index.ftl.html");
    }
    
}
