/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc4388.robot;

import frc4388.utility.LEDPatterns;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants.  This class should not be used for any other purpose.  All constants should be
 * declared globally (i.e. public static).  Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
    public static final class DriveConstants {
        public static final int DRIVE_LEFT_FRONT_CAN_ID = 2;
        public static final int DRIVE_RIGHT_FRONT_CAN_ID = 4;
	    public static final int DRIVE_LEFT_BACK_CAN_ID = 3;
        public static final int DRIVE_RIGHT_BACK_CAN_ID = 5;
        
        public static final int DRIVE_PIGEON_ID = 6;

        public static final int SMARTDASHBOARD_UPDATE_FRAME = 2;
    }

    public static final class LEDConstants {
        public static final int LED_SPARK_ID = 0;

        public static final LEDPatterns DEFAULT_PATTERN = LEDPatterns.FOREST_WAVES;
    }

    public static final class OIConstants {
        public static final int XBOX_DRIVER_ID = 0;
        public static final int XBOX_OPERATOR_ID = 1;
    }

    public static final class HornConstants {
        public static final int HORN_SOLENOID_ID = 0;
        //Todo: Change ID with new id on the robot
    }
    public static final class ShooterConstants {
        public static final int SHOOTER_SOLENOID_0_ID = 1;
        public static final int SHOOTER_SOLENOID_1_ID = 2;
        public static final int SHOOTER_SOLENOID_2_ID = 3;
        public static final int SHOOTER_SOLENOID_3_ID = 4;
        public static final int SHOOTER_SOLENOID_4_ID = 5;
        public static final int SHOOTER_SOLENOID_5_ID = 6;
        public static final int SHOOTER_SOLENOID_6_ID = 7;
        public static final int SHOOTER_SOLENOID_7_ID = 8;
    }
    public static final class DebugConstants {
        //public static final boolean CAN_BUILD = no;
        public static final boolean SHOW_INFO = true;
        public static final String TYPE_INFO = "INFO";
    }
}