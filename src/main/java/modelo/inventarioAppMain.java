/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import controlador.controlador;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import vista.vista;

/**
 *
 * @author Salomon RN
 */
@SpringBootApplication
public class inventarioAppMain {
   @Autowired
   RepositorioProducto rp;
    public static void main(String[] args){
            SpringApplicationBuilder builder = new SpringApplicationBuilder(inventarioAppMain.class);
            builder.headless(false);
            ConfigurableApplicationContext context = builder.run(args);
    }
    @Bean
    ApplicationRunner applicationRunner(){
         return args ->{
             final Log logger = LogFactory.getLog(getClass());
             vista v = new vista();
             controlador controlador = new controlador(rp, v);
             v.setcontrolador(controlador);
             controlador.setListaProductos(controlador.ObtenerProductos());
             controlador.iniciaTabla();
             v.setVisible(true);
            
             
         };
    
    }
}
