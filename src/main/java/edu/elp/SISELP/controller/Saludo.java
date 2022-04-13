package edu.elp.SISELP.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("index")
public class Saludo {
    @GetMapping("/saludo")
    public String saludo(@RequestParam String nombre){
        return "Hola Mundo desde Ayacucho!!!!!....... te saluda " + nombre;
    }
    @GetMapping("/bienvenida")
    public String bienvenida(){
        return "Hola amig@s al curso de Java";
    }
}
