package org.firstinspires.ftc.teamcode.ConfigMotores;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotorEx;

@TeleOp(name = "MotorGamepad")
public class Gamepad extends LinearOpMode {
    public DcMotorEx motor1,  motor2;


    public void runOpMode(){

        motor1 = hardwareMap.get(DcMotorEx.class, "Motor1");
        motor2 = hardwareMap.get(DcMotorEx.class, "Motor2");

        waitForStart();

        while (opModeIsActive()){

            if(gamepad1.a){

                motor2.setPower(0.7);

            } else if(gamepad1.b){

                motor1.setPower(0.6);

            } else{

                motor2.setPower(0);
                motor1.setPower(0);
            }
        }
    }
}
