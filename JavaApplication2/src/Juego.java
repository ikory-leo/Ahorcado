

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiantes
 */
public class Juego {
    char [] casillas= {'s','o','p','a'};
    int vidas=4;
    
    int calcularError(char letra){
        for(int i=0;i<4;i++){
            if(casillas[i]==letra){
                return 1;
            }
            
        }
        
        return 0;
    }
    
}