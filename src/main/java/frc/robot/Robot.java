// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.TimedRobot;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

/**
 * The VM is configured to automatically run this class, and to call the functions corresponding to
 * each mode, as described in the TimedRobot documentation. If you change the name of this class or
 * the package after creating this project, you must also update the build.gradle file in the
 * project.
 */
public class Robot extends TimedRobot {
    /**
     * This function is run when the robot is first started up and should be used for any
     * initialization code.
     */

    private static final Joystick joystick = new Joystick(0);

    private final int ButtonA = 1;
    private final int ButtonB = 2;
    private final int ButtonX = 3;
    private final int ButtonY = 4;

    private final int ButtonLB = 5;
    private final int ButtonRB = 6;

    private final int ButtonBACK = 7;
    private final int ButtonSTART = 8;

    private double LT, RT;

    private final CANSparkMax motor_Chassis_LF = new CANSparkMax(1, MotorType.kBrushed);
    private final CANSparkMax motor_Chassis_LB = new CANSparkMax(2, MotorType.kBrushed);
    private final CANSparkMax motor_Chassis_RF = new CANSparkMax(3, MotorType.kBrushed);
    private final CANSparkMax motor_Chassis_RB = new CANSparkMax(4, MotorType.kBrushed);

    private final CANSparkMax motor5 = new CANSparkMax(5,MotorType.kBrushed);

    private final CANSparkMax shooter = new CANSparkMax(6,MotorType.kBrushless);
    private final CANSparkMax intake = new CANSparkMax(7,MotorType.kBrushless);

    //For Test
    private final int testMotorNum = 4;
    private double testMotorSpeed;
    private final CANSparkMax testMotor = new CANSparkMax(testMotorNum, MotorType.kBrushless);



    @Override
    public void robotInit() {
    }

    @Override
    public void robotPeriodic() {
    }

    @Override
    public void autonomousInit() {
    }

    @Override
    public void autonomousPeriodic() {
    }

    @Override
    public void teleopInit() {
    }

    @Override
    public void teleopPeriodic() {
    }

    @Override
    public void disabledInit() {
    }

    @Override
    public void disabledPeriodic() {
    }

    @Override
    public void testInit() {
        testMotorSpeed = 1;
    }

    @Override
    public void testPeriodic() {
        if(joystick.getRawButton(ButtonA)){
            testMotor.set(testMotorSpeed);
        }else{
            testMotor.set(0);
        }
    }

    @Override
    public void simulationInit() {
    }

    @Override
    public void simulationPeriodic() {
    }
}
