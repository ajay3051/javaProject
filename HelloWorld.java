package javaProject;

public class HelloWorld {
  public void audioCall() {
    System.out.println("This is audio call method");
    System.out.println("Audio Call Version 5.1");
  }

  public void videoCall() {
    System.out.println("This is video call method");
    System.out.println("Video call version 2.1");
  }
  public static void main(String[] args){
    HelloWorld hw = new HelloWorld();
    hw.audioCall();
    hw.videoCall();
    System.out.println("Hello World###");
    System.out.println("Thank You!");
  }
}
