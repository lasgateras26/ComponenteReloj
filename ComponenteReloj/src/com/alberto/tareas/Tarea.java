package com.alberto.tareas;

import java.time.LocalDateTime;

public class Tarea {

    private String texto;
    private LocalDateTime fecha;

    public Tarea(String texto, LocalDateTime fecha) {
        this.texto = texto;
        this.fecha = fecha;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }
}
