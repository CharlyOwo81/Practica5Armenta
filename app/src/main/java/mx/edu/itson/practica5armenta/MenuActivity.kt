package mx.edu.itson.practica5armenta

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_menu)

        var btnAntojitos:Button = findViewById(R.id.antojitosBtn) as Button
        var btnEspecialidades:Button = findViewById(R.id.especialidadesBtn) as Button
        var btnCombinaciones:Button = findViewById(R.id.combinationsBtn) as Button
        var btnTortas:Button = findViewById(R.id.tortasBtn) as Button
        var btnSopas:Button = findViewById(R.id.sopasBtn) as Button
        var btnBebidas:Button = findViewById(R.id.drinksBtn) as Button

        btnAntojitos.setOnClickListener {
            var intent: Intent = Intent(this,ProductosActivity::class.java)
            intent.putExtra("menuType","Antojitos")
            startActivity(intent)
        }

        btnEspecialidades.setOnClickListener {
            var intent: Intent = Intent(this,ProductosActivity::class.java)
            intent.putExtra("menuType","Especialidades")
            startActivity(intent)
        }
        btnCombinaciones.setOnClickListener {
            var intent: Intent = Intent(this,ProductosActivity::class.java)
            intent.putExtra("menuType","Combos")
            startActivity(intent)
        }
        btnTortas.setOnClickListener {
            var intent: Intent = Intent(this,ProductosActivity::class.java)
            intent.putExtra("menuType","Tortas")
            startActivity(intent)
        }
        btnSopas.setOnClickListener {
            var intent: Intent = Intent(this,ProductosActivity::class.java)
            intent.putExtra("menuType","Sopas")
            startActivity(intent)
        }
        btnBebidas.setOnClickListener {
            var intent: Intent = Intent(this,ProductosActivity::class.java)
            intent.putExtra("menuType","Drinks")
            startActivity(intent)
        }
    }
}