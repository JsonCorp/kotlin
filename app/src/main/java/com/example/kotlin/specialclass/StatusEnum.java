package com.example.kotlin.specialclass;

public class StatusEnum {
    enum STATUS {
        IDLE, RUNNING, FINISHED
    }

    public static void main(String[] args) {

        STATUS status = STATUS.RUNNING;
        String message = "";
        switch (status) {
            case IDLE:
                message = "It's idle";
                break;
            case RUNNING:
                message = "It's running";
                break;
            case FINISHED:
                message = "It's finished";
                break;
        }

        System.out.println(message);
        System.out.println(status);
    }
}
