package org.firstinspires.ftc.teamcode.DriveTrain;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

public class DriveTrain  extends LinearOpMode {

    public DcMotorEx motorIzquierdo, motorDerecho;


    public void runOpMode() {

        motorIzquierdo = hardwareMap.get(DcMotorEx.class, "MotorIzquierdo");
        motorDerecho = hardwareMap.get(DcMotorEx.class, "MotorDerecho");

        motorDerecho.setDirection(DcMotorSimple.Direction.FORWARD);
        motorIzquierdo.setDirection(DcMotorSimple.Direction.REVERSE);

        motorDerecho.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        motorIzquierdo.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);

        waitForStart();

        while(opModeIsActive()){

            if(gamepad1.dpad_up){
                motorIzquierdo.setPower(0.8);
                motorDerecho.setPower(0.8);
            } else if (gamepad1.dpad_down){
                motorIzquierdo.setPower(-0.8);
                motorDerecho.setPower(-0.8);
            } else if (gamepad1.dpad_left){
                motorIzquierdo.setPower(-0.8);
                motorDerecho.setPower(0.8);
            } else if (gamepad1.dpad_right){
                motorDerecho.setPower(-0.8);
                motorIzquierdo.setPower(0.8);
            } else {
                motorIzquierdo.setPower(0);
                motorDerecho.setPower(0);
            }
        }
    }
}
