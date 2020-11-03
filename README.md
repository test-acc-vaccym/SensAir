# SensAir
Air Quality Sensor Application for Android. 

## Resources
* [DFRobot Bluno Wiki](https://wiki.dfrobot.com/Bluno_SKU_DFR0267#target_4) for bluetooth connectivity using the Bluno
* [CCS811 Sparkfun Library & Examples](https://github.com/sparkfun/SparkFun_CCS811_Arduino_Library) for CCS811 I2C communications


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