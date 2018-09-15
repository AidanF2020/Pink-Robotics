package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;


@TeleOp (name = "PINK Teleop")
public class Teleop extends OpMode
{

    /* Declare OpMode members. */
    private Hardware robot = new Hardware(); // use the class created to define a Pushbot's hardware
    private double leftJoystick, rightJoystick;
    private double leftWheelsMotorCmd, rightWheelsMotorCmd;

    /*
     * Code to run ONCE when the driver hits INIT
     */
    @Override
    public void init ()
    {
        /* Initialize the hardware variables.
         * The init() method of the hardware class does all the work here
         */
        robot.init(hardwareMap);

        // Send telemetry message to signify robot waiting;
        telemetry.addData("Say", "Hello Driver");    //
    }

    /*
     * Code to run REPEATEDLY after the driver hits INIT, but before they hit PLAY
     */
    @Override
    public void init_loop ()
    {
    }

    /*
     * Code to run ONCE when the driver hits PLAY
     */
    @Override
    public void start ()
    {
    }

    /*
     * Code to run REPEATEDLY after the driver hits PLAY but before they hit STOP
     */
    @Override
    public void loop ()
    {
        // BASE CONTROL /////////////////////////////////////////////////////
        // Run wheels in tank mode (The joystick is negative when pushed forward, so negate it)
        leftJoystick = -gamepad1.left_stick_y;
        rightJoystick = -gamepad1.right_stick_y;

        if (gamepad1.left_trigger > 0.2)
        {
            leftWheelsMotorCmd = leftJoystick * 1.0;
            rightWheelsMotorCmd = rightJoystick * 1.0;
        }
        else
        {
            leftWheelsMotorCmd = leftJoystick * 0.7;
            rightWheelsMotorCmd = rightJoystick * 0.7;
        }

        // Set powers and positions
        robot.leftDrive.setPower(leftWheelsMotorCmd);
        robot.rightDrive.setPower(rightWheelsMotorCmd);
    }

    /*
     * Code to run ONCE after the driver hits STOP
     */
    @Override
    public void stop ()
    {
    }

}
