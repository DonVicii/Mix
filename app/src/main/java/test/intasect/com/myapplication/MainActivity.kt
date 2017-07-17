package test.intasect.com.myapplication

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.toast


class MainActivity : AppCompatActivity(), View.OnClickListener {
//    override fun onClick(p0: View?) {
//        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
//    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tv.text="adaddad"
//        var msg = Message.obtain();
        bt.setOnClickListener(this@MainActivity)
        btt.setOnClickListener(this@MainActivity)
    }
    override fun onClick(view :View){
        val id = view.id;
        when(id){
            R.id.bt -> btBtn()
            else->{ toast("this is aa toast!!!")}
        }
    }

    private fun btBtn() {
        toast("this is bb toast!!!")
    }
}
