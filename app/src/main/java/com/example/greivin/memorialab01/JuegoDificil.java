package com.example.greivin.memorialab01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class JuegoDificil extends AppCompatActivity {

    Juego juego;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.juego_dificil);
        this.juego = new Juego();
        juego.azar(15,6);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_dificil,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.salirD:
                Intent intent = new Intent(Intent.ACTION_MAIN);
                intent.addCategory(Intent.CATEGORY_HOME);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
                return true;

            case R.id.juego1:
                finish();
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }

    private void juegofacil() {
        Intent intent = new Intent(this, JuegoFacil.class);//Esta clase llama al Main2Activity (ejecute una instancia
        startActivity(intent);
    }

    public void clickBoton(View view) {

        ImageButton btnSelected = (ImageButton) view;

        switch (view.getId()){
            case R.id.btn01:
                if(!juego.isIntento()){
                    juego.primeraJugada(btnSelected,0);
                }else if(!juego.segundaJugada(btnSelected,0)){
                    btnSelected.setBackgroundColor(getResources().getColor(R.color.colorRed));
                    juego.perdio(btnSelected,getResources().getColor(R.color.colorBoton));
                }
                break;

            case R.id.btn02:
                if(!juego.isIntento()){
                    juego.primeraJugada(btnSelected,1);
                }else if(!juego.segundaJugada(btnSelected,1)){
                    btnSelected.setBackgroundColor(getResources().getColor(R.color.colorRed));
                    juego.perdio(btnSelected,getResources().getColor(R.color.colorBoton));
                }
                break;

            case R.id.btn03:
                if(!juego.isIntento()){
                    juego.primeraJugada(btnSelected,2);
                }else if(!juego.segundaJugada(btnSelected,2)){
                    btnSelected.setBackgroundColor(getResources().getColor(R.color.colorRed));
                    juego.perdio(btnSelected,getResources().getColor(R.color.colorBoton));
                }
                break;

            case R.id.btn04:
                if(!juego.isIntento()){
                    juego.primeraJugada(btnSelected,3);
                }else if(!juego.segundaJugada(btnSelected,3)){
                    btnSelected.setBackgroundColor(getResources().getColor(R.color.colorRed));
                    juego.perdio(btnSelected,getResources().getColor(R.color.colorBoton));
                }
                break;

            case R.id.btn05:
                if(!juego.isIntento()){
                    juego.primeraJugada(btnSelected,4);
                }else if(!juego.segundaJugada(btnSelected,4)){
                    btnSelected.setBackgroundColor(getResources().getColor(R.color.colorRed));
                    juego.perdio(btnSelected,getResources().getColor(R.color.colorBoton));
                }
                break;

            case R.id.btn06:
                if(!juego.isIntento()){
                    juego.primeraJugada(btnSelected,5);
                }else if(!juego.segundaJugada(btnSelected,5)){
                    btnSelected.setBackgroundColor(getResources().getColor(R.color.colorRed));
                    juego.perdio(btnSelected,getResources().getColor(R.color.colorBoton));
                }
                break;

            case R.id.btn07:
                if(!juego.isIntento()){
                    juego.primeraJugada(btnSelected,6);
                }else if(!juego.segundaJugada(btnSelected,6)){
                    btnSelected.setBackgroundColor(getResources().getColor(R.color.colorRed));
                    juego.perdio(btnSelected,getResources().getColor(R.color.colorBoton));
                }
                break;

            case R.id.btn08:
                if(!juego.isIntento()){
                    juego.primeraJugada(btnSelected,7);
                }else if(!juego.segundaJugada(btnSelected,7)){
                    btnSelected.setBackgroundColor(getResources().getColor(R.color.colorRed));
                    juego.perdio(btnSelected,getResources().getColor(R.color.colorBoton));
                }
                break;

            case R.id.btn09:
                if(!juego.isIntento()){
                    juego.primeraJugada(btnSelected,8);
                }else if(!juego.segundaJugada(btnSelected,8)){
                    btnSelected.setBackgroundColor(getResources().getColor(R.color.colorRed));
                    juego.perdio(btnSelected,getResources().getColor(R.color.colorBoton));
                }
                break;

            case R.id.btn10:
                if(!juego.isIntento()){
                    juego.primeraJugada(btnSelected,9);
                }else if(!juego.segundaJugada(btnSelected,9)){
                    btnSelected.setBackgroundColor(getResources().getColor(R.color.colorRed));
                    juego.perdio(btnSelected,getResources().getColor(R.color.colorBoton));
                }
                break;

            case R.id.btn11:
                if(!juego.isIntento()){
                    juego.primeraJugada(btnSelected,10);
                }else if(!juego.segundaJugada(btnSelected,10)){
                    btnSelected.setBackgroundColor(getResources().getColor(R.color.colorRed));
                    juego.perdio(btnSelected,getResources().getColor(R.color.colorBoton));
                }
                break;

            case R.id.btn12:
                if(!juego.isIntento()){
                    juego.primeraJugada(btnSelected,11);
                }else if(!juego.segundaJugada(btnSelected,11)){
                    btnSelected.setBackgroundColor(getResources().getColor(R.color.colorRed));
                    juego.perdio(btnSelected,getResources().getColor(R.color.colorBoton));
                }
                break;

            case R.id.btn13:
                if(!juego.isIntento()){
                    juego.primeraJugada(btnSelected,12);
                }else if(!juego.segundaJugada(btnSelected,12)){
                    btnSelected.setBackgroundColor(getResources().getColor(R.color.colorRed));
                    juego.perdio(btnSelected,getResources().getColor(R.color.colorBoton));
                }
                break;

            case R.id.btn14:
                if(!juego.isIntento()){
                    juego.primeraJugada(btnSelected,13);
                }else if(!juego.segundaJugada(btnSelected,13)){
                    btnSelected.setBackgroundColor(getResources().getColor(R.color.colorRed));
                    juego.perdio(btnSelected,getResources().getColor(R.color.colorBoton));
                }
                break;

            case R.id.btn15:
                if(!juego.isIntento()){
                    juego.primeraJugada(btnSelected,14);
                }else if(!juego.segundaJugada(btnSelected,14)){
                    btnSelected.setBackgroundColor(getResources().getColor(R.color.colorRed));
                    juego.perdio(btnSelected,getResources().getColor(R.color.colorBoton));
                }
                break;
        }

        if(juego.isGanado()){
            Toast.makeText(getBaseContext(), "Juego Completado", Toast.LENGTH_SHORT).show();
           reset();
        }

    }


    public void reset(){

        ImageButton bton = findViewById(R.id.btn01);
        bton.setBackgroundColor(getResources().getColor(R.color.colorBoton));
        bton.setImageResource(R.drawable.pregunta);
        bton.setClickable(true);
        bton = findViewById(R.id.btn02);
        bton.setBackgroundColor(getResources().getColor(R.color.colorBoton));
        bton.setImageResource(R.drawable.pregunta);
        bton.setClickable(true);
        bton = findViewById(R.id.btn03);
        bton.setBackgroundColor(getResources().getColor(R.color.colorBoton));
        bton.setImageResource(R.drawable.pregunta);
        bton.setClickable(true);
        bton = findViewById(R.id.btn04);
        bton.setBackgroundColor(getResources().getColor(R.color.colorBoton));
        bton.setImageResource(R.drawable.pregunta);
        bton.setClickable(true);
        bton = findViewById(R.id.btn05);
        bton.setBackgroundColor(getResources().getColor(R.color.colorBoton));
        bton.setImageResource(R.drawable.pregunta);
        bton.setClickable(true);
        bton = findViewById(R.id.btn06);
        bton.setBackgroundColor(getResources().getColor(R.color.colorBoton));
        bton.setImageResource(R.drawable.pregunta);
        bton.setClickable(true);
        bton = findViewById(R.id.btn07);
        bton.setBackgroundColor(getResources().getColor(R.color.colorBoton));
        bton.setImageResource(R.drawable.pregunta);
        bton.setClickable(true);
        bton = findViewById(R.id.btn08);
        bton.setBackgroundColor(getResources().getColor(R.color.colorBoton));
        bton.setImageResource(R.drawable.pregunta);
        bton.setClickable(true);
        bton = findViewById(R.id.btn09);
        bton.setBackgroundColor(getResources().getColor(R.color.colorBoton));
        bton.setImageResource(R.drawable.pregunta);
        bton.setClickable(true);
        bton = findViewById(R.id.btn10);
        bton.setBackgroundColor(getResources().getColor(R.color.colorBoton));
        bton.setImageResource(R.drawable.pregunta);
        bton.setClickable(true);
        bton = findViewById(R.id.btn11);
        bton.setBackgroundColor(getResources().getColor(R.color.colorBoton));
        bton.setImageResource(R.drawable.pregunta);
        bton.setClickable(true);
        bton = findViewById(R.id.btn12);
        bton.setBackgroundColor(getResources().getColor(R.color.colorBoton));
        bton.setImageResource(R.drawable.pregunta);
        bton.setClickable(true);
        bton = findViewById(R.id.btn13);
        bton.setBackgroundColor(getResources().getColor(R.color.colorBoton));
        bton.setImageResource(R.drawable.pregunta);
        bton.setClickable(true);
        bton = findViewById(R.id.btn14);
        bton.setBackgroundColor(getResources().getColor(R.color.colorBoton));
        bton.setImageResource(R.drawable.pregunta);
        bton.setClickable(true);
        bton = findViewById(R.id.btn15);
        bton.setBackgroundColor(getResources().getColor(R.color.colorBoton));
        bton.setImageResource(R.drawable.pregunta);
        bton.setClickable(true);


        juego.azar(15,6);
    }
}
