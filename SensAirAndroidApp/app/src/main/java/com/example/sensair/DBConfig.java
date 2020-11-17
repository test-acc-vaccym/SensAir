package com.example.sensair;

public class DBConfig {
    public static final String DATABASE_NAME = "ad_data";

    public static final String TABLE_AIRDATA = "Airdata" ;

    //Data Base columns
    // increase_key| Date| Overall | CO2 | TVOC | Combustible Gas | Humidity | Pressure | Temperature
    public static final String COLUMN_KEY = "key" ;
    public static final String COLUMN_DATE = "date";
    public static final String COLUMN_OVERALL = "overall";
    public static final String COLUMN_CO2 = "CO2";
    public static final String COLUMN_TVOC  = "TVOC";
    public static final String COLUMN_COMBUST_GAS = "combustible_gas";
    public static final String COLUMN_HUMIDITY = "humidity" ;
    public static final String COLUMN_PRESSURE = "pressure" ;
    public static final String COLUMN_TEMPERATURE = "temperature" ;

}