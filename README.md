SMART HOME SYSTEM

A console-based Java application that simulates basic smart home controls: lights, fan, AC, and door lock. It also tracks energy usage and protects sensitive operations with a password.
FEATURES
Lights Control: Turn ON/OFF lights and track usage time (minutes).
Fan Control: Turn ON/OFF fan, set speed (low, middle, high), and track usage time.
AC Control: Turn ON/OFF AC, set desired temperature, and track usage time.
Door Lock: Lock/Unlock door (password protected).
Energy Usage Report: Displays cumulative energy consumption (Wh) for lights, fan, and AC.
Password Protection: Admin password required to unlock door and view energy report.
Prerequisites
Java Development Kit (JDK) 8 or higher
Terminal or IDE (e.g., IntelliJ IDEA, Eclipse)

USAGE
Lights/Fan/AC: Selecting ON will increment internal usage counters (1 minute per ON action).
Fan Speed: After turning ON, choose speed: low, middle, or high.
AC Temperature: After turning ON, enter the desired temperature in °C.
Unlock Door / EnergyUsage: Prompts for admin password (Abhi123).
Show status: Prints current states of all devices.
Show EnergyUsage: Calculates and prints energy in Wh:
Lights: 5 W
Fan: 70 W
AC: 1500 W
CONFIGURATION
Admin Password: Abhi123 (constant in code)
Power Ratings: Modify in showEnergyUsage() if needed.
Future Enhancements
GUI using JavaFX or Swing
File-based log of operations
Automatic modes (motion, timer)
Voice command parsing
Multi-room support
Author
Abinaya — pre-final year B.Tech CSBS student at E.G.S. Pillay Engineering College

