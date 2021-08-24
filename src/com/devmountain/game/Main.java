package com.devmountain.game;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        //get user name
        Scanner nameInput = new Scanner(System.in);
        String first_name;
        System.out.print("Hello! What is your first name?");
        first_name = nameInput.next();
        System.out.println("Hello " + first_name + "! Welcome to the Mars Adventure Game, are you ready to get started? Type Y for yes or N for no");
        //get user response
        Scanner responseInput = new Scanner(System.in);
        String response = responseInput.next();

        if (response.equals("Y")) {
            System.out.print("Great! I knew you were up for the challenge! Now lets get started!");

        } else if (response.equals("N")) {
            System.out.print("Don't worry little astronaut! Continue your training until you feel ready to explore the cosmos.");
            System.exit(0);
        }
        //gather user info
        Scanner heightInput = new Scanner(System.in);
        String height;
        System.out.print(" First let's gather some information about you. What is your height in feet?");
        height = heightInput.next();
        System.out.print("Great! You are " + height + " feet tall. How about your age?");
        Scanner ageInput = new Scanner(System.in);
        String age;
        age = ageInput.next();
        System.out.print("Great! You are " + age + " years old. That should be all we need to confirm your astronaut identity. " +
                "Hmmmm it looks like you are scheduled to visit with bootcamp training to test your skills before you take off. Would you like to check in for your appointment? Type Y for yes and N for no");
        //appointment check in
        Scanner appointment_checkin_Input = new Scanner(System.in);
        String appointment = appointment_checkin_Input.next();
        if (appointment.equals("Y")) {
            System.out.print("Great! Oh wow! it looks like your appointment is in five minutes. Hurry and head down the corridor by taking the doors to the right.");

            System.out.print(" Don't take the doors to the left! Type R to go through the doors to the right.");
            Scanner hallwayInput = new Scanner(System.in);
            String hallway = hallwayInput.next();
            if (hallway.equals("R")) {
                System.out.print("**step**step**step** You have now arrived at your appointment. Time to check in! Please restate your name.");
                Scanner renameInput = new Scanner(System.in);
                String re_first_name = renameInput.next();
                System.out.print("Astronaut Identification confirmed. Today we will be examining 3 different skills, Analysis, Strength, and IQ. Let's begin.");
                int sum =0;
                System.out.println("Our first test will be on Analysis where you will be comparing 3 groups. Question one, please compare the following two groups (fish and whale) by providing a one word argument for each portion of a venn diagram. (I.E. cats and dogs: meow,fur,bark ");

            } else if (hallway.equals("L")) {
                System.out.print("**ALARM BLARING** Oh no! It looks like you have been suctioned into a portal. " +
                        "This is an unfinished portal tube being created by nasa that is powered by the quantum physics that create black holes. " +
                        "It is not yet safe for human travel. You feel your limbs pulling in all directions.. sensations of heat," +
                        " cooolness, dryness, and humidity simultaneously. Tastes of blackberries pulsating from your.. ears. " +
                        "Your fingertips with a newfound sensation of smell detect the scent of tutti fruity jelly beans but somehow you sense it is far away. " +
                        "In a moment it all rushes to white and you are standing in a blank canvas. No sensations. What will you do? Type S to scan the room or type W to walk around.");
                Scanner blackholeInput = new Scanner(System.in);
                String blackhole = blackholeInput.next();
                if (blackhole.equals("S")) {
                    System.out.print("As you scan the room you see the light radiates from crystal shaped objects, upon further inspection you see these crystals are not the source of light at all but a seal for the corners of this room. One of them is loose. Any small movement could cause the floor on which you stand to fall out from under you. What will you do? Type W to walk toward the crystal or B to have a brainblast.");
                    Scanner crystalInput = new Scanner(System.in);
                    String crystal = crystalInput.next();
                    if (crystal.equals("W")){
                        System.out.print("Light from all directions intensifies as the crystals dislodge shattering the glass floor on which you stood. You are instantly burned to a crisp. GAME OVER");
                    } else if(crystal.equals("B")){
                        System.out.print("BRAINBLAST!");
                    }
                } else if (blackhole.equals("W")) {
                    System.out.print("Light from all directions intensifies at your unexpected movement in this foreign place. You are instantly burned to a crisp. GAME OVER");
                    System.exit(0);
                }
            } else if (appointment.equals("N")) {
                System.out.print("Okay, be sure to come back when you are ready to schedule your training assessment.");

            }

        }

    }
}
