/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JulDaz
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
/**
 * @see http://www.jc-mouse.net/
 * @author mouse
 */
public class Serverpc {

    /**
     * Puerto 
     */
    private final static int PORT = 5000;
public void comparador(String palabra){
    while(palabra.contains(" "))
}
	
		
    public static void main(String[] args) {
        String c;
        String d;
	       for (int i = 0; i < args.length; i++) {
            String a="-a";
            String b="-b";
             if(args[i].equals(a)){
                 c=args[i+1];
             } 
               if(args[i].equals(b)){
                 d=args[i+1];
             } 
            
        }
		
		
	
        
		
		
        try {
            //Socket de servidor para esperar peticiones de la red
            ServerSocket serverSocket = new ServerSocket(PORT);
            System.out.println("Servidor> Servidor iniciado");    
            System.out.println("Servidor> En espera de cliente...");    
            //Socket de cliente
            Socket clientSocket;
            while(true){
                //en espera de conexion, si existe la acepta
                clientSocket = serverSocket.accept();
                //Para leer lo que envie el cliente
                BufferedReader input = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                //para imprimir datos de salida                
                PrintStream output = new PrintStream(clientSocket.getOutputStream());
                //se lee peticion del cliente
                String request ;
                String e;
                String f;
			do {
                request = input.readLine();
                System.out.println("" + request +  "");
               
                            for (int i = 0; i <request.length(); i++) {
                               if(request.contains(" ")){
                                   e=request.substring(6, i);
                               }
                            }
				}while(request.contains("GET"));
                //se procesa la peticion y se espera resultado
                // String strOutput = process(request);                
                //Se imprime en consola "servidor"
                // System.out.println("Servidor> Resultado de petición");                    
                // System.out.println("Servidor> \"" + strOutput + "\"");
                //se imprime en cliente
                // output.flush();//vacia contenido
                //output.println(strOutput);                
                //cierra conexion
                clientSocket.close();
            }    
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        }
    }
    
    /**
     * procesa peticion del cliente y retorna resultado
     * @param request peticion del cliente
     * @return String
     */
    public static String process(String request){
		
        return request;
    }
    
}
