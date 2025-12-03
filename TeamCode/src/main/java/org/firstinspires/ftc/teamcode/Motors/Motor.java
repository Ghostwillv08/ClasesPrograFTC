package org.firstinspires.ftc.teamcode.Motors;

import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class Motor {

    private final DcMotorEx motor;
    public final MotorConfiguration config;

    public Motor(MotorConfiguration config, HardwareMap hardwareMap) {
        this.config = config;

        this.motor = hardwareMap.get(DcMotorEx.class, config.motorName);

        motor.setDirection(config.direction);
        motor.setMode(config.runMode);
        motor.setZeroPowerBehavior(config.zeroPowerBehavior);
    }


    public void setPower(double p) {
        motor.setPower(p);
    }

    public double getPosition() {
        return motor.getCurrentPosition();
    }

    public DcMotorEx getMotor() {
        return motor;
    }
}
