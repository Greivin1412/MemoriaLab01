package com.example.greivin.memorialab01;

import android.media.Image;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageButton;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by Greivin on 26/3/2018.
 */

public class Juego  extends AppCompatActivity {

    List<Integer> lista ;//= new ArrayList<>(9);
    int[] numeros;// = new int[9];
    boolean intento ,ganado;
    int numGuardado,ganes,total,resta;
    ImageButton botGuardado;
    Random random;

    public Juego(){
        this.numGuardado= 0;
        this.botGuardado = null;
        this.random = new Random();
    }

    public boolean isIntento() {
        return intento;
    }

    public boolean isGanado() {
        return ganado;
    }

    public void azar(int lista,int resta){
        this.lista = new ArrayList<>(lista);
        this.numeros = new int[lista];
        this.intento=false;
        this.ganado=false;
        this.total = lista/2;
        this.ganes=0;
        this.resta = resta;

        //Llenado de list con los numeros
        for(int i = 1; i<lista-resta; i++){
            this.lista.add(i);
            this.lista.add(i);
            System.out.println("Lista "+i);
            System.out.println("Lista "+i);
        }

        //Llenado del vector aleatoriamente
        for(int i=0; i<lista; i++){
            int randomIndex =this.random.nextInt(this.lista.size());
            this.numeros[i]=this.lista.get(randomIndex);
            this.lista.remove(randomIndex);
            System.out.println("Pos "+i+" numero "+this.numeros[i]);
        }
        System.out.println("Total en lista "+this.lista.size());
        this.lista.remove(0);
        System.out.println("Total en lista "+this.lista.size());
    }

    public void ponerImagen(ImageButton boton, int numero){
        switch (numero) {
            case 1:
                boton.setImageResource(R.drawable.calabaza);
                break;

            case 2:
                boton.setImageResource(R.drawable.hamburguesa);
                break;

            case 3:
                boton.setImageResource(R.drawable.papas);
                break;

            case 4:
                boton.setImageResource(R.drawable.pollo);
                break;

            case 5:
                boton.setImageResource(R.drawable.piza);
                break;

            case 6:
                boton.setImageResource(R.drawable.huevo);
                break;

            case 7:
                boton.setImageResource(R.drawable.pescado);
                break;

            case 8:
                boton.setImageResource(R.drawable.salchicha);
                break;

            default:
                break;


        }
    }



    public void primeraJugada(ImageButton boton, int numero){
        this.intento=true;
        boton.setClickable(false);
        this.numGuardado = this.numeros[numero];
        this.botGuardado=boton;
        ponerImagen(boton,this.numeros[numero]);
    }

    public boolean segundaJugada(ImageButton boton, int numero){
        this.intento=false;

        if(this.numGuardado == this.numeros[numero]){
            //gana
            boton.setClickable(false);
            ponerImagen(boton,this.numeros[numero]);
            this.ganes++;
            verificaJuego();
            return true;

        }else{
            //pierde
            boton.setClickable(true);
            this.botGuardado.setClickable(true);
            ponerImagen(boton,this.numeros[numero]);
            return false;
        }

    }

    public void perdio(ImageButton boton,int color){
        Contador contador = new Contador(2000,boton,color);
        contador.start();
    }

    public void verificaJuego(){
        if(this.ganes == total){
            this.ganado = true;
            System.out.println("Has Ganado");
        }
    }

    public void reiniciarFigura(ImageButton b,int color){

        b.setImageResource(R.drawable.pregunta);
      b.setBackgroundColor(color);
        botGuardado.setImageResource(R.drawable.pregunta);
        botGuardado.setClickable(true);

    }

    public class Contador extends CountDownTimer {

        ImageButton boton;
        int color;
        public Contador(long tiempo, ImageButton bot,int color) {

            super(tiempo,1);//Las veces que va a entrar al OnTick durante el tiempo
            this.boton = bot;
            this.color = color;
        }

        @Override
        public void onTick(long l) {//cada cierto tiempo entre aqui y llegue a un MAAX, cuando llegue al MAX se va a OnFInish
            try{
                Thread.sleep(2000);
            }catch (InterruptedException e){

            }
        }

        @Override
        public void onFinish() {
            reiniciarFigura(boton,color);
        }
    }

}
