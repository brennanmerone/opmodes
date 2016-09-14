package com.qualcomm.ftcrobotcontroller.opmodes;


import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.util.ElapsedTime;

/**
 * Created by wbmf2 on 9/14/2016.
 */
public class NOTNTeleop extends OpMode {

    private DcMotor frontleft,frontright,backleft,backright;
    private Servo servo1, servo2, servobucklemyshoe;

    public void init(){
        frontleft=hardwareMap.dcMotor.get("motor_1");
        frontright=hardwareMap.dcMotor.get("motor_2");
        backleft=hardwareMap.dcMotor.get("motor_3");
        backright=hardwareMap.dcMotor.get("motor_4");
        servo1=hardwareMap.servo.get("servo_1");
        servo2=hardwareMap.servo.get("servo_2");
        servobucklemyshoe=hardwareMap.servo.get("servo_3");
    }

    public void loop () {
        ywheels();
    }

        public void ywheels () {

            if (Math.abs(gamepad1.left_stick_y) > .25) {
                frontleft.setPower(gamepad1.left_stick_y);
                backright.setPower(gamepad1.left_stick_y);

            } else {
                frontleft.setPower(0.0);
                backright.setPower(0.0);
            }
        }

        public void xwheels ()
        {
            if (Math.abs(gamepad1.left_stick_x) > .25) {
                frontright.setPower(gamepad1.left_stick_x);
                backleft.setPower(gamepad1.left_stick_x);

            } else {
                frontright.setPower(0.0);
                backleft.setPower(0.0);
            }
        }



}
