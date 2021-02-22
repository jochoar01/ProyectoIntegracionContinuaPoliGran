package com.example.demo.controlers;

import com.example.demo.models.Paths;
import org.springframework.web.bind.annotation.*;

import static com.example.demo.controlers.filesIteration.getFolderImagesAndConvert;

@RestController
public class appiController {



    @RequestMapping("/")
    public String getHelloWorld(){
        return "start";

    }
    @GetMapping(value="convert")

    public Paths getPathImages(){


        return new Paths("C:/Users/juan.ochoa/Desktop/pruebaIMG","C:/Users/juan.ochoa/Desktop/pruebaIMG/copia/");
    }
    @PostMapping(value="convert", consumes ="application/json",produces = "application/json")
    public String convertImages(@RequestBody Paths paths){

       getFolderImagesAndConvert(paths.getInitialPath(), paths.getFinallPath());
     return  "Exitoso";
    }
}
