/*
 * This is Igrow project main code
 * Compatible with ArduinoMega and modules SIM800L, NRF24L01 and ultrasonic distance sensor. 
 * 
 * Code version: V5
*/

//Libraries
#include "nRF24L01.h" // NRF24L01 library https://github.com/TMRh20/RF24
#include "RF24.h"
#include "SPI.h"

// Server database address
const String URL = "http://<domain name>";
int ReceivedMessage[2] = {000}; //NRF24L01 packet
RF24 radio(49,48); // NRF24L01 used SPI pins
const uint64_t pipe = 0xE6E6E6E6E6E6; //NRF24L01 communication pipe

int Voltage_sense = A14; //Power supply voltage sense pin
// data
int main_tank_value = 100; //Water level in % of distant water tank
long main_tank_value_received_time = 0; //Last receiving time of distant water tank data
int main_tank_value_wanted = 50; // Wanted level in distant water tank
int secondary_tank_value = 0; //Water level in % of secondary storage tank
int Battery = 0; //Battery voltage
byte Battery_state_of_charge = 50; //SOC of battery in %
bool pump = 0; //Pump status; 1 = ON, 0 = OFF
//Mode sistema
/*
 * 0 -> sistem ustavljen
 * 1 -> sistem deluje normalno
 * 2 -> napaka v sistemu, sistem ustavljen
 * 3 -> varčevanje z energijo
 */
int mode = 1; //mode sistema
 
//GSM
int GSM_sending_period_s = 60; //Na koliko časa se pošiljajo podatki na splet 
long gsm_time = 0; //Čas zadnje komunikacije z serverjem
long gsm_session_time = 0; //Čas zadnje menjave sessiona na GSM
long GSM_session_period_s = 300; //5min //Čas kolikor traja 1 session GSM interneta
long last_sucsessful_session_time = 0; //Čas zadnjega uspešnega odziva serverja

void setup(void){

pinMode(Voltage_sense, INPUT);

Serial.begin(9600); //Debug port
Serial1.begin(9600); //GSM module

radio.begin(); // Start the NRF24L01
radio.openReadingPipe(1,pipe); // Get NRF24L01 ready to receive
radio.startListening(); // Listen to see if information received
//Waiting for any data from debug port for a system to start
Serial.println("RF24 receiver running");
//GSM INTERNET START
Serial.println("Press any key to start");
while(!Serial.available()){}

GSM_GPRS_WAIT(); //Waiting til GPRS is working
}

void loop(void){

  //RF
  RF_SESSION(); //RF komunikacija (Distant tank watter level check)
  //GSM
  GSM_PROCESS(); //GSM services (GSM communication and controll)
  //Voltage
  Battery = Battery_sense(); //Measuring power supply voltage
  Battery_state_of_charge = Battery_percentage_calculation(Battery); //Calculating battery SOC from power supply voltage
  //Water tank
  //secondary_tank_value = ; //Measuring water level in secundary storage tank
  //PUMP
  PUMP_PROCESS(main_tank_value,main_tank_value_received_time,secondary_tank_value,main_tank_value_wanted, Battery_state_of_charge); //Pump controll
  //System check
  mode = System_check(mode); //System health check
  //
}