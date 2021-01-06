package com.sparta.IO;

import com.sparta.configuration.Settings;
import com.sparta.model.Company;
import com.sparta.utility.TimeTracker;

import java.util.Scanner;

public class Printer {

    public static void greeting(){
        System.out.println("Welcome to the Sparta simulator");
    }

    public static void defaultSettings(){
        System.out.println("The default values are: \n" +
                "Simulation time in months: " +Settings.SIMULATION_MONTHS.getValue() + "\n" +
                "Centre opening frequency: " +Settings.CENTER_OPENING_FREQUENCY.getValue() + "\n" +
                "Centre capacity: " +Settings.CENTER_CAPACITY.getValue() + "\n" +
                "Lower bound for new trainee range: " +Settings.NEW_TRAINEE_MIN.getValue() + "\n" +
                "Upper bound for new trainee range: " +Settings.CENTER_OPENING_FREQUENCY.getValue() + "\n" +
                "New trainee frequency in months: " +Settings.NEW_TRAINEE_FREQUENCY.getValue() + "\n" +
                "Lower bound for centre admittance: " +Settings.CENTER_ADMITTANCE_MIN.getValue() + "\n" +
                "Upper bound for centre admittance: " +Settings.CENTER_ADMITTANCE_MAX.getValue() + "\n" +
                "Centre admittance frequency: " +Settings.CENTER_ADMITTANCE_FREQUENCY.getValue() + "\n" +
                "Seconds per month: " +Settings.MONTH_IN_MS.getValue());
    }

    public static void simulationTime(){
        System.out.println("Enter simulation time in Months (Press enter to use default value: "+ Settings.SIMULATION_MONTHS.getValue());
    }

    public static void centreOpeningFrequency(){
        System.out.println("Enter centre opening frequency (Press enter to use default value: "+ Settings.CENTER_OPENING_FREQUENCY.getValue());
    }

    public static void centreCapacity(){
        System.out.println("Enter centre capacity (Press enter to use default value: "+ Settings.CENTER_CAPACITY.getValue());
    }
    public static void newTraineeMin(){
        System.out.println("Enter lower bound for new trainee generation range (Press enter to use default value: "+ Settings.NEW_TRAINEE_MIN.getValue());
    }

    public static void newTraineeMax(){
        System.out.println("Enter upper bound for new trainee generation range (Press enter to use default value: "+ Settings.NEW_TRAINEE_MAX.getValue());
    }

    public static void newTraineeFrequency(){
        System.out.println("Enter new trainee frequency in months (Press enter to use default value: "+ Settings.NEW_TRAINEE_FREQUENCY.getValue());
    }

    public static void centreAdmittanceMin(){
        System.out.println("Enter lower bound for centre admittance (Press enter to use default value: "+ Settings.CENTER_ADMITTANCE_MIN.getValue());
    }

    public static void centreAdmittanceMax(){
        System.out.println("Enter upper bound for centre admittance (Press enter to use default value: "+ Settings.CENTER_ADMITTANCE_MAX.getValue());
    }

    public static void centreAdmittanceFrequency(){
        System.out.println("Enter centre admittance frequency in months (Press enter to use default value: "+ Settings.CENTER_ADMITTANCE_FREQUENCY.getValue());
    }

    public static void monthDelay(){
        System.out.println("Enter how many seconds represent one month (Press enter to use default value: "+ Settings.MONTH_IN_MS.getValue());
    }

    public static void areValuesCorrectToRun(){
        System.out.println("Are these values correct to run the simulation? (Y/N):");
    }

    public static void currentMonth(){
        System.out.println("Current Month: "+TimeTracker.getMonth());
    }

    public static void printProgress(Company company) {
        currentMonth();
        openCentres(company);
        fullCentres(company);
        traineesInTraining(company);
        traineesInWaitingList(company);
    }

    public static void openCentres(Company company){
        System.out.println("Number of open centres: "+company.getCentres().size());
    }

    public static void fullCentres(Company company){
        System.out.println("Number of full centres: "+company.getFullCentres().size());
    }

    public static void traineesInTraining(Company company){
        System.out.println("Number of trainees in training: "+TimeTracker.getTraineesInTraining());
    }

    public static void traineesInWaitingList(Company company){
        System.out.println("Number of trainees in waiting list: "+company.getWaitingList().size());
    }

}
