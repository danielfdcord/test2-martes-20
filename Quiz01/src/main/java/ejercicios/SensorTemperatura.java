
package ejercicios;

/**
 *
 * @author steve-urbit
 */
public class SensorTemperatura {
    /**
     * Un sensor de temperatura realiza una medicion cada 2 minutos.
     * Con el objetivo de determinar cuanto tiempo tarda un sistema de
     * refrigeracion de presicion en alcanzar la temperatura deseada.
     * Esta funcion calcula la cantidad de minutos que le lleva al sistema
     * alcanzar la temperatura deseada con una tolerancia de 0.25˚C.
     * 
     * @param muestrasSensor arreglo de las muestras tomadas por el sensor.
     * @param temperaturaDeseada en ˚C.
     * @return cantidad de minutos 
     */
    public static int tiempoDeEstabilizacion(float[] muestrasSensor, float temperaturaDeseada){
        int index=0;
        int cant_min;
        for (int i =0;i<muestrasSensor.length;i++){
            do {
                index=index+i;
            }
            while ((muestrasSensor[i]>=temperaturaDeseada-0.25)&&(muestrasSensor[i]<=temperaturaDeseada+0.25));       
        }
        cant_min=(index+1)*2;
        
        if (cant_min!=0){
            return cant_min;
        }
        
        return 0;
    }
    
    /**
     * En ciertas ocaciones el sensor produce algunas muestras erroneas.
     * Que resultan estar a mas de 5˚C por encima o por debajo del promedio de 
     * las ultimas 3 muestras anteriores
     * Esta funcion elimina tales muestras erroneas.
     * 
     * @param muestrasSensor en 5˚C.
     * @return arreglo SIN muestras erroneas.
     * 
     */
    
      public static float[] quitarMuestrasErroneas(float[] muestrasSensor){
            float prom=0f;
            int index=0;
            
            for (int i=3;i<muestrasSensor.length;i++){
                
              prom=((muestrasSensor[i-3]+muestrasSensor[i-2]+muestrasSensor[i-1])/3);
                
                if ((muestrasSensor[i]<prom-5)||(muestrasSensor[i]>prom+5)){
                index++;
                muestrasSensor[i]=0;
                }   
            }
            float nuevaMuestra[]=new float [muestrasSensor.length-index];
            
            for (int i=0;i<nuevaMuestra.length;i++){
                if (muestrasSensor[i]!=0){
                    nuevaMuestra[i]=muestrasSensor[i];
                }    
            }
            return nuevaMuestra;
         }
    
   
}
    