/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package modelo;

import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Salomon RN
 */
    //Interfaz que hereda el repositorio para usar sus funciones
  public interface RepositorioProducto extends CrudRepository <Producto, Integer>{

  }