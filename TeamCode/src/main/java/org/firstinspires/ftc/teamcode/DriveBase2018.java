package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.util.Range;
@Disabled
@TeleOp(name = "DriveBase", group = "Exercises")
/**
 * Created by singh on 10/2/2018.
 */

public class DriveBase2018 extends LinearOpMode{
    DcMotor leftMotor, rightMotor;
    double leftY, rightY;

    public void runOpMode(){
        leftMotor = hardwareMap.dcMotor.get("LFMotor");
        rightMotor = hardwareMap.dcMotor.get("RFMotor");

        rightMotor.setDirection(DcMotor.Direction.REVERSE);

        telemetry.addData("Mode", "Waiting");
        telemetry.update();

        waitForStart();
        sleep(500);

        telemetry.addData("Mode", "Active");


        while (opModeIsActive()){
            leftY = Range.clip(gamepad1.left_stick_y, -1.0, 1.0);
            rightY = Range.clip(gamepad1.right_stick_y, -1.0, 1.0);

            idle();
        }
    }
}
