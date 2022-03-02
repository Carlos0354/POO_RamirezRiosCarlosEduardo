/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany._sockets;

/**
 *
 * @author crami
 */

import java.net.*;
import java.io.*;
import java.util.*;


public class Servidor {
    
    //socket que se encargue de atender a los clientes
    AtenderClientes cte;
    ArrayList<Socket> listaClientes = new ArrayList();
    
    public Servidor(){
        try{
            //el socket unico del servidor
            ServerSocket ss = new ServerSocket(5000);
            Socket cliente;
            //proceso para tener en fila a los clientes
            while(true){
                cliente = ss.accept();
                System.out.println("Conexion exitosa");
                listaClientes.add(cliente);
                cte = new AtenderClientes(listaClientes, cliente);
            }
        }catch(Exception e){
            System.out.println("Error servidor caido");
            System.out.println(e.getMessage());
        }
        
        
    }
    
    public static void main(String[] args){
            new Servidor();
        }
    
}