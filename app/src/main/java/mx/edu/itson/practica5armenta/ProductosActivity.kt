package mx.edu.itson.practica5armenta

import android.content.Context
import android.media.Image
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.ListView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ProductosActivity : AppCompatActivity() {
    var menu : ArrayList<Product> = ArrayList<Product>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_productos)

        var menuOption: String? = intent.getStringExtra("menuType")
        agregarProductos(menuOption)

        var listview:ListView= findViewById(R.id.listview) as ListView

        var adaptador : AdaptadorProductos = AdaptadorProductos(this, menu)
        listview.adapter = adaptador
    }

    fun agregarProductos(){
        when(option){

        }
    }
}
private class AdaptadorProductos:BaseAdapter{
    var producto=ArrayList<Product>()
    var contexto : Context?=null
    constructor(contexto: Context, producto:ArrayList<Product>){
        this.producto=producto
        this.contexto=contexto
    }

    override fun getCount(): Int {
        return producto.size
    }

    override fun getItem(position: Int): Any {
        return producto[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var prod=producto[position]
        var inflador = LayoutInflater.from(contexto)
        var vista=inflador.inflate(R.layout.producto_view, null)

        var imagen=vista.findViewById(R.id.producto_img) as ImageView
        var nombre=vista.findViewById(R.id.producto_nombre) as TextView
        var desc=vista.findViewById(R.id.producto_desc) as TextView
        var precio=vista.findViewById(R.id.producto_precio) as TextView

        imagen.setImageResource(prod.image)
        nombre.setText(prod.name)
        desc.setText(prod.description)
        precio.setText("$${prod.price}")
        return vista
    }
}
