/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.itsmigra1;

/**
 *
 * @author luisa
 */
public class PRINCIPAL {

    public static void main(String[] args) {

        ALUMNO alumno = new ALUMNO();
        DOCENTE docente = new DOCENTE();
        COORDINADOR coordinador = new COORDINADOR();

        alumno.socializar();
        alumno.coordina();
       System.out.println("-----------");
        docente.socializar();
        docente.evalua();
       System.out.println("-----------");
        coordinador.socializar();
        coordinador.coordina();
    }
}
