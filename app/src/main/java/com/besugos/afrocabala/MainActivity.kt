package com.besugos.afrocabala


import android.annotation.SuppressLint
import android.app.DatePickerDialog
import android.app.Dialog
import android.content.Intent
import android.content.pm.ActivityInfo
import android.graphics.Typeface
import android.os.Build

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.TypedValue

import android.view.View
import android.view.Window
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.annotation.RequiresApi
import java.text.SimpleDateFormat
import java.util.*


class MainActivity : AppCompatActivity() {

    private lateinit var txtDate: TextView
    private lateinit var txtTesta: TextView
    private lateinit var txtNuca: TextView
    private lateinit var txtEsq: TextView
    private lateinit var txtDir: TextView
    private lateinit var txtPlac: TextView
    private lateinit var txtPrincipal: TextView
    private lateinit var txtPrimordial: TextView
    private lateinit var txtObstaculo: TextView
    private lateinit var date: String
    private lateinit var database: Database
    var formatDate = SimpleDateFormat("dd/MM/YYYY", Locale.US)

    @RequiresApi(Build.VERSION_CODES.N)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT)

        database = Database()

        txtDate = findViewById(R.id.txtDate)
        txtTesta = findViewById(R.id.txtTesta)
        txtNuca = findViewById(R.id.txtNuca)
        txtEsq = findViewById(R.id.txtEsq)
        txtDir = findViewById(R.id.txtDir)
        txtPlac = findViewById(R.id.txtPlacenta)
        txtPrincipal = findViewById(R.id.txtPrincipal)
        txtPrimordial = findViewById(R.id.txtPrimordial)
        txtObstaculo = findViewById(R.id.txtObstaculo)
        val btnCalc = findViewById<Button>(R.id.btnCalc)


        btnCalc.setOnClickListener {
            calculate()
        }

        txtTesta.setOnClickListener {
            showDialog("Testa", txtTesta.text.toString().toInt())
        }

        txtNuca.setOnClickListener {
            showDialog("Nuca", txtNuca.text.toString().toInt())
        }

        txtDir.setOnClickListener {
            showDialog("Direita", txtDir.text.toString().toInt())
        }

        txtEsq.setOnClickListener {
            showDialog("Esquerda", txtEsq.text.toString().toInt())
        }

        txtPlac.setOnClickListener {
            showDialog("Placenta", txtPlac.text.toString().toInt())
        }

        txtPrincipal.setOnClickListener {
            showDialog("Principal", txtPrincipal.text.toString().toInt())
        }

        txtPrimordial.setOnClickListener {
            showDialog("Primordial", txtPrimordial.text.toString().toInt())
        }

        txtObstaculo.setOnClickListener {
            showDialog("Obstáculo", txtObstaculo.text.toString().toInt())
        }

        txtDate.setOnClickListener(View.OnClickListener {
            val getDate: Calendar = Calendar.getInstance()
            val datepicker = DatePickerDialog(
                this,
                android.R.style.Theme_DeviceDefault_Dialog_MinWidth,
                DatePickerDialog.OnDateSetListener { view, year, month, dayOfMonth ->

                    val selectDate = Calendar.getInstance()
                    selectDate.set(Calendar.YEAR, year)
                    selectDate.set(Calendar.MONTH, month)
                    selectDate.set(Calendar.DAY_OF_MONTH, dayOfMonth)
                    date = formatDate.format(selectDate.time)
                    //Toast.makeText(this, "Date: " + date, Toast.LENGTH_SHORT).show()
                    txtDate.text = date
                    txtDate.setTextSize(TypedValue.COMPLEX_UNIT_SP, 36F)
                    txtDate.setTypeface(null, Typeface.BOLD)
                    btnCalc.isEnabled = true
                    txtTesta.text = ""
                    txtNuca.text = ""
                    txtDir.text = ""
                    txtEsq.text = ""
                    txtPlac.text = ""
                    txtPrincipal.text = ""
                    txtPrimordial.text = ""
                    txtObstaculo.text = ""

                },
                getDate.get(Calendar.YEAR),
                getDate.get(Calendar.MONTH),
                getDate.get(Calendar.DAY_OF_MONTH)
            )
            datepicker.show()

        })
    }

    private fun calculate() {

        val dia1 = date[0].toString().toInt()
        val dia2 = date[1].toString().toInt()
        val mes1 = date[3].toString().toInt()
        val mes2 = date[4].toString().toInt()
        val ano1 = date[6].toString().toInt()
        val ano2 = date[7].toString().toInt()
        val ano3 = date[8].toString().toInt()
        val ano4 = date[9].toString().toInt()

        var principal = dia1 + dia2 + mes1 + mes2 + ano1 + ano2 + ano3 + ano4
        if (principal > 16) {
            principal = reduzir(principal)
        }

        var testa = dia1 + mes1 + ano1 + ano3
        if (testa > 16) {
            testa = reduzir(testa)
        }

        var nuca = dia2 + mes2 + ano2 + ano4
        if (nuca > 16) {
            nuca = reduzir(nuca)
        }

        var dir = testa + nuca
        if (dir > 16) {
            dir = reduzir(dir)
        }

        var esq = testa + nuca + dir
        if (esq > 16) {
            esq = reduzir(esq)
        }

        var placenta = testa + nuca + dir + esq
        if (placenta > 16) {
            placenta = reduzir(placenta)
        }

        var primordial = dia2 + mes2 + ano3 + ano4
        if (primordial > 16) {
            primordial = reduzir(primordial)
        }

        var obstaculo = dia1 + dia2 + mes1 + mes2 + ano1 + ano2 + ano3 + ano4
        if (obstaculo > 16) {
            obstaculo = reduzir(obstaculo)
        }

        txtPrincipal.text = principal.toString()
        txtTesta.text = testa.toString()
        txtNuca.text = nuca.toString()
        txtDir.text = dir.toString()
        txtEsq.text = esq.toString()
        txtPlac.text = placenta.toString()
        txtPrimordial.text = primordial.toString()
        txtObstaculo.text = obstaculo.toString()

    }

    private fun reduzir(num: Int): Int {
        val numString = num.toString()
        val n1 = numString[0].toString().toInt()
        val n2 = numString[1].toString().toInt()
        return n1 + n2
    }


    private fun showDialog(origem: String, odu:Int) {
        val dialog = Dialog(this)
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
        dialog.setCancelable(false)
        dialog.setContentView(R.layout.detail_dialog)

        val title = dialog.findViewById(R.id.tvTitle) as TextView
        val posExplain = dialog.findViewById(R.id.tvPosExplain) as TextView
        val body = dialog.findViewById(R.id.tvBody) as TextView
        val orixas = dialog.findViewById(R.id.tvOduOrixas) as TextView
        val oduExplain = dialog.findViewById(R.id.tvOduExplain) as TextView
        val sintese = dialog.findViewById(R.id.tvOduSintese) as TextView

        title.text = origem
        body.text = database.odu[odu].nome
        posExplain.text = getPosDesc(origem)
        orixas.text = "Orixás regentes: " + database.odu[odu].orixas
        oduExplain.text = database.definitions[odu]
        sintese.text = database.odu[odu].palavra


        val yesBtn = dialog.findViewById(R.id.btn_yes) as ImageView
        yesBtn.setOnClickListener {
            dialog.dismiss()
        }

        dialog.show()

    }

    private fun getPosDesc(origem: String): String {
        when (origem) {
            "Testa" -> return database.posicao[0]
            "Nuca" -> return database.posicao[1]
            "Direita" -> return database.posicao[2]
            "Esquerda" -> return database.posicao[3]
            "Placenta" -> return database.posicao[4]
            "Principal" -> return database.posicao[5]
            "Primordial" -> return database.posicao[6]
            "Obstáculo" -> return database.posicao[7]
        }
        return ""
    }
}




