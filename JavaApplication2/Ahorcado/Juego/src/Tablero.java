/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiantes
 */
public class Tablero {
    char [] casillas= new char [1];
    int calcularError(){
        for(int i=0;i>3;i++){
            if(casillas[i]=='a'){
                return 1;
            }
            
        }
        
        return 0;
    }
    
}
