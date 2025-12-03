package org.firstinspires.ftc.teamcode.ConfigMotores;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;

@TeleOp(name = "LimitesMotores")
public class LimitesMotores  extends LinearOpMode{

    public DcMotorEx motor1, motor2;

    public void runOpMode() {



        motor1 = hardwareMap.get(DcMotorEx.class, "Motor1");
        motor2 = hardwareMap.get(DcMotorEx.class, "Motor2");

        motor1.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        motor2.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.FLOAT);


        motor1.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER); //Resetear encoders para evitar que se quede con alguna configuracion anterior
        motor2.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        motor1.setMode(DcMotor.RunMode.RUN_TO_POSITION); //Configura el motor para que funcione llendo a las posiciones establecidad
        motor2.setMode(DcMotor.RunMode.RUN_TO_POSITION);

        waitForStart();

        while(opModeIsActive()){

            int position1 = motor1.getCurrentPosition();
            int position2 = motor2.getCurrentPosition();



            if (gamepad1.a){
                motor1.setTargetPosition(90); //Configura los TICKS a los que quieres que vaya el motor
                motor1.setPower(0.8);
                motor2.setTargetPosition(90);
                motor2.setPower(0.8);
            } else if (gamepad1.b) {
                motor1.setTargetPosition(0);
                motor1.setPower(0.8);
                motor2.setTargetPosition(0);
                motor2.setPower(0.8);
            }

            telemetry.addData("Posicion Motor1:" , position1); //Imprime la posicion actual de motor en TICKS
            telemetry.addData("Posicion Motor2:", position2);
            telemetry.update();

        }
    }
}
