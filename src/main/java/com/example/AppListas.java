package com.example;

import java.util.ArrayList;
import java.util.List;

public class AppListas {
    public static void main(String[] args) {
        
        List<Cliente> listaClientes = new ArrayList<>();
        var cliente1 = new Cliente();
        cliente1.setNome("Manoel");
        cliente1.setCidade("PALMAS ");

        var cliente2 = new Cliente();
        cliente2.setNome("Breno ");
        cliente2.setCidade("SAO PAULO");

        listaClientes.add(cliente1);
        listaClientes.add(cliente2);
        listaClientes.add(cliente1);
        listaClientes.add(cliente2);
        listaClientes.add(cliente1);
        listaClientes.add(cliente2);
        listaClientes.add(cliente1);
        listaClientes.add(cliente2);
        listaClientes.add(cliente1);
        listaClientes.add(cliente2);

        for (var cliente : listaClientes) {
            System.out.println(cliente);
        }

        //System.out.println(listaClientes);
        

        
        

    }
    
}
