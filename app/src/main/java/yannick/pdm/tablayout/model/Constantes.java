package yannick.pdm.tablayout.model;

import java.util.ArrayList;

import yannick.pdm.tablayout.R;

public class Constantes {


    public static ArrayList<Estudante> estudantes = new ArrayList<Estudante>();
    public static String[] avatars = {"John","Emily","Emma", "Michael","Sophia", "Olivia", "Carson", "James", };


    public static String[] cursos = {
            "Selecione um curso",
            "LCA", // Licenciatura em Contabilidade e Auditoria
            "LEA", // Licenciatura em Engenharia Ambiental
            "LECT", // Licenciatura em Engenharia Civil e de Transportes
            "LECC", // Licenciatura em Engenharia e Ciência dos Computadores
            "LEMEC", // Licenciatura em Engenharia Electromecânica
            "LEET", // Licenciatura em Engenharia Electrónica e de Telecomunicações
            "LEE", // Licenciatura em Engenharia Electrotécnica
            "LEF", // Licenciatura em Engenharia Ferroviária
            "LEIT", // Licenciatura em Engenharia Informática e de Telecomunicações
            "LEMT", // Licenciatura em Engenharia Mecânica e de Transportes
            "LGBS", // Licenciatura em Gestão Bancária e de Seguros
            "LGF" // Licenciatura em Gestão e Finanças
    };


    public static int getID(int i) {
        if (i == 0) {
            return R.drawable.a;
        }else if (i == 1) {
            return R.drawable.b;
        }else if (i == 2) {
            return R.drawable.c;
        }else if (i == 3) {
            return R.drawable.d;
        }else if (i == 4) {
            return R.drawable.e;
        }else if (i == 5) {
            return R.drawable.f;
        }else if (i == 6) {
            return R.drawable.g;
        }else if(i == 7) {
            return R.drawable.h;
        }else{
            return -1;
        }


    }


    public static String createID(){

        return " ";
    }
}
