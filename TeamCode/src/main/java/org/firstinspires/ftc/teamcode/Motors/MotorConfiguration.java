package org.firstinspires.ftc.teamcode.Motors;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

public class MotorConfiguration {

    public final String motorName;
    public final DcMotorSimple.Direction direction;
    public final DcMotor.RunMode runMode;
    public final DcMotor.ZeroPowerBehavior zeroPowerBehavior;

    public MotorConfiguration(
            String motorName,
            DcMotorSimple.Direction direction,
            DcMotor.RunMode runMode,
            DcMotor.ZeroPowerBehavior zeroPowerBehavior
    ) {
        this.motorName = motorName;
        this.direction = direction;
        this.runMode = runMode;
        this.zeroPowerBehavior = zeroPowerBehavior;
    }
}
