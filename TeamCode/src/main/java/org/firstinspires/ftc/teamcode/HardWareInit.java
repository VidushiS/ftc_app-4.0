package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;



/**
 * Created by singh on 10/9/2018.
 */

public class HardWareInit{

    DcMotor leftMotor, rightMotor, strafeMotor, LeftSlideMotor, RightSlideMotor, IntakeMotor, FlipMotor;
    Servo ColorSensor1, ColorSensor2, DumpServo;

    public void initHardware(LinearOpMode op) {
        leftMotor = op.hardwareMap.dcMotor.get("leftMotor");
        rightMotor = op.hardwareMap.dcMotor.get("rightMotor");
        strafeMotor = op.hardwareMap.dcMotor.get("strafeMotor");
        LeftSlideMotor = op.hardwareMap.dcMotor.get("LeftSlideMotor");
        RightSlideMotor = op.hardwareMap.dcMotor.get("RightSlideMotor");
        rightMotor.setDirection(DcMotorSimple.Direction.REVERSE);
        RightSlideMotor.setDirection(DcMotorSimple.Direction.REVERSE);
      /*  IntakeMotor = op.hardwareMap.dcMotor.get("IntakeMotor");


        */
        /*FlipMotor = op.hardwareMap.dcMotor.get("FlipMotor");




        ColorSensor1 = op.hardwareMap.servo.get("ColorSensor1");
        ColorSensor2 = op.hardwareMap.servo.get("ColorSensor2");
        DumpServo = op.hardwareMap.servo.get("DumpServo");*/
    }
    public void waitBlock(LinearOpMode op){
        while (op.opModeIsActive() && this.leftMotor.isBusy()){
            op.telemetry.addData("leftMotor", leftMotor.getCurrentPosition());
            op.telemetry.addData("rightMotor", rightMotor.getCurrentPosition());
            op.telemetry.update();
            op.idle();
        }
    }
    public void EncooderReseeter(LinearOpMode op){
        this.leftMotor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        this.rightMotor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

        op.sleep(500);

        this.leftMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        this.rightMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
    }

    public void MotorStop(LinearOpMode op){
        this.leftMotor.setPower(0);
        this.rightMotor.setPower(0);
    }

    public void GoStraight(int encoderCnts, double MotorSpd){
        this.leftMotor.setTargetPosition(encoderCnts);
        this.rightMotor.setTargetPosition(encoderCnts);

        this.leftMotor.setPower(MotorSpd);
        this.rightMotor.setPower(MotorSpd);
    }
    public void Turn(int encoderCnts, double MotorSpd){
        this.leftMotor.setTargetPosition(encoderCnts);
        this.rightMotor.setTargetPosition(encoderCnts);

        this.leftMotor.setPower(MotorSpd);
        this.rightMotor.setPower(MotorSpd);
    }


}
