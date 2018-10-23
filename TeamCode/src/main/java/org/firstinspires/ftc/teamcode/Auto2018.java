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

        hardware.GoStraight(3200, 0.5);

        //Deploy the color servo. Below is the following mock code required for it to work.






    }
}
