package ru.netology.dz;
public class NotRegisteredException extends RuntimeException {
    public NotRegisteredException(String name) {
        super("Player " + name + " doesn't exists");
    }

}