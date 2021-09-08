package cl.cellit.matriz.services;

import com.github.cliftonlabs.json_simple.JsonObject;

import org.springframework.stereotype.Service;

@Service
public class MatrizService {
    public JsonObject generaMatriz( int r, int c , int z , int x , int y){
        JsonObject rs = new JsonObject();

        if( r-1 <= y || c-1 <= x ){
            rs.put("ATENCIÓN","Los valores de X e Y no pueden superar:  " + (c-2) + " y " + (r-2) + " respectivamente.");
            return rs;
        }

        JsonObject m = new JsonObject();        
        
        Integer[][] matriz = new Integer[r][c];
        int suma = 0;
        boolean salto = false;

        System.out.println("\n\n  Matriz resultante :  ");
        for( int i=1 ; i<=r ; i++ ){
            JsonObject fila = new JsonObject();
            for( int k=1 ; k<=c ; k++ ){
                int val = calcula(i,z);
                if( salto ){
                    System.out.print("\n  "+val+"  ");
                    salto = false;
                }else{
                    System.out.print("  "+val+"  ");
                }
                fila.put("C"+k, val );
                if( (i-1)<=y && (k-1)<=x ){
                    matriz[i][k]=val;
                    suma += val;
                }
            }
            m.put( "R"+i , fila );
            salto = true;
        }

        System.out.println("\n Suma:"+suma);
        
        rs.put("Suma",suma);
        rs.put("Matriz",m);
        return rs;
    }
    public int calcula( int r, int z ){
        if( r==1 ){
            return z;
        }else{
            return z + r - 1 ;
        }
    }
}
