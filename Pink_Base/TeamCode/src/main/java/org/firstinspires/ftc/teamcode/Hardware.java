package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;


public class Hardware {

    //-----------------------------------------Motors-----------------------------------------//
    public DcMotor leftDrive    = null;
    public DcMotor rightDrive   = null;

    //----------------------------------Local OpMode Members----------------------------------//
    HardwareMap hwMap = null;

    //---------------------Initialization of Standard Hardware Interfaces---------------------//
    public void init (HardwareMap ahwMap) {

        //--------------------Saving the Reference to the Hardware Map--------------------//
        hwMap = ahwMap;

        //-------------------------------------Motors-------------------------------------//
        leftDrive   = hwMap.get(DcMotor.class, "leftDrive");
        rightDrive  = hwMap.get(DcMotor.class, "rightDrive");

        //-------------------------------Motor Configuration------------------------------//
        leftDrive.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        rightDrive.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

        leftDrive.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        rightDrive.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);

        leftDrive.setDirection(DcMotor.Direction.REVERSE);
        rightDrive.setDirection(DcMotor.Direction.FORWARD);

        leftDrive.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        rightDrive.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);

        leftDrive.setPower(0);
        rightDrive.setPower(0);
    }
}