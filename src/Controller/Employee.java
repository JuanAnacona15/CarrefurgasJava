package Controller;

import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Employee {
    private int ID;
    private String Name;
    private int JA_WorkDep_47, JA_Sec_47, JA_Div_47, JA_BrithDep_47, JA_ZodiSign_47, JA_BloodTy_47, JA_ExtrD_47, JA_ExtrN_47, JA_ExtrS;
    private int JA_DayW_47, JA_Age_47, JA_EmplTy_47;
    private Date DateTimeJA_BrithDate_47;
    private String JA_District, JA_Mun_47, JA_ExpID_47;
    private double JA_SBMA_47;
    private double JA_ExtrDVal_47, JA_ExtrNVal_47, JA_ExtrSVal_47;
    private double JA_Pension_47, JA_Health_47, JA_Transport_47;
    private double JA_Day_47, JA_Fortnight_47, JA_Week_47, JA_Bimester_47, JA_Trimester_47, JA_Semester_47, JA_Annual_47;
    private double JA_Quinquennium_47, JA_Hour_47, JA_Minute_47, JA_Second_47, JA_TenthSecond_47, JA_HundredthSecond_47;
    private double JA_Nanosecond_47, JA_Picosecond_47;
    private double JA_Daytime_47, JA_Nocturnal_47, JA_Sunday_47;
    private double JA_TotDevegad_47, JA_TotalWorked_47, JA_devengadSalary_47, JA_Deducid_47, JA_Accrual_47, JA_Net_47, JA_TPremiums_47;
    private static Map<String, Double> JA_Premiums_47 = Collections.synchronizedMap(new HashMap<>());

    static {
        // Inicializando el mapa con valores por defecto
        initializeMap();
    }

    private static void initializeMap() {
        JA_Premiums_47.put("Jacaranda", 0.0);
        JA_Premiums_47.put("Marcelina", 0.0);
        JA_Premiums_47.put("Firicundina", 0.0);
        JA_Premiums_47.put("Petunia", 0.0);
        JA_Premiums_47.put("Hermenegilda", 0.0);
        JA_Premiums_47.put("Age", 0.0);
        JA_Premiums_47.put("Feending", 0.0);
        JA_Premiums_47.put("Production", 0.0);
        JA_Premiums_47.put("Consanguinity", 0.0);
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public static Map<String, Double> getJA_Premiums_47() {
        return JA_Premiums_47;
    }

    public static void setJA_Premiums_47(Map<String, Double> JA_Premiums_47) {
        Employee.JA_Premiums_47 = JA_Premiums_47;
    }

    
    
    public static double getJA_Premiums_47(String key) {
        return JA_Premiums_47.getOrDefault(key, 0.0);
    }

    public static Map<String, Double> getAllPremiums(){
        return JA_Premiums_47;
    }

    public static void setJA_Premiums_47(String key, double value) {
        synchronized (JA_Premiums_47) {
            JA_Premiums_47.put(key, value);
        }
    }


    public double getJA_Day_47() {
        return JA_Day_47;
    }

    public void setJA_Day_47(double JA_Day_47) {
        this.JA_Day_47 = JA_Day_47;
    }

    public double getJA_Fortnight_47() {
        return JA_Fortnight_47;
    }

    public void setJA_Fortnight_47(double JA_Fortnight_47) {
        this.JA_Fortnight_47 = JA_Fortnight_47;
    }

    public double getJA_Week_47() {
        return JA_Week_47;
    }

    public void setJA_Week_47(double JA_Week_47) {
        this.JA_Week_47 = JA_Week_47;
    }

    public double getJA_Bimester_47() {
        return JA_Bimester_47;
    }

    public void setJA_Bimester_47(double JA_Bimester_47) {
        this.JA_Bimester_47 = JA_Bimester_47;
    }

    public double getJA_Trimester_47() {
        return JA_Trimester_47;
    }

    public void setJA_Trimester_47(double JA_Trimester_47) {
        this.JA_Trimester_47 = JA_Trimester_47;
    }

    public double getJA_Semester_47() {
        return JA_Semester_47;
    }

    public void setJA_Semester_47(double JA_Semester_47) {
        this.JA_Semester_47 = JA_Semester_47;
    }

    public double getJA_Annual_47() {
        return JA_Annual_47;
    }

    public void setJA_Annual_47(double JA_Annual_47) {
        this.JA_Annual_47 = JA_Annual_47;
    }

    public double getJA_Quinquennium_47() {
        return JA_Quinquennium_47;
    }

    public void setJA_Quinquennium_47(double JA_Quinquennium_47) {
        this.JA_Quinquennium_47 = JA_Quinquennium_47;
    }

    public double getJA_Hour_47() {
        return JA_Hour_47;
    }

    public void setJA_Hour_47(double JA_Hour_47) {
        this.JA_Hour_47 = JA_Hour_47;
    }

    public double getJA_Minute_47() {
        return JA_Minute_47;
    }

    public void setJA_Minute_47(double JA_Minute_47) {
        this.JA_Minute_47 = JA_Minute_47;
    }

    public double getJA_Second_47() {
        return JA_Second_47;
    }

    public void setJA_Second_47(double JA_Second_47) {
        this.JA_Second_47 = JA_Second_47;
    }

    public double getJA_TenthSecond_47() {
        return JA_TenthSecond_47;
    }

    public void setJA_TenthSecond_47(double JA_TenthSecond_47) {
        this.JA_TenthSecond_47 = JA_TenthSecond_47;
    }

    public double getJA_HundredthSecond_47() {
        return JA_HundredthSecond_47;
    }

    public void setJA_HundredthSecond_47(double JA_HundredthSecond_47) {
        this.JA_HundredthSecond_47 = JA_HundredthSecond_47;
    }

    public double getJA_Nanosecond_47() {
        return JA_Nanosecond_47;
    }

    public void setJA_Nanosecond_47(double JA_Nanosecond_47) {
        this.JA_Nanosecond_47 = JA_Nanosecond_47;
    }

    public double getJA_Picosecond_47() {
        return JA_Picosecond_47;
    }

    public void setJA_Picosecond_47(double JA_Picosecond_47) {
        this.JA_Picosecond_47 = JA_Picosecond_47;
    }

    public int getJA_WorkDep_47() {
        return JA_WorkDep_47;
    }

    public void setJA_WorkDep_47(int JA_WorkDep_47) {
        this.JA_WorkDep_47 = JA_WorkDep_47;
    }

    public int getJA_Sec_47() {
        return JA_Sec_47;
    }

    public void setJA_Sec_47(int JA_Sec_47) {
        this.JA_Sec_47 = JA_Sec_47;
    }

    public int getJA_Div_47() {
        return JA_Div_47;
    }

    public void setJA_Div_47(int JA_Div_47) {
        this.JA_Div_47 = JA_Div_47;
    }

    public int getJA_BrithDep_47() {
        return JA_BrithDep_47;
    }

    public void setJA_BrithDep_47(int JA_BrithDep_47) {
        this.JA_BrithDep_47 = JA_BrithDep_47;
    }

    public int getJA_ZodiSign_47() {
        return JA_ZodiSign_47;
    }

    public void setJA_ZodiSign_47(int JA_ZodiSign_47) {
        this.JA_ZodiSign_47 = JA_ZodiSign_47;
    }

    public int getJA_BloodTy_47() {
        return JA_BloodTy_47;
    }

    public void setJA_BloodTy_47(int JA_BloodTy_47) {
        this.JA_BloodTy_47 = JA_BloodTy_47;
    }

    public int getJA_ExtrD_47() {
        return JA_ExtrD_47;
    }

    public void setJA_ExtrD_47(int JA_ExtrD_47) {
        this.JA_ExtrD_47 = JA_ExtrD_47;
    }

    public int getJA_ExtrN_47() {
        return JA_ExtrN_47;
    }

    public void setJA_ExtrN_47(int JA_ExtrN_47) {
        this.JA_ExtrN_47 = JA_ExtrN_47;
    }

    public int getJA_ExtrS() {
        return JA_ExtrS;
    }

    public void setJA_ExtrS(int JA_ExtrS) {
        this.JA_ExtrS = JA_ExtrS;
    }

    public int getJA_DayW_47() {
        return JA_DayW_47;
    }

    public void setJA_DayW_47(int JA_DayW_47) {
        this.JA_DayW_47 = JA_DayW_47;
    }

    public int getJA_Age_47() {
        return JA_Age_47;
    }

    public void setJA_Age_47(int JA_Age_47) {
        this.JA_Age_47 = JA_Age_47;
    }

    public int getJA_EmplTy_47() {
        return JA_EmplTy_47;
    }

    public void setJA_EmplTy_47(int JA_EmplTy_47) {
        this.JA_EmplTy_47 = JA_EmplTy_47;
    }

    public Date getDateTimeJA_BrithDate_47() {
        return DateTimeJA_BrithDate_47;
    }

    public void setDateTimeJA_BrithDate_47(Date DateTimeJA_BrithDate_47) {
        this.DateTimeJA_BrithDate_47 = DateTimeJA_BrithDate_47;
    }

    public String getJA_District() {
        return JA_District;
    }

    public void setJA_District(String JA_District) {
        this.JA_District = JA_District;
    }

    public String getJA_Mun_47() {
        return JA_Mun_47;
    }

    public void setJA_Mun_47(String JA_Mun_47) {
        this.JA_Mun_47 = JA_Mun_47;
    }

    public String getJA_ExpID_47() {
        return JA_ExpID_47;
    }

    public void setJA_ExpID_47(String JA_ExpID_47) {
        this.JA_ExpID_47 = JA_ExpID_47;
    }

    public double getJA_SBMA_47() {
        return JA_SBMA_47;
    }

    public void setJA_SBMA_47(double JA_SBMA_47) {
        this.JA_SBMA_47 = JA_SBMA_47;
    }

    public double getJA_ExtrDVal_47() {
        return JA_ExtrDVal_47;
    }

    public void setJA_ExtrDVal_47(double JA_ExtrDVal_47) {
        this.JA_ExtrDVal_47 = JA_ExtrDVal_47;
    }

    public double getJA_ExtrNVal_47() {
        return JA_ExtrNVal_47;
    }

    public void setJA_ExtrNVal_47(double JA_ExtrNVal_47) {
        this.JA_ExtrNVal_47 = JA_ExtrNVal_47;
    }

    public double getJA_ExtrSVal_47() {
        return JA_ExtrSVal_47;
    }

    public void setJA_ExtrSVal_47(double JA_ExtrSVal_47) {
        this.JA_ExtrSVal_47 = JA_ExtrSVal_47;
    }

    public double getJA_Pension_47() {
        return JA_Pension_47;
    }

    public void setJA_Pension_47(double JA_Pension_47) {
        this.JA_Pension_47 = JA_Pension_47;
    }

    public double getJA_Health_47() {
        return JA_Health_47;
    }

    public void setJA_Health_47(double JA_Health_47) {
        this.JA_Health_47 = JA_Health_47;
    }

    public double getJA_Transport_47() {
        return JA_Transport_47;
    }

    public void setJA_Transport_47(double JA_Transport_47) {
        this.JA_Transport_47 = JA_Transport_47;
    }


    public double getJA_Daytime_47() {
        return JA_Daytime_47;
    }

    public void setJA_Daytime_47(double JA_Daytime_47) {
        this.JA_Daytime_47 = JA_Daytime_47;
    }

    public double getJA_Nocturnal_47() {
        return JA_Nocturnal_47;
    }

    public void setJA_Nocturnal_47(double JA_Nocturnal_47) {
        this.JA_Nocturnal_47 = JA_Nocturnal_47;
    }

    public double getJA_Sunday_47() {
        return JA_Sunday_47;
    }

    public void setJA_Sunday_47(double JA_Sunday_47) {
        this.JA_Sunday_47 = JA_Sunday_47;
    }

    public double getJA_TotDevegad_47() {
        return JA_TotDevegad_47;
    }

    public void setJA_TotDevegad_47(double JA_TotDevegad_47) {
        this.JA_TotDevegad_47 = JA_TotDevegad_47;
    }

    public double getJA_TotalWorked_47() {
        return JA_TotalWorked_47;
    }

    public void setJA_TotalWorked_47(double JA_TotalWorked_47) {
        this.JA_TotalWorked_47 = JA_TotalWorked_47;
    }

    public double getJA_devengadSalary_47() {
        return JA_devengadSalary_47;
    }

    public void setJA_devengadSalary_47(double JA_devengadSalary_47) {
        this.JA_devengadSalary_47 = JA_devengadSalary_47;
    }

    public double getJA_Deducid_47() {
        return JA_Deducid_47;
    }

    public void setJA_Deducid_47(double JA_Deducid_47) {
        this.JA_Deducid_47 = JA_Deducid_47;
    }

    public double getJA_Accrual_47() {
        return JA_Accrual_47;
    }

    public void setJA_Accrual_47(double JA_Accrual_47) {
        this.JA_Accrual_47 = JA_Accrual_47;
    }

    public double getJA_Net_47() {
        return JA_Net_47;
    }

    public void setJA_Net_47(double JA_Net_47) {
        this.JA_Net_47 = JA_Net_47;
    }

    public double getJA_TPremiums_47() {
        return JA_TPremiums_47;
    }

    public void setJA_TPremiums_47(double JA_TPremiums_47) {
        this.JA_TPremiums_47 = JA_TPremiums_47;
    }
}
