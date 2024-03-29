/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc4388.robot;

import com.ctre.phoenix.motorcontrol.InvertType;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;
import com.ctre.phoenix.sensors.PigeonIMU;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import frc4388.robot.Constants.DriveConstants;
import frc4388.robot.Constants.HornConstants;
import frc4388.robot.Constants.LEDConstants;
import frc4388.robot.Constants.ShooterConstants;
import frc4388.robot.Constants.DebugConstants;;
import frc4388.utility.RobotGyro;
import frc4388.utility.DPrint;

/**
 * Defines and holds all I/O objects on the Roborio. This is useful for unit
 * testing and modularization.
 */
public class RobotMap {

    public RobotMap() {
        configureLEDMotorControllers();
        configureDriveMotorControllers();
    }

    /* LED Subsystem */
    public final Spark LEDController = new Spark(LEDConstants.LED_SPARK_ID);

    void configureLEDMotorControllers() {
        
    }

    /* Drive Subsystem */
    public final WPI_TalonFX leftFrontMotor = new WPI_TalonFX(DriveConstants.DRIVE_LEFT_FRONT_CAN_ID);
    public final WPI_TalonFX rightFrontMotor = new WPI_TalonFX(DriveConstants.DRIVE_RIGHT_FRONT_CAN_ID);
    public final WPI_TalonFX leftBackMotor = new WPI_TalonFX(DriveConstants.DRIVE_LEFT_BACK_CAN_ID);
    public final WPI_TalonFX rightBackMotor = new WPI_TalonFX(DriveConstants.DRIVE_RIGHT_BACK_CAN_ID);
    public final DifferentialDrive driveTrain = new DifferentialDrive(leftFrontMotor, rightFrontMotor);
    public final RobotGyro gyroDrive = new RobotGyro(new PigeonIMU(DriveConstants.DRIVE_PIGEON_ID));

    void configureDriveMotorControllers() {

        /* factory default values */
        leftFrontMotor.configFactoryDefault();
        rightFrontMotor.configFactoryDefault();
        leftBackMotor.configFactoryDefault();
        rightBackMotor.configFactoryDefault();

        /* set back motors as followers */
        leftBackMotor.follow(leftFrontMotor);
        rightBackMotor.follow(rightFrontMotor);

        /* set neutral mode */
        leftFrontMotor.setNeutralMode(NeutralMode.Brake);
        rightFrontMotor.setNeutralMode(NeutralMode.Brake);
        leftFrontMotor.setNeutralMode(NeutralMode.Brake);
        rightFrontMotor.setNeutralMode(NeutralMode.Brake);

        /* flip input so forward becomes back, etc */
        leftFrontMotor.setInverted(false);
        rightFrontMotor.setInverted(false);
        leftBackMotor.setInverted(InvertType.FollowMaster);
        rightBackMotor.setInverted(InvertType.FollowMaster);
    }
    /* Horn subsystem */
    // public final Solenoid HornSolenoid =  new Solenoid(HornConstants.HORN_SOLENOID_ID);

    // /* Shooter subsystem */
    // public final Solenoid ShooterSolenoid0 = new Solenoid(ShooterConstants.SHOOTER_SOLENOID_0_ID);
    // public final Solenoid ShooterSolenoid1 = new Solenoid(ShooterConstants.SHOOTER_SOLENOID_1_ID);
    // public final Solenoid ShooterSolenoid2 = new Solenoid(ShooterConstants.SHOOTER_SOLENOID_2_ID);
    // public final Solenoid ShooterSolenoid3 = new Solenoid(ShooterConstants.SHOOTER_SOLENOID_3_ID);
    // public final Solenoid ShooterSolenoid4 = new Solenoid(ShooterConstants.SHOOTER_SOLENOID_4_ID);
    // public final Solenoid ShooterSolenoid5 = new Solenoid(ShooterConstants.SHOOTER_SOLENOID_5_ID);
    // public final Solenoid ShooterSolenoid6 = new Solenoid(ShooterConstants.SHOOTER_SOLENOID_6_ID);
    // public final Solenoid ShooterSolenoid7 = new Solenoid(ShooterConstants.SHOOTER_SOLENOID_7_ID);

    /* DPrint Utility */
    public final DPrint DPrinter = new DPrint(DebugConstants.TYPE_INFO);
}