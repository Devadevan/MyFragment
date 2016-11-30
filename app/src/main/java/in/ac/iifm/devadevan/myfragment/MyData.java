package in.ac.iifm.devadevan.myfragment;

/**
 * Created by Devadevan on 29-11-2016.
 */

public class MyData {

    static String[] Headlines = {
            "Activity",
            "Services",
            "Broadcast Receiver",
            "Content Provider"
    };

    static String[] Articles = {
            "<p><b>Activity</b><p align='justify' padding='5px'>An Activity is an application component that provides a screen with which users can interact in order to do something, such as dial the phone, take a photo, send an email, or view a map. Each activity is given a window in which to draw its user interface. The window typically fills the screen, but may be smaller than the screen and float on top of other windows.",
            "<p><b>Services</b><p align='justify' padding='5px'>A Service is an application component that can perform long-running operations in the background and does not provide a user interface. Another application component can start a service and it will continue to run in the background even if the user switches to another application. Additionally, a component can bind to a service to interact with it and even perform interprocess communication (IPC). For example, a service might handle network transactions, play music, perform file I/O, or interact with a content provider, all from the background.",
            "<p><b>Broadcast Receiver</b><p align='justify' padding='5px'>A broadcast receiver is a component that responds to system-wide broadcast announcements. Many broadcasts originate from the system-for example, a broadcast announcing that the screen has turned off, the battery is low, or a picture was captured. Apps can also initiate broadcasts-for example, to let other apps know that some data has been downloaded to the device and is available for them to use. Although broadcast receivers don't display a user interface, they may create a status bar notification to alert the user when a broadcast event occurs. More commonly, though, a broadcast receiver is just a \"gateway\" to other components and is intended to do a very minimal amount of work. For instance, it might initiate a service to perform some work based on the event.",
            "<p><b>Content Provider</b><p align='justify' padding='5px'>A content provider manages access to a central repository of data. A provider is part of an Android application, which often provides its own UI for working with the data. However, content providers are primarily intended to be used by other applications, which access the provider using a provider client object. Together, providers and provider clients offer a consistent, standard interface to data that also handles inter-process communication and secure data access."
    };
}
