# SensAir
Air Quality Sensor Application for Android. 

The SensAir App is an open-source air quality sensing app. Interfacing with three sensors, the application allows a user to monitor their air quality in real-time, providing users with alerts, graphs, and air quality gauges (as seen below).
<img src="https://i.imgur.com/HmIWCRY.png" width="40%">
<img src="https://i.imgur.com/KYzBIQI.png" width="40%">

## Android Libraries
* [SpeedView Library](https://github.com/anastr/SpeedView) for the gauge in the MainActivity
* [MP Android Charts](https://github.com/PhilJay/MPAndroidChart) for graphing needs 

## Hardware
* [HC-05 (v2.0-20100601) Bluetooth Module](https://components101.com/sites/default/files/component_datasheet/HC-05%20Datasheet.pdf) for bluetooth.
    * **Bluetooth Address**: 35555e (Hex)
    * **Bluetooth MAC address**: 00:18:E4:35:55:5E
    * **Baud rate**: 38400
      * All attributes can be changed using AT commands and vary from part to part.
    * [List of AT Commands](https://roboindia.com/tutorial-content/arduino_code/hc-05_at_commands.zip)
      * Before trying AT commands, make sure the LED is blinking slowly (about once every two seconds) If it is not, then cut power to HC-05 and re-power it while holding down the button to toggle AT and Pairing mode.
    * Vcc = 5V
    
* [SparkFun CCS811 Air Quality Breakout Board](https://cdn-learn.adafruit.com/assets/assets/000/044/636/original/CCS811_DS000459_2-00-1098798.pdf)
    * I2C connection
      * [CCS811 Library & Examples](https://github.com/sparkfun/SparkFun_CCS811_Arduino_Library) for I2C
    * Vcc = 3.3V

* [SparkFun BME 280 Atmospheric Breakout Board](https://cdn.sparkfun.com/assets/e/7/3/b/1/BME280_Datasheet.pdf)
    * I2C connection
      * [BME 280 Library & Examples](https://github.com/sparkfun/SparkFun_BME280_Arduino_Library) for I2C
    * Vcc = 3.3V

* [MQ2 Gas Sensor](https://docs.particle.io/assets/datasheets/electronsensorkit/MQ-2.pdf)
    * Analog sensor
    * Vcc = 5V


## Identifier Naming Convention
It is important to implement a consistent naming convention throughout the entire project. Generally, the project will follow classic java-styled notation, where the first word is lowercase and each following word has its first letter in uppercase. For example,
```
    firstSecondThird
```

#### Classes and Objects
* Classes shall be named with the first letter of every word capitalized. Objects shall be named with the same java notation,  E.g.
```
    typeDescription
```
* Object names should be descriptive, where the first word is the item type and the next words are what the item does. E.g.
```
    Button buttonGoToNext = new Button();
    DbHelper dbHelper = new DbHelper();
    EditText editTextUserName = new EditText();
```
#### Variables
* Variables shall be named in all uppercase letters if they are final. Otherwise, the variable should follow the classic java style. Variable names should be descriptive and clearly indicate what the variable is doing (except variables with a narrow scope, like in for loops). E.g.
```
    final int MYVARIABLE = 5;
    int counter = 0;
    string userProfileId = user.getID();
```
#### Functions
* Functions shall be named with the same java-styled notation. They should be descriptive and describe the functions purpose. Some examples:
```
    void getKey()
    double computeAverage()
    string getName()
```
