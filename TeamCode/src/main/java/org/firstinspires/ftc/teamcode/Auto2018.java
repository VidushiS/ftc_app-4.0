package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;


@Autonomous(name = "Official Auto", group = "Exercises")

/**
 * Created by singh on 10/17/2018.
 */

public class Auto2018 extends LinearOpMode{

    HardWareInit hardware = new HardWareInit();

    @Override
    public void runOpMode(){
        hardware.initHardware(this);

        hardware.EncooderReseeter(this);

        telemetry.addData("Mode", "waiting");
        telemetry.update();

        waitForStart();

        hardware.EncooderReseeter(this);

        hardware.LeftSlideMotor.setPower(-.5);
        hardware.RightSlideMotor.setPower(-.5);

        sleep(2000);

        hardware.LeftSlideMotor.setPower(0);
        hardware.RightSlideMotor.setPower(0);

        

        hardware.GoStraight(3200, 1.0);
        hardware.waitBlock(this);
        hardware.MotorStop(this);

        //Deploy the color servo. Below is the following mock code required for it to work.
        /*
        * while(ColorSensor1 = silver && ColorSensor2 = silver){
        *   robot should raise one arm and turn so that the middle is knocked off
        *   idle();
        *}
        *while(ColorSensor1 = Gold){
        * robot should turn in that direction to knock it off, opposite if other colorsensor reads gold
        *}
        * */

        hardware.GoStraight(1000, 1.0);
        hardware.waitBlock(this);
        hardware.MotorStop(this);







    }
}
