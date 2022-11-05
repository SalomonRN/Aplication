/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Optional;
import javax.swing.JOptionPane;
import modelo.Producto;
import modelo.RepositorioProducto;
import org.springframework.beans.factory.annotation.Autowired;
import vista.vista;
import javax.swing.table.DefaultTableModel;
import vista.actualizar;
import vista.informe;

/**
 *
 * @author Salomon RN
 */
public class controlador {
    // Llamada de las clases

    RepositorioProducto rp;
    @Autowired
    ArrayList<Producto> listaProductos;
    vista v;
    actualizar ven;

    //Cronstructor para instancias
    public controlador(RepositorioProducto rp, vista v) {
        this.rp = rp;
        this.v = v;
    }

    //
    public void setListaProductos(ArrayList<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }

    //Funciones para DataBase(repositorio)
    public Producto agregar(Producto p) {
        return rp.save(p);
    }

    public Producto actualizar(Producto p) {
        return rp.save(p);
    }

    public boolean eliminar(Integer id) {
        try {
            rp.deleteById(id);
            return true;
        } catch (Exception ex) {
            return false;
        }
    }

    //Metodo para cargar los registro de la DataBase a la Array
    public ArrayList<Producto> ObtenerProductos() {
        return (ArrayList<Producto>) rp.findAll();

    }

//Funcion para calcular el InventarioTotal
    public double InventarioTotal() {
        double suma = 0;
        //For eche que recorre el Array "listaProductos" y suma su contenido
        for (Producto p : listaProductos) {
            suma += p.getPrecio() * p.getInventario();
        }
        return suma;
    }

    //Funcion para calcular el promedio
    public double promedio() {
        double suma = 0;
        //For eche que recorre el Array "listaProductos" y suma su contenido
        for (Producto p : listaProductos) {
            suma += p.getPrecio();
        }
        //La suma obtenida se divide con el numero total de datos
        return suma / listaProductos.size();
    }

    //Funcion para calcular el producto con el precio menor
    public String precio_menor() {
        String nombre = listaProductos.get(0).getNombre();
        double precio = listaProductos.get(0).getPrecio();
        /*For eche que recorre el Array "listaProductos" y compara cada 
            * valor y guarda nombre y precio del producto menor
         */
        for (Producto prec : listaProductos) {
            if (prec.getPrecio() < precio) {
                nombre = prec.getNombre();
                precio = prec.getPrecio();
            }
        }
        return nombre;
    }

    //Funcion para calcular el producto con el precio mayor
    public String precio_mayor() {
        String nombre = listaProductos.get(0).getNombre();
        double precio = listaProductos.get(0).getPrecio();
        /*For eche que recorre el Array "listaProductos" y compara cada 
            * valor y guarda nombre y precio del producto mayor
         */
        for (Producto prec : listaProductos) {
            if (prec.getPrecio() > precio) {
                nombre = prec.getNombre();
                precio = prec.getPrecio();
            }
        }
        return nombre;
    }

    /*
    /* Metodo a realizar si el Botón "Agregar Producto" fue oprimido en la 
    *  clase "Vista"
     */
    public void act_btn_agregarer() {
        //Variales que guardan el contenido de los Text
        String nombre = v.getTxt_nombre();
        String precio = v.getTxt_precio();
        String inventario = v.getTxt_inventario();
        //Validacion para verificar que cada campo esté completo
        if ((!nombre.equals("")) && (!precio.equals("")) && (!inventario.equals(""))) {
            //
            Producto nuevo = new Producto(nombre, Double.parseDouble(precio), Integer.parseInt(inventario));
            listaProductos.add(nuevo);
            agregar(nuevo);
            DefaultTableModel model = (DefaultTableModel) v.getTbl_inventario().getModel();
            model.insertRow(listaProductos.size() - 1, new Object[]{nuevo.getNombre(), nuevo.getPrecio(), nuevo.getInventario()});

        } else {
            JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios");
        }
    }

    /*  Metodo a realizar si el Botón "Actualizar Producto" fue oprimido en la 
    *  clase "Vista"
     */
    public void abrir_ventana() {
        actualizar act = new actualizar();
        act.setcontrolador(this);
        act.setVisible(true);
    }

    /*
    /* Metodo a realizar si el Botón "Borrar Producto" fue oprimido en la 
    *  clase "Vista"
     */

    public void act_btn_borar() {

        //Variable que guarda la fila a eliminar que se va a eliminar
        //int [] borrar = v.getTbl_inventario().getSelectedRows();
        int borrar = v.getTbl_inventario().getSelectedRow();

        try {
            /* for(Producto n :borrar[] ){
            
            }*/
            //Validacion y proceso a realizar con respecto a la fila 
            if (eliminar(listaProductos.get(borrar).getCodigo()) == true) {
                DefaultTableModel model = (DefaultTableModel) v.getTbl_inventario().getModel(); //Visual
                model.removeRow(borrar); //Visual   
                listaProductos.remove(borrar);//Array
                JOptionPane.showMessageDialog(null, "El producto fue borrado exitosamente");
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Asegurese si está seleccionando alguna de las fila, o si la fila contiene informacion");

        }

    }

    /* Metodo a realizar si el Botón "Actualizar Producto" fue oprimido en la 
    *  clase "actualizar"
     */
    public void act_btn_actualizar(actualizar ven) {
        //Variable que guarda la fila seleccionada
        int actu = v.getTbl_inventario().getSelectedRow();
        // Variables que guardan los nuevos datos
        String nombre = ven.getTxt_nombre_actualizar();
        String precio = ven.getTxt_precio_actualizar();
        String inventario = ven.getTxt_inventario_actualizar();
        /*
        //Validacion para verificar que se está seleccionando alguna fila
        if(actu >=0){
        if((!nombre.equals(""))&&(!precio.equals(""))&&(!inventario.equals(""))){
            //Actualizar el producto con los nuevos datos asignados
            DefaultTableModel model = (DefaultTableModel) v.getTbl_inventario().getModel();
            listaProductos.get(actu).setNombre(nombre);
            listaProductos.get(actu).setPrecio(Double.parseDouble(precio));
            listaProductos.get(actu).setInventario(Integer.parseInt(inventario));   
            actualizar(listaProductos.get(actu));
            model.setValueAt(nombre, actu, 0);
            model.setValueAt(precio, actu, 1);
            model.setValueAt(inventario, actu, 2);
                }else{
                    JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios");
                }
        }else{
            JOptionPane.showMessageDialog(null, "Por favor seleccione la fila a editar en la ventana anterior");
        }  
         */

        try {
            if ((!nombre.equals("")) && (!precio.equals("")) && (!inventario.equals(""))) {
                //Actualizar el producto con los nuevos datos asignados
                DefaultTableModel model = (DefaultTableModel) v.getTbl_inventario().getModel();
                listaProductos.get(actu).setNombre(nombre);
                listaProductos.get(actu).setPrecio(Double.parseDouble(precio));
                listaProductos.get(actu).setInventario(Integer.parseInt(inventario));
                actualizar(listaProductos.get(actu));
                model.setValueAt(nombre, actu, 0);
                model.setValueAt(precio, actu, 1);
                model.setValueAt(inventario, actu, 2);
            } else {
                JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios");
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Asegurese si está seleccionando alguna de las fila, o si la fila contiene informacion");
        }

    }

    /* Metodo a realizar si el Botón "Generar Informe" fue oprimido en la 
    *  clase "vista"
     */
    public void act_btn_informe() {
        informe i = new informe();
        i.setVisible(true);
        i.set_mayor(i.get_mayor() + precio_mayor());
        i.set_menor(i.get_menor() + precio_menor());
        i.set_promedio(i.get_promedio() + String.format("%.1f", promedio()));
        i.set_valor(i.get_valor() + InventarioTotal());

    }

    /* 
    * Funcion que trae el contenido de la DataBase y la ordena en 
    * "Tbl_inventario()" en la clase "vista"
     */
    public void iniciaTabla() {
        int ind = 0;
        DefaultTableModel model = (DefaultTableModel) v.getTbl_inventario().getModel();
        for (Producto pro : listaProductos) {
            model.insertRow(ind, new Object[]{pro.getNombre(), pro.getPrecio(), pro.getInventario()});
            ind += 1;
        }
    }
}
