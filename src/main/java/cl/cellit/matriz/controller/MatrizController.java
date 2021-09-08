package cl.cellit.matriz.controller;

import com.github.cliftonlabs.json_simple.JsonObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.cellit.matriz.services.MatrizService;

@RestController
@RequestMapping("/matriz")
public class MatrizController {
    @Autowired
    MatrizService ms;

    @GetMapping(path="/{r}/{c}/{z}/{x}/{y}")
    public JsonObject generaMatriz(
        @PathVariable int r ,
        @PathVariable int c ,
        @PathVariable int z ,
        @PathVariable int x ,
        @PathVariable int y 
    ){
        return ms.generaMatriz(r,c,z,x,y);
    }
}
