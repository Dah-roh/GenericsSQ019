package org.example.service;

@FunctionalInterface
public interface DefaultInterface<R, T>{
    R apply(T object);
}
