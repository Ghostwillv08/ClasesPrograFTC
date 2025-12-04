package org.firstinspires.ftc.teamcode.ConfigMotores;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.DcMotorSimple.Direction;


@TeleOp(name = "MoverMotores")
public class MoverMotores extends LinearOpMode{
    public DcMotorEx motorIzquierdo, motorDerecho;



    public void runOpMode(){
        motorIzquierdo = hardwareMap.get(DcMotorEx.class, "Motor1");
        motorDerecho = hardwareMap.get(DcMotorEx.class, "Motor2");

        motorDerecho.setDirection(Direction.REVERSE);

        motorDerecho.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        motorIzquierdo.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);

        waitForStart();

        while(opModeIsActive()){

            motorDerecho.setPower(0.8);
            motorIzquierdo.setPower(0.5);

        }
    }

}
