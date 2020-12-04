package com.example.reproductor

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View

class MainActivity : AppCompatActivity() {

    lateinit var mediaPlayer: MediaPlayer
    var ban=false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.e("Activity","Se creo La Actividad")
        
        mediaPlayer=MediaPlayer.create(this, R.raw.bobnavidad)

    }

    override fun onStart() {
        super.onStart()
        Log.e("Activity","Se Inicio La Actividad")
        if(ban)
            playCancion()
    }

    override fun onResume() {
        super.onResume()
        Log.e("Activity","Se continuo con La Actividad")
    }

    override fun onPause() {
        super.onPause()
        Log.e("Activity","Se Pauso La Actividad")
        pauseCancion()
    }

    override fun onStop() {
        super.onStop()
        Log.e("Activity","Se Detuvo La Actividad")
    }

    override fun onRestart() {
        super.onRestart()
        Log.e("Activity","Se Reinicio La Actividad")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("Activity","Se Destruyo La Actividad")
    }

    fun playCancionClick(v: View){
        ban=true
        playCancion()
    }

    fun pauseCancionClick(v: View){
        pauseCancion()
    }

    fun playCancion(){
        mediaPlayer.start()
    }

    fun pauseCancion(){
        mediaPlayer.pause()
    }
}