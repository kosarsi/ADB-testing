package org.firstinspires.ftc.team8923_2021;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

@Autonomous(name="BlueDeliver")
public class BlueDeliver extends MasterAutonomous {
    public void runOpMode() throws InterruptedException {
        initAuto();
        waitForStart();

        while (opModeIsActive()) {
            double referenceAngle = imu.getAngularOrientation().firstAngle;
            moveForward(5.0, 10, 10);
            imuPivot(referenceAngle, 90, 35, 0.015, 3.0);
            imuPivot(referenceAngle, 90, 35, 0.015, 3.0);
            moveForward(-2.0, 10, 10);
            autoDeliver();
        }
    }
}