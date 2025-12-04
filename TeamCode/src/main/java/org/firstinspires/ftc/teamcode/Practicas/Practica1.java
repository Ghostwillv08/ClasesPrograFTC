package org.firstinspires.ftc.teamcode.Practicas;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotorEx;

@TeleOp(name = "Practica1")

public class Practica1 extends LinearOpMode {

    public DcMotorEx motor1;

    public void runOpMode() {

        motor1 = hardwareMap.get(DcMotorEx.class, "Motor1");

        waitForStart();

        while(opModeIsActive()){

            motor1.setPower(0.5);
        }
    }
}
