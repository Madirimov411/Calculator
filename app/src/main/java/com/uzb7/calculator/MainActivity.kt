package com.uzb7.calculator

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(), View.OnClickListener {
    lateinit var displey:EditText
    lateinit var natija:TextView
    lateinit var numbertext:String
    var textnumber:Int=0
    var amal:String = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initview()
    }

    private fun initview() {
        val bone=findViewById<Button>(R.id.b_1)
        val btwo=findViewById<Button>(R.id.b_2)
        val bthree=findViewById<Button>(R.id.b_3)
        val bfour=findViewById<Button>(R.id.b_4)
        val bfive=findViewById<Button>(R.id.b_5)
        val bsex=findViewById<Button>(R.id.b_6)
        val bseven=findViewById<Button>(R.id.b_7)
        val bheigt=findViewById<Button>(R.id.b_8)
        val bnine=findViewById<Button>(R.id.b_9)
        val bzero=findViewById<Button>(R.id.b_0)
        val bAC=findViewById<Button>(R.id.b_AC)
        val bpilusminus=findViewById<Button>(R.id.b_minuspilus)
        val bplus=findViewById<Button>(R.id.b_qoshish)
        val bminus=findViewById<Button>(R.id.b_ayirish)
        val bkopaytirish=findViewById<Button>(R.id.b_kopaytirish)
        val bbolish=findViewById<Button>(R.id.b_bolish)
        val bbarobar=findViewById<Button>(R.id.b_barobar)
        natija=findViewById(R.id.tv_natija)
        displey=findViewById(R.id.et_displey)
        bone.setOnClickListener(this)
        btwo.setOnClickListener(this)
        bthree.setOnClickListener(this)
        bfour.setOnClickListener(this)
        bfive.setOnClickListener(this)
        bsex.setOnClickListener(this)
        bseven.setOnClickListener(this)
        bheigt.setOnClickListener(this)
        bnine.setOnClickListener(this)
        bzero.setOnClickListener(this)
        bfive.setOnClickListener(this)
        bsex.setOnClickListener(this)
        bseven.setOnClickListener(this)
        bheigt.setOnClickListener(this)
        bnine.setOnClickListener(this)
        bzero.setOnClickListener(this)
        bAC.setOnClickListener(this)
        bpilusminus.setOnClickListener(this)
        bplus.setOnClickListener(this)
        bminus.setOnClickListener(this)
        bkopaytirish.setOnClickListener(this)
        bbolish.setOnClickListener(this)
        bbarobar.setOnClickListener(this)
    }

    @SuppressLint("SetTextI18n")
    override fun onClick(button: View?) {
        var qosh: String
        if(natija.text.toString().contains("=")||natija.text.toString()=="0"){
            natija.text=""
            qosh=natija.text.toString()
        }
        else qosh=natija.text.toString()
        val id=button?.id
        when(id){
            R.id.b_1->{
                qosh+="1"
                natija.text=qosh
                if(displey.text.toString()=="0"||displey.text.toString()=="Xato") numbertext=""
                else numbertext=displey.text.toString()
                numbertext+="1"
                displey.setText(numbertext)
            }
            R.id.b_2->{
                qosh+="2"
                natija.text=qosh
                if(displey.text.toString()=="0"||displey.text.toString()=="Xato") numbertext=""
                else numbertext=displey.text.toString()
                numbertext+="2"
                displey.setText(numbertext)
            }
            R.id.b_3->{
                qosh+="3"
                natija.text=qosh
                if(displey.text.toString()=="0"||displey.text.toString()=="Xato") numbertext=""
                else numbertext=displey.text.toString()
                numbertext+="3"
                displey.setText(numbertext)
            }
            R.id.b_4->{
                qosh+="4"
                natija.text=qosh
                if(displey.text.toString()=="0"||displey.text.toString()=="Xato") numbertext=""
                else numbertext=displey.text.toString()
                numbertext+="4"
                displey.setText(numbertext)
            }
            R.id.b_5->{
                qosh+="5"
                natija.text=qosh
                if(displey.text.toString()=="0"||displey.text.toString()=="Xato") numbertext=""
                else numbertext=displey.text.toString()
                numbertext+="5"
                displey.setText(numbertext)
            }
            R.id.b_6->{
                qosh+="6"
                natija.text=qosh
                if(displey.text.toString()=="0"||displey.text.toString()=="Xato") numbertext=""
                else numbertext=displey.text.toString()
                numbertext+="6"
                displey.setText(numbertext)
            }
            R.id.b_7->{
                qosh+="7"
                natija.text=qosh
                if(displey.text.toString()=="0"||displey.text.toString()=="Xato") numbertext=""
                else numbertext=displey.text.toString()
                numbertext+="7"
                displey.setText(numbertext)
            }
            R.id.b_8->{
                qosh+="8"
                natija.text=qosh
                if(displey.text.toString()=="0"||displey.text.toString()=="Xato") numbertext=""
                else numbertext=displey.text.toString()
                numbertext+="8"
                displey.setText(numbertext)
            }
            R.id.b_9->{
                qosh+="9"
                natija.text=qosh
                if(displey.text.toString()=="0"||displey.text.toString()=="Xato") numbertext=""
                else numbertext=displey.text.toString()
                numbertext+="9"
                displey.setText(numbertext)
            }
            R.id.b_0->{
                qosh+="0"
                natija.text=qosh
                if(displey.text.toString()=="0"||displey.text.toString()=="Xato") numbertext=""
                else numbertext=displey.text.toString()
                numbertext+="0"
                displey.setText(numbertext)
            }
            R.id.b_AC->{
                natija.text="0"
                displey.setText("0")
            }
            R.id.b_qoshish->{
                if(!qosh.contains("+")||!qosh.contains("-")||!qosh.contains("÷")||!qosh.contains("x")){
                    qosh+="+"
                    natija.text=qosh
                }
                textnumber=numbertext.toInt()
                displey.setText("0")
                amal="+"
            }
            R.id.b_ayirish->{
                if(!qosh.contains("+")||!qosh.contains("-")||!qosh.contains("÷")||!qosh.contains("x")){
                    qosh+="-"
                    natija.text=qosh
                }
                textnumber=numbertext.toInt()
                displey.setText("0")
                amal="-"
            }
            R.id.b_kopaytirish->{
                if(!qosh.contains("+")||!qosh.contains("-")||!qosh.contains("÷")||!qosh.contains("x")){
                    qosh+="x"
                    natija.text=qosh
                }
                textnumber=numbertext.toInt()
                displey.setText("0")
                amal="*"
            }
            R.id.b_bolish->{
                if(!qosh.contains("+")||!qosh.contains("-")||!qosh.contains("÷")||!qosh.contains("x")){
                    qosh+="÷"
                    natija.text=qosh
                }
                textnumber=numbertext.toInt()
                displey.setText("0")
                amal="/"
            }
            R.id.b_barobar->{
                if(qosh.contains("+")||qosh.contains("-")||qosh.contains("÷")||qosh.contains("x")){
                    qosh+="="
                    natija.text=qosh
                    if(displey.text.toString()=="0") numbertext="0"
                    when(amal){
                        "+"->{
                            displey.setText("0")
                            qosh+=(textnumber+numbertext.toInt()).toString()
                            natija.text=qosh
                        }
                        "-"->{
                            displey.setText("0")
                            qosh+=(textnumber-numbertext.toInt()).toString()
                            natija.text=qosh
                        }
                        "*"->{
                            displey.setText("0")
                            qosh+=(textnumber*numbertext.toInt()).toString()
                            natija.text=qosh
                        }
                        "/"->{
                            if(numbertext!="0") {
                                displey.setText("0")
                                qosh+=(textnumber/numbertext.toInt()).toString()
                                natija.text=qosh
                            }
                            else {
                                displey.setText("Xato")
                                natija.text="Xato"
                            }
                        }
                    }
                }

            }
        }
    }
}