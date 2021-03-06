package com.chemasmas.customcomponents

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.chemasmas.customcomponentslibrary.ColumnData
import com.chemasmas.customcomponentslibrary.TimeSlot
import com.chemasmas.customcomponentslibrary.Util
import com.chemasmas.customcomponentslibrary.adapters.SlotPicked
import com.chemasmas.customcomponentslibrary.components.CustomTimeSchedule
import kotlinx.android.synthetic.main.activity_main.*

//import com.chemasmas.customcomponentslibrary.Util

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Util.health()

        (customC as CustomTimeSchedule<String>).addTimeLines(
            arrayListOf<ColumnData<String>>(
                ColumnData<String>(
                    "Miyana 1","DAta",
                    arrayListOf(
                        //Restricciones
                        TimeSlot(800,"AAA",TimeSlot.LOCKED),
                        TimeSlot(850,"AAA",TimeSlot.LOCKED),
                        TimeSlot(900,"AAA",TimeSlot.LOCKED),
                        TimeSlot(950,"AAA2",TimeSlot.LOCKED),
                        TimeSlot(2000,"AAA2",TimeSlot.LOCKED),
                        TimeSlot(2050,"AAA2",TimeSlot.LOCKED),
                        //Ocupados
                        TimeSlot(1000,"Evento Demo",TimeSlot.SELECTED),
                        TimeSlot(1050,"Evento Demo",TimeSlot.SELECTED),
                        TimeSlot(1100,"Evento Demo 2",TimeSlot.SELECTED),
                        TimeSlot(1150,"Evento Demo 2",TimeSlot.SELECTED),
                        TimeSlot(1200,"Evento Demo 3",TimeSlot.SELECTED)
                    )
                ),ColumnData<String>(
                    "Tonala 2","Test"
                    ,arrayListOf(
                        //Restricciones
                        TimeSlot(1200,"",TimeSlot.LOCKED),
                        TimeSlot(1250,"",TimeSlot.LOCKED),
                        TimeSlot(1450,"",TimeSlot.LOCKED),
                        TimeSlot(1500,"",TimeSlot.LOCKED),
                        //Ocupados
                        TimeSlot(1550,"Evento Demo",TimeSlot.SELECTED),
                        TimeSlot(1600,"Evento Demo",TimeSlot.SELECTED)
                    )
                ),
                ColumnData<String>(
                    "Chema 3","Test"
                    ,arrayListOf(
                        //Restricciones
                        TimeSlot(1900,"",TimeSlot.LOCKED),
                        TimeSlot(1950,"",TimeSlot.LOCKED),
                        TimeSlot(2000,"",TimeSlot.LOCKED)
                    )
                ),
                ColumnData<String>(
                    "Chema 4","Test"
                ),ColumnData<String>(
                    "Tonala 5","Test"
                    ,arrayListOf(
                        //Restricciones
                        TimeSlot(1200,"",TimeSlot.LOCKED),
                        TimeSlot(1250,"",TimeSlot.LOCKED),
                        TimeSlot(1500,"",TimeSlot.LOCKED)
                    )
                ),
                ColumnData<String>(
                    "Chema 6","Test"
                    ,arrayListOf(
                        //Restricciones
                        TimeSlot(1900,"",TimeSlot.LOCKED),
                        TimeSlot(1950,"",TimeSlot.LOCKED),
                        TimeSlot(2000,"",TimeSlot.LOCKED)
                    )
                ),
                ColumnData<String>(
                    "Chema 7","Test"
                ),ColumnData<String>(
                    "Miyana","DAta",
                    arrayListOf(
                        //Restricciones
                        TimeSlot(800,"",TimeSlot.LOCKED),
                        TimeSlot(850,"",TimeSlot.LOCKED),
                        TimeSlot(900,"",TimeSlot.LOCKED)
                    )
                ),ColumnData<String>(
                    "Tonala 8","Test"
                    ,arrayListOf(
                        //Restricciones
                        TimeSlot(1200,"",TimeSlot.LOCKED),
                        TimeSlot(1250,"",TimeSlot.LOCKED),
                        TimeSlot(1500,"",TimeSlot.LOCKED)
                    )
                ),
                ColumnData<String>(
                    "Chema 9","Test"
                    ,arrayListOf(
                        //Restricciones
                        TimeSlot(1900,"",TimeSlot.LOCKED),
                        TimeSlot(1950,"",TimeSlot.LOCKED),
                        TimeSlot(2000,"",TimeSlot.LOCKED)
                    )
                ),
                ColumnData<String>(
                    "Chema 10","Test"
                ),
                ColumnData<String>(
                    "Chema 11","Test"
                ),
                ColumnData<String>(
                    "Chema 12","Test"
                ),
                ColumnData<String>(
                    "Chema 13","Test"
                ),
                ColumnData<String>(
                    "Chema 14","Test"
                ),
                ColumnData<String>(
                    "Chema 15","Test"
                ),
                ColumnData<String>(
                    "Chema 16","Test"
                ),
                ColumnData<String>(
                    "Chema 17","Test"
                ),
                ColumnData<String>(
                    "Chema 18","Test"
                ),
                ColumnData<String>(
                    "Chema 19","Test"
                ),
                ColumnData<String>(
                    "Chema 20","Test"
                )
            )
        , SlotPicked{ item, line ->
                Log.d("Lambda",item.tag)
                Log.d("Lambda",line.data.toString())
                Log.d("Lambda",line.title)
                Toast.makeText(this,"seleccionado",Toast.LENGTH_SHORT).show()
            },
            SlotPicked{ item, line ->
                Log.d("Lambda",item.tag)
                Log.d("Lambda",line.data.toString())
                Log.d("Lambda",line.title)
                Toast.makeText(this,"Esta Bloqueado",Toast.LENGTH_SHORT).show()
            })
    }
}
