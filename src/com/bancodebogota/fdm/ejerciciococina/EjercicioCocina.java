/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bancodebogota.fdm.ejerciciococina;

/**
 *
 * @author NAGOCHI
 */
public class EjercicioCocina {

    private static final int NUMERO_INGREDIENTES = 4;
   
//declaraciones de las clases
    private Cocina cocina;
    private JefeCocina jefeCocina;
    private InventarioIngrediente[] ingredientes;
 //   private Ingrediente[] ingredientesReceta;
    private Cliente cliente;
    private Plato plato;
    private Receta receta;
    private Receta[] listaRecetas;
    private Pedido pedido;
       
    

    public EjercicioCocina() {
        this.ingredientes = new InventarioIngrediente[NUMERO_INGREDIENTES];
        this.listaRecetas = new Receta[2];
               
    }

//Metodos//
    public void crearJefeCocina() {
        jefeCocina = new JefeCocina();
        jefeCocina.setCodigoJefeCocina(1);
        jefeCocina.setNombres("Juan");
        jefeCocina.setApellidos("Perez");
        jefeCocina.setDireccion("Calle 23");
        jefeCocina.setTelefono("4446677");
        jefeCocina.setNroDocumento("1234");
        jefeCocina.setSalario(5000);

        System.out.println("-----------Jefe de cocina-----------");
        System.out.println(jefeCocina);

    }

    public void crearCocina() {
        cocina = new Cocina();
        cocina.setJefeCocina(jefeCocina);
        cocina.setCodigoCocina(1000);
        cocina.setEspecialidad("Tradicional");
        cocina.setDireccion("Calle 31");
        cocina.setTelefono("5148989");

        System.out.println("-----------Cocina-----------");
        System.out.println(cocina);

    }
    
    public void crearIngrediente() {
        Ingrediente iI1 = new InventarioIngrediente();
        Ingrediente iI2 = new InventarioIngrediente();
        Ingrediente iI3 = new InventarioIngrediente();
        Ingrediente iI4 = new InventarioIngrediente();
        
        iI1.setCodigoIngrediente(1);
        iI1.setNombre("Arroz");
        iI1.setCantidad(20);
        iI1.setMedida("Kilos");
        iI1.setEstado("Sólido");
        iI1.setContable("No");
        iI1.setValor(10000);
        
        iI2.setCodigoIngrediente(2);
        iI2.setNombre("Azúcar");
        iI2.setCantidad(10);
        iI2.setMedida("Litros");
        iI2.setEstado("Sólido");
        iI2.setContable("No");
        iI2.setValor(20000);
        
        iI3.setCodigoIngrediente(3);
        iI3.setNombre("Leche");
        iI3.setCantidad(10);
        iI3.setMedida("Litros");
        iI3.setEstado("Líquido");
        iI3.setContable("No");
        iI3.setValor(30000);
        
        iI4.setCodigoIngrediente(4);
        iI4.setNombre("Gelatina");
        iI4.setCantidad(1);
        iI4.setMedida("Kilos");
        iI4.setEstado("Líquido");
        iI4.setContable("No");
        iI4.setValor(40000);
        
        ingredientes[0] = (InventarioIngrediente) iI1;
        ingredientes[1] = (InventarioIngrediente) iI2;
        ingredientes[2] = (InventarioIngrediente) iI3;
        ingredientes[3] = (InventarioIngrediente) iI4;
          
        System.out.println("-----------Inventario Ingredientes-----------");
        
        for (Ingrediente ingrediente : ingredientes) {
            System.out.println(ingrediente +"\n");
        }
     
    }
    
    public void crearReceta() {
        Receta recetat = new Receta();
        
        //Receta 1
        recetat.setCodigoReceta("1");
        recetat.setNombre("Arroz con leche");
        
        Ingrediente[] lista= new InventarioIngrediente[2];
        Ingrediente i1 = new InventarioIngrediente();
        Ingrediente i2 = new InventarioIngrediente();
        
        i1.setCodigoIngrediente(1);
        i1.setNombre("Arroz");
        i1.setCantidad(1);
        i1.setMedida("Kilo");
        
        i2.setCodigoIngrediente(2);
        i2.setNombre("Leche");
        i2.setCantidad(1);
        i2.setMedida("Litro");
        
        lista[0]=i1;
        lista[1]=i2;
        
        recetat.setListaIngredientes(lista);
        
        this.listaRecetas[0]=recetat;
       
               
        //Receta 2
        recetat = new Receta();
        recetat.setCodigoReceta("2");
        recetat.setNombre("Flan");
        
        Ingrediente[] lista1= new InventarioIngrediente[3];
        Ingrediente r1 = new InventarioIngrediente();
        Ingrediente r2 = new InventarioIngrediente();
        Ingrediente r3 = new InventarioIngrediente();
        
        r1.setCodigoIngrediente(1);
        r1.setNombre("Gelatina");
        r1.setCantidad(1);
        r1.setMedida("Kilo");
        
        r2.setCodigoIngrediente(2);
        r2.setNombre("Leche");
        r2.setCantidad(1);
        r2.setMedida("Litro");
        
        r3.setCodigoIngrediente(3);
        r3.setNombre("Huevos");
        r3.setCantidad(4);
        
        lista1[0]=r1;
        lista1[1]=r2;
        lista1[2]=r3;
        
        recetat.setListaIngredientes(lista1);
        
        this.listaRecetas[1]=recetat;
        
        System.out.println("-----------Recetas-----------");
        for (Receta listaReceta : listaRecetas) {
            System.out.println(listaReceta +"\n");
        }    
       
    }

    public void crearCliente() {
        cliente = new Cliente();
        cliente.setCodigoCliente(1);
        cliente.setNombres("Pedro");
        cliente.setApellidos("López");
        cliente.setNroDocumento("1000");
        cliente.setDireccion("Calle 12");
        cliente.setTelefono("3120090");
        
        System.out.println("-----------Cliente-----------");
        System.out.println(cliente);
      
    }
    
    public void crearPlato(){
        plato = new Plato();
        plato.setCodigoPlato(1);
        plato.setTipoPlato("Completo");
        plato.setCodReceta("1");
                
        System.out.println("-----------Plato-----------");
        System.out.println(plato);
                      
    }
    
    public void crearPedido(){
        pedido = new Pedido();
        pedido.setCodigoPedido(1);
        pedido.setNumeroMedioPlato(0);
        pedido.setNumeroPlatos(1);
        pedido.setValorPlato(3000);
        pedido.setValorTotal(3000.00);
        pedido.setSolicitud("Arroz con leche");
              
        System.out.println("-----------Pedido-----------");
        System.out.println(pedido);
           
    }
    
   public boolean validarIngredientesReceta(String codReceta){
        //Obtener receta y lista de ingredientes
        Receta r = new Receta();
        for (int i=0;i<listaRecetas.length; i++){
            if (codReceta.equals(listaRecetas[i].getCodigoReceta())){
                r = listaRecetas[i];
            }
        }
        //Comprobar existencias
        Ingrediente [] listaIngredientes = r.getListaIngredientes();
        boolean posible = true;
        for (int i = 0;i<listaIngredientes.length;i++){
            if (!hayExistenciasDeIngrediente(listaIngredientes[i].nombre)){
               posible = false;
               break;
            }
        }
        return posible;
   }
   
   private boolean hayExistenciasDeIngrediente(String nombreIngrediente){
       for (int i = 0;i<ingredientes.length;i++){
           if (nombreIngrediente==ingredientes[i].nombre){
               return true;
           }
       } 
       return false;
   }
    
    
    
    public static void main(String[] args) {

        EjercicioCocina main = new EjercicioCocina();
        main.crearJefeCocina();
        main.crearCocina();
        main.crearCliente();
        main.crearIngrediente();
        main.crearReceta();
        main.crearPlato();
        main.crearPedido();
        
        if(main.validarIngredientesReceta("1")){
            System.out.println("El pedido será despachado. Hay ingredientes en el inventario para hacer la receta.");
        }else{
            System.out.println("El pedido no será despachado. No hay ingredientes en el inventario para hacer la receta.");
        }
    }

}
