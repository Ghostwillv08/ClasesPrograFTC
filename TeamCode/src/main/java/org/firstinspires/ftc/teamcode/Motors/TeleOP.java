package org.firstinspires.ftc.teamcode.Motors;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

import org.firstinspires.ftc.teamcode.Motors.Motor;
import org.firstinspires.ftc.teamcode.Motors.MotorConfiguration;

@TeleOp(name = "TestMotores")
public class TeleOP extends LinearOpMode {

    private Motor jointMotorLeft;
    private Motor jointMotorRight;

    @Override
    public void runOpMode() {

        MotorConfiguration leftConfig = new MotorConfiguration(
                "Motor1",
                DcMotorSimple.Direction.FORWARD,
                DcMotor.RunMode.RUN_USING_ENCODER,
                DcMotor.ZeroPowerBehavior.BRAKE
        );

        MotorConfiguration rightConfig = new MotorConfiguration(
                "Motor2",
                DcMotorSimple.Direction.REVERSE,
                DcMotor.RunMode.RUN_USING_ENCODER,
                DcMotor.ZeroPowerBehavior.BRAKE
        );

        jointMotorLeft = new Motor(leftConfig, hardwareMap);
        jointMotorRight = new Motor(rightConfig, hardwareMap);

        waitForStart();

        while (opModeIsActive()) {

            // Control con gamepad
            if (gamepad1.a) {
                jointMotorLeft.setPower(0.5);
                jointMotorRight.setPower(0.5);
            } else if (gamepad1.b) {
                jointMotorLeft.setPower(-0.5);
                jointMotorRight.setPower(-0.5);
            } else {
                jointMotorLeft.setPower(0);
                jointMotorRight.setPower(0);
            }

            telemetry.addData("Left Pos", jointMotorLeft.getPosition());
            telemetry.addData("Right Pos", jointMotorRight.getPosition());
            telemetry.update();
        }
    }
}
