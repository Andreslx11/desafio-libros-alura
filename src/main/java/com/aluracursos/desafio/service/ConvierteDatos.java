package com.aluracursos.desafio.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ConvierteDatos implements  IConvierteDatos{

    /*devuelven datos en formato JSON y necesitamos convertirlos a objetos Java
    para manipularlos en nuestra aplicación.*/
    private ObjectMapper objectMapper = new ObjectMapper();




    //    @Override  recordar que el dato esta sobrescrito
    // .readValue() es el metodo que hace la converción
    @Override
    public <T> T obtenerDatos(String json, Class<T> clase) {
        try {
            return objectMapper.readValue(json, clase);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
