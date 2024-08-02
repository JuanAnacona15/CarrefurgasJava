package Model;

import java.util.Calendar;
import java.util.Date;
import java.util.Map;

public class Calculates {

    public int Ja_CalcAge_47(Date JA_BrithDate_47){
        /*
        En esta funcion se calcula la edad cdel empleado
        Parametros: Fecha de nacimiento
        Salida: Edad
        Nombre: Juan Manuel Anacona
        contacto: anaconajuanma@itipopayan.edu.co
        */
        Calendar calcBrith = Calendar.getInstance();
        Calendar calcToday = Calendar.getInstance();
        
        calcBrith.setTime(JA_BrithDate_47);
        calcToday.setTime(new Date());
        return calcToday.get(Calendar.YEAR) - calcBrith.get(Calendar.YEAR);
    }


    public double JA_Daytime_47(int JA_WorDep_47, int JA_Sect_47, int JA_Div_47, double JA_HourVal_47){
        /*-----------------------------------------------------------------------------------------------------------------------------
            En esta funcion se calcula el valor de la hora extra diurna
            Parametros: Departamento de trabajo, Seccion, Division, Valor de la hora.
            Salida: Valor de la hora extra.
            Nombre: Juan Manuel Anacona
            contacto: anaconajuanma@itipopayan.edu.co
        --------------------------------------------------------------------------------------------------------------------------------*/
        if(JA_WorDep_47 == 1 || JA_WorDep_47 == 2){
            return JA_HourVal_47 * 1.25;
        }else if(JA_WorDep_47 == 3){
            if(JA_Sect_47 == 4 || JA_Sect_47 == 5 || JA_Sect_47 == 6){
                return JA_HourVal_47 * 1.25;
            }else if(JA_Sect_47 == 7 || JA_Sect_47 == 8 || JA_Sect_47 == 9){
                return JA_HourVal_47 * 1.35;
            }else if(JA_Sect_47 == 10 || JA_Sect_47 == 11 || JA_Sect_47 == 12){
                return JA_HourVal_47 * 1.4;
            }else if(JA_Sect_47 == 13 || JA_Sect_47 == 14 || JA_Sect_47 == 15){
                return JA_HourVal_47 * 1.45;
            }else if(JA_Sect_47 == 16 || JA_Sect_47 == 17 || JA_Sect_47 == 18){
                return JA_HourVal_47 * 1.5;
            }else if(JA_Sect_47 == 19 || JA_Sect_47 == 20 || JA_Sect_47 == 21){
                return JA_HourVal_47 * 1.55;
            }else if((JA_Sect_47 == 22 || JA_Sect_47 == 23 || JA_Sect_47 == 24)){
                return JA_HourVal_47 * 1.6;
            }else if(JA_Sect_47 == 25 || JA_Sect_47 == 26 || JA_Sect_47 == 27){
                return JA_HourVal_47 * 1.65;
            }else if(JA_Sect_47 == 28){
                if(JA_Div_47 == 1){
                    return JA_HourVal_47 * 1.7;
                }else if(JA_Div_47 == 2){
                    return JA_HourVal_47 * 1.715;
                }else if(JA_Div_47 == 3){
                    return JA_HourVal_47 * 1.3;
                }else if(JA_Div_47 == 4){
                    return JA_HourVal_47 * 1.45;
                }else{
                    return JA_HourVal_47;
                }
            }else if(JA_Sect_47 == 29 || JA_Sect_47 == 30){
                return JA_HourVal_47 * 1.75;
            }
        }else if(JA_WorDep_47 == 4 || JA_WorDep_47 == 5){
            return JA_HourVal_47 * 1.8;
        }else if(JA_WorDep_47 == 6 || JA_WorDep_47 == 7){
            return JA_HourVal_47 * 1.85;
        }else if(JA_WorDep_47 == 8){
            return JA_HourVal_47 * 1.9;
        }else{
            return JA_HourVal_47;
        }
        return JA_HourVal_47;
    }
    public double JA_Night_47(int JA_WorDep_47, int JA_Sect_47, int JA_Div_47, double JA_HourVal_47){
        /*
        En esta funcion se calcula el valor de la hora extra nocturna
        Parametros: Departamento de trabajo, Seccion, Division, Valor de la hora.
        Salida: Valor de la hora extra.
        Nombre: Juan Manuel Anacona
        contacto: anaconajuanma@itipopayan.edu.co
        */
        if(JA_WorDep_47 == 1 || JA_WorDep_47 == 2){
            return JA_HourVal_47 * 1.30;
        }else if(JA_WorDep_47 == 3){
            if(JA_Sect_47 == 4 || JA_Sect_47 == 5 || JA_Sect_47 == 6){
                return JA_HourVal_47 * 1.30;
            }else if(JA_Sect_47 == 7 || JA_Sect_47 == 8 || JA_Sect_47 == 9){
                return JA_HourVal_47 * 1.40;
            }else if(JA_Sect_47 == 10 || JA_Sect_47 == 11 || JA_Sect_47 == 12){
                return JA_HourVal_47 * 1.45;
            }else if(JA_Sect_47 == 13 || JA_Sect_47 == 14 || JA_Sect_47 == 15){
                return JA_HourVal_47 * 1.50;
            }else if(JA_Sect_47 == 16 || JA_Sect_47 == 17 || JA_Sect_47 == 18){
                return JA_HourVal_47 * 1.55;
            }else if(JA_Sect_47 == 19 || JA_Sect_47 == 20 || JA_Sect_47 == 21){
                return JA_HourVal_47 * 1.60;
            }else if((JA_Sect_47 == 22 || JA_Sect_47 == 23 || JA_Sect_47 == 24)){
                return JA_HourVal_47 * 1.65;
            }else if(JA_Sect_47 == 25 || JA_Sect_47 == 26 || JA_Sect_47 == 27){
                return JA_HourVal_47 * 1.7;
            }else if(JA_Sect_47 == 28){
                if(JA_Div_47 == 1){
                    return JA_HourVal_47 * 1.75;
                }else if(JA_Div_47 == 2){
                    return JA_HourVal_47 * 1.725;
                }else if(JA_Div_47 == 3){
                    return JA_HourVal_47 * 1.35;
                }else if(JA_Div_47 == 4){
                    return JA_HourVal_47 * 1.40;
                }else{
                    return JA_HourVal_47;
                }
            }else if(JA_Sect_47 == 29 || JA_Sect_47 == 30){
                return JA_HourVal_47 * 1.80;
            }
        }else if(JA_WorDep_47 == 4 || JA_WorDep_47 == 5){
            return JA_HourVal_47 * 1.85;
        }else if(JA_WorDep_47 == 6 || JA_WorDep_47 == 7){
            return JA_HourVal_47 * 1.90;
        }else if(JA_WorDep_47 == 8){
            return JA_HourVal_47 * 1.95;
        }else{
            return JA_HourVal_47;
        }
        return JA_HourVal_47;
    }
    public double JA_Sunday_57(int JA_WorDep_47, int JA_Sect_47, int JA_Div_47, double JA_HourVal_47){
        /*
        En esta funcion se calcula el valor de la hora extra dominical
        Parametros: Departamento de trabajo, Seccion, Division, Valor de la hora.
        Salida: Valor de la hora extra.
        Nombre: Juan Manuel Anacona
        contacto: anaconajuanma@itipopayan.edu.co
        */
        if(JA_WorDep_47 == 1 || JA_WorDep_47 == 2){
            return JA_HourVal_47 * 1.35;
        }else if(JA_WorDep_47 == 3){
            if(JA_Sect_47 == 4 || JA_Sect_47 == 5 || JA_Sect_47 == 6){
                return JA_HourVal_47 * 1.35;
            }else if(JA_Sect_47 == 7 || JA_Sect_47 == 8 || JA_Sect_47 == 9){
                return JA_HourVal_47 * 1.45;
            }else if(JA_Sect_47 == 10 || JA_Sect_47 == 11 || JA_Sect_47 == 12){
                return JA_HourVal_47 * 1.50;
            }else if(JA_Sect_47 == 13 || JA_Sect_47 == 14 || JA_Sect_47 == 15){
                return JA_HourVal_47 * 1.55;
            }else if(JA_Sect_47 == 16 || JA_Sect_47 == 17 || JA_Sect_47 == 18){
                return JA_HourVal_47 * 1.60;
            }else if(JA_Sect_47 == 19 || JA_Sect_47 == 20 || JA_Sect_47 == 21){
                return JA_HourVal_47 * 1.65;
            }else if((JA_Sect_47 == 22 || JA_Sect_47 == 23 || JA_Sect_47 == 24)){
                return JA_HourVal_47 * 1.7;
            }else if(JA_Sect_47 == 25 || JA_Sect_47 == 26 || JA_Sect_47 == 27){
                return JA_HourVal_47 * 1.75;
            }else if(JA_Sect_47 == 28){
                if(JA_Div_47 == 1){
                    return JA_HourVal_47 * 1.8;
                }else if(JA_Div_47 == 2){
                    return JA_HourVal_47 * 1.615;
                }else if(JA_Div_47 == 3){
                    return JA_HourVal_47 * 1.3;
                }else if(JA_Div_47 == 4){
                    return JA_HourVal_47 * 1.75;
                }else{
                    return JA_HourVal_47;
                }
            }else if(JA_Sect_47 == 29 || JA_Sect_47 == 30){
                return JA_HourVal_47 * 1.80;
            }
        }else if(JA_WorDep_47 == 4 || JA_WorDep_47 == 5){
            return JA_HourVal_47 * 1.85;
        }else if(JA_WorDep_47 == 6 || JA_WorDep_47 == 7){
            return JA_HourVal_47 * 1.90;
        }else if(JA_WorDep_47 == 8){
            return JA_HourVal_47 * 1.95;
        }else{
            return JA_HourVal_47;
        }
        return JA_HourVal_47;
    }
    
    public double JA_JacarandePremium_47(double JA_ExtrD_47, int JA_BritDep_47, String JA_BrithMun_47, double JA_SBMA_47){
        /*
        En esta funcion se calcula el valor de la prima jacaranda
        Parametros: Extras diurnas, departamento de nacimiento, municipio de nacimiento, SBMA     
        Salida: Prima jacaranda
        Nombre: Juan Manuel Anacona
        contacto: anaconajuanma@itipopayan.edu.co
        */
        if(((JA_ExtrD_47%2) != 0) && (JA_ExtrD_47%7) == 0){
            if((JA_BritDep_47==10)){
                if(JA_BrithMun_47.equals("Caloto")){
                    return JA_SBMA_47*0.0002;
                }else if (JA_BrithMun_47.equals("Guapi")){
                    return JA_SBMA_47 * 0.0025;
                }else if(JA_BrithMun_47.equals("Str Quilichao")){
                    return JA_SBMA_47 * 0.0003;
                }else if(JA_BrithMun_47.equals("Pto Tejada")){
                    return JA_SBMA_47 * 0.0004;
                }else{
                    return JA_SBMA_47 * 0.000001;
                }
            }else if(JA_BritDep_47 == 30){
                if(JA_BrithMun_47.equals("Buga")){
                    return JA_SBMA_47 * 0.0005;
                }else if (JA_BrithMun_47.equals("Caicedonia")){
                    return JA_SBMA_47 * 0.006;
                }else if(JA_BrithMun_47.equals("Buenaventura")){
                    return JA_SBMA_47 * 0.007;
                }else if(JA_BrithMun_47.equals("Palmira")){
                    return JA_SBMA_47 * 0.008;
                }else{
                    return JA_SBMA_47 * 0.000001;
                }
            }
        }
        return 0;
    }
    
    public double JA_MarcelinaPremium_47(double JA_HourVal_47, String JA_ExId_47, int JA_BloodTy_47, int JA_ZodSig_47, double JA_JacPrem_47){
        /*
        En esta funcion se calcula el valor de la prima marcelina
        Parametros: valor de la hora, departamento de expedicion de la cedula, tipo de sangre
        signo sodiacal, prima jacaranda
        Salida: Prima marcelina
        Nombre: Juan Manuel Anacona
        contacto: anaconajuanma@itipopayan.edu.co
        */
        if((/*JA_isPrime_47(JA_HourVal_47)*/true) && JA_HourVal_47%7 == 0){
            if(JA_ExId_47.equals("Gachala") && (JA_BloodTy_47 == 5 || JA_BloodTy_47 == 2) && (JA_ZodSig_47 == 1 || JA_ZodSig_47 == 10)){
                return JA_JacPrem_47 * 0.5;
            }else if(JA_ExId_47.equals("Obando") && (JA_BloodTy_47 == 3 || JA_BloodTy_47 == 4 || JA_BloodTy_47 == 8) && (JA_ZodSig_47 == 3 || JA_ZodSig_47 == 5)){
                return JA_JacPrem_47 * 0.6;
            }else if(JA_ExId_47.equals("Gualmatan") && (JA_BloodTy_47 == 1 || JA_BloodTy_47 == 2 || JA_BloodTy_47 == 3) && (JA_ZodSig_47 == 4 || JA_ZodSig_47 == 8)){
                return JA_JacPrem_47 * 0.7;
            }else{
                return 0;
            }
        }else{
            return 0;
        }    
    }
    
    public double JA_FiricundinaPremium_47(int JA_EmplTy_47, double JA_MarcPrem_47){
        /*
        En esta funcion se calcula el valor de la prima firicundina
        Parametros: Tipo de empleado, prima marcelina.    
        Salida: Prima firicundina. 
        Nombre: Juan Manuel Anacona
        contacto: anaconajuanma@itipopayan.edu.co
        */
        if(JA_EmplTy_47 == 2){
            return JA_MarcPrem_47 * 0.015;
        }else{
            return 0;
        }
    }
    
    public double JA_PetuniaPremium_47(double JA_WeekVal_47, double JA_FiriPrem_47){
        /*
        En esta funcion se calcula el valor de la prima petunia
        Parametros: Valor de la semana, prima firicundina.    
        Salida: Prima petunia. 
        Nombre: Juan Manuel Anacona
        contacto: anaconajuanma@itipopayan.edu.co
        */
        if(JA_WeekVal_47 <= 3628800){
            return JA_FiriPrem_47 * 0.2;
        }else{
            return 0;
        }
    }
    
    public double JA_HermenegildaPremium_47(double JA_EmplAge_47, int JA_WorDep_47, int JA_Sect_47, int JA_Div_47, String JA_BrithMun_47, int JA_BloodTy_47, double JA_SBMA_47, String JA_District_47, Double JA_JacPrem_47, Double JA_PetPrem_47){
        /*
        En esta funcion se calcula el valor de la prima hermenegilda
        Parametros: Edad, Departamento de trabajo, Seccion, Division,
        Municipio de nacimiento, tipo de sangre, SBMA, Barrio, prima jacaranda, prima petunia.
        Salida: Prima hermenegilda
        Nombre: Juan Manuel Anacona
        contacto: anaconajuanma@itipopayan.edu.co
        */
        if((JA_EmplAge_47 >= 25 && JA_EmplAge_47 < 30) && JA_WorDep_47 == 3 && ((JA_Sect_47 == 28 && JA_Div_47 == 2) || (JA_Sect_47 == 16 || JA_Sect_47 == 17)) && JA_BrithMun_47.equals("Guachucal")){
            return JA_SBMA_47 * 0.00003;
        }else if((JA_EmplAge_47 >= 30 && JA_EmplAge_47 < 45) && JA_WorDep_47 == 8 && 
                (JA_BrithMun_47.equals("Fra Pizarro") || JA_BrithMun_47.equals("Samaniego") || JA_BrithMun_47.equals("Laguazaque") || JA_BrithMun_47.equals("Sn Js Pare")) && 
                JA_BloodTy_47 == 3 && JA_District_47.equals("Las Americas")){
            return JA_JacPrem_47 * 0.000015;
        }else if((JA_EmplAge_47 >= 45 && JA_EmplAge_47 < 50) && JA_WorDep_47 == 6 && 
                (JA_BrithMun_47.equals("Sativasur") || JA_BrithMun_47.equals("Ventaquemada") || JA_BrithMun_47.equals("Guacari") || JA_BrithMun_47.equals("Sn Sebastian") || JA_BrithMun_47.equals("Lenguazaque")) &&
                JA_BloodTy_47 == 1 && JA_District_47.equals("El Valencia")){
            return JA_PetPrem_47 * 0.0005;
        }else{
            return 0;
        }
    }
    
    public double JA_AgePremium_47(int JA_EmplAge_47, double JA_Fortnight_47){
        /*
        En esta funcion se calcula el valor de la prima por edad
        Parametros: Edad, Quincena.
        Salida: Prima por edad
        Nombre: Juan Manuel Anacona
        contacto: anaconajuanma@itipopayan.edu.co
        */
        if(JA_EmplAge_47 >= 18 && JA_EmplAge_47 < 30){
            return JA_Fortnight_47 * 0.01;
        }else if(JA_EmplAge_47 >= 30 && JA_EmplAge_47 < 40){
            return JA_Fortnight_47 * 0.015;
        }else if(JA_EmplAge_47 >= 40 && JA_EmplAge_47 < 50){
            return JA_Fortnight_47 * 0.02;
        }else if(JA_EmplAge_47 >= 50 && JA_EmplAge_47 < 60){
            return JA_Fortnight_47 * 0.02;
        }else if(JA_EmplAge_47 >= 60 && JA_EmplAge_47 < 70){
            return JA_Fortnight_47 * 0.025;
        }else{
            return 0;
        }
    }

    public double JA_FeednigPremium_47(double JA_Fornight_47, double JA_SLMV_47){
        /*
        En esta funcion se calcula el valor de la prima de alimentacion
        Parametros: Quincena, SMLV
        Salida: Prima de alimentacion
        Nombre: Juan Manuel Anacona
        contacto: anaconajuanma@itipopayan.edu.co
        */
        if((JA_Fornight_47 >= JA_SLMV_47) && (JA_Fornight_47 < JA_SLMV_47*2)){
            return JA_SLMV_47 * 0.0333;
        }else if((JA_Fornight_47>=JA_SLMV_47*2) && (JA_Fornight_47 < JA_SLMV_47*4)){
            return JA_SLMV_47 * 0.0444; 
        }else if((JA_Fornight_47>=JA_SLMV_47*4) && (JA_Fornight_47 < JA_SLMV_47*6)){
            return JA_SLMV_47 * 0.0555;
        }else if((JA_Fornight_47>=JA_SLMV_47*6) && (JA_Fornight_47 < JA_SLMV_47*8)){
            return JA_SLMV_47 * 0.0666;
        }else{
            return 0;
        }
    }
    
    public double JA_ProductionPremium_47(int JA_WorDep_47, int JA_Sect_47, double JA_Fornight_47){
        /*
        En esta funcion se calcula el valor de la prima de produccion
        Parametros: Departamento de trabajo, Seccion, Quincena. 
        Salida: Prima de alimentacion
        Nombre: Juan Manuel Anacona
        contacto: anaconajuanma@itipopayan.edu.co
        */
        if(JA_WorDep_47 == 3 && JA_Sect_47 == 22){
            return JA_Fornight_47 * 0.0056;
        }else{
            return 0;
        }
    }
    
    public double JA_ConsanguinityPremium_47(double JA_SBMA_47, int JA_BloodTy_47, int JA_BritDep_47, int JA_EmplAge_47, int JA_ExtrDomi_47){
        /*
        En esta funcion se calcula el valor de la prima por consanguinidad
        Parametros: SBMA, Tipo de sangre, departamento de nacimiento, edad, extras dominicales.
        Salida: Prima de consanguinidad
        Nombre: Juan Manuel Anacona
        contacto: anaconajuanma@itipopayan.edu.co
        */
        if(JA_BloodTy_47 == 3 && (JA_BritDep_47==30 || JA_BritDep_47==14) && (JA_EmplAge_47%2 == 0) && (JA_factorial_47(JA_ExtrDomi_47) <= 120)){
            return JA_SBMA_47 * 0.00025;
        }else{
            return 0;
        }
    }
    
    public static boolean JA_isPrime_47(int JA_num_47) {
        /*
        En esta funcion evalua si un numero es primo
        Parametros: Numero
        Salida: Si es primo o no
        Nombre: Juan Manuel Anacona
        contacto: anaconajuanma@itipopayan.edu.co
        */
        if (JA_num_47 <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(JA_num_47); i++) {
            if (JA_num_47 % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    public static int JA_factorial_47(int JA_num_47) {
        /*
        En esta funcion se calcula el factorial de un numero
        Parametros: Numero
        Salida: Factorial
        Nombre: Juan Manuel Anacona
        contacto: anaconajuanma@itipopayan.edu.co
        */
        if (JA_num_47 < 0) {
            return 0;
        }
        int JA_res_47 = 1;
        for (int i = 2; i <= JA_num_47; i++) {
            JA_res_47 *= i;
        }
        return JA_res_47;
    }
    
    
    public double JA_Pension_47(double SBMA, double SMLV){
        /*
        En esta funcion se calcula la pension del trabajador
        Parametros: SBMA, SMLV
        Salida: Pension
        Nombre: Juan Manuel Anacona
        contacto: anaconajuanma@itipopayan.edu.co
        */
        if((SBMA >= SMLV) && (SBMA < SMLV*2)){
            return SBMA * 0.0258;
        }else if((SBMA >= SMLV*2) && (SBMA < SMLV*4)){
            return SBMA * 0.0358;
        }else if((SBMA >= SMLV*4) && (SBMA < SMLV*6)){
            return SBMA * 0.0458;
        }else if((SBMA >= SMLV*6) && (SBMA < SMLV*8)){
            return SBMA * 0.0558;
        }else if((SBMA >= SMLV*8) && (SBMA < SMLV*10)){
            return SBMA * 0.0658;
        }else if(SBMA >= 10*SMLV){
            return SBMA * 0.0258;
        }else{
            return 0;
        }
    }

    public double JA_Health_47(double SBMA, double SMLV){
        /*
        En esta funcion se calcula el subsidio de salud
        Parametros: SBMA, SMLV
        Salida: Subsidio de salud
        Nombre: Juan Manuel Anacona
        contacto: anaconajuanma@itipopayan.edu.co
        */
        if((SBMA >= SMLV) && (SBMA < SMLV*2)){
            return SBMA * 0.0155;
        }else if((SBMA >= SMLV*2) && (SBMA < SMLV*4)){
            return SBMA * 0.0286;
        }else if((SBMA >= SMLV*4) && (SBMA < SMLV*6)){
            return SBMA * 0.0315;
        }else if((SBMA >= SMLV*6) && (SBMA < SMLV*8)){
            return SBMA * 0.0438;
        }else if((SBMA >= SMLV*8) && (SBMA < SMLV*10)){
            return SBMA * 0.05125;
        }else if(SBMA >= 10*SMLV){
            return SBMA * 0.0768;
        }else{
            return 0;
        }
    }

    public double JA_Transport_47(double SMLV, double SBMA){
        /*
        En esta funcion se calcula el subsidio de transporte
        Parametros: SBMA, SMLV
        Salida: Subsidio de transporte
        Nombre: Juan Manuel Anacona
        contacto: anaconajuanma@itipopayan.edu.co
        */
        if(SBMA <= (SMLV*2)){
            return SMLV*0.12;
        }else{
            return 0;
        }
    }
    
    public double JA_Daytime_47(int JA_ExtrD_47, double JA_ExtrDVal_47){
        /*
        En esta funcion se calcula el valor de las extras diurnas trabajadas
        Parametros: Extras diurnas, valor de las extras diurnas.
        Salida: Valor de las extras diurnas
        Nombre: Juan Manuel Anacona
        contacto: anaconajuanma@itipopayan.edu.co
        */
        return JA_ExtrD_47 * JA_ExtrDVal_47;
    }

    public double JA_Nocturnal_47(int JA_ExtrN_47, double JA_ExtraNVal_47){
        /*
        En esta funcion se calcula el valor de las extras nocturnas trabajadas
        Parametros: Extras diurnas, valor de las nocturnas diurnas.
        Salida: Valor de las extras nocturnas
        Nombre: Juan Manuel Anacona
        contacto: anaconajuanma@itipopayan.edu.co
        */
        return JA_ExtrN_47 * JA_ExtraNVal_47;
    }

    public double JA_Sundays_47(int JA_ExtrS_47, double JA_ExtraSVal_47){
        /*
        En esta funcion se calcula el valor de las extras dominicales trabajadas
        Parametros: Extras dominicales, valor de las dominicales diurnas.
        Salida: Valor de las extras diurnas
        Nombre: Juan Manuel Anacona
        contacto: anaconajuanma@itipopayan.edu.co
        */
        return JA_ExtrS_47 * JA_ExtraSVal_47;
    }

    public double JA_Day_47(double SBMA){
        /*
        En esta funcion se calcula el valor del dia
        Parametros: SBMA
        Salida: Valor del dia
        Nombre: Juan Manuel Anacona
        contacto: anaconajuanma@itipopayan.edu.co
        */
        return SBMA/30;
    }
    
    public double JA_Fortnight_47(double SBMA){
        /*
        En esta funcion se calcula el valor de la quincena
        Parametros: SBMA
        Salida: Valor de la quincena
        Nombre: Juan Manuel Anacona
        contacto: anaconajuanma@itipopayan.edu.co
        */
        return SBMA/2;
    }
    
    public double JA_Week_47(double SBMA){
        /*
        En esta funcion se calcula el valor de la semana
        Parametros: SBMA
        Salida: Valor del la semana
        Nombre: Juan Manuel Anacona
        contacto: anaconajuanma@itipopayan.edu.co
        */
        return SBMA/4;
    }
    
    public double JA_Bimester_47(double SBMA){
        /*
        En esta funcion se calcula el valor del semestre
        Parametros: SBMA
        Salida: Valor del semestre
        Nombre: Juan Manuel Anacona
        contacto: anaconajuanma@itipopayan.edu.co
        */
        return SBMA * 2;
    }
    
    public double JA_Trimester_47(double SBMA){
        /*
        En esta funcion se calcula el valor del trimestre
        Parametros: SBMA
        Salida: Valor del trimestre
        Nombre: Juan Manuel Anacona
        contacto: anaconajuanma@itipopayan.edu.co
        */
        return SBMA * 3;
    }
    
    public double JA_Semester_47(double SBMA){
        /*
        En esta funcion se calcula el valor del semestre
        Parametros: SBMA
        Salida: Valor del semestre
        Nombre: Juan Manuel Anacona
        contacto: anaconajuanma@itipopayan.edu.co
        */
        return JA_Trimester_47(SBMA) * 2;
    }
    
    public double JA_Annual_47(double SBMA){
        /*
        En esta funcion se calcula el valor del año
        Parametros: SBMA
        Salida: Valor del año
        Nombre: Juan Manuel Anacona
        contacto: anaconajuanma@itipopayan.edu.co
        */
        return JA_Semester_47(SBMA) * 2;
    }
    
    public double JA_Quinquennium_47(double SBMA){
        /*
        En esta funcion se calcula el valor del quintenio
        Parametros: SBMA
        Salida: Valor del quintenio
        Nombre: Juan Manuel Anacona
        contacto: anaconajuanma@itipopayan.edu.co
        */
        return JA_Annual_47(SBMA) * 5;
    }
    
    public double JA_Hour_47(double SBMA){
        /*
        En esta funcion se calcula el valor de la hora
        Parametros: SBMA
        Salida: Valor del dia
        Nombre: Juan Manuel Anacona
        contacto: anaconajuanma@itipopayan.edu.co
        */
        return JA_Day_47(SBMA) / 8;
    }
    
    public double JA_Minute_47(double SBMA){
        /*
        En esta funcion se calcula el valor del minuto
        Parametros: SBMA
        Salida: Valor del minuto
        Nombre: Juan Manuel Anacona
        contacto: anaconajuanma@itipopayan.edu.co
        */
        return JA_Hour_47(SBMA) / 60;
    }
    
    public double JA_Second_47(double SBMA){
        /*
        En esta funcion se calcula el valor del segundo
        Parametros: SBMA
        Salida: Valor del segundo
        Nombre: Juan Manuel Anacona
        contacto: anaconajuanma@itipopayan.edu.co
        */
        return JA_Minute_47(SBMA) / 60;
    }
    
    public double JA_TenthSecond_47(double SBMA){
        /*
        En esta funcion se calcula el valor de la decima de segundo
        Parametros: SBMA
        Salida: Valor de la decima de segundo
        Nombre: Juan Manuel Anacona
        contacto: anaconajuanma@itipopayan.edu.co
        */
        return JA_Second_47(SBMA) / 10;
    }
    
    public double JA_HundredthSecond_47(double SBMA){
        /*
        En esta funcion se calcula el valor de la centesima de segundo
        Parametros: SBMA
        Salida: Valor de la centesima de segundo
        Nombre: Juan Manuel Anacona
        contacto: anaconajuanma@itipopayan.edu.co
        */
        return JA_Second_47(SBMA) / 100;
    }
    
    public double JA_Nanosecond_47(double SBMA){
        /*
        En esta funcion se calcula el valor del nanosegundo
        Parametros: SBMA
        Salida: Valor del nanosegundo
        Nombre: Juan Manuel Anacona
        contacto: anaconajuanma@itipopayan.edu.co
        */
        return JA_Second_47(SBMA) / 1000000000;
    }
    
    public double JA_Picosecond_47(double SBMA){
        /*
        En esta funcion se calcula el valor del picosegundo
        Parametros: SBMA
        Salida: Valor del picosegundo
        Nombre: Juan Manuel Anacona
        contacto: anaconajuanma@itipopayan.edu.co
        */
        return JA_Second_47(SBMA) / Math.pow(10, 12);
    }
    public double JA_devengadSalary_47(int JA_DayW_47, double JA_Day_47){
        /*
        En esta funcion se calcula el valor el tiempo trabajado
        Parametros: Dias trabajados, Valor del dia
        Salida: Salario devegado
        Nombre: Juan Manuel Anacona
        contacto: anaconajuanma@itipopayan.edu.co
        */
        return JA_DayW_47 * JA_Day_47;
    }
    
    public double JA_Worked_47(double JA_EarnedSalary_47, double JA_DaytimeExtras_47, double JA_NocturnalExtras_47,
                                     double JA_SundayExtras_47, double JA_SecondsExtras_47, double JA_TenthsExtras_47,
                                     double JA_HundredthsExtras_47, double JA_NanosecondsExtras_47, double JA_PicosecondsExtras_47){
        /*
        En esta funcion se calcula el total trabajado
        Parametros: Valor de tiempo extra
        Salida: Pago de total trabajaso
        Nombre: Juan Manuel Anacona
        contacto: anaconajuanma@itipopayan.edu.co
        */
        
        
        return JA_EarnedSalary_47 + JA_DaytimeExtras_47 + JA_NocturnalExtras_47 + JA_SundayExtras_47
                + JA_SecondsExtras_47 + JA_TenthsExtras_47 + JA_HundredthsExtras_47
                + JA_NanosecondsExtras_47 + JA_PicosecondsExtras_47;
    }
    
    
    public double TotalPrem(Map<String, Double> Premiums){
        /*
        En esta funcion se hace la sumatoria de todas las primas.    
        Parametros: Mapa donde se almacena el valor de las primas
        Salida: Total de primas
        Nombre: Juan Manuel Anacona
        contacto: anaconajuanma@itipopayan.edu.co
        */
        double Sum = 0.0;
        for (Map.Entry<String, Double> entry : Premiums.entrySet()) {
            // Sumar el valor actual al total
            Sum += entry.getValue();
        }

        return Sum;
    }

    public double JA_TotDevegad_47(double JA_TotalPremiums_47, double JA_TotalWorked_47, double JA_Transport_47){
        /*
        En esta funcion se calcula el total devegado
        Parametros: Total de primas, Total trabajado, Subsidio de transporte
        Salida: Total devegado
        Nombre: Juan Manuel Anacona
        contacto: anaconajuanma@itipopayan.edu.co
        */
        return JA_TotalPremiums_47 + JA_TotalWorked_47 + JA_Transport_47;
    }

    public double JA_Deducid_47(double JA_Discount_47, double JA_Health_47, double JA_Pension_47){
        /*
        En esta funcion se calcula el total deducido
        Parametros: Descuentos, Salud, Pension.
        Salida: Total deducido
        Nombre: Juan Manuel Anacona
        contacto: anaconajuanma@itipopayan.edu.co
        */
        return JA_Discount_47 + JA_Health_47 + JA_Pension_47;
    }

    public double JA_totalsWorked_47(double... values){
        /*
        En esta funcion se calcula el valor de el total trabajado
        Parametros: Valor de el tiempo trabajado
        Salida: Total trabajado
        Nombre: Juan Manuel Anacona
        contacto: anaconajuanma@itipopayan.edu.co
        */
        double sum = 0.0;
        for(double value : values){
            sum += value;
        }
        return sum;
    }

    public double JA_Accrual_47(double JA_TotalPremiums_47, double JA_TotalWorked_47, double JA_Transport_47){
        /*
        En esta funcion se calcula el total devegado
        Parametros: Total de primas, Total trabajado, Subsidio de transporte
        Salida: Total devegado
        Nombre: Juan Manuel Anacona
        contacto: anaconajuanma@itipopayan.edu.co
        */
        return JA_TotalPremiums_47 + JA_TotalWorked_47 + JA_Transport_47;
    }

    public double JA_Net_47(double JA_Deducid_47, double JA_Accrual_47){
        /*
        En esta funcion se calcula el total neto
        Parametros: Deducido, Devegado
        Salida: Neto a pagar
        Nombre: Juan Manuel Anacona
        contacto: anaconajuanma@itipopayan.edu.co
        */
        return JA_Accrual_47 - JA_Deducid_47;
    }
}
